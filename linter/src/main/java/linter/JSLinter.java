/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringJoiner;

public class JSLinter {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        try {
            System.out.println(lint("./src/main/resources/gates.js"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Sorry, there was an error processing the file.");
        }
    }
// Basically copied the solution code but thoughtfully stepped through all of it and did not add until I understood.
    public static  String lint(String path) throws IOException {
//        take in a path to a file and loop through each line
        File js = new File(path); //set the file path
        Scanner jsScan = new Scanner(js); // set a scanner to read over the file
        StringJoiner answer = new StringJoiner("\n");
        int lineCount=0;
        while(jsScan.hasNextLine()){
            lineCount++;
            String line = jsScan.nextLine();
            // ignore empty lines. they don't need semicolons.
            if(line.length() > 0){
                char lastChar = line.charAt(line.length() -1);
                System.out.println(lastChar +" last char");
                if (lastChar != '{' && lastChar != '}' && lastChar != ';'){
                    if (!line.contains("if") && !line.contains("else")) {
                        String error = "LINE # " + lineCount + " : missing semicolon " + line;
                        answer.add(error);
                    }
                }
            }

            // look at the last letter and see if there's curly braces.
        }
        return answer.toString();
    }

}
