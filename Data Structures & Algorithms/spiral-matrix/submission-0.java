class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        
        List<Integer> result=new ArrayList<>();

        int startrow=0,endrow=n-1;
        int startcol=0,endcol=m-1;

   while(startrow<=endrow && startcol<=endcol){
        for(int col=startcol;col<=endcol;col++){
           result.add(matrix[startrow][col]);
        }
       startrow++;
        for(int row=startrow;row<=endrow;row++){
            result.add(matrix[row][endcol]);
        }
       endcol--;
        if(startrow<=endrow){
            for(int col=endcol;col>=startcol;col--){
                result.add(matrix[endrow][col]);
            }
                   endrow--;
        }
       
        if(startcol<=endcol){
            for(int row=endrow;row>=startrow;row--){
                result.add(matrix[row][startcol]);
            }
            startcol++;
        }
    }
    return result;
}
}
