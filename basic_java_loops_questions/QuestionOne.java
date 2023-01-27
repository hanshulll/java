import java.util.Scanner;
public class QuestionOne{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int num = input.nextInt();
		for(int i=1;i<=num;i++){
			System.out.println(i);
		}

	}
}