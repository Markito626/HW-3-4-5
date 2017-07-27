package Checkbook;
import java.io.IOException;
import java.io.Serializable;
import java.io.*;

public class Checkbook implements Serializable {

    public double balance;
    public Check myCheck;
    public Check[] checklist = new Check[10];

    public Checkbook() {
        balance = 1000.0;
    }
    public void addCheck(Check newCheck) {
        Check[] checklist = new Check[10];


        public void write checkbook() {
            Check c1 = new Check("date",int checknumber, "reason", "payee", amount);

            try {
                FileOutputStream f = new FileOutputStream("Hw4.txt,true");
                ObjectOutputStream out = new ObjectOutputStream(f);

                out.writeObject(c1);
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Unable to Serialize the object");

        }
    }
}