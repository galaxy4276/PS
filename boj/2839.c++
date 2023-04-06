#include <iostream>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int N;
  cin >> N;
  int count = 0;

  while (true) {
    if (N % 5 == 0) {
      count += N / 5;
      cout << count;
      break;
    }

    count++;
    N -= 3;
    if (N < 0) {
      cout << -1;
      break;
    }

  }

  return 0;
}