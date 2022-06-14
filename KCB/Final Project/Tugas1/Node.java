package FinalProject;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Node {
    //atribut
    private final State  state;
    private final Node   parent;
    private final Action action;
    private final double cost;
    private final int    depth;
    private static int nodesExpandedInLastSearch;

    //construktor
    protected Node() {
        this(null, null, null, 0);
    }
    
    public Node(State state) {
        this(state, null, null, 0);
    }

    public Node(State state, Node parent, Action action, double cost) {
        this.state=state;
        this.parent=parent;
        this.action=action;
        this.cost=cost;
        if (parent!=null)
            this.depth=parent.getDepth()+1;
        else
            this.depth=0;
    }
    
    //methods
    //memperluas node menjadi sub-node.
    public Node[] expand() {
        ActionStatePair[] successors=state.successor();
        Node[] descendants=new Node[successors.length];
        for (int a=0; a<successors.length; a++) {
            Action aksi=successors[a].getAction();
            State child=successors[a].getState();
            descendants[a]=new Node(child, this, aksi, this.getCost()+state.pathcost(aksi));
        }
        return descendants;
    }

    //menentukan semua action yang digunakan untuk sampai ke node

    public Action[] getActions() {
        Action[] steps=new Action[depth];
        Node node=this;
        for (int i=0; i<depth; i++) {
            steps[i]=node.getAction();
            node=node.getParent();
        }
        return steps;
    }
    
    
    public Action getAction() {
        return action;
    }

    public double getCost() {
        return cost;
    }

    public int getDepth() {
        return depth;
    }

    public Node getParent() {
        return parent;
    }

    public State getState() {
        return state;
    }
    
   //method EBF
   public static double effectiveBranchingFactor(int nNodes, int depth) {
        double maxError=0.01; //kesalahan maksimum yang terima dari solusi
        double delta=0.01;    // seberapa banyak mengubah ebf yang diuji setiap iterasi   
        int signOfError=0;    // tanda selisih antara N+1 dan 1+b+b^2+......+b^d
        double b=0;           // mencari b optimal akan dimulai dari b minimum yang mungkin
        while (true) {        // pencarian b dimulai
            //menghitung ekspresi 1+b+b^2+......+b^d
            double sum=1;
            for (int i=1; i<depth+1; i++) {
                sum+=Math.pow(b, (double)i);
            }
            // meghitung perbedaan 
            // N+1 dan 1+b+b^2+......+b^d, remember N+1=1+b+b^2+......+b^d
            double error=sum-(1+(double)nNodes);
            // simpan tanda error sebelumnya
            int signOfPreviousError=signOfError;
            // tentukan tanda error yang baru
            if (error<0.0) // negative
                signOfError=-1;
            else // positive
                signOfError=+1;
            /* jika kesalahan yang dihitung lebih besar dari kesalahan maksimum yang dapat diterima, maka periksa apakah ada tanda error
              yang diubah, jika demikian berarti loop melewatkan root yang dicari, maka kurangi b dengan delta dan
               kurangi delta untuk mendapatkan root dalam pencarian berikutnya jika tanda error tidak berubah maka tingkatkan 'b' dengan delta
               sebaliknya jika kesalahan lebih kecil dari batas kembalikan faktor cabang efektif */
            if (Math.abs(error)>maxError) { // error is big
                if (signOfPreviousError==signOfError || signOfPreviousError==0) {  
                    b+=delta;   //mengambil langkah lain menuju solusi
                } else {        // perubahan tanda yang berarti melompati minimal error
                    b-=delta;   // go back
                    delta/=2;   // ambil langkah kecil
                    signOfError=signOfPreviousError;  // batalkan perubahan tanda
                }
            } else // error is small, let's return
                return(b);
        }
    }
   
   
    public static int getNodesExpandedInLastSearch() {
    	return nodesExpandedInLastSearch;
    }
    
    //fungsi A* search
    public static Node breadthFirstSearch(State initial, PriorityQueue<Node> fringe) {
    	// // reset jumlah total node yang diperluas ke nol
    	nodesExpandedInLastSearch = 0;
    	// menambahkan initial state pada fringe
    	fringe.add(new Node(initial));
    	// daftar untuk melacak semua node yang dihasilkan
    	ArrayList<Node> allNode = new ArrayList<>();
    	allNode.add(new Node(initial));
        System.out.println("Euclidean Distance = "+initial.countEuclid());
        System.out.println();
        // Proses loop semua node pada fringe
        while (!fringe.isEmpty()) { // menguji apakah fringe kosong, jika ya "gagal"
        	// hapus dan kembalikan node yang paling diinginkan dari fringe
    		Node head = fringe.poll();
    		//periksa untuk tidak mengulangi dengan node ancestor dan node sebelumnya 
    		State state = head.getState();
    		// if goal state, return the node
            if (state.goal()) {
                return head; // if goal state then return this node
            }
         // Membuat node anak dan menambahkan ke fringe dan list
    		for (Object child:Arrays.asList(head.expand())) {
    			if(!allNode.contains((Node)child)){
    				fringe.add((Node)child);
    				allNode.add((Node)child);
    			}		
    		}
    		// menambah jumlah node yang diperluas dalam pencarian ini
    		nodesExpandedInLastSearch++;
        }
        return null;
    }

}
