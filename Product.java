//Class product
//Composition
//Has-A relationship
public class Product {

	private String desc;
	private double price;
	private Date dateOfManufacture; //Composition

	//Constructor
	public Product () {
		this("None",0.00,new Date());
	}
	public Product(String d, double p, Date dom) {
		setDesc(d);
		setPrice(p);
		setDOM(dom);
	}

	//Mutator and Accessor methods

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setDOM(Date d) {
		dateOfManufacture = d;
	}

	//Get methods
	public String getDesc() {
		return this.desc;
	}
	public double getPrice() {
		return price;
	}
	public Date getDOM() {
		return dateOfManufacture; //Address of date object
	}

	public String toString() {
		return String.format("%s: %s\n%s: %.2f\n%s: %s\n",
			"Description",getDesc(),"Price",getPrice(),
			"Date of Manufacture", getDOM());
	}
}