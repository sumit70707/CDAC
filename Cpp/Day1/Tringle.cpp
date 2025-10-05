#include <iostream>
using namespace std;

int main() {
    int a, b, c;
    cout << "Enter three angles: ";
    cin >> a >> b >> c;
    if (a + b + c == 180 && a>0 && b>0 && c>0)
        cout << "Valid Triangle";
    else
        cout << "Not a Valid Triangle";
    return 0;
}
