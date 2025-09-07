package classesAndObjects;

//using Linear Search

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindElement {

    public static int search(int[] arr, int key){

        //loop through each element
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arrOne = {2,4,8,6,3,9,10,15,12,17,1};
        System.out.println(Arrays.toString(arrOne));

        int index = search(arrOne, 15);
        if(index == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: "+index);
        }
    }
}
