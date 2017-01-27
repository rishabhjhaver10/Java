public class Publisher
 {
	private String name, state;
	
	public Publisher(String name , String state)
	{
		this.name = name;
		this.state = state;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getState() 
	{
		return state;
	}

	public void setState(String state) 
	{
		this.state = state;
	}
	
	public String toString()
	{
		return "Name:"+this.name +" State:"+this.state;
	}

}
