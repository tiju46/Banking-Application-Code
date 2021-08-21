import java.util.Scanner;

public class bankingclass {

    int amount;
    int balance;
    int prevoiustransaction;


    public void deposit(int amount){
        balance += amount;
        prevoiustransaction = amount;
    }

    public void withdraw(int amount){
        balance -= amount;
        prevoiustransaction = -amount;
    }

    public void prevtrans(){

        if(prevoiustransaction > 0){
            System.out.println("Deposited ...." +prevoiustransaction);
        }else if(prevoiustransaction<0){
            System.out.println("Withdraw ...." +Math.abs(prevoiustransaction));
        }else{
            System.out.println("No Transaction Happened");
        }

    }
    public void showmenu(){
        char options;
        Scanner scan = new Scanner(System.in);

        System.out.println("A   -  Deposit");
        System.out.println("B   -  Withdraw");
        System.out.println("C   -  Prev-Transaction");
        System.out.println("D   -  Exit");
        do{
            System.out.println("Enter Your Choice");
            options = scan.next().charAt(0);

            switch (options){
                case 'A':
                    System.out.println("Enter amount to deposit");
                    amount = scan.nextInt();
                    deposit(amount);
                    System.out.println("Amount Deposited....."+balance);
                    break;
                case 'B':
                    System.out.println("Enter amount to withdraw");
                    amount = scan.nextInt();
                    withdraw(amount);
                    System.out.println("Amount withdrawn...." +balance);
                    break;
                case 'C':
                    System.out.println("Your Previous Transaction");
                    prevtrans();
                    break;
                case 'D':
                    System.out.println("Thank you for your time");
                    break;
                    default:
                        System.out.println("Please Enter Correct Choice");

            }


        }while(options != 'D');
    }

    public static void main(String[] args) {
        bankingclass bank = new bankingclass();
        bank.showmenu();
    }
}
