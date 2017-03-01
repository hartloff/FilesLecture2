import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FilesLecture2 {


    // 2 points
    static String Q1(String commaSeparatedValues) {

        // TODO: You are give a String containing at least 2 comma separated values. Return the second value in a
        //       separate String.


        return "";
    }


    // 3 points
    static ArrayList<String> Q2(String csvFilename) {

        // TODO: Read the given file which contains comma separated values and return an ArrayList containing only the
        //       first value from each line


        return null;
    }


    public static void main(String[] args) {

        String secondValue = Q1("MSFT,2016-09-23,57.43");
        System.out.println("Expecting: 2016-09-23");
        System.out.println("Returned: " + secondValue);
        System.out.println();

        ArrayList<String> result = Q2("src/testFile.csv");
        System.out.println(result);
    }

}
