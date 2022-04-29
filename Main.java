import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        int total = 1; // number of splits
        ArrayList<String> inputs = new ArrayList<String>(); // each index is a line of input.txt
        int temp = 0;

        setHash set = new setHash(); //Object for Hashset
        setDictionary dictionary = new setDictionary(); //Object for Hashset
        dictionary.parseFile("input/aliceInWonderlandDictionary.txt");
        set.parseFile("input/input.txt");

        for (String s : set.input) {
            //System.out.println(s);
            inputs.add(s); //store each line of our input.txt to our arraylist to be referenced later
        }
        dynamicAlgo answer = new dynamicAlgo();

        for (String s : set.input) {
            for (String d : dictionary.forReading) {
                temp = answer.splitAlgo(s, d, d.length());
                System.out.println("The max number of matches between " + s + " and " + d + " is: " + temp);
            }
        }

        String[] matches = new String[total]; // literal string matches
        printResults.printAll(total, inputs, matches);
    }
}
