package classesAndObjects;

public class Biggest {

    public int[] nums;

    public Biggest(int[] nums){
        this.nums = nums;
    }

    public void display(){
        if(nums == null || nums.length == 0){
            System.out.println("Array is empty");
            return;
        }
        int l = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] > l){
                l=nums[i];
            }
        }
        System.out.println("The largest element in array: "+l);
    }

    public static void main(String[] args) {
        int []arr = {2,3,5,9,1,10,22};
        Biggest b1 = new Biggest(arr);
        b1.display();
    }
}
