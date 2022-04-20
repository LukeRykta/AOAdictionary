import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        setHash set = new setHash();
        set.parseFile("input/input.txt");

        for (String s : set.input) System.out.println(s);
        new dynamicAlgo();
    }
}
