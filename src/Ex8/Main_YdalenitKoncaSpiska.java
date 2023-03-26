package Ex8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main_YdalenitKoncaSpiska {

        public static void main(String[] args)
        {
            List<String> list = new ArrayList<>();
            list.addAll(Arrays.asList("Красный", "Синий", "Коричневый", "Зеленый", "Желтый"));

            System.out.println("Начальный список: " + list);

            int indexOfLastElement = list.size() - 1;
            list.remove(indexOfLastElement);

            System.out.println("Конечный список: " + list);
        }
    }
