package com.epam.mjc.stage0;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {

        String[] seasons = {"winter", "spring", "summer", "autumn"};
        return seasons;
    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int [] array = new int[length];
        int count = 0;
        for(int i=0;i<length;i++){
            array[i] = ++count;
        }
        return array;

    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {

        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        int temp = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == number){
                temp = i;
                break;

                 }
            else{
            temp = -1;
            }
        }
        return temp;

    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String temp;
        for(int i = 0;i<arr.length/2;i++){

            temp = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return arr;

    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {

        int positiveCount = 0;
        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                positiveCount++;
            }
        }
        int newArr[] = new int[positiveCount];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>0) {
                newArr[j]=arr[i];
                ++j;

            }



        }
return newArr;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        int countHolder[] = new int[arr.length];
        int countElements = 0;

        for(int i = 0;i<arr.length;i++) {
            for(int j = 0;j<arr[i].length;j++) {
                countElements++;
            }
            countHolder[i] = countElements;
            countElements=0;
        }


        for(int i = 0;i<arr.length;i++) {
            for(int j = 0;j<arr.length;j++) {
                if(countHolder[i]<countHolder[j]) {
                    int countSwap = countHolder[j];
                    countHolder[j] = countHolder[i];
                    countHolder[i] = countSwap;

                    int[] n = new int[arr[i].length];
                    n = arr[j];
                    arr[j] = arr[i];
                    arr[i] = n;
                }
            }
        }


        for(int i = 0;i<arr.length;i++) {
            for(int j = arr[i].length-1;j>=1;j--) {
                for(int in = 0;in<j;in++) {
                    if(arr[i][in]>arr[i][in+1]) {
                        int dummy = arr[i][in];
                        arr[i][in] = arr[i][in+1];
                        arr[i][in+1] = dummy;
                    }
                }

            }
        }
        return arr;
    }
}
