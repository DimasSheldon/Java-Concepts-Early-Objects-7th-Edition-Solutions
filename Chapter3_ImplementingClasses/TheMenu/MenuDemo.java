package EKPL.Chapter3_ImplementingClasses.TheMenu;

/**
 * Created by Sheldon on 10/13/2016.
 */
public class MenuDemo {
    public static void main(String[] args) {
        MyMenu mainMenu = new MyMenu();
        System.out.println("This is our menu's option:");
        mainMenu.addOption("Open new account");
        mainMenu.addOption("Log into existing account");
        mainMenu.addOption("Help");
        mainMenu.addOption("Quit");
        mainMenu.display();
    }
}