#include <iostream>

std::string pattern(int n)
{
  std::string output = "";
  for (int i=1; i <= n; i++) {
    for (int j = 0; j < i; j++) {
      output+=" ";
    }
    for (int j=n; j >= i; j--) {
      if (j==n) {
//           output+=" ";
        if (i >= 10) {
          output+=std::to_string(i%10);
        } else output+=std::to_string(i);
      } else {
          if (i >= 10) {
            output+=" "+std::to_string(i%10);
          } else output+=" "+std::to_string(i);
      }
    } 
    if (i!=n) output+="\n";
  }
  return output;
}