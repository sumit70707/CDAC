#include <iostream>
using namespace std;

class Date {
    int dd, mm, yy;
public:
    Date() { dd = mm = yy = 0; }
    Date(int d, int m, int y) { dd = d; mm = m; yy = y; }

    void setDate(int d, int m, int y) { dd = d; mm = m; yy = y; }
    int getDay() { return dd; }
    int getMonth() { return mm; }
    int getYear() { return yy; }

    void display() {
        cout << "Date: " << dd << "/" << mm << "/" << yy << endl;
    }
};

int main() {
    Date d1; // default
    d1.display();

    Date d2(10, 9, 2025); // parameterized
    d2.display();

    d1.setDate(1, 1, 2024);
    d1.display();

    return 0;
}
