import java.util.ArrayList;

class ArrayListPractice
{
	public static void main(String[] args)
	{
		ArrayList<String> names1 = new ArrayList<String>();
		ArrayList<String> names2 = new ArrayList<String>();

		names1.add("Emily");
		names1.add("Bob");
		names1.add("Cindy");

		names2.add("Dave");

		System.out.println("---Before appending---");

		System.out.println("The contents of names1 are given below: ");


		for(int i=0; i<names1.size(); i++)
			System.out.println(names1.get(i));

		System.out.println();

		System.out.println("The contents of names2 are given below: ");

		for(int i=0; i<names2.size(); i++)
			System.out.println(names2.get(i));

		append(names1, names2);
	}

		public static void append(ArrayList<String> names1, ArrayList<String> names2)
		{
 			for (int i = 0; i < names2.size(); i++)
 			{
 				names1.add(names2.get(i));
 			}

 		System.out.println();
		System.out.println();


 		System.out.println("---After appending---");	

		System.out.println("The contents of names1 are given below: ");

		for(int i=0; i<names1.size(); i++)
			System.out.println(names1.get(i));

		System.out.println();

		System.out.println("The contents of names1 are given below: ");

		for(int i=0; i<names2.size(); i++)
			System.out.println(names2.get(i));
		}
}


	
