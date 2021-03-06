import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int option;
        Main m = new Main();

        System.out.println("1. 9.5");
        System.out.println("2. 9.6");
        System.out.println("3. 9.8");
        System.out.print("Choisissez votre option : ");
        option = Integer.parseInt(m.reader.readLine());

        if (option == 1) {
            m.algo95();
        } else if (option == 2) {
            m.algo96();
        } else if (option == 3) {
            m.algo98();
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

    public void algo96() throws IOException {
        String sentence = new String();

        System.out.println("Indiquez une phrase :");
        sentence = reader.readLine();

        for (int i = 0; i < sentence.length(); i++) {
            sentence = sentence.substring(0, i)+(char)((int)sentence.charAt(i)+1)+sentence.substring(i+1, sentence.length());
        }

        System.out.println("Votre phrase codée :");
        System.out.println(sentence);
    }

    public void algo98() throws IOException {
        int glup;
        int glup2;
        float glupFloat;
        Random rand = new Random();

        glup = rand.nextInt((2-0)+1)+0;
        System.out.println(glup);

        glup = rand.nextInt((1-(-1))+1)+(-1);
        System.out.println(glup);

        glupFloat = (float) ((-1.35) + (rand.nextFloat() * (1.65 - (-1.35))));
        System.out.println(glupFloat);

        glup = rand.nextInt((6-1)+1)+1;
        System.out.println(glup);

        glupFloat = (float) ((-10.5) + (rand.nextFloat() * (6.5 - (-10.5))));
        System.out.println(glupFloat);

        glup = rand.nextInt((6-1)+1)+1;
        glup2 = rand.nextInt((6-1)+1)+1;
        System.out.println(glup+glup2);
    }
}
