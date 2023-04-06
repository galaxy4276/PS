#include <bits/stdc++.h>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  stack<int> S;
  int N;
  string cmd;

  cin >> N;

  while(N--) {
    cin >> cmd;
    if (cmd == "push") {
      int number;
      cin >> number;
      S.push(number);
    } else if (cmd == "pop") {
      if (S.empty() == true) {
        cout << -1 << "\n";
      } else {
        cout << S.top() << "\n";
        S.pop();
      }
    } else if (cmd == "size") {
      cout << S.size() << "\n";
    } else if (cmd == "empty") {
      S.empty() ? cout << 1 : cout << 0;
      cout << "\n";
    } else if (cmd == "top") {
      S.empty() ? cout << -1 : cout << S.top();
      cout << "\n";
    }
  }
  return 0;
}
