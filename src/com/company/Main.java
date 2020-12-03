package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner card = new Scanner(System.in);

        System.out.print("Input your credit card number: ");

        long cardnumber;

        cardnumber = card.nextLong();

        System.out.println("Credit Card Number: " + cardnumber);

        int sum = 0;

        String cardType = String.valueOf(cardnumber);

        if (cardType.startsWith("3")) {
            System.out.print("AMERICAN EXPRESS CARD");

        } else if (cardType.startsWith("4")) {
            System.out.print("VISA CARD");

        } else if (cardType.startsWith("5")) {
            System.out.print("MASTERCARD CARD");
        }

        while (cardnumber > 0)

            cardnumber = cardnumber / 10;

        if (cardnumber % 2 != 0) {
            cardnumber *= 2;
        }

        if (cardnumber > 9) {
            cardnumber = (cardnumber % 10) + 1;
        } else
            cardnumber *= 1;

        sum += cardnumber;

        if (sum % 10 == 0) {
            System.out.print(": VALID.");

        } else
            System.out.print(": INVALID. Please try again.");
    }
}