import java.io.FileWriter;

public class Ex4 {
    public static void main(String[] args) throws Exception {
        String str = Test100();
        fileWrite(str);
    }

    public static String Test100() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            builder.append("Test ");
        }
        return builder.toString();
    }

    public static void fileWrite(String str) throws Exception {
        FileWriter fw = new FileWriter("Ex4file.txt");
        fw.write(str);
        fw.close();
    }
}
