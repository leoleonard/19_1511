import java.util.NoSuchElementException;

public class TablicaTest {
    public static void main(String[] args) throws NoSuchElementException {
        Tablica tab = new Tablica();
        int[] tab1 = {5, 5, 5, 8, 3, 3, 3, 10, 2, 1, 2};
        int[] tab2 = {2, 2, 2, 3, 3, 4, 5};
        int[] tab3 = {};

        System.out.println("Najczęściej wystepująca wartość w tablicy to " + tab.pattern(tab1));
        System.out.println("Najczęściej wystepująca wartość w tabblicy to " + tab.pattern(tab2));
        System.out.println("Najczęściej wystepująca wartość w tabblicy to " + tab.pattern(tab3));

    }

}