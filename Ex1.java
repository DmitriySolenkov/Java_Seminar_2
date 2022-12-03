public class Ex1 {

    public static void main(String[] args) {
        String str = altChar(4, 'f', '5');
        System.out.println(str);
    }

    private static String altChar(int length, char ch1, char ch2) {
        StringBuilder builder = new StringBuilder();
        for (int index = 0; index < length; index++) {
            if (index % 2 == 0) {
                builder.append(ch1);
            } else {
                builder.append(ch2);
            }
        }
        return builder.toString();

    }

}
