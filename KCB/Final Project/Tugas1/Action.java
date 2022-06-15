package FinalProject;

public class Action {
    //atribut
    private String label=null;

    //constructor
    public Action() {
        label="?";
    }
    
    public Action(String label) {
        this.label=label;
    }

    //method
    public String toString() {
        return label;
    }
}
