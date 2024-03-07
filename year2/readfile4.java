import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class readfile4 {
    public static void main(String[] args) throws Exception{
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));  
            //缓冲FileWriter  
            BufferedWriter bufWriter = new BufferedWriter(new FileWriter("aa.txt"));  
           String input;
            //每读一行进行一次写入动作  
            while(!(input = bufReader.readLine()).equals("quit")) {  
                bufWriter.write(input);                  
                bufWriter.newLine();  
            }  
            bufReader.close();  
            bufWriter.close();
    }
}
