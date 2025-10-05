#include <iostream>
using namespace std;

class ComplexNumber {
    int real, imaginary;
public:
    ComplexNumber() { real=0; imaginary=0; }
    ComplexNumber(int r, int i) { real=r; imaginary=i; }

    void setReal(int r) { real=r; }
    void setImaginary(int i) { imaginary=i; }
    int getReal() { return real; }
    int getImaginary() { return imaginary; }

    void display() {
        cout << real << " + " << imaginary << "i" << endl;
    }
};

int main() {
    ComplexNumber c1; // default
    c1.display();

    ComplexNumber c2(3, 4); // parameterized
    c2.display();

    c1.setReal(5);
    c1.setImaginary(7);
    c1.display();

    return 0;
}
