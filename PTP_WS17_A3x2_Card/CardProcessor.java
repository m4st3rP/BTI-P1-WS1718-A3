package PTP_WS17_A3x2_Card;

import PTP1_WS17_A3.cards.Card;
import PTP1_WS17_A3.cards.Deck;

/**
 * A3x2: CardProzessor - see task
 * 
 * @author Michael Schaefers ; P1@Hamburg-UAS.eu
 * @version 2017/10/24
 */
public class CardProcessor {

    /**
     * Die Methode generateCardMatrix() zieht "wantedNumber" Karten vom
     * Kartenstapel und sortiert die gezogenen Karten in eine
     * "Raenge*Farben-Matrix ein". Optional soll (zur Kontrolle) jede gezogene
     * Karte (sofort nach ihrer Ziehung) ausgegeben werden.
     * 
     * @param deck
     *            der Kartenstapel von dem die Karten gezogen werden
     * @param wantedNumber
     *            gewuenschte Anzahl Karten
     * @param dbgOutputEnable
     *            true schaltet Kontrollausgabe an und false aus
     * 
     * @return Card[][] die KartenMatrix mit den einsortierten gezogenen Karten
     */

    public Card[][] generateCardMatrix(final Deck deck, final int wantedNumber, final boolean dbgOutputEnable) {

        // the matrix always has the same dimensions, since there are exactly
        // 4*13 cards in a deck
        Card[][] cardMatrix = new Card[4][13];
        // the sorting process is done for each card
        for (int i = 0; i < wantedNumber; i++) {
            Card c = deck.deal();
            if (dbgOutputEnable) {
                System.out.print(c);
                if (i == wantedNumber - 1) {
                    System.out.println();

                    System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");

                }

            }

            // with ordinal() you can get the value of an enum
            cardMatrix[c.getSuit().ordinal()][c.getRank().ordinal()] = c;

        }

        return cardMatrix;

    }// method()

    /**
     * a method to sort an array of unsorted cards
     * 
     * @param cardAmount
     *            the amount of unsorted cards
     * @param dbgOutputEnable
     *            a boolean if each card should be outputted
     * @param cards
     *            the array of unsorted cards
     * @return the 2d matrix with sorted cards
     */

    // we overloaded this method for task number 3
    public Card[][] generateCardMatrix(final int cardAmount, final boolean dbgOutputEnable, Card... cards) {

        Card[][] cardMatrix = new Card[4][13];

        // do once for the amount of cards we have
        for (int i = 0; i < cardAmount; i++) {
            if (dbgOutputEnable) {
                System.out.print(cards[i]);
                System.out
                        .println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
            }
            if (cards[i] != null) {

                // with ordinal() you can get the value of an enum
                cardMatrix[cards[i].getSuit().ordinal()][cards[i].getRank().ordinal()] = cards[i];
            }
        }

        return cardMatrix;

    }// method()

    /**
     * the method sort() sorts unsorted Cards and returns them sorted
     * 
     * 
     * @param Card...
     *            a variable amount of unsorted Cards
     *
     * @return Card... an amount of sorted Cards
     */

    public Card[] sort(final Card... unsortedCards) {

        Card[][] matrix = new Card[4][13];
        matrix = generateCardMatrix(unsortedCards.length, false, unsortedCards);

        Card[] sortedCards = new Card[52];

        
        int sortedCardsPosition = 0;

        // transform an 2d Array into an 1d Array
        for (int x = 0; x < matrix[0].length; x++) {
           for(int y = 0 ; y < matrix.length; y++) {
                if (matrix[y][x] != null) {
                    sortedCards[sortedCardsPosition] = matrix[y][x];
                    sortedCardsPosition++;
                }              
            }
        }
        
        return sortedCards;
    }

    /**
     * Die Methode printCardMatrix() gibt eine Kartenmatrix aus. Es wird dabei
     * vorausgesetzt, dass die Kartenmatrix als Raenge*Farben-Matrix aufgebaut
     * ist.
     * 
     * @param cardMatrix
     *            die auszuegebende KartenMatrix.
     */
    public void printCardMatrix(final Card[][] cardMatrix) {
        for (Card[] e : cardMatrix) {
            for (Card f : e) {
                if (f == null) {
                    System.out.print("  --  ");
                } else {
                    System.out.print(f);
                }
            }
            System.out.println();
        }
    }// method()

    /**
     * the method printCards() is printing single existing Cards
     * 
     * @param cards
     *            a variable amount of cards
     */
    public void printCards(final Card... cards) {

        for (Card e : cards) {
            if (e != null) {
                System.out.print(e);
            }

        }

    }
}// class
