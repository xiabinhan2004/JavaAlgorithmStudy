import java.io.FileReader;

public class test2 {
    public static void main(String[] args) throws Exception{
        FileReader cc=new FileReader("cc.txt");
        int i;
        while((i=cc.read())!=-1){
            System.out.print((char)i);
        }
        
    }
    
}
