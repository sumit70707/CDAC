#include <iostream>
using namespace std;

int main() {
    int n, sumEven = 0, sumOdd = 0;
    cout << "Enter n: ";
    cin >> n;
    for (int i = 1; i <= n; i++) {
        if (i % 2 == 0)
            sumEven += i;
        else
            sumOdd += i;
    }
    cout << "Sum of Even = " << sumEven << "\nSum of Odd = " << sumOdd;
    return 0;
}
