

public class LinearSearch {
    public static void main(String[] args) {
        // array can or cannot be in an order like ascending or descending and it doesn't effect also
        // time complexity O(n)
        // you have to find all the index for value 3
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 9, 23, 3, 29, 22, 98, 3, 12, 11};
        int target = 3;
        String s = "";
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target) {
                s += String.valueOf(i) + " ";
            }
        }
        System.out.println(s);
    }
}
