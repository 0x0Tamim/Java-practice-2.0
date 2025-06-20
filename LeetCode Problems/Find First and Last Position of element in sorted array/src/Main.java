import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // 🔧 Your task: Implement this method
    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        boolean firstIndexFound = false;
        boolean secondIndexFound = false;
        int firstIndex=-1;
        int lastIndex=-1;
        while (start<=end){
            if(nums[start]<target){
                start += 1;
            }
            if(nums[end]>target){
                end -= 1;
            }

            if(!firstIndexFound && nums[start]==target){
                firstIndex=start;
                firstIndexFound = true;
            }

            if(!secondIndexFound && nums[end]==target){
                lastIndex=end;
                secondIndexFound = true;
            }

        }
        return new int[]{firstIndex, lastIndex}; // Placeholder, replace with your implementation
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Input array elements (must be sorted)
        int[] nums = new int[n];
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        // Call your method
        int[] result = searchRange(nums, target);

        // Output result
        System.out.println("First and Last Position: " + Arrays.toString(result));
    }
}
