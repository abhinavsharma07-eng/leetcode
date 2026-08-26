// Title: Smallest Missing Multiple of K
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/smallest-missing-multiple-of-k/

        set.add(n);
      }  
      for(i =1; i <= nums.length;i++){
        if(!set.contains(k*i)) return k*i;
      }
      return k*(i);
    
    }
}
