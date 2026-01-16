import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) throws Exception {
        File f = new File("data/text.txt");
        try (Scanner scanner = new Scanner(f)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
            } catch (Exception e) {
                Logger logger = Logger.getLogger(App.class.getName());
                logger.severe("An error occurred: " + e.getMessage());
            }
        }
    }