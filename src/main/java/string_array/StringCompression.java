package string_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCompression {

    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c'};
        System.out.println(compress(chars));

    }

    public static int compress(char[] chars) {
        int length = chars.length;
        List<String> countString = new ArrayList<>();

        int count = 1;
        char s = chars[0];
        countString.add(String.valueOf(chars[0]));

        for (int i = 1; i < length; i++) {
            if (s == chars[i]) {
                count++;
            }

            else  {
                if (count >= 10) {
                    countString.addAll(Arrays.asList(String.valueOf(count).split((""))));
                } else if (count > 1) countString.add(String.valueOf(count));
                
                s = chars[i];
                count = 1;
                countString.add(String.valueOf(chars[i]));
            }
        }

        if (count >= 10) {
            countString.addAll(Arrays.asList(String.valueOf(count).split((""))));
        } else if (count > 1) countString.add(String.valueOf(count));

        for (int i = 0; i < countString.size(); i++) {
            chars[i] = countString.get(i).charAt(0);
        }
        return countString.size();

    }


}
