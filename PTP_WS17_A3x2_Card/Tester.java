package PTP_WS17_A3x2_Card;

import PTP1_WS17_A3.cards.Card;
import PTP1_WS17_A3.cards.Deck;

public class Tester {

    /**
     * Die Methode dotest() testet die Loesung zu A3x2. Diese Methode darf nicht
     * geaendert werden.
     * 
     * @param wantedNumber
     *            gewuenschte Anzahl Karten fuer letzten Test
     * @param dbgOutputEnable
     *            Einstellung fuer Kontrollausgabe beim letzten Test. true
     *            schaltet die Kontrollausgabe an und false aus.
     */
    public void doTest(int wantedNumber, final boolean dbgOutputEnable) {
        System.out.printf("TI1-P1 (WS17/18):\n");
        System.out.printf("=================\n");
        System.out.printf("\n");

        Deck deck = new Deck();
        Card[][] cardMatrix;
        CardProcessor cardProzessor = new CardProcessor();
        cardMatrix = cardProzessor.generateCardMatrix(deck, 52, false);
        System.out.printf("Vermutliche Ausgabe der Pflicht-Variante:\n");
        cardProzessor.printCardMatrix(cardMatrix);
        System.out.printf("------------------------------------------------------------------------------\n");
        /*
         * // Nur falls printCardMatrixOptional() implementiert
         * System.out.printf( "Optionale Variante:\n" );
         * cardProzessor.printCardMatrixOptional( cardMatrix );
         */
        System.out.printf("##############################################################################\n");
        deck = new Deck();
        cardMatrix = cardProzessor.generateCardMatrix(deck, 1, true);
        cardProzessor.printCardMatrix(cardMatrix);
        System.out.printf("##############################################################################\n");
        cardMatrix = cardProzessor.generateCardMatrix(deck, 7, true);
        cardProzessor.printCardMatrix(cardMatrix);
        System.out.printf("##############################################################################\n");
        cardMatrix = cardProzessor.generateCardMatrix(deck, wantedNumber, dbgOutputEnable);
        cardProzessor.printCardMatrix(cardMatrix);
    }// method()
}// class
