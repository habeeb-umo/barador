import java.util.*;
public class MainMenu {
	public static void main(String[] args){
	//Main Menu graphics	
	System.out.printf("\t\t**Blades of Barador**\t\t\n");
	System.out.println();
	System.out.printf("\t1. New Game\t");
	System.out.printf("\t2. Load Game\n");
	System.out.println();
	System.out.printf("\t\t      3. Exit\n");
	System.out.print("Select: ");
	//User input
	Scanner sc = new Scanner(System.in);
	String answer = sc.nextLine();
	sc.close();
	//New Game Condition
	if(answer.equals("1") || answer.equals("1.") || answer.toLowerCase().equals("new game")){
		System.out.println("choice 1");
		System.exit(0);
	}
	//Load Game Condition
	if(answer.equals("2") || answer.equals("2.") || answer.toLowerCase().equals("load game")){
		System.out.println("choice 2");
		System.exit(0);
	}
	//Exit Condition
	if(answer.equals("3") || answer.equals("3.") || answer.toLowerCase().equals("exit")){
		System.out.println("Closing...");
		System.exit(0);
	}
	else{
		System.out.println("Invalid entry");
		System.out.println("Closing...");
		System.exit(0);
	}
	}
}
