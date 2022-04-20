import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        int total = 0; // number of splits
        String userStr = ""; // user input;

        setHash set = new setHash();
        setDictionary dictionary = new setDictionary();
        dictionary.parseFile("input/aliceInWonderlandDictionary.txt");
        set.parseFile("input/input.txt");

        for (String s : set.input) System.out.println(s);
        dynamicAlgo answer = new dynamicAlgo();
        answer.splitAlgo(set.input, dictionary.forReading);

        String[] matches = new String[total]; // literal string matches
        printResults.printAll(total, userStr, matches);
    }
}
