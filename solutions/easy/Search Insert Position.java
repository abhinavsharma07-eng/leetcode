// Title: Search Insert Position
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/search-insert-position/

                if(target > nums[mid]) start = mid+1;
                else end = mid -1; 
            }
        }
         return end+1;
        
    }
            else{
            if(nums[mid] == target) return mid;
            
            mid = (start + end)/2;
        while(start <= end ){
      int mid = (start + end)/2;
