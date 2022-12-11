import java.util.Scanner;

public class GoDutch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Вкажіть кількість людей.");
        int number = scan.nextInt();


        System.out.println("Вкажіть сумму рахунку.");
        int amount = scan.nextInt();

        if (number <= 0) System.out.println("Number of friends cannot be negative or zero");
        else if (amount <= 0) System.out.println("Bill total amount cannot be negative.");
        else {
           int i = (int) ((amount) + (amount* 0.10));
           int b = i / number;

           System.out.println(b);
        }


    }

}