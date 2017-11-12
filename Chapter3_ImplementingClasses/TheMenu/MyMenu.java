package EKPL.Chapter3_ImplementingClasses.TheMenu;

/**
 * Created by Sheldon on 10/13/2016.
 * A menu that is displayed on a console
 */
public class MyMenu {
    private String menutText;
    private int optionCount;

    /**
     * Constructs a menu with no options.
     */
    public MyMenu() {
        menutText = "";
        optionCount = 0;
    }

    /**
     * Adds an option to the end of this menu.
     *
     * @param option the option to add
     */
    public void addOption(String option) {
        optionCount = optionCount + 1;
        menutText = menutText + optionCount + ")" + option + "\n";
    }

    /**
     * Displays the menu on the console
     */
    public void display() {
        System.out.println(menutText);
    }
}