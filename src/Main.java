import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.findWords(new String[]{"qwety", "qwety", "qad", "qwety"});
    }

//    public String[] cry(String[] words) {
//        char[] rowOne = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
//        char[] rowTwo = {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
//        char[] rowThree = {'z', 'x', 'c', 'v', 'b', 'n', 'm'};
//
//        StringBuilder resultWord = new StringBuilder();
//        String[] resultArray = new String[0];
//        int i;
//        int j;
//        int k;
//        for (k = 0; k < words.length; k++) {
//            String word = words[k].toLowerCase(Locale.ROOT);
//            char[] wordArray = word.toCharArray();
//            for (i = 0; i < rowTwo.length; i++) {
//                for (j = 0; j < word.length(); j++) {
//                    if (wordArray[i] == rowTwo[j]) {
//                        resultWord.append(wordArray[i]);
//                        System.out.println(resultWord);
//                    }
//                    break;
//                }
//            }
//            if (!word.equals(words[k])) {
//                break;
//            }
//            resultArray[k] = Arrays.toString(new String[]{String.valueOf(resultWord)});
//        }
//        return resultArray;
//    }

    public String[] findWords(String[] words) {

        String rowStringOne = "qwertyuiop";
        String rowStringTwo = "asdfghjkl";
        String rowStringThree = "zxcvbnm";

        String[] keyboard = {rowStringOne, rowStringTwo, rowStringThree};
        int i;
        int j = 0;
        int k;
        int p;

        ArrayList<String> resultArray = new ArrayList<>();

        for (p = 0; p < keyboard.length; p++) {
            String row = keyboard[p];
            for (k = 0; k < words.length; k++) {
                StringBuilder result = new StringBuilder();
                String word = words[k].toLowerCase(Locale.ROOT);
                char[] wordArray = word.toCharArray();
                for (i = 0; i < wordArray.length; i++) {
                    char myChar = wordArray[i];
                    if (row.indexOf(myChar) == -1) {
                        result.delete(0, result.length());
                        break;
                    }
                    result.append(myChar);
                }
                if (result.toString().equals(words[k])) {
                    resultArray.add(j, result.toString());
                    result.delete(1, result.length());
                    j++;
                }
            }

        }
        System.out.println(Arrays.toString(resultArray.toArray(new String[0])));
        return resultArray.toArray(new String[0]);
    }
}


