import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //Random numberOfMovieTitle = new Random();

        File file = new File("movies.txt");
        Scanner fileScanner = new Scanner(file);



String [] films = new String [25];


        for(int i=0;i<25;i++){
            films[i] =fileScanner.nextLine();
        }

//        while (fileScanner.hasNextLine()) {
//          int i = 0;
//
//            films[i] =fileScanner.nextLine();
//            i++;
//        }

        //System.out.println(Arrays.toString(films));
        int random = (int )(Math.random() * 25);
        //System.out.println(films[random]);

        String toGuess = films[random];

        //System.out.println(toGuess.length());

        String [] toGuessArray = toGuess.split("");
        String [] hidden = toGuess.split("");



        //testowe
        for (int i = 0; i < toGuessArray.length; i++) {
            System.out.println(toGuessArray[i]);

        }


        for (int i = 0; i < toGuessArray.length; i++) {
            if (toGuessArray[i].equals(" ")) {
                hidden[i] = "";
            }

            //////////////////why/////////////////////
            else {
                hidden [i] = "_";
            }
            System.out.print(hidden[i] + " ");
        }


        //petla do sprawdzania czy używkownikowi udalo się zgadnąć którąś z liter
        for(int j= 0; j<10; j++) {



            //System.out.println(Arrays.toString(hidden));

            Scanner sc = new Scanner(System.in);
        String letterFromPlayer = sc.nextLine();

            if(letterFromPlayer.equals(toGuess)){
                System.out.println("Congrats you won");
                break;
            }
            else {
                for (int i = 0; i < toGuessArray.length; i++) {

                    if (letterFromPlayer.equals(toGuessArray[i])) {
                        hidden[i] = toGuessArray[i];
                    }


                }


                for (int i = 0; i < toGuessArray.length; i++) {
                    System.out.print(hidden[i] + " ");
                }
            }





// wziac od uzytkownika litere
            //

        }

//        String hidden = new String();
//        for(int i = 0; i<toGuess.length; i++){
//
//            hidden += "_ ";
//
//        }


        //System.out.println(hidden);

    }
}
