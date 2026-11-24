// Title: Maximum Subarray With Equal Products
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-subarray-with-equal-products/

            best = Math.max(best, right - left + 1);
            prdt *= x;
        }
        return best;
    }

     int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
