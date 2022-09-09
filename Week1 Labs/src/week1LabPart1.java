
public class week1LabPart1 {

	public static void main(String[] args) {
		//Declaring and initializing variables
		int availableSeats = 15;
		double totalCost = 14.99;
		char middleInitial = 'A';
		boolean isHotOutside = false;
		String firstName = "John";
		String streetAddress = "123 JD Street";
		//Printing descriptive values of variables
		System.out.println("There are " + availableSeats + " seats available.");
		System.out.println("Cost of groceries is " + totalCost);
		System.out.println("Middle Initial: " + middleInitial);
		System.out.println("It is hot outside: " + isHotOutside);
		System.out.println("First name: " + firstName);
		System.out.println(firstName + " lives at " + streetAddress);
		//Updating variable values
		availableSeats -= 2;
		totalCost += 2.15;
		middleInitial = 'B';
		isHotOutside = !isHotOutside;
		String fullName = firstName + ' ' + middleInitial + " Doe";
		//Printing updated/final values
		System.out.println("\nUpdated available Seats: " + availableSeats);
		System.out.println("New total cost: " + totalCost);
		System.out.println("Correct middle initial: " + middleInitial);
		System.out.println("It is hot outside: " + isHotOutside);
		System.out.println("Full name: " + fullName);
		System.out.println(fullName + " lives at " + streetAddress);
	}

}
