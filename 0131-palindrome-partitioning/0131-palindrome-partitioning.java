class Solution {
    public List<List<String>> partition(String s) {
        

        List<List<String>> arr = new ArrayList<>();

        backtrack(s , 0 , new ArrayList<>() , arr);
        return arr ;
    }

    public static void backtrack( String s , int start , List<String> lst ,  List<List<String>> arr){


        if ( start == s.length() ){
            arr.add(new ArrayList<>(lst));
            return ;
        }

       

        String str = "";

        for ( int i = start ; i < s.length() ; i++){
            
            str = str + s.charAt(i);
            if( isPalind(str) == false ){
                continue ;
            }
            lst.add(str);

            backtrack(s, i+1 , lst , arr);
            
            lst.remove(lst.size() -1 );
            
            




        }




    }

    public static boolean isPalind(String str ){

            int low = 0;
            int high = str.length() -1 ;
            

            while ( low <= high ){

                if(str.charAt(low) == str.charAt(high)){
                    low++;
                    high--;
                }else {
                    return false ;
                }


            }

             return true ;

    }








}