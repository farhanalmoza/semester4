package FinalProject;

public interface State {
    
   public boolean goal();
  
    public ActionStatePair[] successor();
    
    public double pathcost(Action action);

   public int[][] getTiles();

public double countEuclid();

}
