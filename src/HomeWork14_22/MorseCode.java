package HomeWork14_22;

public class MorseCode {


    public static String convertToMorseCode(String sentence) {
        StringBuilder morseCode = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            String character = sentence.substring(i, i + 1).toUpperCase();

            switch (character) {
                case "A":
                    morseCode.append(".- ");
                    break;
                case "B":
                    morseCode.append("-... ");
                    break;
                case "C":
                    morseCode.append("-.-. ");
                    break;
                case "D":
                    morseCode.append("-.. ");
                    break;
                case "E":
                    morseCode.append(". ");
                    break;
                case "F":
                    morseCode.append("..-. ");
                    break;
                case "G":
                    morseCode.append("--. ");
                    break;
                case "H":
                    morseCode.append(".... ");
                    break;
                case "I":
                    morseCode.append(".. ");
                    break;
                case "J":
                    morseCode.append(".--- ");
                    break;
                case "K":
                    morseCode.append("-.- ");
                    break;
                case "L":
                    morseCode.append(".-.. ");
                    break;
                case "M":
                    morseCode.append("-- ");
                    break;
                case "N":
                    morseCode.append("-. ");
                    break;
                case "O":
                    morseCode.append("--- ");
                    break;
                case "P":
                    morseCode.append(".--. ");
                    break;
                case "Q":
                    morseCode.append("--.- ");
                    break;
                case "R":
                    morseCode.append(".-. ");
                    break;
                case "S":
                    morseCode.append("... ");
                    break;
                case "T":
                    morseCode.append("- ");
                    break;
                case "U":
                    morseCode.append("..- ");
                    break;
                case "V":
                    morseCode.append("...- ");
                    break;
                case "W":
                    morseCode.append(".-- ");
                    break;
                case "X":
                    morseCode.append("-..- ");
                    break;
                case "Y":
                    morseCode.append("-.-- ");
                    break;
                case "Z":
                    morseCode.append("--.. ");
                    break;
                case "1":
                    morseCode.append(".---- ");
                    break;
                case "2":
                    morseCode.append("..--- ");
                    break;
                case "3":
                    morseCode.append("...-- ");
                    break;
                case "4":
                    morseCode.append("....-  ");
                    break;
                case "5":
                    morseCode.append("..... ");
                    break;
                case "6":
                    morseCode.append("-.... ");
                    break;
                case "7":
                    morseCode.append("--... ");
                    break;
                case "8":
                    morseCode.append("---.. ");
                    break;
                case "9":
                    morseCode.append("----. ");
                    break;
                case "0":
                    morseCode.append("----- ");
                    break;


                default:
                    morseCode.append("  ");
            }

        }
        return morseCode.toString();
    }


    public static String convertToEnglish(String morse) {
        String[] letters = morse.split(" ");
        String sentence = "";

        for (int i = 0; i < letters.length; i++) {

            switch (letters[i]) {
                case ".-":
                    sentence += "A";
                    break;
                case "-...":
                    sentence += ("b");
                    break;
                case "-.-.":
                    sentence += ("c");
                    break;
                case "-..":
                    sentence += ("d");
                    break;
                case ".":
                    sentence += ("e");
                    break;
                case "..-.":
                    sentence += ("f");
                    break;
                case "--.":
                    sentence += ("g");
                    break;
                case "....":
                    sentence += ("h");
                    break;
                case "..":
                    sentence += ("i");
                    break;
                case ".---":
                    sentence += ("j");
                    break;
                case "-.-":
                    sentence += ("k");
                    break;
                case ".-..":
                    sentence += ("l");
                    break;
                case "--":
                    sentence += ("m");
                    break;
                case "-.":
                    sentence += ("n");
                    break;
                case "---":
                    sentence += ("o");
                    break;
                case ".--.":
                    sentence += ("p");
                    break;
                case "--.-":
                    sentence += ("q");
                    break;
                case ".-.":
                    sentence += ("r");
                    break;
                case "...":
                    sentence += ("s");
                    break;
                case "-":
                    sentence += ("t");
                    break;
                case "..-":
                    sentence += ("u");
                    break;
                case "...-":
                    sentence += ("v");
                    break;
                case ".--":
                    sentence += ("w");
                    break;
                case "-..-":
                    sentence += ("x");
                    break;
                case "-.--":
                    sentence += ("y");
                    break;
                case "--..":
                    sentence += ("z");
                    break;
                case ".----":
                    sentence += ("1");
                    break;
                case "..---":
                    sentence += ("2");
                    break;
                case "...--":
                    sentence += ("3");
                    break;
                case "....-":
                    sentence += ("4");
                    break;
                case ".....":
                    sentence += ("5");
                    break;
                case "-....":
                    sentence += ("6");
                    break;
                case "--...":
                    sentence += ("7");
                    break;
                case "---..":
                    sentence += ("8");
                    break;
                case "----.":
                    sentence += ("9");
                    break;
                case "-----":
                    sentence += ("0");
                    break;


                default:
                    sentence += " ";
                    break;

            }

        }


        return sentence.toUpperCase();
    }


    public static void main(String[] args) {


        System.out.println(convertToEnglish(".... . .-.. .-.. ---   .-- --- .-. .-.. -.."));

        System.out.println(convertToMorseCode("Hello world"));

    }
}
