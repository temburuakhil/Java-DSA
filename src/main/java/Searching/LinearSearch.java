package Searching;

public class LinearSearch {

    public static void search(int[] arr,int target){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                System.out.println("Found in "+i+" Index " );
                break;
            }
        }
    }
    public static void main(String[] args) {
        search(new int[]{2,3,3,3,4,5},2);


    }
}
