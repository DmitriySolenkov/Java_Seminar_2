public class Ex2 {
    public static void main(String[] args) {
        System.out.println(codding("aaaaabbcccdeeeee"));

    }

    public static String codding(String str) {
        char[] charAr = str.toCharArray();
        StringBuilder builder = new StringBuilder();
        char ch = charAr[0];
        int count = 1;
        for (int index = 1; index < charAr.length; index++) {
            if (charAr[index] == ch)
                count++;
            else {
                builder.append(ch);
                if (count != 1) {
                    builder.append(count);
                }
                ch = charAr[index];
                count = 1;
            }
        }
        builder.append(ch);
        if (count != 1) {
            builder.append(count);
        }
        return builder.toString();
    }
}
