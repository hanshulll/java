import java.util.Scanner;

public class QuestionFifth{

    static int PrintInfo(int num1){
    	System.out.print("The series for n is : ");
    	for(int i = 3;i<num1;i+=4){
    		System.out.print(i+" ");
    	}
    	System.out.print("\n");
    	return 0;
    }

	public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the value of n (n>3) : ");
    int num1 = input.nextInt();
    if(num1<=0 || num1<=3){
    	System.out.println("Invalid input");
    }
    else
    PrintInfo(num1);

	}


	}