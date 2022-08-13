package rikkei.academy.view;

import rikkei.academy.controller.SongController;
import rikkei.academy.model.Song;

import java.util.List;
import java.util.Scanner;

public class SongView {
    Scanner scanner = new Scanner(System.in);
    SongController songController = new SongController();

    public void showListSong(){
        System.out.println("--------STT-------NAME-------Listen-------Like--------");
        List<Song> songList = songController.showSong();
        for (int i = 0; i < songList.size(); i++) {
            System.out.println("--------" + songList.get(i).getId() + "--------" + songList.get(i).getName() + "-------"+ songList.get(i).getListen()+ "--------" + songList.get(i).getLike()+"--------");
        }
//        System.out.println("Enter 0 To Go Back or Enter 1 To Exit");
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
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = scanner1.nextLine();
        List<Song> songList = songController.creatSong(name);
        System.out.println("--------STT-------NAME-------Listen-------Like--------");
        for (Song song : songList) {
            System.out.println(song.getId() + "----------" + song.getName() + "----------" + song.getListen() + "----------" + song.getLike() + "----------");
        }
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
    public void editSong(int id, String name){
        System.out.println("Enter Id Of The Song You Want To Edit");
        int idEdit = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Name: ");
        String nameEdit = scanner.nextLine();
        List<Song> songList = songController.editSong(id, name);

    }
    public SongView(){
        System.out.println("Song Menu");
        System.out.println("1: Show List Song");
        System.out.println("2: Creat Song");
        System.out.println("3: Update Song");
        System.out.println("0: Back To Menu");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                showListSong();
                break;
            case 2:
                creatSong();
                break;
            case 3:

            case 0:
                new Main();
        }


    }

}
