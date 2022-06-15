package FinalProject;

//class kombinasi action dan state
public final class ActionStatePair {
    //atribut
    private final Action action;
    private final State state;
   
    //constructor
    public ActionStatePair(Action a, State s) {
        action=a;
        state=s;
    }
    
    //Methods
    public Action getAction() {
        return action;
    }
    
    public State getState() {
        return state;
    }
     
}
    

