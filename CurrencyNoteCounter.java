    import java.util.*;

public class CurrencyNoteCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] notes = {500, 100, 50, 20, 10, 5, 2, 1};

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        System.out.println("Currency breakdown");

        for (int currency : notes) {
            if (amount >= currency) {
                int count = amount / currency;
                amount = amount % currency;
                System.out.println(currency + " = " + count);
            }
        }
    }
}


