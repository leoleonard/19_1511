import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.NoSuchElementException;


public class Tablica {

    public int pattern(int[] data) throws NoSuchElementException {

        ArrayList<List> list = new ArrayList<>();

        if (data.length == 0) {
            throw new NoSuchElementException();
        } else {

            for (int i = 0; i < data.length; i++) {
                int number = data[i];
                int total = 0;
                for (int j = 0; j < data.length; j++) {
                    if (number == data[j]) {
                        total++;
                    }
                }
                list.add(new List(number, total));
            }
            Comparator1 comparator1 = new Comparator1();
            Collections.sort(list, comparator1);
            return list.get(0).getNumber();
        }

    }

    public class List {
        int number;
        int total;

        public List(int number, int total) {
            this.number = number;
            this.total = total;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        @Override
        public String toString() {
            return "List{" +
                    "number=" + number +
                    ", total=" + total +
                    '}';
        }
    }

    class Comparator1 implements Comparator<List> {

        @Override
        public int compare(List o1, List o2) {
            if (o1.getTotal() == o2.getTotal()) {
                if (o1.getNumber() > o2.getNumber()) {
                    return 1;
                } else {
                    return -1;
                }
            } else if (o1.getTotal() > o2.getTotal()) {
                return -1;
            } else {
                return 1;
            }

        }
    }


}

