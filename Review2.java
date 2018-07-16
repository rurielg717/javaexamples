/*
 _____ ____ ___   ____   ___  _  ___  
 | ____/ ___|_ _| |___ \ / _ \/ |( _ ) 
 |  _| \___ \| |    __) | | | | |/ _ \ 
 | |___ ___) | |   / __/| |_| | | (_) |
 |_____|____/___| |_____|\___/|_|\___/ 
 */

 //If you are lost, do not be afraid to ask for help or look back on previous assignments.

public class Review2 {
	public static void main(String[] args){

/* An array functions just like a variable. Each array has a pertaining datatype and is used to store multiple data:
 
type var-name[];
OR
type[] var-name;
 
such as
int intArray[]; 
or int[] intArray; 
BOTH are valid ways to initialize arrays
 */
    
//Now we're going to create an integer array for a phone number

/*
Each number and space in the array consists with its index
[7][7][3][8][8][6][9][5][9][3]
|0||1||2||3||4||5||6||7||8||9|
*/
    
    int[] phoneNumber;
    phoneNumber = new int[10]; //A phone number has 10 digits, BUT every arrays first index is 0 so we have 9 total indexes
  	phoneNumber[0] = 7;
    phoneNumber[1] = 7;
    phoneNumber[2] = 3;
    phoneNumber[3] = 8;
    phoneNumber[4] = 8;
    phoneNumber[5] = 6;
    phoneNumber[6] = 9;
    phoneNumber[7] = 5;
    phoneNumber[8] = 9;
    phoneNumber[9] = 3;

    for (int i = 0; i < phoneNumber.length; i++) {
         System.out.println("Element at index " + i + " : "+ phoneNumber[i]);          
    }


    //EXERCISE: Create a String array called birbs with 5 indexes. In the first index put "cockatiels"
    
 String[] birbs;
      birbs = new String [6];      

      birbs[0] = "cockatiels";
      birbs[1] = "bluejays";
      birbs[2] = "parrots";
      birbs[3] = "mockingbird";
      birbs[4] = "cardinal";
      birbs[5] = "eagle";
  
  for (int i = 0; i < birbs.length; i++) {
         System.out.println("The bird at the " + i + " index is the "+ birbs[i]);     
	}
    }
}
