import java.util.Scanner;
public class QuestionFifteen {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the value of n (n>0) : ");
        n=input.nextInt();
        int [] array = new int[n];
        for(int i =0;i<n;i++){
            array[i] = input.nextInt();
        }
        for (int i = 0;i<n;i++){
            for(int j=3;j<=array[i];j++){
                if(j%3==0){
                    System.out.print(j+" ");
                }
                else if(j%5==0){
                    System.out.print(j+" ");
                }
            }
            System.out.println("");
        }
    }
}
