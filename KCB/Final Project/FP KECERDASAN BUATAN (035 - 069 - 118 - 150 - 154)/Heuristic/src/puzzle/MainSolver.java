package puzzle;

import java.lang.Math;
import java.util.ArrayList;

public class MainSolver {

    /**
     * Test program for search procedures
     * @param args none interpreted as yet
     */
    public static void main(String[] args) {

        PuzzleState myState= randomPuzzle(10);

        PuzzleState myState2 = new PuzzleState(myState);

        System.out.println("Initial state:");
        System.out.println(myState2.toString());

        Action[] actions1Ah4 = solveH4A(new PuzzleState(myState));

        System.out.println("Solution via H4 with A*:-------------");
        PuzzleState myStateh4 = new PuzzleState(myState);

        if (actions1Ah4 == null){
            System.out.println("Solution not found");
        }else{
            for (int i=0; i<actions1Ah4.length; i++) {
                System.out.println((i+1)+": "+actions1Ah4[actions1Ah4.length-1-i]);
                PuzzleState.performAction(myStateh4,actions1Ah4[actions1Ah4.length-1-i]);
                System.out.println(myStateh4.toString());
            }
        }

        
    }


    /**
     * Example solve
     * You must change this function to solve the problem with your own 
     * A* implementation with heuristic function 1.
     * @param state initial puzzle state
     */

    public static Action[] solveH1A(PuzzleState state){
        Node goal=Node.aStarSearch(state, 1);
        if (goal == null) return null;

        return goal.getActions();
    }

    public static Action[] solveH4A(PuzzleState state){
        Node goal=Node.aStarSearch(state, 4);
        if (goal == null) return null;

        return goal.getActions();
    }


    /**
     * Generate a solvable random puzzle.
     * @param maxShuffles the number of shuffles to be performed
     */
    public static PuzzleState randomPuzzle(int maxShuffles) {
        PuzzleState myState=new PuzzleState();
        int totalMoves = 0;
        while(totalMoves < maxShuffles){
            int r = (int) (Math.random()*100);
            try {
                if(r > 75){
                    PuzzleState.performAction(myState, PuzzleState.MOVE_LEFT);
                    //System.out.println("left");
                } else if (r > 50) {
                    PuzzleState.performAction(myState, PuzzleState.MOVE_RIGHT);
                    //System.out.println("right");
                } else if (r > 25) {
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
        return myState;
    }

    /**
     * Check if the actions solve the given puzzle.
     * @param myState a problem
     * @param actions an array of Action
     */
    public static boolean checkActions(PuzzleState myState, Action[] actions) {
        // create an initial fiteen puzzle state by first generating the goal config
        for (Action action : actions) {
            try {
                PuzzleState.performAction(myState, action);
            } catch (RuntimeException e) {
                return false; // illegal move
            }
        }

        // check whether myState is the goal state.
        return myState.goal();
    }
}
