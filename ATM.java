
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pkeer
 */
public class ATM {

    public static void main(String[] args) {
        int pin = 1234;
        int balance = 10000;
        int AddAmount = 0;
        int TakeAmount = 0;
        String name;
        Scanner scanner = new Scanner(System.in);
        //We have to take an input by an user
        System.out.println("Enter your pin number");
        int password = scanner.nextInt();
        //code arrangement shift+alt+f
        if (password == pin) {
            System.out.println("Enter your name");
            name = scanner.next();
            System.out.println("Welcome " + name);

            while (true) {
                System.out.println("Press 1 to check your balance");
                System.out.println("Press 2 to deposit amount");
                System.out.println("Press 3 to Withdraw amount");
                System.out.println("Press 4 to receive receipt");
                System.out.println("Press 5 to EXIT");

                int opt = scanner.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("Your corrent balance is " + balance);
                        break;
                    case 2:
                        System.out.println("How much amount do you want to Add amount to your account?");
                        AddAmount = scanner.nextInt();
                        System.out.println("Amount Successfully Added");
                        balance = AddAmount + balance;
                        break;
                    case 3:
                        System.out.println("How much amount do you want to withdraw from your account?");
                        TakeAmount = scanner.nextInt();
                        if (TakeAmount > balance) {
                            System.out.println("your balance is insufficient. Please try less than your available balance");
                        } else {
                            System.out.println("Transaction Successfully processed! Please take your amount");
                        }
                        balance = balance - TakeAmount;
                        break;
                    case 4:
                        System.out.println("Welcome to All in One mini ATM");
                        System.out.println("Available balance is " + balance);
                        System.out.println("Credited Amount " + AddAmount);
                        System.out.println("Debited Amount " + TakeAmount);
                        System.out.println("Thanks for coming");
                        break;
                    case 5:
                        System.out.println("Thank You");
                        break;
                    default:
                        System.out.println("Please Enter 5 to EXIT");
                        break;
                }
                if (opt == 5) {
                    break;
                }
            }
        } else {
            System.out.println("The entered Pin number is worng! Please enter the correct pin number");
        }

    }
}
