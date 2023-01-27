import java.util.*;
public class QuestionThirteen{
	public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n;
    System.out.print("Enter the value of n : ");
    n = input.nextInt();
    int[] array = new int[n];
    for (int i = 0;i<n;i++){
     System.out.printf("Enter the element number %d : ",i);
     array[i] = input.nextInt();
    }

    for(int i=0;i<n;i++){
    	if(array[i]%2!=0){
    		System.out.println("odd");
    	}
    	else
    		System.out.println("even");
    }
	}
}