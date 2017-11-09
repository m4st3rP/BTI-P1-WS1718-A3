package PTP_WS17_A3x2_Card;

import static PTP1_WS17_A3.cards.Card.Constant.*;
import PTP1_WS17_A3.cards.Card;
import PTP1_WS17_A3.cards.Deck;

public class TesterSort {

    /**
     * Die Methode dotest() testet die Loesung zu A3x3. Diese Methode darf NUR
     * am Ende ergaenzt werden.
     */
    public void doTest2() {
        System.out.printf("TI1-P1 (WS17/18):\n");
        System.out.printf("=================\n");
        System.out.printf("\n");

        CardProcessor cardProzessor = new CardProcessor();

        // 1.Test: 7 zufaellige Karten sortieren und dann ausgeben
        final int requestedNumber = 7;

        Deck deck = new Deck();
        Card[] cardVector = new Card[requestedNumber];

        // 7 zufaellige Karten zusammenstellen
        for (int i = 0; i < requestedNumber; i++) {
            cardVector[i] = deck.deal();
        } // for

        // Karten sortieren
        cardVector = cardProzessor.sort(cardVector);

        // Karten ausgeben
        System.out.printf("Sortierte Ausgabe mit:  2<3<4<5<6<7<8<9<T<J<Q<K<A (1.Prio)  und  C<D<H<S (2.Prio)\n");
        System.out.printf("\n\n");
        System.out.printf("1.Test:\n");
        cardProzessor.printCards(cardVector);
        System.out.printf("\n\n");

        // 2.Test: Vorgegebene Kartenzusammenstellung sortieren und ausgeben
        System.out.printf("2.Test:\n");
        cardProzessor.printCards(cardProzessor.sort(CA, H2, DJ, HJ, SK, HQ, HK, H2, HQ, CA));

        // Moegliche Ergaenzungen koennen hier eingefuegt werden.
        // ...

    }// method()

}// class
