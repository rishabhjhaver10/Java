//Array list basics

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {

		//Create an ArrayList

		//ArrayList<type> variable = new ArrayList<type>();

		ArrayList<String> students = new ArrayList<String>();

		ArrayList<Balloon> baloons = new ArrayList<Balloon>();

		System.out.println("Size of student list = " +
			students.size());

		//Add names to students
		students.add("Kate");
		students.add("James");

		System.out.println("Size of student list = " +
			students.size());

		System.out.println();

		for(int i=0; i<students.size(); i++)
			System.out.println(students.get(i));

		System.out.println();

		for(String student : students)
			System.out.println(student);


		Balloon b1 = new Balloon(4);
		Balloon b2 = new Balloon(6);

		baloons.add(b1);
		baloons.add(b2);

	}

}