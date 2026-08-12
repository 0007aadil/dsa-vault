class Solution {
    public boolean rotateString(String s, String goal) {

        char[] arr1 = s.toCharArray();
        char[] arr2 = goal.toCharArray();

        if ( Arrays.equals(arr1 , arr2 )){
            return true ;
        }

        for ( int i = 0 ; i< arr1.length ; i++){
            char c = arr1[arr1.length -1 ];

            for ( int j =0 ; j < arr1.length; j++){
                char temp = c ;
                c = arr1[j];
                arr1[j] = temp; 
            }

            if ( Arrays.equals(arr1 , arr2 )){
            return true ;
        }

        }

        return false ;
        
    }
}