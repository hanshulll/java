import java.util.Scanner;
public class QuestionFourth{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int  num1 = input.nextInt();
		System.out.printf("The even number till %d are : ",num1);

		if(num1<0){
		    System.out.println("Wrong input");
		}
		else{
		for(int i=0;i<=num1;i++){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
	System.out.println("");
	}
}
}