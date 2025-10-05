#include <iostream>
#include <set>
using namespace std;

int main() {
    set<string> cities;
    int choice;
    string name;

    do {
        cout << "\n1.Add City  2.Display All  3.Search City  4.Exit\n";
        cin >> choice;

        switch (choice) {
        case 1:
            cout << "Enter city name: ";
            cin >> name;
            cities.insert(name);
            break;
        case 2:
            for (auto &c : cities) cout << c << " ";
            cout << endl;
            break;
        case 3:
            cout << "Enter city to search: ";
            cin >> name;
            if (cities.find(name) != cities.end()) cout << "Found\n";
            else cout << "Not Found\n";
            break;
        }
    } while (choice != 4);
    return 0;
}
