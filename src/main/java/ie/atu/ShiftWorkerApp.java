package ie.atu;

public class ShiftWorkerApp {
    public ShiftWorkerApp() {
    }

    public class ShiftWorker extends ShiftWorkerApp {
    public ShiftWorker(String name, String gender, int shift, int age){
        super(name,gender,shift,age);
        name="dummy";
        gender="dummy";
        shift=0;
        age=0;

    }

    }
}