package Ex7;
import java.util.LinkedList;
import java.util.Scanner;
public class KillerLinked{
    public static void main(String[] args){
        LinkedList linkedlist = new LinkedList();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество людей:");
        int n = in.nextInt();
        long m = System.currentTimeMillis();
        for(int i = 1; i <= n;i++){
            linkedlist.add(i);
        }
        kill(linkedlist);
        for(int i = 0; i < linkedlist.size();i++){
            System.out.println(linkedlist.get(i) + "");
        }
        System.out.println((double) (System.currentTimeMillis() - m)/1000);
    }
    public static LinkedList kill(LinkedList linkedlist){

        if(linkedlist.size() < 2){
            return linkedlist;
        }
        for(int i = 0;i < linkedlist.size();i++){
            if(i+1 < linkedlist.size()) {
                linkedlist.remove(i + 1);
            }
        }
        return kill(linkedlist);
    }
}