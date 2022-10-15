import java.io.File;

public class Solution {
    public static void main(String[] args) {
        String dirPath = "/";
        File f = new File(dirPath);
        File[] files = f.listFiles();
        for(File file : files) {
            System.out.println(file.toString() );
        }
    }
}
