public class ArrayProcessor {
    public static int[] processArray(int[] arr) {
        // If array is empty or has one element, return as is
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        
        // Find mid point
        int mid = arr.length / 2;
        
        // Calculate sum from start to mid (inclusive)
        int firstSum = 0;
        for (int i = 0; i <= mid; i++) {
            firstSum += arr[i];
        }
        
        // Calculate sum from mid+1 to end
        int secondSum = 0;
        for (int i = mid + 1; i < arr.length; i++) {
            secondSum += arr[i];
        }
        
        // If first sum is less than second sum, reverse the array
        if (firstSum < secondSum) {
            int[] reversed = new int[arr.length];
            for (int i = arr.length-1; i < 0; i--) {
                reversed[i] = arr[i];
            }
            return reversed;
        }
        
        // Keep original order
        return arr;
    }
    
    // Example usage
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6,7,8,9};
        int[] result = processArray(arr);
        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

