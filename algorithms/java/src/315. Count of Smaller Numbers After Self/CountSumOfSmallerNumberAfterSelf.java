class Solution {
    public List<Integer> countSmaller(int[] nums) {
        
       ArrayList<Integer> list = new ArrayList<>();
        //arr[arr.length-1]=0;
        for(int i=0;i<nums.length;i++)
        {
            int k=0;
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j]<nums[i])
                    k++;
            }
            list.add(k);
        }
        //list.add(0);
        return list;
    }
}