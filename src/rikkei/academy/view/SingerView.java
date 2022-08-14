package rikkei.academy.view;
import rikkei.academy.controller.SingerController;
import rikkei.academy.model.Singer;
import java.util.List;
import java.util.Scanner;

import static jdk.nashorn.internal.runtime.UnwarrantedOptimismException.isValid;

public class SingerView {
//    Scanner sc = new Scanner(System.in);
    SingerController  singerController = new SingerController();
    public void showSinger(){
        List<Singer> singerList = singerController.showSinger();
        System.out.println("|       STT       NAME           AGE        |");
        for (Singer singer: singerList) {
            System.out.println("|       " + singer.getId() + "         " + singer.getName() + "           " + singer.getAge()+ "       |" );
        }
//        for (int i = 0; i < singerList.size(); i++) {
//            System.out.println("---------"+ singerList.get(i).getId()+ "-------" + singerList.get(i).getName()+ "-------" + singerList.get(i).getAge()+"-------");
//        }
     backMenu();
    }




    public void creatSinger(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println(" Enter Age: ");
        int age = Integer.parseInt(sc.nextLine());
        List<Singer> singerList = singerController.creatSinger(name, age);
        System.out.println("|       STT       NAME           AGE        |");
        for (Singer singer: singerList) {
            System.out.println("        " + singer.getId() + "         " + singer.getName() + "           " + singer.getAge()+ "        " );
        }
      backMenu();
    }



    public void removeSinger(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Id You Want to Delete: ");
        int id = Integer.parseInt(sc.nextLine());
        if (!isValid(id)) {
            System.out.println("Not Pound");
            new SingerView();
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
        System.out.println("|       STT       NAME           AGE        |");
        for (Singer singer: singerList) {
            System.out.println("        " + singer.getId() + "         " + singer.getName() + "           " + singer.getAge()+ "        " );
        }
        backMenu();
    }




    public void editSinger(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id Of The Song You Want To Edit");
        int idEdit = Integer.parseInt(sc.nextLine());
        System.out.println("Edit Name: ");
        String nameEdit = sc.nextLine();
        System.out.println("Edit Age: ");
        int ageEdit = Integer.parseInt(sc.nextLine());
        List<Singer> singerList = singerController.editSinger(idEdit, nameEdit, ageEdit);
        System.out.println("|       STT       NAME           AGE        |");
        for (Singer singer: singerList) {
            System.out.println("        " + singer.getId() + "         " + singer.getName() + "           " + singer.getAge()+ "        " );
        }
        backMenu();
    }




    public void detailSinger(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id Singer Want See: ");
        int idSee = Integer.parseInt(sc.nextLine());
        List<Singer> singers = singerController.detailSinger(idSee);
        System.out.println("|       STT       NAME           AGE        |");
        for (Singer singer: singers) {
            System.out.println("        " + singer.getId() + "         " + singer.getName() + "           " + singer.getAge()+ "        " );
        }
        backMenu();
    }




    public void sortSinger(){
        System.out.println("|       STT       NAME           AGE        |");
        List<Singer> singerList = singerController.sortSinger();
        for (Singer singer: singerList) {
            System.out.println("        " + singer.getId() + "         " + singer.getName() + "           " + singer.getAge()+ "        " );
        }
       backMenu();
    }




    public SingerView(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nMENU SINGER");
        System.out.println("1: Show List Singer");
        System.out.println("2: Creat Singer");
        System.out.println("3: Update Singer");
        System.out.println("4: Detail Singer");
        System.out.println("5: Delete Singer ");
        System.out.println("6: Sort Singer");
        System.out.println("0: Back To Menu");
        try {
            int choiceMenu = scanner.nextInt();
            while (choiceMenu != 0 && choiceMenu != 1 && choiceMenu != 2 && choiceMenu != 3 && choiceMenu != 4 && choiceMenu != 5 && choiceMenu != 6){
                System.out.println("Enter Again");
                new SingerView();
            }
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
                    detailSinger();
                    break;
                case 5:
                    removeSinger();
                    break;
                case 6:
                    sortSinger();
                    break;
            }

        }
        catch (Exception e){
            System.out.println("Enter Again");
            new SingerView();
        }
    }


    private boolean isValid(int id){
        int size = singerController.showSinger().size();
        return id >= 0 && id<= size;
    }

    public void backMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter Any Character Go To Back SINGER MENU");
        System.out.println("1: Go Back MENU");
        System.out.println("0: Exit");
        try {
            int back = Integer.parseInt(scanner.nextLine());
            while (back != 0 && back !=1){
                new SingerView();
            }
            switch (back){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    new Main();
            }
        }
        catch (Exception e){
            new SingerView();
        }
    }

}

