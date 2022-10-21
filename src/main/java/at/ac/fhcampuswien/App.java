package at.ac.fhcampuswien;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void oneMonthCalender (int days, int startingDay) {
        int [] monthOut = new int[days];
        for (int i = 0; i < monthOut.length; i++) {
            monthOut[i] = i + 1;
        }

        int counter = 1;

        if (startingDay != 1) {
            for (int j = 1; j < startingDay; j++) {
                System.out.print("   ");
                counter++;
            }
        }
        for (int i = 0; i < days; i++) {

            System.out.print(String.format("%2d", monthOut[i]) + " ");
            if ((counter % 7) == 0 || i == days - 1) {
                System.out.print(System.lineSeparator());
            }
            counter++;
        }
    }
    public static long[] lcg(long seed) {
        long[] randomNumbers = new long[10];
        double m = Math.pow(2, 31);
        long mNeu = (long) m;
        final long A = 1103515245;
        final int B = 12345;
        for (int i = 0; i < randomNumbers.length; i++) {
            seed = (seed * A + B) % mNeu;
            randomNumbers[i] = seed;
        }
        return randomNumbers;
    }

    public static void guessingGame(int numberToGuess) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int input = 0;
        for (int i = 0; i < counter; i++) {
            System.out.print("Guess number " + (i + 1) + ": ");
            input = scanner.nextInt();

            if (input < numberToGuess && i != 15) {
                System.out.print("The number AI picked is higher than your guess." + System.lineSeparator());
            } else if (input > numberToGuess && i != 15) {
                System.out.print("The number AI picked is lower than your gues." + System.lineSeparator());
            }

            if (i < 15 && input != numberToGuess) {
                counter++;
            }else if (input == numberToGuess) {
                System.out.print("You won wisenheimer!" + System.lineSeparator());
            } else if (input == 15 && input != numberToGuess) {
                System.out.print("You lost! Have you ever heard of divided & counquer?" + System.lineSeparator());


            }
        }
    }
    public static boolean swapArrays(int [] array1, int [] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            int temporary = array1[i];
            array1[i] = array2[i];
            array2[i] = temporary;
        }

        return true;
    }



    public static int checkDigit(int[] code) {
        int product, sum = 0, mod11, codeOut;
        for (int i = 0; i < code.length; i++) {
            product = code[i] * (i + 2);
            sum += product;
        }
        mod11 = sum % 11;
        codeOut = 11 - mod11;
        if (codeOut == 10) {
            codeOut = 0;
        } else if (codeOut == 11) {
            codeOut = 5;
        }

        return codeOut;
    }
 // Sources used to help me understand: https://www.youtube.com/watch?v=NbYgm0r7u6o ; https://www.youtube.com/watch?v=sWP9VPpys-U

    // Implement all methods as public static

    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
    }
}