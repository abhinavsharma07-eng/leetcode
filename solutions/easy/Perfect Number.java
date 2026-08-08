// Title: Perfect Number
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/perfect-number/

    public boolean checkPerfectNumber(int num) {
        int i=1;
        int  sum=0;
        while(i<= num/2){
            if(num%i==0) sum+=i;
        }
        
    }
            i++;
        if(sum == num) return true;
        return false;
}
