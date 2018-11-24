package HomeWork14_7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PigLatin {


    public static String[] printLatinWord(String word) {
        String[] str = word.split(" ");

        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].substring(1) + str[i].substring(0, 1).toLowerCase() + "ay";
        }

        return str;
    }


//    public static List<String> printLatinWordByStream(String word) {
//        String[] str = word.split(" ");
//        return Arrays.stream(str).map(s ->
//                s.substring(1).toLowerCase() + s.substring(0, 1).toLowerCase() + "ay").collect(Collectors.toList());
//    }


    public static void main(String[] args) {

        for (String str : PigLatin.printLatinWord("Hello World ")) {
            System.out.println(str);
        }

//        System.out.println("Using streams\n");
//        for (String str : PigLatin.printLatinWordByStream("Hello World ")) {
//            System.out.println(str);
//        }


    }
}
