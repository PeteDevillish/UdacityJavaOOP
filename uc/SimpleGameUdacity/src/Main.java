import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int random = (int )(Math.random() * 100 + 1);

        System.out.println(random);



for(int i=10; i>0; i--) {

    Scanner userNumber = new Scanner(System.in);
    int userNumberr = userNumber.nextInt();

    String chances;

    if(i>2){
      chances = "Try again, you have " + (i-1) + " chances.";
    }

    else if(i==2){
        chances = "Try again, you have " + (i-1) + " chance.";
    }

    else{
        chances = "";
    }

    if (userNumberr > random) {
        System.out.println("Number is less than You chose. " + chances);
    }

    else if (userNumberr < random) {
        System.out.println("Number is greater than You chose. "  + chances);
    }

    else {
        System.out.println("Congrats, you are a winner");
        break;
    }

    if(i ==1 && userNumberr !=random){
        System.out.println("You loose");
    }

        }
    }
}
