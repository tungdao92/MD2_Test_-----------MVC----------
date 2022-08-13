package rikkei.academy.view;

import java.util.Scanner;

public class Main {
    public Main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1: View Singer");
        System.out.println("2: View Song");
        System.out.println("0: Exit");

        int choice = scanner.nextInt();
        while (choice != 1 && choice !=2 && choice != 0){
            System.out.println("MENU");
            System.out.println("1: View Singer");
            System.out.println("2: View Song");
            System.out.println("0: Exit");
            choice = scanner.nextInt();
        }
        switch (choice){
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

    }


    public static void main(String[] args) {
        new Main();
    }
}
