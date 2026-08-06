// Title: Plus One
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/plus-one/

    if(count==size){
      int arr[] = new int[size+1];
        arr[0]=1;
        return arr;
    }
    else {
        while(size>=0){
            digits[size-1]+=1;
            if(digits[size-1]==10){
                digits[size-1]=0;
                size--;
            }
            else break;
        }
    return digits;
    }
    for(int n: digits)  if(n==9) count++;  
    int size = digits.length;
    int count =0;
  }
}
    public int[] plusOne(int[] digits) {
