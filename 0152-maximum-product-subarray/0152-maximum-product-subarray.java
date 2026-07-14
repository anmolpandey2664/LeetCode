class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int LeftProduct=1;
        int RightProduct=1;
        int ans=nums[0];
        for(int i=0;i<n;i++){
            LeftProduct=LeftProduct==0?1:LeftProduct;
            RightProduct=RightProduct==0?1:RightProduct;

            LeftProduct*=nums[i];
            RightProduct*=nums[n-1-i];
            ans=Math.max(ans,Math.max(LeftProduct,RightProduct));
        }
        return ans;
        
    }
}