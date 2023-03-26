package Ex2;

 import java.util.Scanner;
    public class Main1
    {
        public static void main(String[] args)
        {
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число для перевода:");
            n = sc.nextInt();
            Main1 obj = new Main1();
            int m = obj.binary(n);
            System.out.println("Перевод в двоичную систему:"+m);
        }
        public static int binary(int n)
        {
            if (n == 1)
            {
                return 1;
            }
            return binary(n / 2) * 10 + n % 2;
        }
    }