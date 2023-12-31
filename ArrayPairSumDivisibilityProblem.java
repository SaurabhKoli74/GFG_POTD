class ArrayPairSumDivisibilityProblem{
    public static boolean CanPairSum(int nums[], int k, int n){
        // Array can't be divided into pairs
        if(n%2 !=0){
            return false;
        }

        int temp[]= new int[k];
        for(int i=0 ; i<n; i++){
            temp[nums[i]%k]++;
        }

        if(temp[0]%2!= 0){
            return false;
        }

        // Now, Check 1 to k
        // Ex.nums =[9, 5, 7, 3], 3,5,1,3 k=6
        // temp = [0:0, 1:1, 2:0, 3:1, 4:0, 5:1]
        for(int i=1; i<k; i++){
            if(temp[i]!= temp[k-i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int nums[] = {9, 5, 7, 3};
        int k = 6;
        System.out.println(CanPairSum(nums,k,nums.length));;
    }
}