import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Вкажіть на скільки футів равлик піднімається по дереву на день.(a)");
        int a = scan.nextInt();

        System.out.println("Вкажіть на скільки равлик щоночі сповзає вниз.(b)");
        int b = scan.nextInt();

        System.out.println("Вкажіть висоту дерева.(h)");
        int h = scan.nextInt();

        if (a >= h) {
            System.out.println(1);
        } else if (a <= b) {
            System.out.println("Impossible");
        } else {
            int number = 0;
            int digit = 0;
            while (digit < h) {
                number++;
                digit = digit + a;
                if (digit >= h) {
                    break;
                } else {
                    digit = digit - b;
                }
            }
            System.out.println(number);
        }


    }
}