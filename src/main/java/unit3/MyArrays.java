package unit3;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MyArrays {
    public static void main(String[] args) {

    int[] arr = new int[3];
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(Arrays.toString(arr));

    // arr[4] = 4;

    // System.out.println(arr);

    int[] arr1 = {1,2,3,4,};

    int[][] arr2 = new int[2][2];

    int[][] arr3 ={{1,2,3,4},
                   {5,6,7,8},
                   {9,10,11,12,}};

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + ",");
            }
            System.out.println();
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(Arrays.toString(arr3[i]));
        }

    }
}
