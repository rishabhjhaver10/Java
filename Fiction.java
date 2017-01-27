import java.util.Date;

public class Fiction extends Book implements Comparable 
{

	public Fiction(String title, Publisher publisher, String isbn, Date date, long price)
	{
		super(title, publisher, isbn, date);
		setPrice(price);
	}

	void setPrice(double price) 
	{
		super.price = price;
	}

	public long calculateCharge(long sold)
	{
		return 0;
	}

	
	public boolean isEqual(Book book1)
	{
		if(this.isbn.equals(book1.isbn)) 
			return true;
		
		return false;
	}

	public Fiction clone(){
		return this;
	}
	
	public String toString()
	{
		return super.toString();
	}
}
