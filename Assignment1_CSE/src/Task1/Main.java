package Task1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String Isbn=input.next();
		String Title=input.next();
		String Author=input.next();
		double Price=input.nextDouble();
		String DownloadUrl=input.next();
		double SizeMB=input.nextDouble();
		
		EBook ebook=new EBook(Isbn,Title,Author,Price,DownloadUrl,SizeMB);
		System.out.println(ebook.toString());
		
		
		
		String Isbn1=input.next();
		String Title1=input.next();
		String Author1=input.next();
		double Price1=input.nextDouble();
		double shippingWieght=input.nextDouble();
		String inStock=input.next();
		PaperBook paperbook=new PaperBook(Isbn1,Title1,Author1,Price1,shippingWieght,inStock);
		System.out.println(paperbook.toString());
	

	}

}
