package joshua_assessment_2;

import java.io.*;
import java.util.Scanner;

public class CreateAndWrite {

    static String path = "D:\\Program Files\\IdeaProjects\\Assessment\\src\\joshua_assessment_2\\test.txt";
    static File writeAndRead = new File(path);
    static Scanner myReader = null;

    public static void main(String[] args) {

        try {
            if (writeAndRead.createNewFile()) {
                System.out.println("Created new file: " + writeAndRead.getName());
            } else {
                System.out.println("File already exist");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileWriter fileWriter = new FileWriter(path);
            fileWriter.write("TESTing a writing");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            myReader = new Scanner(writeAndRead);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (myReader.hasNext()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
    }
}
