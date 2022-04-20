import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class setDictionary {
    //Global Variables
    HashSet<String> forReading = new HashSet<String>();
    //Constructor
    public setDictionary(){}

    //File parser. Stores each line into Hashset.
    public void parseFile(String file){
        //Initialize File
        File newFile = new File(file);
        //Try catch for storing strings into hashSet
        try{
            Scanner scan = new Scanner(newFile);
            String fileLine;
            //While loop will iterate each line
            while(scan.hasNextLine()){
                fileLine = scan.nextLine();
                forReading.add(fileLine);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public String toString() {
        return "";
    }
}
