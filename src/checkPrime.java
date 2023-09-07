import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a number");
        int a = input.nextInt();
        boolean check = true;

        if (a < 2) {
            System.out.println("it's a prime");
        } else {
            int i = 2;
            while (i < a) {
                if (a % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
        }
        if (check) {
            System.out.println(a + " is a prime");
        } else {
            System.out.println(a + " is not a prime");
        }
    }
}
