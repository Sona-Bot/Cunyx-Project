import java.util.Scanner;
public class cunyx {
	/** Main Method/Driver */
		public static void main (String[] args){	
			//Creating an input field
			Scanner ui = new Scanner(System.in);
			String input = " ";
			
			//Infinite Loop while input is NOT "quit"
			while (!terminationCheck(input)){
				System.out.print("prompt> ");
				input = ui.nextLine();
				Process p = new Process();
				p.setProcessName(input);
				System.out.println(p.toString());
			}
			
			System.out.println("Have a Good day!");
		}
	
	public static boolean terminationCheck (String message){
		return message.equals("quit");
	}
	
}
