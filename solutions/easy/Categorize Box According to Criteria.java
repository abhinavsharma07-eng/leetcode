// Title: Categorize Box According to Criteria
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/categorize-box-according-to-criteria/

    public String categorizeBox(int length, int width, int height, int mass) {
                
        long volume = (long)length*width*height;
        int dim = (length>=width)?((length>=height)?length:height):((width>=height)?width:height);
        if((volume >= 1000_000_000L||dim>=100_00)&& mass>=100) return "Both";
        else if (volume >= 1000_000_000L ||dim>=100_00) return "Bulky";
        else if (mass >=100) return "Heavy";
        else return "Neither";  
    }

