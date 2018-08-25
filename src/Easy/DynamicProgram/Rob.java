package Easy.DynamicProgram;

public class Rob {
    public int rob(int[] nums) {
        if(nums.length <= 1){
            return nums.length == 0 ? 0 : nums[0];
        }
        // preMax是上次的最大收益
        int preMax = nums[0];
        // currentMax是当前的最大受益
        int currentMax = Math.max(nums[0], nums[1]);
        for(int i = 2; i < nums.length; i++){
            int tmp = currentMax;
            // 当前的最大收益是两种选择里较大的那个
            currentMax = Math.max(preMax + nums[i], currentMax);
            preMax = tmp;
        }
        return currentMax;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        Rob rob = new Rob();
        System.out.println(rob.rob(nums));
    }
}
