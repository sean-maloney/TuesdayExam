package ie.atu;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ShiftWorker user =new ShiftWorker();
        Scanner keyboard = new Scanner (System.in);
        user.getName();
        user.getGender();
        user.getShift();
        user.getAge();
        System.out.println("Hello, Please enter your details below: \n");
        System.out.println("Name: \n");
        user.setName(Scanner.nextLine());
        System.out.println("Gender: Male, Female, NB \n");
        user.setGender(Scanner.nextLine());
        System.out.println("Shift: 1 or 2 \n");
        user.setShift(Scanner.nextLine());
        System.out.println("Age: must be above 18 \n");
        user.setAge(Scanner.nextLine());
        user.displayInfo();
    }
}