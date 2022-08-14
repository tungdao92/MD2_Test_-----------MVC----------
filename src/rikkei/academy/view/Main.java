package rikkei.academy.view;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public Main() {

        System.out.println("\nMENU   ");
        System.out.println("1: View Singer");
        System.out.println("2: View Song");
        System.out.println("0: Exit");


        try {
            int choice = Integer.parseInt(scanner.nextLine());
            while (choice != 1 && choice != 2 && choice != 0) {
                System.out.println("Enter Again");
                new Main();
            }
            switch (choice) {
                case 1:
                    new SingerView();
                    break;
                case 2:
                    new SongView();
                    break;
                case 0:
                    System.exit(0);
                default:
            }
        } catch (Exception e) {
            System.out.println("Enter Again");
            new Main();
        }
    }


    public static void main(String[] args) {
        new Main();
    }

}