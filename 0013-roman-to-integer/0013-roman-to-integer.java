import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanNumbers = new HashMap<Character, Integer>();
        romanNumbers.put('I', 1);
        romanNumbers.put('V', 5);
        romanNumbers.put('X', 10);
        romanNumbers.put('L', 50);
        romanNumbers.put('C', 100);
        romanNumbers.put('D', 500);
        romanNumbers.put('M', 1000);

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1) {
                if (romanNumbers.get(s.charAt(i)) < romanNumbers.get(s.charAt(i + 1))) {
                    sum -= romanNumbers.get(s.charAt(i));
                } else {
                    sum += romanNumbers.get(s.charAt(i));
                }
            } else {
                sum += romanNumbers.get(s.charAt(i));
            }
        }

        return sum;
    }
}
