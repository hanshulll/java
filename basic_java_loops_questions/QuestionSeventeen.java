import java.util.Scanner;
public class QuestionSeventeen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the value of n (n>0) : ");
        n=input.nextInt();
        input.close();
        int sum=0;
        if(n>0){
            for (int i =1;i<=n;i++){
                sum+=i;

            }
            int avg = sum/n;
            System.out.println("Sum : "+sum);
            System.out.println("Avg : "+avg);
        }
        else {
            System.out.println("Wrong input !! n should be greater than 0 !!");
        }
    }
}
