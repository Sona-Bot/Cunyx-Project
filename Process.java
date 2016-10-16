/** Nazib Mondal
  * CUNY Queens College
  */


public class Process{
  
  /* Class Variables */
	private static int IDCounter = 0;
    private int processID;
    private String processName;

  /* Constructor */
    public Process(){
      IDCounter++;
      processID = IDCounter;
      processName = ("Process #" + IDCounter);
    }
  
  /* Methods */
  
    // Get Methods
    public int getProcessID(){
      return this.processID;
    }
    public String getProcessName(){
      return this.processName;
    }
  
    //Set Methods
    public void setProcessID(int processID){
      this.processID = processID;
    }
    public void setProcessName(String processName){
      this.processName = processName;
    }
    
    // Prints process as a string
    public String toString(){
    	return  "Process Name = " + processName + " | Process ID = " + processID;
    }
  
}
