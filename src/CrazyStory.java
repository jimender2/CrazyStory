import java.util.Scanner;
public class CrazyStory {

	public static void main(String[] args) {
			String name, city, adjective, state, college, profession, animal, petName, verb;
			int age;
			double pay;
			
			Scanner keyboard = new Scanner (System.in);
			System.out.print("Enter your Name: ");
			name = keyboard.nextLine();
			System.out.print("Enter your City: ");
			city = keyboard.nextLine();
			System.out.print("Enter an adjective: ");
			adjective = keyboard.nextLine();

			System.out.print("Enter your State: ");
			state = keyboard.nextLine();

			System.out.print("Enter your age: ");
			age = keyboard.nextInt();
			keyboard.nextLine();
			System.out.print("Enter your College: ");
			college = keyboard.nextLine();

			System.out.print("Enter your Profession: ");
			profession = keyboard.nextLine();

			System.out.print("Enter your Pay per hour: ");
			pay = keyboard.nextDouble();
			keyboard.nextLine();
			System.out.print("Enter your Animal: ");
			animal = keyboard.nextLine();

			System.out.print("Enter your Pet Name: ");
			petName = keyboard.nextLine();

			System.out.print("Enter a verb: ");
			verb = keyboard.nextLine();
			System.out.println("Once upon a time someone named " + name + " lived in " + city +
					" in the " + adjective + " state of " + state + ".   When " + age + " years old, "
					+ "");
			
			
	}

}
