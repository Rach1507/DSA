public class rangeSum2d {
        public int[][] cube , sumMatrix;
    
        public rangeSum2d(int[][] matrix) {
    
            cube = matrix;
    
            for(int i = 0;i<cube.length;i++){
                // sumMatrix[i][0] = cube[i][0];
                // System.out.print(" "+sumMatrix[i][0]);
                for(int j = 1;j<cube[0].length;j++){
                    cube[i][j] = cube[i][j] + cube[i][j-1]; 
                    // System.out.print(" "+sumMatrix[i][j]);
                }
                // System.out.println();
            }
        }
        
        public int sumRegion(int row1, int col1, int row2, int col2) {
    
            int sum = 0,col =0 , rowSum = 0 , col1Sum = 0 ; 
            // System.out.println();
            
            for(int i = row1;i <= row2; i++ ){
                if(col1 > 0)
                rowSum = cube[i][col2]- cube[i][col1-1];
                else
                rowSum = cube[i][col2]-0;
                // System.out.println(rowSum);
                sum += rowSum;
            }
    
    
            return sum;
    
    
            // row1Sum += matrix[row1][col2]- matrix[row1][col1];
            // rowMiddleSum = matrix[row1][col2]- matrix[row1][col1];
            //.
            //.
            //.
            //row2sum = matrix[row2][col2]- matrix[row2][col1];
    
        }
    }
    
    /**
     * Your NumMatrix object will be instantiated and called as such:
     * NumMatrix obj = new NumMatrix(matrix);
     * int param_1 = obj.sumRegion(row1,col1,row2,col2);
     */
    

class NumMatrix {
    int[][] mat;
    public NumMatrix(int[][] matrix) {
        int n=matrix.length,m=matrix[0].length;
        for(int i=1;i<n;i++) matrix[i][0]+=matrix[i-1][0];
        for(int i=1;i<m;i++) matrix[0][i]+=matrix[0][i-1];
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                matrix[i][j]+=(matrix[i-1][j]+matrix[i][j-1]-matrix[i-1][j-1]);
            }
        }
        mat=matrix;
    }
    
    public int sumRegion(int r1, int c1, int r2, int c2) {
        int ans=mat[r2][c2];
        if(r1>0) ans-=mat[r1-1][c2];
        if(c1>0) ans-=mat[r2][c1-1];
        if(r1>0 && c1>0) ans+=mat[r1-1][c1-1];
        return ans;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */