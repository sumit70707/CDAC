#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int n, temp, sum = 0, digits = 0;
    cout << "Enter a number: ";
    cin >> n;
    temp = n;
    int x = n;
    while (x > 0) { digits++; x /= 10; }
    while (temp > 0) {
        int d = temp % 10;
        sum += pow(d, digits);
        temp /= 10;
    }
    if (sum == n)
        cout << "Armstrong";
    else
        cout << "Not Armstrong";
    return 0;
}
