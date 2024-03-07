import java.io.PrintWriter;
public class test {
    public static void main(String[] args) throws Exception {
        double[] a = { 19.99, 9.99, 5, 6, 15.99, 3.99, 4.99 };
        java.io.PrintWriter output = new java.io.PrintWriter("a.txt");
        for (int i = 0; i < a.length; i++) {
            output.println(a[i]);
        }
        output.close();
        java.io.File file = new java.io.File("a.txt");
        java.util.Scanner input = new java.util.Scanner(file);
        while (input.hasNext()) {
            System.out.println(input.nextDouble());
        }
        input.close();
        
    }
}
