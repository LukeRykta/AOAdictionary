import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        String printString = "";

        setHash set = new setHash(); //Object for Hashset
        setDictionary dictionary = new setDictionary(); //Object for Hashset
        dictionary.parseFile("input/aliceInWonderlandDictionary.txt");
        set.parseFile("input/input.txt");
        dynamicAlgo answer = new dynamicAlgo();

        for(String s: set.input) {
            printString = answer.parseString(s, dictionary.forReading);
            if(printString == null)
                System.out.println(s + " cannot be split into AiW words");
            else
                System.out.println(s + " can be split into " + answer.getSplitNums() + " AiW word: " + printString);
        }

    }
}
