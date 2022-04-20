import java.util.HashSet;
import java.util.Iterator;

public class dynamicAlgo {
    //Global Variables
    HashSet<String> splitList = new HashSet<String>();
    //Constructor
    dynamicAlgo(){

    }

    public void splitAlgo(String w, HashSet<String> d){
        //Create iterator to iterate to each string in the Hashset
        for (String s : d) {
            int n = w.length(); //length of current un-split word
            int[][] c = new int[n][n]; //nxn character array
            for(int i = 0; i < n; i++)
                for(int j = 0; j < n; j++){

                }

        }
    }

    public HashSet<String> getSplitList() {
        return splitList;
    }

    public void setSplitList(HashSet<String> splitList) {
        this.splitList = splitList;
    }
}