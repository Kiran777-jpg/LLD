package Intrv;

//Input: nums = [2,11,7,15],
//target = 9
//Output: [0,2]

import java.util.*;

public class Main {

    private static int[] usingHashmap(int[] nums, int target) {
        int n=nums.length;
        Map<Integer, List<Integer>> hashmap = new HashMap<>();
        int[] ans={-1,-1,-1};
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                int sum=nums[i]+nums[j];
                hashmap.put(sum, Arrays.asList(i, j));
            }
        }

        for(int i=0;i<n;i++) {
            int ele=target-nums[i];
            if(hashmap.containsKey(ele)) {
                ans[0]=hashmap.get(ele).get(0);
                ans[1]=hashmap.get(ele).get(1);
                ans[2]=i;
                return ans;
            }
        }
        return ans;
//        for(int i=0;i<n;i++) {
//            int ele=target-nums[i];
//            if(hashmap.containsKey(ele)) {
//                ans[0]=hashmap.get(ele);
//                ans[1]=i;
//                return ans;
//            }
//            hashmap.put(nums[i], i);
//        }
//        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,11,7,15};
        int target=24;
        int[] ans=usingHashmap(nums, target);
        System.out.println(ans[0] + ", " + ans[1] + ", " + ans[2]);
    }
}
