import java.io.*;
import static java.lang.System.*;

public class inRead {
	public static void main(String[] args){
		try{
			FileReader fr = new FileReader("test");
			BufferedReader br = new BufferedReader(fr);
			String str;
			
			while ((str = br.readLine()) != null){
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
}
