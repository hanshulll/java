import java.util.Scanner;
 class EnhancedLoop{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = input.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=input.nextInt();
        }
        for(int i : arr){
            System.out.print(i+" ");
        }

    }
 }