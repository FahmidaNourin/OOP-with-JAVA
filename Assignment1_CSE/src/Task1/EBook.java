package Task1;

public class EBook extends Book{
	private String downloadUrl;
	private double sizeMB;
	
	public EBook(String isbn,String title,String author,double price,String downloadUrl,double sizeMB) {
		super(isbn,title,author,price);
		this.downloadUrl=downloadUrl;
		this.sizeMB=sizeMB;
		
		
		
	}
	@Override
	public String toString() {
		
		return ("ISBN:"+getIsbn()+", Title:"+getTitle()+", Author:"+getAuthor()+", Price:"+getPrice()+", Download Link:"+downloadUrl+", Size:"+sizeMB+"MB");
		
	}

}
