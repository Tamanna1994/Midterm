ackage math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *

         */
        int rows = 6; // Number of rows in the pyramid

        for (int i = 0; i < rows; i++) {
            // Print spaces before the stars
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
    }

}
