package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Abiturient student[] = new Abiturient[5];
        student[0] = new Abiturient(1, "Aset", "Nursutan", "87786554444", "4");
        student[1] = new Abiturient(2, "Erasyl", "Semei", "87767267856", "4");
        student[2] = new Abiturient(3, "Ergazy", "Aktau", "87012446677", "5");
        student[3] = new Abiturient(4, "Sayat", "Almaty", "87752660033", "3");
        student[4] = new Abiturient(5, "Ansar", "Kostanay", "8705545554", "2");
        System.out.println("a) Studennter tyzymy korset neydov.ocenki");
        String ocenki = sc.nextLine();
        for (int i = 0; i < 5; i++) {
            if (student[i].getOcenki().equalsIgnoreCase(ocenki)) {
                System.out.println(student[i].toString());
            }

        }
    }

}
