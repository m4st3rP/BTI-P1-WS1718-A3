package PTP1_WS17_A3x4_ArrayPalindromTester;

public class PalindromeTester {

    /**
     * Die Methode isPalindrom prueft ob ein Palindrom vorliegt.
     * 
     * @param text
     *            der zu ueberpruefende Text.
     *
     * @return boolean der zu ueberpruefende Text ist ein Palindrom.
     */

    // Schreiben Sie eine Methode, die
    // o) ein Ergebnis vom Typ boolean abliefert
    // o) isPalindrome heißt
    // o) ein char[] als Parameter entgegen nimmt
    // Die Parameter soll text heißen

    public boolean isPalindrome(char text[]) {

        int a = 0;
        int b = text.length - 1;
        while ((a < b) && (Character.toLowerCase(text[a]) == Character.toLowerCase(text[b]))) {
            a++;
            b--;

        }
        return a >= b;

    }
}// class
