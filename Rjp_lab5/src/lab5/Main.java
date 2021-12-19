package lab5;
import java.util.*;
public class Main {

	public static void main(String[] args) {
	
		System.out.println("Enter a string");
		Scanner input = new Scanner(System.in);
		String st=input.nextLine();
		
		System.out.println(countVowels(st));
	}
		public static int countVowels(String sentence) {
			
			int count=0;

		      for (int i=0 ; i<sentence.length(); i++){
		         char ch = sentence.charAt(i);
		         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
		            count ++;
		         }
		      }
		      return count;
		}


}
