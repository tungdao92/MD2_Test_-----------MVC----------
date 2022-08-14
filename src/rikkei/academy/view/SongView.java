package rikkei.academy.view;

import rikkei.academy.controller.SongController;
import rikkei.academy.model.Song;

import java.util.List;
import java.util.Scanner;

import static jdk.nashorn.internal.runtime.UnwarrantedOptimismException.isValid;

public class SongView {
//    Scanner scanner = new Scanner(System.in);
    SongController songController = new SongController();

    public void showListSong(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("|        STT         NAME        Listen      Like       |");
        List<Song> songList = songController.showSong();
        for (Song song: songList) {
            System.out.println("----------" + song.getId() + "----------" + song.getName() + "----------" + song.getListen() + "----------" + song.getLike() + "----------");
        }
        System.out.println("1: Go Back Menu Singer \n2: Go Back MENU \n3: Exit");
        String back = scanner.nextLine();
        while (!back.equals("1") && !back.equals("2") && back.equals("3")){
            System.out.println("1: Go Back Menu Singer \n2: Go Back MENU \n3: Exit");
            back = scanner.nextLine();
        }
        if (back.equals("1")){
            new SongView();
        }if (back.equals("2")){
            new Main();
        }if (back.equals("3")){
            System.exit(0);
        }
    }



    public void creatSong() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        List<Song> songList = songController.creatSong(name);
        System.out.println("|        STT         NAME        Listen      Like       |");
        for (Song song : songList) {
            System.out.println("----------" + song.getId() + "----------" + song.getName() + "----------" + song.getListen() + "----------" + song.getLike() + "----------");
        }
        System.out.println("1: Go Back Menu Singer \n2: Go Back MENU \n3: Exit");
        String back = scanner.nextLine();
        while (!back.equals("1") && !back.equals("2") && back.equals("3")) {
            System.out.println("1: Go Back Menu Singer \n2: Go Back MENU \n3: Exit");
            back = scanner.nextLine();
        }
        if (back.equals("1")) {
            new SongView();
        }
        if (back.equals("2")) {
            new Main();
        }
        if (back.equals("3")) {
            System.exit(0);
        }
    }



    public void editSong(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Id Of The Song You Want To Edit");
        int idEdit = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Name: ");
        String nameEdit = scanner.nextLine();
        List<Song> songList = songController.editSong(idEdit , nameEdit);
        System.out.println("|        STT         NAME        Listen      Like       |");
        for (Song song: songList) {
            System.out.println( "----------" + song.getId() + "----------" + song.getName() + "----------" + song.getListen() + "----------" + song.getLike() + "----------");
        }
        System.out.println("1: Go Back Menu Singer \n2: Go Back MENU \n3: Exit");
        String back = scanner.nextLine();
        while (!back.equals("1") && !back.equals("2") && back.equals("3")) {
            System.out.println("1: Go Back Menu Singer \n2: Go Back MENU \n3: Exit");
            back = scanner.nextLine();
        }
        if (back.equals("1")) {
            new SongView();
        }
        if (back.equals("2")) {
            new Main();
        }
        if (back.equals("3")) {
            System.exit(0);
        }
    }


    public void deleteSong(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Id Of The Song You Want To Delete");
        int idDelete = Integer.parseInt(scanner.nextLine());
        if (!isValid(idDelete)) {
            System.out.println("Not Pound");
            new SongView();
        }
        System.out.println("You May Want To Delete (Y / N)?");
        String check = scanner.nextLine();
        if (check.equalsIgnoreCase("y")) {
           songController.deleteSong(idDelete);
        } else if (check.equalsIgnoreCase("n")) {
            System.out.println("Not Deleting");
        } else {
            System.out.println("Invalid choice");
        }
        List<Song> songList = songController.showSong();
        System.out.println("|        STT         NAME        Listen      Like       |");

        for (Song song: songList) {
            System.out.println( "----------" + song.getId() + "----------" + song.getName() + "----------" + song.getListen() + "----------" + song.getLike() + "----------");
        }
        System.out.println("1: Go Back Menu Singer \n2: Go Back MENU \n3: Exit");
        String back = scanner.nextLine();
        while (!back.equals("1") && !back.equals("2") && back.equals("3")) {
            System.out.println("1: Go Back Menu Singer \n2: Go Back MENU \n3: Exit");
            back = scanner.nextLine();
        }
        if (back.equals("1")) {
            new SongView();
        }
        if (back.equals("2")) {
            new Main();
        }
        if (back.equals("3")) {
            System.exit(0);
        }

    }


    public SongView(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Song Menu");
        System.out.println("1: Show List Song");
        System.out.println("2: Creat Song");
        System.out.println("3: Update Song");
        System.out.println("5: Delete Song");
        System.out.println("0: Back To Menu");

        try {
            int choice = Integer.parseInt(scanner.nextLine());
            while (choice != 0 && choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 6){
                new SongView();
            }

            switch (choice){
                case 1:
                    showListSong();
                    break;
                case 2:
                    creatSong();
                    break;
                case 3:
                    editSong();
                    break;
                case 5:
                    deleteSong();
                    break;
                case 0:
                    new Main();
            }
        }
        catch (Exception e){
            new SingerView();
        }


    }
    private boolean isValid(int id){
        int size = songController.showSong().size();
        return id >= 0 && id< size;
    }

}
