import java.util.Date;

public abstract class Book {

	private String title;
	private String isbn;
	private double price;
	private Date date;
	private Publisher publisher;
	
	public Book(String title, Publisher publisher, String isbn, Date date)
	{
		this.title = title;
		this.isbn = isbn;
		this.date = date;
		this.publisher = publisher;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public Publisher getPublisher()
	{
		return this.publisher;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public Date getDate()
	{
		return this.date;
	}
	
	abstract void setPrice(long price);

	public void setTitle(String title)
	{
		this.title = title;
	}

	public void setISBN(String isbn)
	{
		this.isbn = isbn;
	}
	
	public void setDate(Date date)
	{
		this.date = date;
	}
	
	abstract public long calculateCharge(long sold);
	
	public String toString(){
		return "Book Title:" + this.title + "\nBook ISBN:" + this.isbn + "\nPublisher " + this.publisher.toString() + "\nPrice:" + this.price + "\nDate:" + this.date ;
	}
}
