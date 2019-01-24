import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        File file = new File("98-0.txt");
        Scanner scanner = new Scanner(file);

        int words = 0;

        //sprawdza czy ma kolejna linie do odczytania
        while(scanner.hasNextLine()){

            String line = scanner.nextLine();

            //zlicza wszystkie slowa najpierw dzielac kolejne linie na wyrazy
            words +=line.split(" ").length;

        }
        System.out.println(words);




        File Huck = new File("adventuresOfHuckleberryFinn.txt");
        Scanner sc = new Scanner(Huck);

        int finnWords = 0;
        while(sc.hasNextLine()){
            String finnLine = sc.nextLine();
            words += finnLine.split(" ").length;

        }
        System.out.println(words);
    }
}
