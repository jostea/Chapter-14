package HomeWork14_14;

public class TokenizingAndComparing {
    public static void main(String[] args) {
        String string = "My name is TED";

        String[] stringsArr = string.split(" ");
        for (String str : stringsArr) {
            if (str.endsWith("ED")) {
                System.out.println(str);
            }
        }


    }


}
