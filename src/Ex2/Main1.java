package Ex2;

import java.util.Scanner;

public class Ex2 {

    public static int[] arr = new int[10];
    static Scanner in = new Scanner(System.in);
    public static int x = 0;

    public static int[] Mass(int n) {
        if (x == n) return arr;
        else {
            System.out.print("Введите " + (x + 1) + " элемент массива: ");
            arr[x++] = in.nextInt();
        }
        return Mass(n);
    }

    public static void main(String[] args) {
        int[] out = Mass(10);
        for (int el : out) System.out.print(el + " ");
    }

}
