import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        String userName, password;
        int balance = 1000;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int select;
        while (right > 0) {
            System.out.print("Enter Username:");
            userName = input.nextLine();
            System.out.print("Enter Password:");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Hi, Welcome to Kodluyoruz Bank.");
                do {
                    System.out.println("1-Deposit\n" +
                            "2-withdraw\n" +
                            "3-Balance inquiry\n" +
                            "4-Exit");
                    System.out.println();
                    System.out.println("Please Select The Operation You Want To Perform :");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.println("Enter The Amount");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.println("Enter The Amount");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("your balance is insufficient");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("Your Balance:" + balance);
                    }
                } while (select != 4);
                System.out.println("See You Later.");
                break;
            } else {
                right--;
                System.out.println("Incorrect Username or Password. Try again.");
                if (right == 0) {
                    System.out.println("Your Account Has Been Blocked, Please Contact The Bank.");
                } else {
                    System.out.println("Your Remaining Right :" + right);
                }
            }
        }
    }
}

