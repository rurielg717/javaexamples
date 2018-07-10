/*

  _____ ____ ___   ____   ___  _  ___  
 | ____/ ___|_ _| |___ \ / _ \/ |( _ ) 
 |  _| \___ \| |    __) | | | | |/ _ \ 
 | |___ ___) | |   / __/| |_| | | (_) |
 |_____|____/___| |_____|\___/|_|\___/ 


 */

// Single line comment - text that are ignored by the compiler
// useful for marking down your code to explain what you are doing

/*
	Multi-line comment - for when things get real... complicated...
*/


/**** Naming conventions java files ****

	* The first character of a .java file is in uppercase
	* The class name below is the same as the file name
*/
public class Exercise1 {

	// point of entry for program execution when running the compiled java file
	public static void main (String[] args) {

		/**** Variables and Data types ****
			
			Initialization

			[Data Type] [Variable Name];
			[Data Type] [Variable Name] = [Initial Value(s)]; 

			After initialization, variables can be referred to using their names
		*/

		// Integer/int are whole numbers that can be between -2,147,483,648 to 2,147,483,647
		int drivingAge;
		int age = 46;
		drivingAge = 12;

		// Double are numbers with decimals that can be between ± 1.79769313486231570E+308 
		Double salesTax;
		Double gasPrice = 3.48;
		salesTax = 0.12;

		// boolean values can be either true or false
		boolean isRaining;
		boolean goOutside = true;
		isRaining = false;

		// Characters are variables that can only one values using single quoutes ''
		char shirtSize = 'L';
		shirtSize = 'S';
		char gender;

		// Strings are words that includes any charaters
		String name;
		String favFood = "Waffles";


		// Java's class that allows printing text to terminal, useful to see your results and debugging
		System.out.println("My name is " + name + " and my favorite food is " + favFood + "!");
		System.out.println("I am " + age + " years old!");


		/**** If-Conditions  ****
			Rules:
				* If-conditions always start with: if 
				* If-conditions optionally can have numerous: else if
				* If-conditions may end with: else 

			Structure:
		––––––––––––––––––––––––––––––––––––––––
			if ( [boolean(s)] ) {
				[code(s) ];
			}
		––––––––––––––––––––––––––––––––––––––––
			if ( [boolean(s)] ) {
				[code(s)];
			}
			else {
				[code(s)];
			}
		––––––––––––––––––––––––––––––––––––––––
			if ( [boolean(s)] ) {
				[code(s)];
			}
			else if ( [boolean(s)] ) {
				[code(s)]
			}
			else if ( [boolean(s)] ) {
				[code(s)]
			}
			...
		––––––––––––––––––––––––––––––––––––––––
			if ( [boolean(s)] ) {
				[code(s)];
			}
			else if ( [boolean(s)] ) {
				[code(s)]
			}
			else if ( [boolean(s)] ) {
				[code(s)]
			}
			...
			else {
				[code(s)];
			}
		––––––––––––––––––––––––––––––––––––––––
		*/
	}
}

