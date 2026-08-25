class Solution {
    public int missingMultiple(int[] nums, int k) {
        int i=1;

        while(true){
            int multiple = k*i;
            boolean found = false;

            for(int num:nums){
                if(num == multiple){
                    found = true;
                    break;
                }
            }
            if(!found){
                return multiple;
            }
            i++;
        }
        
    }
}