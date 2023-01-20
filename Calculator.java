import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=0,num=0;
		char ch;
		Scanner scanner=new Scanner(System.in);
		do
		{
			System.out.println("Enter the number to add");
			num=scanner.nextInt();//100 200
			res=res+num;//0=0+100 // 100=100+200=300
			System.out.println("Press + to add and = for stop");
			ch=scanner.next().charAt(0);
		}while(ch=='+');//+==+
		System.out.println("result of addition is -->"+res);
		
	}

}
