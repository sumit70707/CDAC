#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter a number: ";
    cin >> n;
    if (n % 5 == 0 && n % 7 == 0)
        cout << "Divisible by 5 and 7";
    else
        cout << "Not divisible by 5 and 7";
    return 0;
}
