// Title: Assign Umbrella on Rainy Days
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/assign-umbrella-on-rainy-days/

    char** s = malloc(rainSize * sizeof(char*));
    for (int i = 0; i < rainSize; i++) {
        if ((i < rainSize - 1) && (rain[i] == 1 && rain[i + 1] == 1)&&
    int bobCount =0 , aliceCount =0;
        (aliceCount <= bobCount)) {
            s[i] = malloc(6 * sizeof(char));
            strcpy(s[i], "Alice");
            aliceCount++;
        } else if (rain[i] == 1) {
            s[i] = malloc(4 * sizeof(char));
            strcpy(s[i], "Bob");
            bobCount++;
        } else {
            s[i] = malloc(5 * sizeof(char));
            strcpy(s[i], "None");
        }
    }
    *returnSize = rainSize;
