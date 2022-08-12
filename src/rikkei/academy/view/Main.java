package rikkei.academy.view;

import java.util.Scanner;

public class Main {
    public Main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: Show List Singer");
        System.out.println("2: Creat Singer");
        System.out.println("3: Delete Singer");
        System.out.println("4: Update Singer");
        System.out.println("5: Detail Singer ");
        System.out.println("6: Sort Singer");
        System.out.println("0: Exit");
        int choiceMenu = scanner.nextInt();
        switch (choiceMenu){
            case 0:
                System.exit(0);
                break;
            case 1:
                new SingerView().viewSinger();
                break;
            case 2:
                new SingerView().creatSinger();
                break;
            case 3:
                new SingerView().removeSinger();
                break;
            case 4:
                new SingerView().editSinger();
                break;
            case 5:
                new SingerView().searchSinger();
                break;
            case 6:
                new SingerView().sortSinger();
                break;


        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
