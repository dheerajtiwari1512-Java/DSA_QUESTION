class Solution {
    public int[] searchRange(int[] nums, int target) {

     int first=fisrtoccuranve(nums,target);
     int last=LastOccurnace(nums,target);
       return new int [] {first,last};
        
    }
    public int fisrtoccuranve(int [] nums,int target){
        int start=0;
        int end=nums.length-1;
    
        int ans=-1;
         while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                ans=mid;
                // left ki side jaygea   keep serching for left
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1; // keep going to right side
            }
            else {
                end=mid-1;    // keep going to left side
            }
        }
        return ans;
    }

     public  int LastOccurnace(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
       while(start<=end){
           int mid=(start+end)/2;
           if(nums[mid]==target){
               ans=mid;
               // right ki side jaygea   keep serching for right
               start=mid+1;
           }
           else if(nums[mid]<target){
               start=mid+1; // keep going to right side
           }
           else {
               end=mid-1;    // keep going to left side
           }
       }
       return ans;
   }

}
