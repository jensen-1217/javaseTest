package genericity.IODemo;

import java.io.*;

public class Buffered {
    public static void main(String[] args) {
        String srcPath ="E:\\PMD\\Test\\Dome\\files\\hello.txt";
        String desPath="E:\\PMD\\Test\\Dome\\files\\hello1.txt";

        long st = System.currentTimeMillis();
        copy(srcPath,desPath);
        long et = System.currentTimeMillis();
        System.out.println(et-st);

    }

    public static void copy(String src,String dest){
        try(final BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src),1024*100);
            final BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest),1024*100)
        ) {

            byte[] buf = new byte[1024];

            int len=-1;
            while ((len=bis.read(buf))!=-1){
                bos.write(buf,0,len);
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
