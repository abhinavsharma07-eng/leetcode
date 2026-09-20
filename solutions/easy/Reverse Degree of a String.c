// Title: Reverse Degree of a String
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/reverse-degree-of-a-string/

int reverseDegree(char* s) {
    int num = 0;
    int i =0 ;
    while (s[i] != '\0') {
        int uniCode = 123 - (int)*(s+i);
        int product = (i+1)*uniCode;
        num += product;
        i++;
    }
    return num;
}
