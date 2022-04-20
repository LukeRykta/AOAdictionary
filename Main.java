import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        int total = 0; // number of splits
        String userStr = ""; // user input;

        for (String arg : args) {
            System.out.println("USER INPUT: " + arg);
            int n = arg.length(); // length of the input string
            System.out.println("INPUT LENGTH: " + n);
        }

        setHash set = new setHash(); //Object for Hashset
        setDictionary dictionary = new setDictionary(); //Object for Hashset
        dictionary.parseFile("input/aliceInWonderlandDictionary.txt");
        set.parseFile("input/input.txt");

        //for (String s : set.input) System.out.println(s);  Prints un-split list

        dynamicAlgo answer = new dynamicAlgo();

        for (String s : set.input)
            answer.splitAlgo(s, dictionary.forReading);

        String[] matches = new String[total]; // literal string matches
        printResults.printAll(total, userStr, matches);
    }
}
