package myquene;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.concurrent.ArrayBlockingQueue;


public class MyQuene{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        ArrayBlockingQueue<Integer> quene = new ArrayBlockingQueue<Integer>(num+1);
        
        String[] split = sc.nextLine().split(" ");
        for (int i = 0; i < split.length; i++) {
            quene.add(Integer.parseInt(split[i]));
        }
        for (Integer I : quene) {
            System.out.print(I+" ");
        }
        System.out.println();
        int insertnum = Integer.parseInt(sc.nextLine());
        quene.add(insertnum);
        StringJoiner sj=new StringJoiner(" ");
        for (Integer i : quene) {
            sj.add(i.toString());
        }
        System.out.println(sj.toString());
        System.out.println(quene.poll());
        for (Integer I : quene) {
            System.out.print(I+" ");
        }
        sc.close();
        


        
    }
}