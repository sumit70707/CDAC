#include <iostream>
#include <map>
using namespace std;

class Account {
public:
    int actid;
    string name;
    float balance;
    void accept() {
        cout << "Enter id, name, balance: ";
        cin >> actid >> name >> balance;
    }
    void display() {
        cout << actid << " " << name << " " << balance << endl;
    }
};

int main() {
    map<int, Account> accs;
    int choice, id;

    do {
        cout << "\n1.Add Account  2.Display All  3.Search  4.Remove All  5.Exit\n";
        cin >> choice;

        switch (choice) {
        case 1: {
            Account a; a.accept();
            accs[a.actid] = a;
            break;
        }
        case 2:
            for (auto &p : accs) p.second.display();
            break;
        case 3:
            cout << "Enter account id: ";
            cin >> id;
            if (accs.find(id) != accs.end()) accs[id].display();
            else cout << "Not Found\n";
            break;
        case 4:
            accs.clear();
            cout << "All removed!\n";
            break;
        }
    } while (choice != 5);
    return 0;
}
