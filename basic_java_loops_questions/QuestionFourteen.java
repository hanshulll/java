import java.util.Scanner;
public class QuestionFourteen{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] array = new int[n];
        int [] array1 = new int[100];
        for(int i =0;i<n;i++){
            array[i]=input.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
            array1 [0]= array[i];
            for(int j=0;j<array[i];){
                array1[j] /= 3;
                if (array1[j] == 0) {
                    break;
                }
                System.out.print(array1[j] + " ");

            }
            System.out.println("");
        }

    }
}
