package PTP_WS17_A3x1_ArrayProcesso;

/**
 * ArrayProcessor
 * 
 * @author Michael Schaefers ; P1@Hamburg-UAS.eu
 * @version 2017/10/14
 *
 */
public class ArrayProcessor {
    /**
     * Checks if the pattern fits
     * 
     * @param theArray
     *            the array where the sum gets calculated
     * @param y
     *            current height position
     * @param x
     *            current width position
     * @return true if pattern fits
     */
    boolean fits(long[][] theArray, int x, int y) {

        // since x starts offset because of the pattern, we only compare it to
        // pattern width - 1
        return (   (theArray[y].length     >= 2 + x)
                && (theArray[y + 1].length >= 3 + x)
                && (theArray[y + 2].length >= 3 + x)
                && (theArray[y + 3].length >= 2 + x));
    }

    /**
     * 
     * processes the sum of the array after the pattern
     * 
     * @param theArray
     *            the array where the sum gets calculated
     * @return sum of the pattern on the array
     */
    public long process(long[][] theArray) {
        long sum = 0;
        
        // only proceed if pattern fits from current position downwards
        for (int y = 0; y < theArray.length - 3; y++) {
            int x = 1;

            // only proceed if pattern fits sideways
            while (fits(theArray, x, y)) {

                sum = sum + theArray[  y  ][  x  ] + theArray[  y  ][x + 1]
                          + theArray[y + 1][x - 1] + theArray[y + 1][x + 2]
                          + theArray[y + 2][x - 1] + theArray[y + 2][x + 2]
                          + theArray[y + 3][  x  ] + theArray[y + 3][x + 1];
                x++;
            }
           
        }

        return sum;
    }// method()

}// class
