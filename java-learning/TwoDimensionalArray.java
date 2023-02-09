import java.util.Scanner;
public class TwoDimensionalArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int row = input.nextInt();
        System.out.print("Enter the number of columns : ");
        int column = input.nextInt();
        int [][] arr = new int[row][column];
        System.out.println();
        for (int i =0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=input.nextInt();
            }
        }
        input.close();
        System.out.println();
        for (int j=0;j<row;j++ ){
            for (int i =0;i<column;i++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }


    }
}

