package rikkei.academy.view;

import rikkei.academy.controller.SingerController;
import rikkei.academy.model.Singer;

import java.util.List;
import java.util.Scanner;

import static jdk.nashorn.internal.runtime.UnwarrantedOptimismException.isValid;

public class SingerView {
    Scanner sc = new Scanner(System.in);
    SingerController  singerController = new SingerController();
    public void showSinger(){


        System.out.println("---------STT-------NAME-------AGE-------");
        List<Singer> singerList = singerController.showSinger();
        for (Singer singer: singerList) {
            System.out.println("---------" + singer.getId() + "---------" + singer.getName() + "---------" + singer.getAge()+ "---------");
        }
//        for (int i = 0; i < singerList.size(); i++) {
//            System.out.println("---------"+ singerList.get(i).getId()+ "-------" + singerList.get(i).getName()+ "-------" + singerList.get(i).getAge()+"-------");
//        }
        System.out.println("1: Go Back Menu Singer \n2: Go Back MENU \n3: Exit");
        String back = sc.nextLine();
        while (!back.equals("1") && !back.equals("2") && !back.equals("3")){
            System.out.println("1: Go Back Menu Singer \n2: Go Back MENU \n3: Exit");
            back = sc.nextLine();
        }
        if (back.equals("1")){
            new SingerView();
        }if (back.equals("2")){
            new Main();
        }if (back.equals("3")){
            System.exit(0);
        }
    }


    public void creatSinger(){
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println(" Enter Age: ");
        int age = Integer.parseInt(sc.nextLine());
        List<Singer> singerList = singerController.creatSinger(name, age);
        System.out.println("---------STT-------NAME-------AGE-------");
        for (Singer singer: singerList) {
            System.out.println("---------" + singer.getId() + "---------" + singer.getName() + "---------" + singer.getAge()+ "---------");
        }
        System.out.println("1: Go Back Menu Singer \n2: Go Back MENU \n3: Exit");
        String back = sc.nextLine();
        while (!back.equals("1") && !back.equals("2") && !back.equals("3")){
            System.out.println("1: Go Back Menu Singer \n2: Go Back MENU \n3: Exit");
            back = sc.nextLine();
        }
        if (back.equals("1")){
            new SingerView();
        }if (back.equals("2")){
            new Main();
        }if (back.equals("3")){
            System.exit(0);
        }
    }

    public void removeSinger(){

        System.out.println("Enter Id You Want to Delete: ");
        int id = Integer.parseInt(sc.nextLine());
        if (!isValid(id)) {
            System.out.println("Not Pound");
            return;
        }
        System.out.println("You May Want To Delete (Y / N)?");
        String check = sc.nextLine();
        if (check.equalsIgnoreCase("y")) {
            singerController.removeSinger(id);
        } else if (check.equalsIgnoreCase("n")) {
            System.out.println("Not Deleting");
        } else {
            System.out.println("Invalid choice");
        }
        List<Singer> singerList = singerController.showSinger();
        System.out.println("---------STT-------NAME-------AGE-------");
        for (Singer singer: singerList) {
            System.out.println("---------" + singer.getId() + "---------" + singer.getName() + "---------" + singer.getAge()+ "---------");
        }
        System.out.println("1: Go Back Menu Singer \n2: Go Back MENU \n3: Exit");
        String back = sc.nextLine();
        while (!back.equals("1") && !back.equals("2") && !back.equals("3")){
            System.out.println("1: Go Back Menu Singer \n2: Go Back MENU \n3: Exit");
            back = sc.nextLine();
        }
        if (back.equals("1")){
            new SingerView();
        }if (back.equals("2")){
            new Main();
        }if (back.equals("3")){
            System.exit(0);
        }
    }


    public void editSinger(){
        System.out.println("Enter Id Of The Song You Want To Edit");
        int idEdit = Integer.parseInt(sc.nextLine());
        System.out.println("Edit Name: ");
        String nameEdit = sc.nextLine();
        System.out.println("Edit Age: ");
        int ageEdit = Integer.parseInt(sc.nextLine());
        List<Singer> singerList = singerController.editSinger(idEdit, nameEdit, ageEdit);
        System.out.println("---------STT-------NAME-------AGE-------");
        for (Singer singer: singerList) {
            System.out.println("---------" + singer.getId() + "---------" + singer.getName() + "---------" + singer.getAge()+ "---------");
        }
        System.out.println("1: Go Back Menu Singer \n2: Go Back MENU \n3: Exit");
        String back = sc.nextLine();
        while (!back.equals("1") && !back.equals("2") && !back.equals("3")){
            System.out.println("1: Go Back Menu Singer \n2: Go Back MENU \n3: Exit");
            back = sc.nextLine();
        }
        if (back.equals("1")){
            new SingerView();
        }if (back.equals("2")){
            new Main();
        }if (back.equals("3")){
            System.exit(0);
        }
    }


    public void searchSinger(){
        System.out.println("Enter Id Singer Want See: ");
        int id = Integer.parseInt(sc.nextLine());
        List<Singer> singers = singerController.searchSinger(id);
        System.out.println("---------STT-------NAME-------AGE-------");

        for (Singer singer: singers) {
            System.out.println("---------" + singer.getId() + "---------" + singer.getName() + "---------" + singer.getAge()+ "---------");
        }
        System.out.println("1: Go Back Menu Singer \n2: Go Back MENU \n3: Exit");
        String back = sc.nextLine();
        while (!back.equals("1") && !back.equals("2") && !back.equals("3")){
            System.out.println("1: Go Back Menu Singer \n2: Go Back MENU \n3: Exit");
            back = sc.nextLine();
        }
        if (back.equals("1")){
            new SingerView();
        }if (back.equals("2")){
            new Main();
        }if (back.equals("3")){
            System.exit(0);
        }
    }


    public void sortSinger(){
        System.out.println("---------STT-------NAME-------AGE-------");
        List<Singer> singerList = singerController.sortSinger();
        for (Singer singer: singerList) {
            System.out.println("---------" + singer.getId() + "---------" + singer.getName() + "---------" + singer.getAge()+ "---------");
        }
        System.out.println("1: Go Back Menu Singer \n2: Go Back MENU \n3: Exit");
        String back = sc.nextLine();
        while (!back.equals("1") && !back.equals("2") && !back.equals("3")){
            System.out.println("1: Go Back Menu Singer \n2: Go Back MENU \n3: Exit");
            back = sc.nextLine();
        }
        if (back.equals("1")){
            new SingerView();
        }if (back.equals("2")){
            new Main();
        }if (back.equals("3")){
            System.exit(0);
        }

    }
    public SingerView(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENU Singer");
        System.out.println("1: Show List Singer");
        System.out.println("2: Creat Singer");
        System.out.println("3: Update Singer");
        System.out.println("4: Detail Singer");
        System.out.println("5: Delete Singer ");
        System.out.println("6: Sort Singer");
        System.out.println("0: Back To Menu");
        int choiceMenu = scanner.nextInt();
        switch (choiceMenu){
            case 0:
                new Main();
                break;
            case 1:
                showSinger();
                break;
            case 2:
                creatSinger();
                break;
            case 3:
                editSinger();
                break;
            case 4:
                searchSinger();
                break;
            case 5:
                removeSinger();
                break;
            case 6:
                sortSinger();
                break;
        }
    }


//    private boolean isValidate(int id){
//        int size = singerController.showSinger().size();
//        return id >= 0 && id< size;
//    }

}

