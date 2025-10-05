#include <iostream>
using namespace std;

int main() {
    int a, b, c;
    cout << "Enter three numbers: ";
    cin >> a >> b >> c;
    if (a > b) {
        if (a > c)
            cout << "Greatest = " << a;
        else
            cout << "Greatest = " << c;
    } else {
        if (b > c)
            cout << "Greatest = " << b;
        else
            cout << "Greatest = " << c;
    }
    return 0;
}
