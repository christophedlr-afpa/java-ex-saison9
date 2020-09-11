import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int option;
        Main m = new Main();

        System.out.println("1. 9.5");
        System.out.print("Choisissez votre option : ");
        option = Integer.parseInt(m.reader.readLine());

        if (option == 1) {
            m.algo95();
        } else {
            System.out.println("Mauvaise option");
        }
    }

    public void algo95() throws IOException {
        int charPos;
        String sentence = new String();
        String leftSentence = new String();
        String rightSentence = new String();

        System.out.println("Veuillez entrer une phrase : ");
        sentence = reader.readLine();

        System.out.print("Indiquez la position d'un caractère de la chaîne, ce dernier sera supprimé : ");
        charPos = Integer.parseInt(reader.readLine());

        leftSentence = sentence.substring(0, charPos);
        rightSentence = sentence.substring(charPos+1, sentence.length());
        sentence = leftSentence+rightSentence;

        System.out.println("La nouvelle phrase : ");
        System.out.println(sentence);
    }
}
