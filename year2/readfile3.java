import java.io.*;
public class readfile3 {
    public static void main(String[] args) {
        String filePath="./";
        File f1 = new File(filePath);
        File svf = new File("./filename.txt");
        try {
            FileWriter writer = new FileWriter(svf, true); 
            BufferedWriter out = new BufferedWriter(writer);
            
            if (f1.isDirectory()) {
                String s[] = f1.list();
                for (int i = 0; i < s.length; i++) {
                    File f = new File(filePath + "/" + s[i]);
                    if (f.isDirectory()) {
                        System.out.println(s[i] + " 文件夹");
                        out.write(s[i] + "\n"); 
                    } else {
                        System.out.println(s[i] + " 文件");
                    }
                }
                
                out.close();
            } else {
                System.out.println(filePath + " 不是一个目录");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}