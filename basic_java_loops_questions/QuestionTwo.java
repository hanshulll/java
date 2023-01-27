import java.util.Scanner;

public class QuestionTwo{

    static int Descending(int num1,int num2){
    	System.out.printf("Number between %d and %d = ",num2,num1);
    	for(int j = num2;j>=num1;j--){
    		System.out.print(j+" ");
    	}
    	System.out.print("\n");
		return 0;
	}


	static int Ascending(int num1,int num2){
		System.out.printf("Number between %d and %d =  ",num1,num2);
		for(int i=num1;i<=num2;i++){
			System.out.print(i+" ");
		}
		System.out.print("\n");
		return 0;
	}

 

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of n and m : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		Ascending(num1,num2);
		Descending(num1,num2);

	
}
}