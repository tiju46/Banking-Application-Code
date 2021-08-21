import java.util.ArrayList;
import java.util.Scanner;

public class BaseClass {

    int userinput;
    int amount;
    long accountnum;
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> array = new ArrayList<Integer>();
    public void setUserinput(){
        System.out.println("Enter Your Choice");
        System.out.println("1 . Deposit");
        System.out.println("2 . Withdraw ");
        System.out.println("3 . Balance");

        userinput = scan.nextInt();
    }
    public void transaction(){
        switch (userinput){
            case 1:
                System.out.println("Enter Account Number");
                        accountnum = scan.nextInt();
                System.out.println("Enter Amount to Deposit");
                amount = scan.nextInt();
                array.add(amount);

                break;

            case 2:
                System.out.println("Enter Account number");
                accountnum = scan.nextInt();
                System.out.println("Enter Amount to withdraw");
                amount = scan.nextInt();
                array.add(amount);
                break;
            case 3:
                System.out.println("Enter Account Number");
                accountnum = scan.nextInt();
                if(accountnum == 1234){
                   display();
                }else {
                    System.out.println("Not Valid account");
                }
                break;
                default:
                    System.out.println("Please enter valid input");
                    break;

        }

        }
    public void display(){
        for(long value : array) {
            System.out.println("Amount Added " +value);
        }
    }

    public static void main(String[] args) {
        BaseClass base = new BaseClass();
        base.setUserinput();
        base.transaction();
       //3 base.display();


    }
}
