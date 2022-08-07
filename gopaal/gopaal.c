#include <stdio.h>

int main() {
    int t;  // no. of test cases
    scanf("%d", &t);

    // NOTE: this short expression is helpful in cp
    while (t--) {
        int x, y;
        scanf("%d %d", &x, &y);

        // either truck driver must turn, or Gopaal must turn...
        if (x <= 30 || y <= 20)
            printf("0\n");  // bach gyaa
        else
            printf("1\n");  // RIP Gopaal
    }
}