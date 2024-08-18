package Stuff;

import java.util.ArrayList;
import java.util.List;

class Solution {

 public static void main(String[] args) {
     int[][] arrays = {
             {1, 2, 3},
               {4,5},
             {1, 2, 3}
     };

     // Creating an outer list
     List<List<Integer>> outerList = new ArrayList<>();

     // Iterating over the 2D array and converting it to a List<List<Integer>>
     for (int[] array : arrays) {
         // Convert each 1D array to a List<Integer> and add it to the outerList
         List<Integer> innerList = new ArrayList<>();
         for (int num : array) {
             innerList.add(num);
         }
         outerList.add(innerList);
     }
        System.out.println(maxDistance(outerList));
 }


    public static int maxDistance(List<List<Integer>> arrays) {
     int maxDistance = 0;

     for(int i = 0; i< arrays.size(); i++){
         for(int j = i+1; j< arrays.size(); j++){
             maxDistance = Math.max(maxDistance, Printmax(arrays,i,j));
         }
     }
     return maxDistance;
    }

    static int Printmax(List<List<Integer>> arrays, int i , int j){

            int imin = Min(arrays.get(i));
            int imax = Max(arrays.get(i));
            int jmin = Min(arrays.get(j));
            int jmax = Max(arrays.get(j));

            int a = Math.abs(imin - jmax);
            int b = Math.abs(imax - jmin);

            return  Math.max(a,b);


    }

    static int Min(List<Integer> arrays){
        return arrays.get(0);
    }

    static int Max(List<Integer> arrays){
        return arrays.get(arrays.size() - 1);
    }
}
