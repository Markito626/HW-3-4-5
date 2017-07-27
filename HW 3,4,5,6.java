package Checkbook;
import java.io.IOException;
import java.util.Scanner;
public class Main extends Check {

    public static void Main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
    }

    public static void checkmaker() {
        do {
            System.out.println("Welcome to Mark's Check maker");
            System.out.println("1 Show account Balance ");
            System.out.println("2 Write a check ");
            System.out.println("3 Make a new check book ");
            System.out.println("4 Print single check ");
            System.out.println("5 Exit");
            System.out.println("Enter Choice");
            try {
                choice = scan.nextInt();
            } catch (Exception e) {
                System.out.println("error try again");
                break;
            }
            if (choice < 1 || choice > 6) {
                System.out.println("Invaild number");
            } catch (IOException e) {
                System.out.println("Unable to accept entered information");
                else {
                    switch (choice) {
                        case 1:
                    }
                    try {
                        Checkregister.checkadder();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        break;
                        case 2:
                            try {
                                user.chckmaker();
                            } catch (IOException e1) {
                                e1.printStackTrace();
                            }
                            break;

                        case 3:
                            try {
                                user.newcheckbook();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                            case 4:
                            try {
                                user.singleprinter();
                                } catch (IOException e) {
                                e.printStackTrace();}
                        case 5:
                            System.out.println("exit");
                            System.exit(choice);
                    }
}
            }
            while (choice != 6)
            sc.close();
        }
    }
}