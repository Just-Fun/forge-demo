package org.forge.demo;

import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Serzh on 4/21/17.
 */
public class GameAZ {

    public static void main(String[] args) {

        char letter = getRandomCharacter();
        doWork(letter);

    }

    private static void doWork(char letter) {
        write("Try to guess letter.\n" +
                "Enter the letter from 'A' to 'Z'.\n");
        /* +
                "'1' for restart or '9' to quit\n");*/

        while (true) {
            String input = read();
            char c = input != null ? input.charAt(0) : 0;

            if (input == null) {
//                        do nothing
            } else if (c == letter) {
                System.out.println("You win!");
                break;
            } else if (c > letter) {
                System.out.println("You're too high.");
            } else if (c < letter) {
                System.out.println("You're too low.");
            }

        }
    }

    private static void printError(Exception e) {
        String message = e.getMessage();
        Throwable cause = e.getCause();
        if (cause != null) {
            message += " " + cause.getMessage();
        }
        write("Failure! because of: " + message);
    }

    private static void write(String message) {
        System.out.println(message);
    }


    private static String read() {
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    private static char getRandomCharacter() {
        Random r = new Random();
        return (char) (65 + r.nextInt(26));
    }
}
