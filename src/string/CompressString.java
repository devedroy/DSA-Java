package string;

public class CompressString {
    static String compressString(String s) {
        if (s.isEmpty()) return "";

        StringBuilder result = new StringBuilder();
        char currentChar = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (currentChar == s.charAt(i)) {
                count++;
            } else  {
                result.append(currentChar).append(count);
                currentChar = s.charAt(i);
                count = 1;
            }
        }
        result.append(currentChar).append(count);
        return result.toString();
    }

    public static void main(String[] args){
      System.out.println(compressString("aaabbddaccc"));
    }
}