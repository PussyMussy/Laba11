package Ex8;
import java.util.Arrays;
import java.util.stream.IntStream;
public class Main_YdalenieOpredelennogoElementa {

        public static int[] remove(int[] a, int index)
        {
            if (a == null || index < 0 || index >= a.length) {
                return a;
            }

            return IntStream.range(0, a.length)
                    .filter(i -> i != index)
                    .map(i -> a[i])
                    .toArray();
        }

        public static void main(String[] args)
        {
            int[] a = { 1, 2, 3, 4, 5 };
            int index = 2;

            a = remove(a, index);
            System.out.println(Arrays.toString(a));
        }
    }