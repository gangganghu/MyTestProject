import java.io.*;
import java.util.*;

public class ReadHook {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }

        String input = sb.toString();

        // Log to a file so we can see if hook runs
        //FileWriter fw = new FileWriter("C:\\Users\\ville\\hook_debug.log", true);
        //fw.write("Hook ran! Input: " + input + "\n");
        //fw.close();

        if (input.contains(".txt")) {
            System.err.println("You cannot read the .txt file");
            System.exit(2);
        }
    }
}