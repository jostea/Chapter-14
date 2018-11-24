package HomeWork14_9;

public class ReversSentence {
    public static void main(String[] args) {
        String string = "Hello world";

        String[] str1 = string.split(" ");
        for (int i = 0; i < str1.length; i++) {
            str1[i] = new StringBuilder(str1[i]).reverse().toString();
            System.out.println(str1[i]);
        }


        String str2 = " ";
        for (int i = string.length() - 1; i != 0; i--) {
            str2 += string.substring(i, i + 1);

        }
        str2 += string.substring(0, 1);

        String[] str = str2.split(" ");
        for (String s : str) {
            System.out.println(s);
        }


    }
}
