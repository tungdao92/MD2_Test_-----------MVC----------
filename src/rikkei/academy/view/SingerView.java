package rikkei.academy.view;

import rikkei.academy.controller.SingerController;
import rikkei.academy.model.Singer;

import java.util.List;
import java.util.Scanner;

import static jdk.nashorn.internal.runtime.UnwarrantedOptimismException.isValid;

public class SingerView {
    Scanner scanner = new Scanner(System.in);
    SingerController  singerController = new SingerController();
    public void viewSinger(){
        System.out.println("----------------------------------------");
        System.out.println("---------STT-------NAME-------AGE-------");
        List<Singer> singerList = singerController.showSinger();
        for (int i = 0; i < singerList.size(); i++) {
            System.out.println("---------"+ singerList.get(i).getId()+ "-------" + singerList.get(i).getName()+ "-------" + singerList.get(i).getAge()+"-------");
        }
        System.out.println("Enter 'back' return");
        String back = scanner.nextLine();
        if (back.equalsIgnoreCase("back")){
            new Main();
        }
    }
    public void creatSinger(){
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println(" Enter Age: ");
        int age = Integer.parseInt(scanner.nextLine());
        List<Singer> singerList = singerController.creatSinger(name, age);
        System.out.println("----------------------------------------");
        System.out.println("---------STT-------NAME-------AGE-------");
        for (int i = 0; i < singerList.size(); i++) {
            System.out.println("---------"+ singerList.get(i).getId()+ "-------" + singerList.get(i).getName()+ "-------" + singerList.get(i).getAge()+"-------");

            }
        System.out.println("Enter 'back' return");
        String back = scanner.nextLine();
        if (back.equalsIgnoreCase("back")){
            new Main();
        }
    }
    public void removeSinger(){
        System.out.println("Enter Id You Want to Delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        if (!isValidate(id)) {
            System.out.println("Not Pound");
            return;
        }
        System.out.println("You May Want To Delete (Y / N)?");
        String check = scanner.nextLine();
        if (check.equalsIgnoreCase("y")) {
            singerController.removeSinger(id);
        } else if (check.equalsIgnoreCase("n")) {
            System.out.println("Not Deleting");
        } else {
            System.out.println("Invalid choice");
        }


        System.out.println("----------------------------------------");
        List<Singer> singerList = singerController.showSinger();

        System.out.println("---------STT-------NAME-------AGE-------");
        for (int i = 0; i < singerList.size(); i++) {
            System.out.println("---------"+ singerList.get(i).getId()+ "-------" + singerList.get(i).getName()+ "-------" + singerList.get(i).getAge()+"-------");

        }
        System.out.println("Enter 'back' return");
        String back = scanner.nextLine();
        if (back.equalsIgnoreCase("back")){
            new Main();
        }
    }
    public void editSinger(){
        System.out.println("Enter Id Singer Want Edit: ");
        int idEdit = Integer.parseInt(scanner.nextLine());
        System.out.println("Edit Name: ");
        String nameEdit = scanner.nextLine();
        System.out.println("Edit Age: ");
        int ageEdit = Integer.parseInt(scanner.nextLine());
        List<Singer> singerList = singerController.editSinger(idEdit, nameEdit, ageEdit);
        System.out.println("----------------------------------------");
        System.out.println("---------STT-------NAME-------AGE-------");
        for (int i = 0; i < singerList.size(); i++) {
            System.out.println("---------"+ singerList.get(i).getId()+ "-------" + singerList.get(i).getName()+ "-------" + singerList.get(i).getAge()+"-------");
        }
        System.out.println("Enter 'back' return");
        String back = scanner.nextLine();
        if (back.equalsIgnoreCase("back")){
            new Main();
        }
    }
    public void searchSinger(){
        System.out.println("Enter Id Singer Want See: ");
        int id = Integer.parseInt(scanner.nextLine());
        List<Singer> singers = singerController.searchSinger(id);
        System.out.println("----------------------------------------");
        System.out.println("---------STT-------NAME-------AGE-------");

        for (int i = 0; i < singers.size(); i++) {
            System.out.println("---------"+ singers.get(i).getId()+ "-------" + singers.get(i).getName()+ "-------" + singers.get(i).getAge()+"-------");
        }
        System.out.println("Enter 'back' return");
        String back = scanner.nextLine();
        if (back.equalsIgnoreCase("back")){
            new Main();
        }
    }
    public void sortSinger(){
        System.out.println("----------------------------------------");
        System.out.println("---------STT-------NAME-------AGE-------");
        List<Singer> singerList = singerController.sortSinger();
        for (int i = 0; i < singerList.size(); i++) {
            System.out.println("---------"+ singerList.get(i).getId()+ "-------" + singerList.get(i).getName()+ "-------" + singerList.get(i).getAge()+"-------");
        }
        System.out.println("Enter 'back' return");
        String back = scanner.nextLine();
        if (back.equalsIgnoreCase("back")){
            new Main();
        }


    }
    private boolean isValidate(int id){
        int size = singerController.showSinger().size();
        return id >= 0 && id< size;
    }

}

