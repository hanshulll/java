public class QuestionEleven{
	public static void main(String[] args){
		for(int i =97;i<=122;i+=4){
			System.out.printf("%c ",i);
			if(i-30==91){
				break;
			}
			else
			System.out.printf("%c ",i-30);

		}
		System.out.printf("\n");
	}
}