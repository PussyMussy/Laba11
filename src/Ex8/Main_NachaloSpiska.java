package Ex8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main_NachaloSpiska {
        public static void main(String[] args)
        {
            List<String> colors = new ArrayList<>(Arrays.asList("Красный", "синий", "коричневый", "фиолетовый"));
            String color = "Желтый";

            colors.add(0, color);
            System.out.println(colors);
        }
    }

