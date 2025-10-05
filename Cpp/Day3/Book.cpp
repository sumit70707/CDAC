#include <iostream>
using namespace std;

class Book {
    string bname, author;
    int id;
    float price;
public:
    Book() { bname="NA"; author="NA"; id=0; price=0; }
    Book(string n, int i, string a, float p) {
        bname=n; id=i; author=a; price=p;
    }

    void setBook(string n, int i, string a, float p) {
        bname=n; id=i; author=a; price=p;
    }

    void display() {
        cout << "Book Name: " << bname << ", ID: " << id
             << ", Author: " << author << ", Price: " << price << endl;
    }
};

int main() {
    Book b1; // default
    b1.display();

    Book b2("C++ Basics", 101, "Bjarne", 500.50); // parameterized
    b2.display();

    b1.setBook("Java Fundamentals", 102, "James", 650);
    b1.display();

    return 0;
}
