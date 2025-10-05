#include <iostream>
using namespace std;

class Person {
    string name;
    int age;
    string city;
public:
    // Default Constructor
    Person() {
        name = "Unknown";
        age = 0;
        city = "NA";
    }

    // Parameterized Constructor
    Person(string n, int a, string c) {
        name = n; age = a; city = c;
    }

    // Getters and Setters
    void setName(string n) { name = n; }
    string getName() { return name; }

    void setAge(int a) { age = a; }
    int getAge() { return age; }

    void setCity(string c) { city = c; }
    string getCity() { return city; }

    void display() {
        cout << "Name: " << name << ", Age: " << age << ", City: " << city << endl;
    }
};

int main() {
    Person p1; // Default constructor
    p1.display();

    Person p2("Sumit", 22, "Beed"); // Parameterized constructor
    p2.display();

    p1.setName("Amit");
    p1.setAge(25);
    p1.setCity("Pune");
    p1.display();

    return 0;
}
