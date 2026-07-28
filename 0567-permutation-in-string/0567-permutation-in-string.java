class Solution {
    public boolean checkInclusion(String s1, String s2) {

        char[] a = s1.toCharArray();
        Arrays.sort(a);
        s1 = new String(a);

        for (int i = 0; i <= s2.length() - s1.length(); i++) {

            boolean b = checkString(s1, s2, i);

            if (b == true) {
                return true;
            }
        }

        return false;
    }


    boolean checkString(String s1, String s2, int k) {

        char[] ch = s2.substring(k, k + s1.length()).toCharArray();

        Arrays.sort(ch);

        String h = new String(ch);

        return h.equals(s1);
    }
}