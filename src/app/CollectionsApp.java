package app;


import app.Controller.UserController;

import java.util.Scanner;

public class CollectionsApp {
    public static void main(String[] args) {
        UserController userController = new UserController();
        userController.displayUsers();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of the user: ");
        int index = scanner.nextInt();

        getOutput(userController,index);

        scanner.close();
    }
    public static void getOutput(UserController userController, int index){
        System.out.println("Result: ");
        userController.displayUser(index);
    }
}
