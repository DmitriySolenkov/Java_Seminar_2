import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

// Напишите метод, который вернет содержимое текущей папки в виде массива строк.
// Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
// Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.

public class Ex5 {
    public static void main(String[] args) throws Exception {
        String[] fileList = dirList("D:/Homework/Java/Seminar2");
        writeList(fileList);
    }

    public static String[] dirList(String dir) {
        File file = new File(dir);
        String[] fileList = file.list();
        return fileList;
    }

    public static void writeList(String[] strAr) throws Exception {
        try {
            FileWriter fw = new FileWriter("Ex5file.txt");
            for (String str : strAr) {
                fw.write(str);
                fw.write("\n");
            }
            fw.close();
        } catch (IOException ex) {
            Logger logger = Logger.getLogger(Ex5.class.getName());
            logger.log(Level.WARNING, "Ошибка!", ex);
        }

    }
}
