#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class User {
public:
    int userid;
    string name, email, pwd;

    void accept() {
        cout << "Enter id, name, email, pwd: ";
        cin >> userid >> name >> email >> pwd;
    }

    void display() {
        cout << userid << " " << name << " " << email << " " << pwd << endl;
    }
};

int main() {
    vector<User> users;
    int choice, id;
    string newPwd;

    do {
        cout << "\n1.Add  2.Display All  3.Search  4.Change Pwd  5.Delete All  6.Exit\n";
        cin >> choice;

        switch (choice) {
        case 1: {
            User u;
            u.accept();
            users.push_back(u);
            break;
        }
        case 2:
            for (auto &u : users) u.display();
            break;
        case 3:
            cout << "Enter userid to search: ";
            cin >> id;
            for (auto &u : users)
                if (u.userid == id) { u.display(); break; }
            break;
        case 4:
            cout << "Enter userid to change pwd: ";
            cin >> id;
            for (auto &u : users) {
                if (u.userid == id) {
                    cout << "Enter new pwd: ";
                    cin >> newPwd;
                    u.pwd = newPwd;
                    cout << "Updated!\n";
                }
            }
            break;
        case 5:
            users.clear();
            cout << "All users deleted!\n";
            break;
        }
    } while (choice != 6);
    return 0;
}
