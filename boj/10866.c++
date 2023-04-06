#include<bits/stdc++.h>
#include<deque>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  deque<int> deq;
  int N;
  cin >> N;

  while(N--) {
    string cmd;
    cin >> cmd;
  
    if (cmd == "push_front") {
      int val; cin >> val;
      deq.push_front(val);
    } else if (cmd == "push_back") {
      int val; cin >> val;
      deq.push_back(val);
    } else if (cmd == "pop_front") {
      if (deq.empty()) cout << -1 << "\n";
      else {
      int head = deq.front();
      deq.pop_front();
      cout << head << "\n";
      }
    } else if (cmd == "pop_back") {
      if (deq.empty()) cout << -1 << "\n";
      else {
        int tail = deq.back();
        deq.pop_back();
        cout << tail << "\n";
      } 
    } else if (cmd == "size") {
      cout << deq.size() << "\n";
    } else if (cmd == "empty") {
      cout << deq.empty() << "\n";
    } else if (cmd == "front") {
      if (deq.empty()) cout << -1 << "\n";
      else cout << deq.front() << "\n";
    } else if (cmd == "back") {
      if (deq.empty()) cout << -1 << "\n";
      else cout << deq.back() << "\n";
    }
  }

  return 0;
}
