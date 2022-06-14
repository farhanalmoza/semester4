package FinalProject;

import java.util.PriorityQueue;
public class FifteenSearchApp {

     public static void main(String[] args) {
    	int shuffle = 40; // Number of shuffle is fixed here
        // Create a random puzzle and memorise the puzzle state.
        PuzzleState myState= randomPuzzle(shuffle);
        PuzzleState myState2 = new PuzzleState(myState);
        double[] EBF = new double[5]; // for storing EBF
      
        Action[] actions3A = solveH3A(new PuzzleState(myState));
        EBF[0] = Node.effectiveBranchingFactor(Node.getNodesExpandedInLastSearch(), shuffle);

        // List the initial state and results of actions performed.
        System.out.println("Initial state:");
        System.out.println(myState2.toString());
        System.out.println("Solusi H3 with A*:-------------");
        myState2 = new PuzzleState(myState);
        for (int i=0; i<actions3A.length; i++) {
            System.out.println((i+1)+": "+actions3A[actions3A.length-1-i]);
            PuzzleState.performAction(myState2,actions3A[actions3A.length-1-i]);
            System.out.println("Euclidean Distance : "+myState2.countEuclid());
            System.out.println(myState2.toString());
        }
        System.out.println();
        
        System.out.println("H3");
        System.out.println("Total Langkah A*: " + actions3A.length);
        System.out.printf("Nilai Effective Branching Factor(EBF): %.3f\n", EBF[0]);      
    }
     
    public static Action[] solveH3A(PuzzleState state){
    	/* memanggil pencarian umum dengan status awal dan antrian prioritas yang diberikan dengan
            [h(n1) + g(n1)] - [h(n2) + g(n2)] pembanding. */
    	Node goal = Node.breadthFirstSearch(state, new PriorityQueue<>(11, (Node lhs, Node rhs) -> {
            //priority queue with comparator( [h(a) + g(a)] - [h(b) + g(b)] )
            int lhsH3 = PuzzleState.wrongAboveAdjacent(lhs.getState().getTiles());
            int rhsH3 = PuzzleState.wrongAboveAdjacent(rhs.getState().getTiles());
            return (lhsH3 + (int)lhs.getCost()) - (rhsH3 + (int)rhs.getCost());
            }));
    	Action[] actions = goal.getActions();
    
    	return actions;
    }
    
    public static Action[] solveH2A(PuzzleState state){
       //melakukan pencarian dari keadaan awal "shuffle" (fringe is empty)
        Node goal = Node.breadthFirstSearch(state,new PriorityQueue<>(11, (Node lhs, Node rhs) -> {
            int lhsH2 = PuzzleState.wrongAboveAdjacent(lhs.getState().getTiles());
            int rhsH2 = PuzzleState.wrongAboveAdjacent(rhs.getState().getTiles());
            return (lhsH2 + (int)lhs.getDepth()) - (rhsH2 + (int)rhs.getDepth());
        } //
        ));
        Action[] actions=goal.getActions();
        
        return actions;
    }

    public static PuzzleState randomPuzzle(int maxShuffles) {
        PuzzleState myState=new PuzzleState();
        int totalMoves = 0;
        while(totalMoves < maxShuffles){
            double r = Math.random();
            try {
                if(r < 0.25){
                    PuzzleState.performAction(myState, PuzzleState.MOVE_LEFT);
                    //System.out.println("left");
                } else if (r < 0.5) {
                    PuzzleState.performAction(myState, PuzzleState.MOVE_RIGHT);
                    //System.out.println("right");
                } else if (r < 0.75) {
                    PuzzleState.performAction(myState, PuzzleState.MOVE_UP);
                    //System.out.println("up");
                } else {
                    PuzzleState.performAction(myState, PuzzleState.MOVE_DOWN);
                    //System.out.println("down");
                }
                totalMoves++;
            }
            catch (RuntimeException e){
                // illegal move
                
            }
        }
        System.out.println("Batasan langkah : "+totalMoves);
        return myState;
    }


    public static boolean checkActions(PuzzleState myState, Action[] actions) {
         // buat keadaan awal 24-puzzle dengan terlebih dahulu membuat konfigurasi tujuan
         for (Action action : actions) {
             try {
                 PuzzleState.performAction(myState, action);
             }catch (RuntimeException e){
                 return false; // illegal move
             }
         }

        // check whether myState is the goal state.
        return myState.goal();
    }
}
