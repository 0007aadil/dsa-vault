class Solution {
    public int evalRPN(String[] s) {

        List<String> arr = new ArrayList<>();

        for (int i = 0; i < s.length; i++) {
            String token = s[i];

            if (!(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/"))) {
                arr.add(token);
            } else {

                if (arr.size() >= 2) {

                    String x = arr.get(arr.size() - 2);
                    int a = Integer.parseInt(x);
                    String y = arr.get(arr.size() - 1);
                    int b = Integer.parseInt(y);
                    int val;
                    if (token.equals("+")) {
                        val = a + b;
                    } else if (token.equals("-")) {
                        val = a - b;
                    } else if (token.equals("*")) {
                        val = a * b;
                    } else {
                        val = a / b;
                    }

                    arr.remove(arr.size() - 1);
                    arr.remove(arr.size() - 1);
                    String ss = "" + val;
                    arr.add(ss);
                }
            }
        }

        String f = arr.get(0);
        int u = Integer.valueOf(f);
        return u;
    }
}