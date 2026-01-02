import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter second number: ");
        int second = scanner.nextInt();

        if (first > second) {
            int temp = first;
            first = second;
            second = temp;
        }

    for (int i = first; i <= second; i++) {
    if (i % 2 == 0) {
        System.out.println(i);
    }
}

 

        scanner.close();
    }
}

