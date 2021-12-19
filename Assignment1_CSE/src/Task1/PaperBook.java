package Task1;

public class PaperBook extends Book{
	private double shippingWieght;
	private String inStock;
	public PaperBook(String isbn,String title,String author,double price,double shippingWieght,String inStock ) {
		super(isbn,title,author,price);
		this.shippingWieght=shippingWieght;
		this.inStock=inStock;
	}
	@Override
	public String toString() {
		return ("ISBN:"+getIsbn()+",Title:"+getTitle()+", Author:"+getAuthor()+", Price:"+getPrice()+",ShippingWieght:"+shippingWieght+",InStock:"+inStock+"STOCK");
		
	}
	

}
