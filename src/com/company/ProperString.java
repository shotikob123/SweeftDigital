package com.company;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ProperString {

    public Boolean isProperly(String sequence) {

        ArrayList<Character> chars = new ArrayList<Character>();
        for (char c : sequence.toCharArray()) {
            chars.add(c);
        }
        int LeftBracket = Collections.frequency(chars, '(');
        int RightBracket = Collections.frequency(chars, ')');

        if (LeftBracket == RightBracket) {
            while (chars.contains(')')) {
                if (chars.indexOf('(') > chars.indexOf(')')) {
                    return false;
                }
                chars.remove(chars.indexOf('('));
                chars.remove(chars.indexOf(')'));
            }
            return true;
        }
        return false;

    }
}
