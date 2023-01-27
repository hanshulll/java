import java.util.Scanner;

public class QuestionThird{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of n and m : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
        int multiple=0;
		for(int i = 0;i<num2;i++){
				multiple=i*num1;
				System.out.print(multiple+" ");
				if(multiple>=num2)
				break;

		}

	}
}