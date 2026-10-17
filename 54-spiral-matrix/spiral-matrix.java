class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;

        List<Integer> result=new ArrayList<>();
        
        int startcol=0,endcol=n-1;
        int startrow=0,endrow=m-1;

        while(startrow<=endrow && startcol<=endcol){
            //row-->print row from startcol to endcol(L to R)
            for(int col=startcol;col<=endcol;col++){
                result.add(matrix[startrow][col]);
            }
            startrow++;
            //col-->print col fro startrow to endrow(T to B)
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