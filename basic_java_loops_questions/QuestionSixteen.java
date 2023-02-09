import java.util.Scanner;
public class QuestionSixteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the value of n (n>0) : ");
        n = input.nextInt();
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 7 == 0) {
                    System.out.print("FizzBuzz" + " ");
                } else if (i % 3 == 0) {
                    System.out.print("Fizz" + " ");
                } else if (i % 7 == 0) {
                    System.out.print("Buzz" + " ");
                } else {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Wrong input n should be greater than 0");
        }
    }
}