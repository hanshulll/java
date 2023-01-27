import java.util.Scanner;
public class QuestionSixth{

	static int Ascending(int num1,int num2){
		
		if(num1<num2){
			System.out.printf("Odd numbers from %d to %d are : ",num1,num2);
			for(int i = num1;i<num2;i++){
				if(i%2!=0){
					System.out.print(i+" ");
				}
		}
		System.out.print("\n");
		}
		return 0;
	    }
	static int Dscending(int num1,int  num2){
		if(num1>num2){
			System.out.printf("Odd numbers from %d to %d are : ",num1,num2);
			for(int i =num1;i>num2;i--){
				if(i%2!=0){
					System.out.print(i+" ");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}


	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of m and n : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		Ascending(num1,num2);
		Dscending(num1,num2);

	}
}