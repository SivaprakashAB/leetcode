// 54. Spiral Matrix
// Solved
// Medium
// Topics
// Companies
// Hint
// Given an m x n matrix, return all elements of the matrix in spiral order.

 

// Example 1:


// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [1,2,3,6,9,8,7,4,5]
// Example 2:


// Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
// Output: [1,2,3,4,8,12,11,10,9,5,6,7]

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         List<Integer> res = new ArrayList<>();  // to create arraylist

    if (matrix.length == 0) {  // first to check the matrix length is 0 then return res ;
      return res;
    }

    int rowBegin = 0;
    int rowEnd = matrix.length - 1;
    int colBegin = 0;
    int colEnd = matrix[0].length - 1;

    while (rowBegin <= rowEnd && colBegin <= colEnd) {
      for (int j = colBegin; j <= colEnd; j++) {   // Traverse Right
        res.add(matrix[rowBegin][j]);
      }
      rowBegin++;

      for (int j = rowBegin; j <= rowEnd; j++) {   // Traverse Down
        res.add(matrix[j][colEnd]);
      }
      colEnd--;

      if (rowBegin <= rowEnd) {
        for (int j = colEnd; j >= colBegin; j--) {    // Traverse Left
          res.add(matrix[rowEnd][j]);
        }
      }
      rowEnd--;

      if (colBegin <= colEnd) {
        for (int j = rowEnd; j >= rowBegin; j--) {    // Traverse Up
          res.add(matrix[j][colBegin]);
        }
      }
      colBegin++;
    }

    return res;
    }
}
