package Checkbook;
import java.util.Scanner;
public class Check {
    private String date;
    private int check;
    private String reason;
    private String payee;
    private double amount;
    static Scanner scan = new Scanner(System.in);

    public Check(double a, String d, int c, String p, String r) {
        amount = a;
        date = d;
        check = c;
        payee = p;
        reason = r;
    } 
    public double getAmount() {
        return amount;
    }
    public String getDate() {
        return date;
    }
    public int getChecknumber() {
        return check;
    }
    public String getPayee() {
        return payee;
    }
    public String getReason() {
        return reason;
    }
    public void printCheck() {
        System.out.println("amount");
        System.out.println("date");
        System.out.println("checknumber");
        System.out.println("payee");
        System.out.println("reason");
        }
    public void quitscanner() 
     {
        scan.close();        
    }
}