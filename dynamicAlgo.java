import java.util.HashMap;
import java.util.HashSet;

public class dynamicAlgo {

    //Constructor
    dynamicAlgo(){

    }
    public String parseString(String wholeWord, HashSet<String> dictionary){
        return splitAlgo(wholeWord, new HashMap<String, String>(), dictionary);
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
                return parsed;
            }
        }
        newMap.put(word, null);
        return null;
    }

}