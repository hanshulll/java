import java.util.Scanner;
public class QuestionFourteenVersionThree {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] array = new int[n];
        for(int i =0;i<n;i++){
            array[i]=input.nextInt();
        }
        int m;
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
            m = array[i];
            for(int j=0;j<array[i];){
                m/= 3;
                if (m == 0) {
                    break;
                }
                System.out.print(m + " ");

            }
            System.out.println("");
        }

    }
}