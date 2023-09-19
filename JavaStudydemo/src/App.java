import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<Integer>();
        for (int i = 0; i < len; i++) {
            int num = sc.nextInt();
        al.add(num);
        }
        int index = sc.nextInt();
        int num1 = sc.nextInt();
        al.add(index,num1);
        StringJoiner sj=new StringJoiner(" ");
        for (Integer integer : al) {
            sj.add(integer.toString());
        }
        System.out.println(sj);
        int rmi = sc.nextInt();
        al.remove(rmi);
        StringJoiner sj2=new StringJoiner(" ");
        for (Integer integer : al) {
            sj2.add(integer.toString());
        }
        System.out.println(sj2);
        int se = sc.nextInt();
        System.out.println(al.indexOf(se));
    }
}
