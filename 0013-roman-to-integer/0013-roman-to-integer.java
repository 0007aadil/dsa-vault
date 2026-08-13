class Solution {
    public int romanToInt(String s) {

        int[] arr1 = {1,5,10,50,100,500,1000};

        char[] arr2 = {'I','V','X','L','C','D','M'};

        HashMap<Character, Integer> map = new HashMap<>();


        for ( int i = 0 ; i < arr1.length; i++){



            map.put(arr2[i] , arr1[i]);

        }

        int res = 0 ;

        for ( int i = 0 ; i < s.length(); i++){

            char k = s.charAt(i);

            if (i + 1 < s.length() && k == 'I' && s.charAt(i+1) == 'V' ){
                res = res + 4;
                i++;

            }else if (i + 1 < s.length() && k == 'I' && s.charAt(i+1) == 'X' ){
                res = res + 9;
                i++;

            }else if (i + 1 < s.length() && k == 'X' && s.charAt(i+1) == 'L'){
                res = res + 40;
                i++;
            }else if (i + 1 < s.length() && k == 'X' && s.charAt(i+1) == 'C'){
                res = res + 90;
                i++;

            }else if (i + 1 < s.length() && k == 'C' && s.charAt(i+1) == 'D'){

                res = res + 400;
                i++;

            }else if (i + 1 < s.length() && k == 'C' && s.charAt(i+1) == 'M'){
                res = res + 900;
                i++;

            }else {

                res = res + map.get(k);

            }
            

            

            
        }

        return res ;


        
        
    }
}