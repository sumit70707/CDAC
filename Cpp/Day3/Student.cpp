#include <iostream>
using namespace std;

class Student {
    int rollno;
    int mark1, mark2, mark3;
public:
    void acceptInfo() {
        cout << "Enter Roll No: ";
        cin >> rollno;
        cout << "Enter marks of 3 subjects: ";
        cin >> mark1 >> mark2 >> mark3;
    }

    void display() {
        int total = mark1 + mark2 + mark3;
        float percentage = total / 3.0;
        char grade;

        if (percentage >= 75) grade = 'A';
        else if (percentage >= 50) grade = 'B';
        else grade = 'C';

        cout << "Roll No: " << rollno << endl;
        cout << "Marks: " << mark1 << " " << mark2 << " " << mark3 << endl;
        cout << "Total: " << total << endl;
        cout << "Percentage: " << percentage << "%" << endl;
        cout << "Grade: " << grade << endl;
    }
};

int main() {
    Student s;
    s.acceptInfo();
    s.display();
    return 0;
}
