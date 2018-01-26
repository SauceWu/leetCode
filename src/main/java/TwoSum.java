/**
 * @author sauceWu .
 * @since 2018/1/8 12:07
 */

class TwoSum {
    public static void main(String[] src){
        int[] result=twoSum(new int[]{3,2,4},6);
        for (int i : result) {
            System.out.print(i);
        }
    }

        public static int[] twoSum(int[] nums, int target) {
            int[] result=new int[2];
            for(int i =0; i<nums.length-1; i++){

                for(int j=i+1 ; j<=nums.length-1;j++){
                    if(nums[i]+nums[j]==target){
                        result[0]=i;
                        result[1]=j;
                        return  result;
                    }
                }
            }
            return result;
        }
    
}
