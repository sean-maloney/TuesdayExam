package ie.atu;
import java.util.Scanner;
public class ShiftWorker {
    private String name;
    private String gender;
    private int shift;
    private int age;

    public ShiftWorker() {
        name= "Invalid name";
        gender= "Invalid Gender";
        shift= 0;
        age=0;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getShift() {
        return shift;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
        if(name<6 && name>21){
            System.out.println("Invalid name Error \nTry Again\n");
        }
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setShift(int shift) {
        this.shift = shift;
        if(shift<1&&shift>2){
            System.out.println("Wrong Shift entered\nTry again\n");
        }
    }

    public void setAge(int age) {
        this.age = age;
        if (age<18){
            System.out.println("Age must be at least 18\nTry again\n");
        }
    }

    public void displayInfo(){
        System.out.println("Name: "+name +" Gender: "+gender+" Shift: "+shift+" Age: "+age);
    }
}
