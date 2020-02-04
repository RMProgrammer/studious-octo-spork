package code;


/**
 * Take two sorted arrays as input and merge them into one
 * Time Complexity o(n) which is o(count1+count2)
 */

public class MergeSortedArrays {

    public static void main (String[] args) {
        int arr1[] = {1, 2, 5, 6, 9};
        int arr2[] = {2, 3, 7, 9};
        int arr1Count = arr1.length;
        int arr2Count = arr2.length;
        int mergedArr[] = new int [arr1Count +arr2Count];

        mergedArr = mergeArrays (arr1, arr2, arr1Count, arr2Count);

    }

    private static int[] mergeArrays (int arr1[], int arr2[], int count1, int count2) {

        int i = 0, j = 0, k = 0;
        int mergedArray[] = new int[count1 + count2];

        while (i < count1 &&  j < count2) {

            if(arr1[i] <= arr2[j]) { //<= will take care of 2=2 if there is same value on both arrays

                mergedArray[k] = arr1[i];
                i++;
                k++;
            }

            else {
                mergedArray[k] = arr2[j];
                j++;
                k++;
            }
        }

        /**
         * if one array is small then the merge stops at the middle as condition will be false
         * (i < count1 &&  j < count2)
         * Add the next two while loops for adding the remaining elements of the longer array to the mergedArray
         */
        while (i < count1) {
            mergedArray[k++] = arr1[i++];
        }

        while (j < count2) {
            mergedArray[k++] = arr2[j++];
        }


        return mergedArray;


    }



}
