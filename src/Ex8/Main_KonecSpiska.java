package Ex8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main_KonecSpiska {
        public static void main(String[] args)
        {
            List<String> alphabets = new ArrayList<>(Arrays.asList("Красный", "синий", "коричневый", "фиолетовый"));
            String e = "Желтый";

            alphabets.add(e);
            System.out.println(alphabets);
        }
}
