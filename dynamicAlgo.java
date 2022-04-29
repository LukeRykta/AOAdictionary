import java.util.HashSet;

public class dynamicAlgo {
    //Global Variables
    HashSet<String> splitList = new HashSet<String>();
    //Constructor
    dynamicAlgo(){

    }

    public int max(int a, int b){
        return Math.max(a, b);
    }

    public int splitAlgo(String word, String dictWord, int n){
        //Create iterator to iterate to each string in the Hashset
        //I'll be basing the filling of the c matrix based off the exmpale given in the notes.
        int len = word.length();
        int[][] c = new int[len][n];
        for(int i = 0; i < len; i++)
            c[i][0] = 0;
        for(int j = 0; j < n; j++)
            c[0][j] = 0;

        for(int i = 1; i < len; i++){
            for(int j = 1; j < n; j++){
                //start to fill in c
                if(word.charAt(i) == dictWord.charAt(j))
                    c[i][j] = c[i-1][j-1] + 1;
                else
                    c[i][j] = max(c[i-1][j], c[i][j-1]);
            }
        }
        return c[len][n];
    }

    public HashSet<String> getSplitList() {
        return splitList;
    }

    public void setSplitList(HashSet<String> splitList) {
        this.splitList = splitList;
    }
}