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
    private int getProcessID(){
      return this.processID;
    }
    private String getProcessName(){
      return this.processName;
    }
  
    //Set Methods
    private void setProcessID(int processID){
      this.processID = processID;
    }
    private void setProcessName(String processName){
      this.processName = processName;
    }
  
}