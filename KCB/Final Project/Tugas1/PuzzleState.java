package FinalProject;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import java.util.Arrays;

public final class PuzzleState implements State {

	public final int[][] tiles;
	public static Action MOVE_LEFT  = new Action("LEFT");
	public static Action MOVE_RIGHT = new Action("RIGHT");
	public static Action MOVE_UP    = new Action("UP");
	public static Action MOVE_DOWN  = new Action("DOWN");
	//Urutan tindakan yang diuji
	private static Action[] actionSequence={MOVE_LEFT, MOVE_RIGHT, MOVE_UP, MOVE_DOWN};
	
        //CONSTRUCTOR
	public PuzzleState() {
		this.tiles=new int[5][5];
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				this.tiles[i][j]=i*5+j+1;
			}
		}
		tiles[4][4]=0; // empty
	}

	public PuzzleState(PuzzleState state) {
		this.tiles=new int[5][5];
		for (int i=0; i<5; i++) {
                    System.arraycopy(state.tiles[i], 0, this.tiles[i], 0, 5);
		}
	}

	public PuzzleState(int[][] state) {
		this.tiles=new int[5][5];
		for (int i=0; i<5; i++) {
                    System.arraycopy(state[i], 0, this.tiles[i], 0, 5);
		}
	}
        
	public PuzzleState(PuzzleState origin, Action action) {
		this(origin);
		performAction(this,action);
	}
	
	//METHOD
	public static void performAction(PuzzleState origin, Action action) {
		int rowEmpty=0, colEmpty=0;
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if (origin.tiles[i][j]==0) {
					rowEmpty=i;
					colEmpty=j;
					break;
				}
			}
		}
		// Periksa ACTION mana yang diambil, periksa apakah itu "valid", jika demikian lakukan action (ganti papan)
		if (action==MOVE_UP && rowEmpty!=0) { 
			origin.tiles[rowEmpty][colEmpty]=origin.tiles[rowEmpty-1][colEmpty]; 
                        //isi tempat kosong dengan ubin yang dipindahkan
			origin.tiles[rowEmpty-1][colEmpty]=0; // tempat kosong baru
		} else if (action==MOVE_DOWN && rowEmpty!=4) {
			origin.tiles[rowEmpty][colEmpty]=origin.tiles[rowEmpty+1][colEmpty];
			origin.tiles[rowEmpty+1][colEmpty]=0;
		} else if (action==MOVE_LEFT && colEmpty!=0) {
			origin.tiles[rowEmpty][colEmpty]=origin.tiles[rowEmpty][colEmpty-1];
			origin.tiles[rowEmpty][colEmpty-1]=0;
		} else if (action==MOVE_RIGHT && colEmpty!=4) {
			origin.tiles[rowEmpty][colEmpty]=origin.tiles[rowEmpty][colEmpty+1];
			origin.tiles[rowEmpty][colEmpty+1]=0;
		} else {
			throw new RuntimeException("Illegal move"); // illegal move
		}
	}

        @Override
	public boolean goal() {
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if (tiles[i][j]!=i*5+j+1) {
					return i==4 && j==4;
				}
			}
		}
		return true;
	}

        @Override
	public ActionStatePair[] successor() {
		
		ArrayList list=new ArrayList();
            for (Action actionSequence1 : actionSequence) {
                try {
                    State state = new PuzzleState(this, actionSequence1);
                    list.add(new ActionStatePair(actionSequence1, state));
                }catch (RuntimeException e) {
                    // illegal move
                    
                }
            }
		ActionStatePair[] pairs=new ActionStatePair[list.size()];
		Iterator iter=list.iterator();
		for (int i=0; iter.hasNext(); i++) {
			pairs[i]=(ActionStatePair)iter.next();
		}
		return pairs;
	}
        
        @Override
	public double pathcost(Action action) {
		return 1;
	}

//bagian method H3
	public static int wrongAboveAdjacent(int[][] states) {
		int wrongAboveAdjacentTiles = 0;
		
		for(int row=0; row<5; row++){
			for(int col=0; col<5;col++){
				// abaikan file kosong
				if (states[row][col] ==0)
					continue;
				if (row ==0){
					//periksa file baris pertama terhadap nilai goal state
					if(states[row][col]!= row*5 +col +1)
						wrongAboveAdjacentTiles++;
					//file baris lain memeriksa file yang berdekatan di atas
				}else if(states[row-1][col]+5 != states[row][col])
					wrongAboveAdjacentTiles++;
			}
		}
		return wrongAboveAdjacentTiles;
	}
	
	public double countEuclid(){
        double euclid=0,power=0;
        int k=0,l=0;
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                if (tiles[i][j]!=i*5+j+1 && tiles[i][j] != 0) {         //mencari ubin yang salah
                    
                    while(k<5){                   //mencari asal ubin yang salah
                        while(l<5) {
                            if((k*5+l+1)==tiles[i][j]){
                                break;
                            }
                            l++;
                        }
                        k++;
                    }
                    power=sqrt(pow(i-k,2)+pow(l-j,2));
                    System.out.println(tiles[i][j]+" "+(i*5+j+1)+" = "+power); //euclidnya
                    euclid=euclid+sqrt(pow(i-k,2)+pow(l-j,2));
                    if (i==4 && j==4){
                       return euclid;
                    }
                    
                }
            }
        }
             return euclid;
           
        
       
    }
	
    @Override
	public boolean equals(Object obj) {
		if (obj.getClass().equals(this.getClass())) {
			PuzzleState state=(PuzzleState)obj;
			for (int r=0; r<tiles.length; r++) {    
				for (int c=0; c<tiles[r].length; c++) {
					if (state.tiles[r][c]!=tiles[r][c])
						return false;
				}
			}
			return true;
		}
		return false;
	}

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Arrays.deepHashCode(this.tiles);
        return hash;
    }


        @Override
	public int[][] getTiles() {
		return tiles;
	}
	
        @Override
	public String toString() {
		DecimalFormat nf=new DecimalFormat("00");
		StringBuilder sb=new StringBuilder();
            for (int[] tile : tiles) {
                for (int c = 0; c < tile.length; c++) {
                    StringBuilder append = sb.append(" ").append(nf.format(tile[c]));
                }
                sb.append("\n");
            }
		return sb.toString();
	}

}
