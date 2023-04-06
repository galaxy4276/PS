#include <iostream>
#include <list>

using namespace std;

int main(void)
{
  ios::sync_with_stdio(0);
  cin.tie(0);

  list<char> editor;

  string initial_str;
  cin >> initial_str;

  for (auto c : initial_str)
    editor.push_back(c);

  list<char>::iterator cursor = editor.end();

  int cmd_cnt;
  cin >> cmd_cnt;

  while (cmd_cnt--)
  {
    char cmd;
    cin >> cmd;
    if (cmd == 'P')
    {
      char input;
      cin >> input;
      editor.insert(cursor, input);
    }
    else if (cmd == 'L')
    {
      if (cursor != editor.begin())
        cursor--;
    }
    else if (cmd == 'D')
    {
      if (cursor != editor.end())
        cursor++;
    }
    else
    {
      if (cursor != editor.begin())
      {
        cursor--;
        cursor = editor.erase(cursor);
      }
    }
  }

  for (auto i : editor)
    cout << i;

  return 0;
}
