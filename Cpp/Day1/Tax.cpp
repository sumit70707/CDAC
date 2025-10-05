#include <iostream>
using namespace std;

int main() {
    float salary, tax = 0;
    cout << "Enter annual basic salary: ";
    cin >> salary;
    if (salary < 150000)
        tax = 0;
    else if (salary <= 300000)
        tax = 0.2 * salary;
    else
        tax = 0.3 * salary;

    cout << "Income Tax = " << tax;
    return 0;
}
