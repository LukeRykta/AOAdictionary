import java.util.HashMap;
import java.util.HashSet;

public class dynamicAlgo {
    private int splitNums;
    //Constructor
    dynamicAlgo(){

    }
    public String parseString(String wholeWord, HashSet<String> dictionary){
        splitNums = 1;
        return splitAlgo(wholeWord, new HashMap<>(), dictionary);
    }

    public String splitAlgo(String word, HashMap<String, String> newMap, HashSet<String> dictionary){
        if(newMap.containsKey(word))
            return newMap.get(word);
        if(dictionary.contains(word))
            return word;

        for(int l = 1; l < word.length(); l++){
            String lSub = word.substring(0, l);
            if(!dictionary.contains(lSub))
                continue;
            String rSub = word.substring(l);
            String rParsed = splitAlgo(rSub, newMap, dictionary);
            if(rParsed != null){
                String parsed = lSub + " " + rParsed;
                newMap.put(word, parsed);
                splitNums += 1;
                //System.out.println("Word in map: " + newMap.get(word));
                return parsed;
            }
        }
        newMap.put(word, null);
        return null;
    }

    public int getSplitNums() {
        return splitNums;
    }

    public void setSplitNums(int splitNums) {
        this.splitNums = splitNums;
    }
}