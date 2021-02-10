package dev.odo.starter;

import java.util.Arrays;
import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/binarysearch")
public class BinarySearch {

    @GET
    public String getRequest(){
        String returnMsg = "\nThis is an example application running Binary Search Algorithm\n\n";
        try {
            int arr[] = { 2, 3, 4, 10, 40, 70, 250, 300, 365, 468, 593, 683, 995 }; 
            int n = arr.length; 
            int x = getRandom(arr); 
            returnMsg += "Array elements: " + Arrays.toString(arr) +"\n";
            returnMsg += "Element to search: " + x +"\n";
            long start = System.currentTimeMillis(); 
            int result = binarySearch(arr, 0, n - 1, x); 
            long end = System.currentTimeMillis(); 
            if (result == -1) 
                returnMsg += "Element not present, \ntime taken: " + (end - start) + "ms";
            else
                returnMsg += "Element found at index: " + result + "\nTime taken to execute the algorithm: " + (end - start) + "ms\n\n";
                
        } catch (Exception e) {
            returnMsg = e.toString();
        }

        return returnMsg;
    }

    public static int getRandom(int[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    int binarySearch(int arr[], int l, int r, int x) 
    { 
        for (long i = 0; i < 500000000; i++) 
            ; 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            if (arr[mid] == x) 
                return mid; 

            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
  
            return binarySearch(arr, mid + 1, r, x); 
        } 

        return -1; 
    } 
}
