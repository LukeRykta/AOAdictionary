public class printResults {

    public static void printAll(int total, String userStr, String[] strMatches) {
        if (total < 1) // no matches
            System.out.println(userStr + " cannot be split into AiW words");
        else if (total == 1) // single match
            System.out.println(userStr + " can be split into " + total + " AiW word: " + strMatches[0]);
        else // multiple matches
            System.out.println(userStr + " can be split into " + total + " AiW words: ");
            for (String strMatch : strMatches) // appends literal match values
                System.out.print(strMatch + " ");
    }
}
