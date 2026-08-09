// Title: Perfect Number
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/perfect-number/

    public boolean checkPerfectNumber(int num) {
        if(num <= 1) return false;
        int i = 2;
        int sum = 1;
        while(i*i<= num){
            if(num % i == 0) {
                sum += i;
                if (i * i != num){
                    sum += num/i;
                }
            }
            i++;
        }
        return  sum == num;   
    }
