import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any integer number: ");
        int a = scanner.nextInt();

        if (a < 2) {
            System.out.println(a + " is not a prime");
        } else if (a == 2) {
            System.out.println(a + " is a prime");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(a)) {
                if (a % Math.sqrt(i) == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(a + " is a prime");
            } else {
                System.out.println(a + " is not a prime");
            }
        }
    }
}


