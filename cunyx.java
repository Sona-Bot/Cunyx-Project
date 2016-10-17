import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class cunyx {
	/** Main Method/Driver */
		public static void main (String[] args){
			//Check for enough arguments
			if (args.length > 1){
				//throw an exception
			}
			
			//Creating an input field
			Scanner ui = new Scanner(System.in);
			String input = "yes";
			
			//Testing for Batch Mode
			if (input.equals("yes")){
				try{
					FileReader fr = new FileReader("test");
					BufferedReader br = new BufferedReader(fr);
					String str;
					
					while ((str = br.readLine()) != null){
						//Exits loop if "quit" is found
						if (terminationCheck(str)) { System.exit(0);}
						Process p = new Process();
						p.setProcessName(str);
						System.out.println(p.toString());
					}
					br.close();
				}
				catch (IOException e){
					System.out.println("File not found");
				}
			}
			
			//Enters interactive mode if batch mode is not chosen
			else{
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
		}
	
	public static boolean terminationCheck (String message){
		return message.equals("quit");
	}
	
	
}
