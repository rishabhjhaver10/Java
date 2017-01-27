import java.util.Date;

public class NonFiction extends Book implements Comparable
 {
	public NonFiction(String title, Publisher publisher, String isbn, Date date, long price)
	{
		super(title, publisher, isbn, date);
		setPrice(price);
	}
	
	void setPrice(long price)
	{
	
		super.price = price;
	}


	public long calculateCharge(long sold)
	{	
		return 0;
	}

	
	public String toString()
	{
		return super.toString();
	}
	
	public boolean isEqual(Book book1)
	{
		if(this.isbn.equals(book1.isbn)) return true;
		
		return false;
	}
	
	public NonFiction clone()
	{
		return this;
	}
	
	
}
