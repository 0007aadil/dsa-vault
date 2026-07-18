class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {


        List<Integer> arr = new ArrayList<>();


        int left = 0;
        int right = matrix[0].length -1;
        int top = 0;
        int bottom = matrix.length -1 ;
        int duration = matrix.length * matrix[0].length;

        while ( arr.size() < duration ){

        



        for ( int i = left; i <= right ; i++){
            arr.add(matrix[top][i]);

        }


        for ( int j = top + 1 ; j <= bottom ; j++){
            arr.add(matrix[j][right]);

        }

        if ( top < bottom ){

            for (int k = right -1 ; k >= left ; k--){
            arr.add(matrix[bottom][k]);


        }

        }

        

        if ( left < right ){

        for ( int l = bottom -1  ; l > top ; l--){

            arr.add(matrix[l][left]);

        }
         }

        left++;
        top++;
        right--;
        bottom--;


        }

        return arr ;





        
       
        




        
    }
}