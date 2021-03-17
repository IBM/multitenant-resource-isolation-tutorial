package dev.odo.starter;

import java.util.Random;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/bubblesort")
public class BubbleSort {

    @GET
    public String getRequest(){
        String returnMsg = "This is an example application running Bubble Sort Algorithm\n";
        try {
            Random rd = new Random();
            int arr[] = new int[79999];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rd.nextInt(Integer.MAX_VALUE);
            }

            int n = arr.length; 
            // int x = getRandom(arr); 

            // returnMsg += "Array of elements before sorting: \n" + Arrays.toString(arr) +"\n";
            // returnMsg += "Element to search: " + x +"\n";
            long start = System.currentTimeMillis(); 
            // int result = binarySearch(arr, 0, n - 1, x); 
            bubbleSort(arr);
            long end = System.currentTimeMillis();
            // returnMsg += "Array elements after sorting: " + Arrays.toString(arr) +"\n";
            returnMsg += " - An array of n="+n+" elements were sorted in ascending order using Bubble sort in: " + (end - start) + "ms.\n";
            
            // if (result == -1) 
            //     returnMsg += "Element not present, \ntime taken: " + (end - start) + "ms";
            // else
            //     returnMsg += "Element found at index: " + result + "\nTime taken to execute the algorithm: " + (end - start) + "ms\n\n";
                
        } catch (Exception e) {
            returnMsg = e.toString();
        }

        return returnMsg;
    }

    public static int getRandom(int[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
            for(int i=0; i < n; i++){  
                    for(int j=1; j < (n-i); j++){  
                            if(arr[j-1] > arr[j]){  
                                    //swap elements  
                                    temp = arr[j-1];  
                                    arr[j-1] = arr[j];  
                                    arr[j] = temp;  
                            }  
                            
                    }  
            }  
    
    }  

    // int binarySearch(int arr[], int l, int r, int x) 
    // { 
    //     // for (long i = 0; i < 500000000; i++) 
    //     //     ; 
    //     if (r >= l) { 
    //         int mid = l + (r - l) / 2; 
  
    //         if (arr[mid] == x) 
    //             return mid; 

    //         if (arr[mid] > x) 
    //             return binarySearch(arr, l, mid - 1, x); 
  
    //         return binarySearch(arr, mid + 1, r, x); 
    //     } 

    //     return -1; 
    // } 
}
