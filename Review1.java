/*

  _____ ____ ___   ____   ___  _  ___  
 | ____/ ___|_ _| |___ \ / _ \/ |( _ ) 
 |  _| \___ \| |    __) | | | | |/ _ \ 
 | |___ ___) | |   / __/| |_| | | (_) |
 |_____|____/___| |_____|\___/|_|\___/ 


 */
/* Exercise
	
    Warmup-1 
    * NearHundred 	- abs value
	* backAround 	- substring, 
    * missingChar 	- substring
    * startHi 		- substring, equals
    * or35			- mod operator
    * posNeg		- if-condition, logical operators
    * in3050		- if-condition, logical operators
    
    Logic-1
    *
    * 
    * 
    
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
public class Review1 {

	// point of entry for program execution when running the compiled java file
	public static void main(String[] args) {

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
		boolean weekend = true;
		isRaining = false;

		// Characters are variables that can only have one value using single quoutes ''
		char shirtSize = 'L';
		shirtSize = 'S';
		char gender;

		// Strings are words that includes any charaters
		String name;
		String favFood = "Waffles";
		name = "";

		// Java's class that allows printing text to terminal, useful to see your results and debugging
		System.out.println("My name is " + name + " and my favorite food is " + favFood + "!");
		System.out.println("I am " + age + " years old!");


		/**** Operators ****
		 	
            Mathematical Operators 
            + - / * %
            
            Logical Operators
            [boolean] && [boolean]
            [boolean] || [boolean]
            ![boolean]
            	
            
            Comparsion Operators
            [ number ] == [ number ]
			[ number ] <= [ number ]
			[ number ] >= [ number ]
			[ number ] != [ number ]
			[ number ] <  [ number ]
			[ number ] >  [ number ]
		*/
		// mathematical operators
      int boys = 17;
      int girls = 14;
      double earned = 12.76;
      double spent = 5.5;
      int ssn = 756483923;
      
      int students = boys + girls;
      double moneyLeft = earned - spent;
      int lastFourDigOfSSN  = ssn % 10000;
      double earnedInFiveWeeks = earned * 5;
      double groupsOfFour = students / 4;
      
       //logical operators
      boolean sick = true;
      boolean weekday = true;
      boolean ventraCard = true;
      boolean car = false;
      
      boolean goToSchool = weekday && !sick;
      boolean goOut= ventraCard || car;
      
      //comparison operators 
        int age = 12;
        int drivingAge = 18;
        int testGrade=67;
        int siblings=3;
      
        boolean canDrive = age > drivingAge;
        boolean grounded = testGrade =< 70;
        boolean isOnlyChild= siblings == 0;
      
		/**** If-Conditions  ****
			Rules:
				* If-conditions always start with: if 
				* If-conditions optionally can have numerous: else if
				* If-conditions may end with: else 

			Structure:
		––––––––––––––––––––––––––––––––––––––––
			if ( [boolean] ) {
				[code];
			}
		––––––––––––––––––––––––––––––––––––––––
			if ( [boolean] ) {
				[code];
			}
			else {
				[code];
			}
		––––––––––––––––––––––––––––––––––––––––
			if ( [boolean] ) {
				[code];
			}
			else if ( [boolean] ) {
				[code];
			}
			else if ( [boolean] ) {
				[code];
			}
			...
		––––––––––––––––––––––––––––––––––––––––
			if ( [boolean] ) {
				[code];
			}
			else if ( [boolean] ) {
				[code];
			}
			else if ( [boolean] ) {
				[code];
			}
			...
			else {
				[code];
			}
		––––––––––––––––––––––––––––––––––––––––
		*/ 	
	}
}
