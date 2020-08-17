package String;

import java.util.Scanner;

public class abc {

	class bc {

		int id;
		String name;

		public void abc(int id, String name) {

			this.id = id;
			this.name = name;

		}

		public void show(int id, String name) {
			System.out.println("id is :" + id);
			System.out.println("name is: " + name);

		}
	}

	public static void main(String[] args) {
		abc b1 = new abc();
		bc b = b1.new bc();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter id :");
		b.id = sc.nextInt();
		System.out.println("Enter name");
		b.name = sc.next();
		

	}

}
