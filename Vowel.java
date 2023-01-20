import java.util.Scanner;
import java.util.Scanner;

public class Vowel{

	public static void main(String[] args) {
		
		char letter;
		System.out.println("Enter the character to check the vowel");
		Scanner scanner=new Scanner(System.in);
		letter=scanner.next().charAt(0);
		switch(letter)
		{
		case 'A':
			System.out.println("vowel");
			break;
		case 'E':
			System.out.println("vowel");
			break;
		case 'I':
			System.out.println("Vowel");
				break;
		case 'O':
			System.out.println("Vowel");
				break;
		case 'U':
			System.out.println("Vowel");
				break;
		case 'a':
			System.out.println("Vowel");
				break;
		case 'e':
			System.out.println("Vowel");
				break;
		case 'i':
			
			System.out.println("Vowel");
				break;
		case 'o':
			System.out.println("Vowel");
				break;
		case 'u':
			System.out.println("Vowel");
				break;
		default: System.out.println("Consonent");
		break;
		
	
		}
		
		System.out.println("end of main");
		
	}
}
