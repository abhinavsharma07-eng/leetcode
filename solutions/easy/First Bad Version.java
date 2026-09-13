// Title: First Bad Version
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/first-bad-version/

        int left = 1 ;
        int right = n;
        int mid;
        while(left< right){
            mid = left - (left - right)/2;
            if(isBadVersion(mid))
                right = mid;
            else 
                left = mid+1;    
        }
        return left;
    }
}
