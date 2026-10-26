package model;

import java.util.Scanner;

public class User {

    private int Id;

    Scanner scan = new Scanner(System.in);

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
    
    public void createNotification(){

        int user_Id;
        String user_name;
        String title;
        String type;
        System.out.println("Enter the User Id :");
        user_Id=scan.nextInt();
    }



    


}
