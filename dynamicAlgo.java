import java.util.HashMap;
import java.util.HashSet;

public class dynamicAlgo {
    private int splitNums;
    private String rParsed = " ";
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
          //  if (rParsed != null && (dictionary.contains(lTemp)) && (lTemp.length() > rParsed.length())) rParsed = lTemp;
            if(!dictionary.contains(lSub))
                continue;
            String forCompare = word.substring(0, l);
            String rSub = word.substring(l);

            for(int i = 1; i < word.length(); i++){
                String temp = word.substring(0, i);
                if((dictionary.contains(temp)) && (temp.length() > forCompare.length())){
                    //System.out.println("temp: " + temp + " compare: " + forCompare);
                    rSub = word.substring(i-1);
                    rParsed = splitAlgo(rSub, newMap, dictionary);
                }
            }
            //System.out.println("Output for lTemp: " + rSub);

            rParsed = splitAlgo(rSub, newMap, dictionary);
            if(rParsed != null){
                String parsed = lSub + " " + rParsed;
                newMap.put(word, parsed);
                splitNums += 1;
               // System.out.println("Word in map: " + parsed);
                return parsed;
            }
        }
        newMap.put(word, null);
        return null;
    }

    public int getSplitNums() {
        return splitNums;
    }
}