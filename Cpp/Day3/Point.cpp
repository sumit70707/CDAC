#include <iostream>
using namespace std;

class Point {
    int x, y;
public:
    Point() { x = y = 0; }
    Point(int a, int b) { x = a; y = b; }

    void setX(int a) { x = a; }
    void setY(int b) { y = b; }
    int getX() { return x; }
    int getY() { return y; }

    void display() {
        cout << "(" << x << ", " << y << ")" << endl;
    }
};

int main() {
    Point p1; // default
    p1.display();

    Point p2(5, 10); // parameterized
    p2.display();

    p1.setX(2);
    p1.setY(3);
    p1.display();

    return 0;
}
