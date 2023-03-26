package Ex8;
import java.util.ArrayList;
import java.util.List;
public class Main {

        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();

            System.out.println(list);
            List<Integer> list1 = new ArrayList<>();  list1.add(0);  list1.addAll(0,list);
            System.out.println(list1);
        }

}
