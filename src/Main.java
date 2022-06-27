import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.findWords(new String[]{"qwety", "qwety", "qad", "qwety"});
    }

    public String[] findWords(String[] words) {

        String rowStringOne = "qwertyuiopQWERTYUIOP";
        String rowStringTwo = "asdfghjklASDFGHJKL";
        String rowStringThree = "zxcvbnmZXCVBNM";

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
                String word = words[k];
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
        return resultArray.toArray(new String[0]);
    }
}
