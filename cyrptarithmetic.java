import java.io.*;
import java.util.*;
import java.util.Map.Entry.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();
        String s3 = scn.nextLine();

        HashMap < Character, Integer > charIntMap = new HashMap < > ();
        String unique = "";
        for (int i = 0; i < s1.length(); i++) {
            if (!charIntMap.containsKey(s1.charAt(i))) {
                charIntMap.put(s1.charAt(i), -1);
                unique += s1.charAt(i);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            if (!charIntMap.containsKey(s2.charAt(i))) {
                charIntMap.put(s2.charAt(i), -1);
                unique += s2.charAt(i);
            }
        }

        for (int i = 0; i < s3.length(); i++) {
            if (!charIntMap.containsKey(s3.charAt(i))) {
                charIntMap.put(s3.charAt(i), -1);
                unique += s3.charAt(i);
            }
        }

        boolean[] usedNumbers = new boolean[10];
        solution(unique, 0, charIntMap, usedNumbers, s1, s2, s3);
    }


    public static void solution(String unique, int idx,
        HashMap < Character, Integer > charIntMap, boolean[] usedNumbers,
        String s1, String s2, String s3) {

        if (idx == unique.length()) {

            String score1 = "";
            for (int i = 0; i < s1.length(); i++) {
                if (charIntMap.get(s1.charAt(i)) != -1) {
                    score1 += charIntMap.get(s1.charAt(i));
                }
            }

            String score2 = "";
            for (int i = 0; i < s2.length(); i++) {
                if (charIntMap.get(s2.charAt(i)) != -1) {
                    score2 += charIntMap.get(s2.charAt(i));
                }
            }

            String score3 = "";
            for (int i = 0; i < s3.length(); i++) {
                if (charIntMap.get(s3.charAt(i)) != -1) {
                    score3 += charIntMap.get(s3.charAt(i));
                }
            }

            if (Integer.parseInt(score1) + Integer.parseInt(score2) == Integer.parseInt(score3)) {
                int[] ascii = new int[26];
                for (int i = 0; i < 26; i++) {
                    ascii[i] = -10;
                }
                for (Map.Entry < Character, Integer > entry: charIntMap.entrySet()) {
                    ascii[entry.getKey() - 'a'] = entry.getValue();
                }
                for (int i = 0; i < 26; i++) {
                    if (ascii[i] != -10) {
                        System.out.print("" + (char)('a' + i) + "-" + ascii[i] + " ");
                    }
                }
                System.out.println();
            }
            return;
        }


        char currentch = unique.charAt(idx);

        for (int i = 0; i < 10; i++) {
            if (!usedNumbers[i]) {
                charIntMap.put(currentch, i);
                usedNumbers[i] = true;
                solution(unique, idx + 1, charIntMap, usedNumbers, s1, s2, s3);
                charIntMap.put(currentch, -1);
                usedNumbers[i] = false;
            }
        }
    }

}
