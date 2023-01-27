import java.util.Scanner;

public class QuestionSeventh{

    public static void main(String [] args){
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter the value of n : ");
    	int num1 = input.nextInt();
    	int output;
        if(num1<=0){
        	System.out.println("Invalid output!!");
        }

        else
    	for(int i = 0; i<num1; i+=3){
    		output = num1-i;
    		System.out.println(output+" ");

    	}
    	System.out.print("\n");
    }
	
}