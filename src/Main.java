import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.findWords(new String[]{"qwety", "qwety", "Dad", "Peace"});
    }

    public String[] cry(String[] words) {
        char[] rowOne = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
        char[] rowTwo = {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
        char[] rowThree = {'z', 'x', 'c', 'v', 'b', 'n', 'm'};

        StringBuilder resultWord = new StringBuilder();
        String[] resultArray = new String[0];
        int i;
        int j;
        int k;
        for (k = 0; k < words.length; k++) {
            String word = words[k].toLowerCase(Locale.ROOT);
            char[] wordArray = word.toCharArray();
            for (i = 0; i < rowTwo.length; i++) {
                for (j = 0; j < word.length(); j++) {
                    if (wordArray[i] == rowTwo[j]) {
                        resultWord.append(wordArray[i]);
                        System.out.println(resultWord);
                    }
                    break;
                }
            }
            if (!word.equals(words[k])) {
                break;
            }
            resultArray[k] = Arrays.toString(new String[]{String.valueOf(resultWord)});
        }
        return resultArray;
    }

    public String[] findWords(String[] words) {
        char[] rowOne = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
        char[] rowTwo = {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
        char[] rowThree = {'z', 'x', 'c', 'v', 'b', 'n', 'm'};

        String rowStringOne = "qwertyuiop";

        int i;
        int j = 0;
        int k;
        String[] resultArray = new String[words.length];

        for (k = 0; k < words.length; k++) {
            StringBuilder result = new StringBuilder();
            String word = words[k].toLowerCase(Locale.ROOT);
            char[] wordArray = word.toCharArray();
            for (i = 0; i < wordArray.length; i++) {
                char myChar = wordArray[i];
                if (rowStringOne.indexOf(myChar) == -1) {
                    result.delete(1,result.length());
                    break;
                }   result.append(myChar);
            }
            if (result.toString().equals(words[k])) {
                resultArray[j] = Arrays.toString(new String[]{String.valueOf(result)});
                System.out.println(Arrays.toString(resultArray));
                result.delete(1,result.length());
                j++;
            }
        }
        return resultArray;
    }
}


