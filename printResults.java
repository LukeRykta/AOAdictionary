import java.util.ArrayList;

public class printResults {

    public static void printAll(int total, ArrayList<String> inputs, String[] strMatches) {
        for (int i = 0; i < inputs.toArray().length; i++) {
            if (total < 1) // no matches
                System.out.println(inputs.get(i) + " cannot be split into AiW words");
            else if (total == 1) // single match
                System.out.println(inputs.get(i) + " can be split into " + total + " AiW word: " + strMatches[0]);
            else // multiple matches
                System.out.print(inputs.get(i) + " can be split into " + total + " AiW words: ");
            for (int j = 0; j < strMatches.length; j++) // appends literal match values
                System.out.print(strMatches[j] + " ");
        }
    }
}
