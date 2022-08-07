#include <stdio.h>
int main() {
  char line[150];
  int vowels, consonant;
  vowels = consonant = 0;


  fgets(line, sizeof(line), stdin);
  for (int i = 0; line[i] != '\0'; ++i) {
    line[i] = tolower(line[i]);

    if (line[i] == 'a' || line[i] == 'e' || line[i] == 'i' ||line[i] == 'o' || line[i] == 'u') {
      ++vowels;
    }
    else if (line[i] >= 'a' && line[i] <= 'z') {
      ++consonant;
    }
  }
  
  printf("Ratio is %d : %d", vowels,consonant);

  return 0;

}