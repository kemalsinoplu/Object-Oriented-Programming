import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir cümle girin: ");
        String cumle = scan.nextLine();

        System.out.print("Old Word: ");
        String oldWord = scan.next();

        System.out.print("New Word: ");
        String newWord = scan.next();

        String newcumle = cumle.replace(oldWord, newWord);

        System.out.println("Yeni cümle: " + newcumle);

        scan.close();
    }
}
