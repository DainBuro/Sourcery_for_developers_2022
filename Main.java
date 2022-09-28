import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> lines = new ArrayList<>();
        Scanner scanner;

        try {
            scanner = new Scanner(new File("src/Src.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            if(is_over_10(line)){
                lines.add(line);
            }
        }

        for (String line : lines) {
            System.out.println(line);
        }
    }

    static boolean is_over_10(String line) {
        for(int i = 0; i < line.length()-1; i++) {
            if(Character.isDigit(line.charAt(i)) &&
                    line.charAt(i) != '0' &&
                    Character.isDigit(line.charAt(i+1))) return true;
        }
        return false;
    }
}