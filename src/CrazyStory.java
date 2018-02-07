import java.util.Scanner;
public class CrazyStory {

	public static void main(String[] args) {
			
			//Declared all of my variables
			String name, 
				city,
				adjective,
				state,
				college,
				profession,
				animal,
				petName,
				verb;
		
			int age;
		
			double pay;
			
			//Get scanner
			Scanner keyboard = new Scanner (System.in);
			
			//Get name
			System.out.print("Enter your Name: ");
			name = keyboard.nextLine();
			
			//Get City
			System.out.print("Enter your City: ");
			city = keyboard.nextLine();
			
			//Get Adjective
			System.out.print("Enter an adjective: ");
			adjective = keyboard.nextLine();

			//Get State
			System.out.print("Enter your State: ");
			state = keyboard.nextLine();

			//Get Age and clear newline
			System.out.print("Enter your age: ");
			age = keyboard.nextInt();
			keyboard.nextLine();
			
			//Get College
			System.out.print("Enter your College: ");
			college = keyboard.nextLine();

			//Get Profession
			System.out.print("Enter your Profession: ");
			profession = keyboard.nextLine();

			//Get Pay and clear newline
			System.out.print("Enter your Pay per hour: ");
			pay = keyboard.nextDouble();
			keyboard.nextLine();
		
			//Get Animal
			System.out.print("Enter an Animal Name: ");
			animal = keyboard.nextLine();

			//Get Pet Name
			System.out.print("Enter your Pet Name: ");
			petName = keyboard.nextLine();

			//Get Verb
			System.out.print("Enter a verb: ");
			verb = keyboard.nextLine();
			
			//Print Story
			System.out.println("Once upon a time someone named " + name + " lived in " + city +
					" in the " + adjective + " \nstate of " + state + ". When " + age + " years old, "
					+ name +" went to school at " + college + ".\n" + name + " graduated and went to work as a "
					+ profession + " while earning $" + pay + " an hour.\nThen, " + name + " adopted a(n) "
					+ animal + " named " + petName + ".\nThey " + verb + " happily ever after!");
	}
}
