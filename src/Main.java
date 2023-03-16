import java.util.Scanner;

public class Main {
    static String toLength(String text, int length) {
        if (text.length() >= length) {
            return text.substring(text.length()-length);
        } else {
            while (text.length() < length) {
                text = ' ' + text;
            }
            return text;
        }
    }

    public static void main(String[] args) {
        // Läs in en text och en längd, skicka båda till en metod som ser till att texten blir så lång.
        //   - Är texten längre = ta de sista X tecknen
        //   - Är texten för kort = lägg till space före

        Scanner input = new Scanner(System.in);
        System.out.print("Ange en texts: ");
        String text = input.nextLine();
        System.out.print("Ange längden: ");
        int length = input.nextInt();

        System.out.println(toLength(text, length));
    }
}