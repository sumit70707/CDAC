#include <iostream>
using namespace std;

int main() {
    int m, n, power = 1;
    cout << "Enter m and n: ";
    cin >> m >> n;
    for (int i = 1; i <= n; i++)
        power *= m;
    cout << "Result = " << power;
    return 0;
}
