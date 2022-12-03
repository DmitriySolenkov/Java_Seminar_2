public class Ex3 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aa"));

    }

    public static boolean isPalindrome(String str) {
        char[] charAr = str.toCharArray();
        int len = 0;
        if (charAr.length % 2 == 0) {
            len = charAr.length / 2 - 1;
        } else {
            len = charAr.length / 2;
        }
        for (int index = 0; index <= len; index++) {
            if (charAr[index] != charAr[charAr.length - 1 - index]) {
                return false;
            }
        }
        return true;
    }
}
