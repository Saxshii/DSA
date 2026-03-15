public class Arrays2 {

    // print sub Array 
public static void subArrays(int sub[]){
    for(int i = 0; i < sub.length; i++){
        for(int j = i; j< sub.length; j++){
            for(int k = i; k <= j; k++){
                System.out.print(sub[k] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        }
}

// sum of each sub Array
// approach 1. (brute force)
public static void subArraySum(int arraySum[]){
    int currentSum;
    int maxSUm = Integer.MIN_VALUE;
    System.out.println("length of array is: " + arraySum.length);

    for(int i=0; i< arraySum.length; i++){
        for(int j=i; j< arraySum.length; j++){
            currentSum = 0;
            for(int k=i; k<=j; k++){
                currentSum += arraySum[k];
                System.out.println(currentSum);
            }
            System.out.println("sum is: " + currentSum);
            if(maxSUm < currentSum){
                maxSUm = currentSum;
            }
        }System.out.println(" ");
    }
      System.out.println("max sum is: " + maxSUm);
}

// approach 2.(prefix Sum)  prefix[end] - prefix[start - 1]
public static void prefixMaxSum(int arraySum[]){
    System.out.println("length of array is: " + arraySum.length);
    int currSum;
    int maxSUm = Integer.MIN_VALUE;
    int prefix[] = new int[arraySum.length];

    prefix[0] = arraySum[0];
    for(int i=1; i< prefix.length; i++){
        prefix[i] = prefix[i-1] + arraySum[i];
    }

    for(int i=0; i < arraySum.length; i++){
        int start = i;
        for(int  j= i; j< arraySum.length; j++){
            int end = j;

            currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
            if(maxSUm < currSum){
                maxSUm = currSum;
            }
        }
    }
    System.out.println("max sum is:" + maxSUm);
}

// approach 3. KADANE ALGORITHM 
public static void kadane(int arraySum[]){
    System.out.println("length of the array " + arraySum.length);
    int currentSum = 0;
    int maxSum = Integer.MIN_VALUE;

    for(int i=0; i<arraySum.length; i++){
        currentSum += arraySum[i] ;
        
        maxSum = Math.max(maxSum, currentSum);
        if(currentSum < 0){
            currentSum = 0;
            }
    }
    System.out.println("max Sum is: " + maxSum);
}

// TRAPPING RAINWATER
public static void rainwater(int height[]){
    int n = height.length;
    int totalWater = 0;

    int leftMax[] = new int[n];
    leftMax[0] = height[0];
    for (int i = 1; i < height.length; i++) {
    leftMax[i] =  Math.max(leftMax[i - 1], height[i]);
    }

    int rightmax[] = new int[n];
    rightmax[n -1] = height[n -1];
    for (int i = n - 2; i >= 0; i--) {
    rightmax[i] =  Math.max(rightmax[i + 1], height[i]);
    }

    for(int i = 0; i< height.length; i++){
        int waterLevel = Math.min(leftMax[i], rightmax[i]);
        int trappedWater = waterLevel - height[i];
        totalWater += trappedWater;
    }
System.out.println("total trapped water is: " + totalWater + " units");
}

// But n sell profit 
public static void maxprofit(int prices[]){
int buy_price = Integer.MAX_VALUE;
int max_profit = 0;

for(int i=0; i<prices.length; i++){
    int curr_price = prices[i];
    buy_price = Math.min(curr_price, buy_price);
    
    int profit = curr_price - buy_price;
    max_profit = Math.max(max_profit, profit);
}
System.out.println("max profit: " + max_profit);
}

public static boolean doubleNo(int numbers[]){
    for (int i = 0; i<numbers.length -1; i++){
        for(int j = i+1; j<numbers.length; j++ ){
            if(numbers[i] == numbers[j]){
                System.out.println("true");
                return true;
            }
        }
        
    }
    return false;
}

public static int rotatedArray(int rotated[], int target){
    int left = 0;
    int right = rotated.length - 1;

    while(left <= right){
        int mid = (left + right)/2;

        if (rotated[mid] == target){
            return mid;
        }

        if (rotated[left] <= rotated[mid]) {
           if (target >= rotated[left] && target < rotated[mid]) {
           right = mid - 1;  
           } else {
           left = mid + 1;  }}
        else{
           if (target > rotated[mid] && target <= rotated[right]) {
           left = mid + 1;  
           } else {
           right = mid - 1;  }
        }
    }
    return -1; 
}

// buy n sell stocks practise question
public static void stocksprofit(int prices[]){
    int buy_price = Integer.MAX_VALUE;
    int maxprofit= 0;

    for(int i=0; i< prices.length; i++){
        int current_price = prices[i];
        buy_price = Math.min(buy_price, current_price);

        int profit = current_price - buy_price;
        if(maxprofit< profit){
            maxprofit = profit;
        }
    }
    System.out.println("maximum profit made: " + maxprofit);
}

public static void watertrapped(int[] height){
    int n = height.length;
    int totalwater = 0;

    int leftmax[] = new int[n];
    leftmax[0] = height[0];
    for (int i = 1; i < n; i++) {
    leftmax[i] =  Math.max(leftmax[i - 1], height[i]);
    }

    int rightmax[] = new int[n];
    rightmax[n -1] = height[n -1];
    for (int i = n - 2; i >= 0; i--) {
    rightmax[i] =  Math.max(rightmax[i + 1], height[i]);
    }

    for(int i = 0; i<n; i++){
        int waterLevel = Math.min(leftmax[i], rightmax[i]);
        int water_trapped = waterLevel - height[i];
        totalwater += water_trapped;
    }
    System.out.println("total water trapped is: " + totalwater + " units");
}
    public static void main(String args[]){

        // int sub[] = {2,4,6,8,10};
        // subArrays(sub);

        // int arraySum[] = {1,-2,6,-1,3};
        // int arraySum[] = {-2,-3,4,-1,-2,1,5,-3};
        // int arraySum[] = {-2,-3,-1,-4};
        // subArraySum(arraySum);
        // prefixMaxSum(arraySum);
        // kadane(arraySum);

        // int height[] = {4,2,0,6,3,2,5};
        // rainwater(height);

        // int prices[] = {7,1,5,3,6,4};
        // maxprofit(prices);

        // int numbers[] = {1,2,3,1};
        // doubleNo(numbers);

        int rotated[] = {0,1,2,4,5,6,7};
        rotatedArray(rotated, 4);

        int profit[] = {7,6,4,3,1};
        stocksprofit(profit);

        int height[] = {4, 2, 0, 3, 2, 5};
        watertrapped(height);


    }

}