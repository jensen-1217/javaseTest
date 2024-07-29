package genericity.IODemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile2 {
    public static void main(String[] args) {
        String srcPath ="E:\\PMD\\Test\\Dome\\files\\hello.txt";
        String desPath="E:\\PMD\\Test\\Dome\\files\\hello1.txt";

        long st = System.currentTimeMillis();
        copy(srcPath,desPath);
        long et = System.currentTimeMillis();
        System.out.println(et-st);

    }

    public static void copy(String src,String dest){
        try(FileInputStream fis = new FileInputStream(src);
            final FileOutputStream fos = new FileOutputStream(dest)
        ) {

            byte[] buf = new byte[1024];

            int len=-1;
            while ((len=fis.read(buf))!=-1){
                fos.write(buf,0,len);
            }

           /* int data=0;
            while ((data=fis.read())!=-1){
                fos.write(data);
            }*/
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
