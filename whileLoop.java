/*

 _____ ____ ___   ____   ___  _  ___  
 | ____/ ___|_ _| |___ \ / _ \/ |( _ ) 
 |  _| \___ \| |    __) | | | | |/ _ \ 
 | |___ ___) | |   / __/| |_| | | (_) |
 |_____|____/___| |_____|\___/|_|\___/ 

 */

 //If you are lost, do not be afraid to ask for help or look back on previous assignments.

public class whileLoop {
	public static void main(String[] args){

boolean moneyIsLow = true;
Double money = 0.00;		

while (moneyIsLow == true){
	money += 11.50;
	if(money > 1000.00){
		moneyIsLow = false;
		System.out.println("kk time to chill buh-BYE!");
	}
	if(money < 1000.00){
	System.out.println("THE GRIND NEVER STOPS CUS I ONLY GOT $" + money + "!");
	}
}

 

	}
}
