package IO;

import org.junit.Test;

import java.io.*;

public class FileTest {

    @Test
    public void test1() throws IOException {
        File file1 = new File("src\\main\\resources\\hello.txt");
        File file2 = new File("src\\main\\resources\\hello4.txt");
        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);
        // 在节点流基础上造缓冲流
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        // 读取、写入
        byte[] buffer = new byte[10];
        int len;
        while ((len = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }
        // 先关闭外层的流、再关闭内层的流
        bos.close();
        bis.close();
        // 说明：关闭外层流的时候，内层流会自动关闭；
//        fos.close();
//        fis.close();
    }

    @Test
    public void test2() {
        long start = System.currentTimeMillis();
        String srcPath = "src\\main\\resources\\hello.txt";
        String destPath = "src\\main\\resources\\hello2.txt";

        copyFiles(srcPath, destPath);
        long end = System.currentTimeMillis();
        System.out.println("It takes " + (end - start) + " ms");
    }



    public void copyFiles(String srcPath, String destPath) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File file1 = new File(srcPath);
            File file2 = new File(destPath);
            fis = new FileInputStream(file1);
            fos = new FileOutputStream(file2);
            byte[] buffer = new byte[3];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null)
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (fos != null)
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}
