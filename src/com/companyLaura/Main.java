package com.companyLaura;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Kā Tevi sauc?");
        System.out.println("Es tikai gribu pārliecināties, vai esi no šīs programmēšanas grupiņas.");
        name = scanner.nextLine();
	    
        if(name.equals("Laura")) {
            System.out.println("Čau, Laura!");
        }
        else if(name.equals("Madars")) {
            System.out.println("Čau. Tu neesi students, bet gan skolotājs. Taču pieeja atļauta.");
        } else {
            System.out.println("Opiņā! Izskatās, ka mums ir iebrucējs, bet nu nekas traks.");
        }

        String school;
        System.out.println("Kas slēpjas zem nosaukuma 'RCS'? ");
        school = scanner.nextLine();

        if(school.equals("Riga Coding School")) {
            System.out.println("Nu Tu baigais gudrinieks! Pareizi.");
        } else {
            do {
                System.out.println("Hmm, kaut kas nav pareizi. Pārbaudi sintaksi un mēģini vēlreiz.");
                System.out.println("Kas slēpjas zem nosaukuma 'RCS'? ");
                school = scanner.nextLine();
            }
            while(!school.equals("Riga Coding School"));
            System.out.println("Pareizi, bet nu ne ar pirmo mēģinājumu.");
        }

        String what;
        System.out.println("Kāds ir mūsu kursa nosaukums?");
        what = scanner.nextLine();

        if(what.equals("programmēšanas pamati")){
            System.out.println("Ou jē! Bet šis bija viegli. Būtu dīvaini, ja Tu nezinātu.");
		System.out.println("Foršu dienu! Atā!");
        } else {
            do {
                System.out.println("Stop, stop, stop. Iespējams, ka kāds ir apmaldījies. Mēģini vēlreiz.");
                System.out.println("Kāds ir mūsu kursa nosaukums?");
                what = scanner.nextLine();
            }
            while(!what.equals("programmēšanas pamati"));
            System.out.println("Pareizi, bet nu ne ar pirmo mēģinājumu.");
            System.out.println("Foršu dienu! Atā!");
        }
    }
}

