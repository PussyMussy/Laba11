package Ex8;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Main_YdalenieNachalaSpiska {

        public static void main(String[] args) {
            List<Integer> collection = IntStream.rangeClosed(1, 5)
                    .boxed().collect(Collectors.toList());

            collection.remove(0);
            System.out.println(collection);
        }


}
