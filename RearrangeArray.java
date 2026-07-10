class Solution {
    public int[] rearrangeArray(int[] nums) {
    int n=nums.length;
    int[] temp=new int[n];
    int pos=0;
    int neg=1;
    for(int i=0;i<n;i++)
    {
        if(nums[i]<0)
        {
            temp[neg]=nums[i];
            neg+=2;
        }
        else
        {
            temp[pos]=nums[i];
            pos+=2;
        }
    }
    return temp;    
    }
}
