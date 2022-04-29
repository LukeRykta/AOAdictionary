import java.util.HashSet;
import java.util.Iterator;

public class dynamicAlgo {
    //Global Variables
    HashSet<String> splitList = new HashSet<String>();
    //Constructor
    dynamicAlgo(){

    }

    public int max(int a, int b){
        return 0;
    }

    public void splitAlgo(String word, String dictWord, int n){
        //Create iterator to iterate to each string in the Hashset
        int len = word.length();
        int[][] c = new int[len][n];
        for(int i = 0; i < len; i++){
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