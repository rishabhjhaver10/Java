import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BooksDemo 
{

	public static void main(String [] args) throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf.parse("2016-05-06");
		Date date2 = sdf.parse("2016-04-07");
		Fiction fiction = new Fiction("Book 1",new Publisher("Publisher 1","Mumbai"), "46457894121241", date1 , 50);
	 	NonFiction nonFiction = new NonFiction("Book 2", new Publisher("Publisher 2", "Ahmedabad"), "5646102456578", date2, 100);

	 System.out.println("Displaying Fiction object:\n" + fiction.toString());
	 System.out.println("=========================");
	 System.out.println("Displaying Non Fiction object:\n" + nonFiction.toString());
	 System.out.println("=========================");
	 System.out.println("Calling the clone function of fiction object to copy to ficton2 object");

	 Fiction fiction2 = fiction.clone();

	 System.out.println("Displaying fiction2 object:\n" + fiction2.toString());
	 System.out.println("=========================");
	 
	 System.out.println("Calling isEqual function of finction object on fiction2 object");
	 
	 if(fiction.isEqual(fiction2))
		 System.out.println("fiction and fiction2 objects are same");
	 else
		 System.out.println("fiction and fiction2 objects are not same");
	 
	}
}