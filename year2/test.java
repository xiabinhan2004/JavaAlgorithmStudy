import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class test {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter("cc.txt"));
        
        String str;
        
        
        while(!(str = br.readLine()).equals("quit")){
            bw.write(str);
            bw.newLine();
        }
        bw.close();
        br.close();

    }
}
