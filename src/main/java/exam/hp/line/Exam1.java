package exam.hp.line;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.StringJoiner;
import leetcode.best.medium.backtracking.LettersCombinations;

public class Exam1 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        if (a.length() >= b.length()) {
            throw new Exception("is Not Valid Inputs");
        }

        //new StringJoiner();
        //LettersCombinations

        //.?
        //abc
        // a.b.c
        // a.b?c
        // a?b.c
        // a?b?c

        //.?#
        //abcd
        // a.b.c.d
        // a.b.c?d
        // a.b.c.d
        // a.
        // a?b.cd
        // a?b?cd

        List<String> results = new ArrayList<>();

        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();

        // Time Complexity
        // a.length = N, b.length = M
        // O(NM)
        for (char aChar: aChars) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < bChars.length; j++) {
                sb.append(bChars[j]);
                sb.append(j < bChars.length-1 ? aChar : "");
            }
            results.add(sb.toString());
        }

        // All Possible Combinations
        List<List<Character>> combinations = getCombinations(aChars);

        // Time Complexity
        // combinations.size = N, bChars.length = M
        // O(NM)
        for (List<Character> chars: combinations) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < bChars.length; j++) {
                sb.append(bChars[j]);
                sb.append(j < bChars.length-1 ? chars.get(j) : "");
            }
            results.add(sb.toString());
        }

        System.out.println(results.size());

        //results.stream().sorted().forEach(System.out::println);

        for (String result: results) {
            System.out.println(result);
        }
    }

    // Time Complexity
    // aChars.length = N
    // Better than O(N * N!), Slower than O(N!)
    private static List<List<Character>> getCombinations(char[] aChars) {
        List<List<Character>> combinations = new LinkedList<>();

        List<Character> aCharList = new ArrayList<>();
        for (Character aChar : aChars) {
            aCharList.add(aChar);
        }

        int n = aChars.length;
        backtrackForCreateCombinations(n, aCharList, combinations, 0);

        return combinations;
    }

    private static void backtrackForCreateCombinations(
        int n, List<Character> chars, List<List<Character>> combinations, int first
    ) {
        if (first == n) {
            combinations.add(new ArrayList<>(chars));
        }
        for (int i = first; i < n; i++) {
            Collections.swap(chars, first, i);

            backtrackForCreateCombinations(n, chars, combinations, first + 1);

            Collections.swap(chars, first, i);
        }
    }




}
