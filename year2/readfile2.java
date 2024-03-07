import java.io.*;

public class readfile2 {
    public  static void main(String[] args)throws IOException {
            String filePath="./cc.txt";
            RandomAccessFile raf=null;
            File file=null;
            try {
                file=new File(filePath);
                raf=new RandomAccessFile(file,"r");
                // 获取 RandomAccessFile对象文件指针的位置，初始位置为0
                System.out.println("指针位置："+raf.getFilePointer());
                //移动文件记录指针的位置
                raf.seek(5);
                System.out.println("指针位置："+raf.getFilePointer());
    
                byte[] b=new byte[1024];
                int hasRead=0;
                //循环读取文件
                while((hasRead=raf.read(b))>0){
                    //输出文件读取的内容
                    System.out.print(new String(b,0,hasRead));
                }
            }catch (IOException e){
                e.printStackTrace();
            }finally {
                raf.close();
            }
        }
    }
    