import java.util.Scanner;

public class QuestionEight{


	static int PrintInfo(int num1,int k){
		int output;

		for(int i =0;i<num1;i++){
			output=num1-(i*k);
			if(output<=0)
				break;
			System.out.print(output+" ");
			
		}
		System.out.println("");
		return 0;
	}
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of n and k : ");
		int num1 = input.nextInt();
		int k = input.nextInt();
		PrintInfo(num1,k);

	}
}