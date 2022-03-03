public class FirstAndLastPos3 {
    public static void main(String[] args) {
        //I do these for repitition to see if I can recall difficult concepts for me from memory!
    }

    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int firstIndex = binarySearch(nums, 0, nums.length-1, target);
        if (firstIndex == -1) {
            res[0] = -1;
            res[1] = -1;
            return res;
        }
        
        int i = firstIndex;
        int j = firstIndex;
        
        while ( i>= 0 && nums[i] == target) {
            i--;
        }
        
        while (j <= nums.length-1 && nums[j] == target){
            j++;
        }
        
        res[0] = i+1;
        res[1] = j-1;
        return res;
        
    }
    
    public int binarySearch(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target){
                right = mid - 1;
            }
            
        }
        
        return -1;
    }

    public int[] searchRange2(int[] nums, int target) {
        int[] res = new int[2];
        int firstPos = binarySearch2(nums, target);
        if (firstPos == -1) {
            res[0] = -1;
            res[1] = -1;
            return res;
        }
        int i = firstPos, j = firstPos;
        while (i > 0 && nums[i-1] == target) {
            i--;
        }
        while (j < nums.length-1 && nums[j+1] == target) {
            j++;
        }
        
        res[0] = i;
        res[1] = j;
        return res;
    }
    
    public static int binarySearch2(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left <= right) {
            int mid = (left+right)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid+1;
            } else if (nums[mid] > target) {
                right = mid-1;
            }
        }
        return -1;
    }
}
