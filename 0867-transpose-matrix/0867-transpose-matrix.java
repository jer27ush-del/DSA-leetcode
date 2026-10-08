class Solution {
    public int[][] transpose(int[][] matrix) {
        int rs=matrix.length;
        int cs=matrix[0].length;
        int[][] res=new int[cs][rs];
        for(int i=0;i<cs;i++){
            for(int j=0;j<rs;j++){
               res[i][j]= matrix[j][i];
            }
        }
        return res;
    }
}