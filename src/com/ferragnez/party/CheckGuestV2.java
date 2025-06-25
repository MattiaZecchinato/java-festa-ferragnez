package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuestV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] guestsList = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        System.out.println("What is your name?");
        String guestName = sc.nextLine();

        boolean isGuestEntered = false;

        int i = 0;
        while (i < guestsList.length) {
            String currentGuest = guestsList[i].replaceAll("\\s", "");
            String guestNameToFind = guestName.replaceAll("\\s", "");

            if (currentGuest.equalsIgnoreCase(guestNameToFind)) {
                System.out.println("You can enter at the party!");
                isGuestEntered = true;
                break;
            }

            i++;
        }

        if (!isGuestEntered) {
            System.out.println("You can\'t enter at the party!");
        }

        sc.close();
    }
}
