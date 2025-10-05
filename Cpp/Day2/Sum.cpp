#include <iostream>
using namespace std;

int main() {
    int n, sum = 0;
    cout << "Enter number of students: ";
    cin >> n;
    int marks[n];
    cout << "Enter marks:\n";
    for (int i = 0; i < n; i++) {
        cin >> marks[i];
        sum += marks[i];
    }
    cout << "Total = " << sum << endl;
    cout << "Average = " << (float)sum / n;
    return 0;
}
