#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    vector<int> v;
    int choice, num;

    do {
        cout << "\n1.Add  2.Show All  3.Search  4.Sort  5.Reverse  6.Clear  7.Exit\n";
        cin >> choice;

        switch (choice) {
        case 1:
            cout << "Enter number: ";
            cin >> num;
            v.push_back(num);
            break;
        case 2:
            cout << "Elements: ";
            for (int x : v) cout << x << " ";
            cout << endl;
            break;
        case 3:
            cout << "Enter number to search: ";
            cin >> num;
            if (find(v.begin(), v.end(), num) != v.end())
                cout << "Found\n";
            else
                cout << "Not Found\n";
            break;
        case 4:
            sort(v.begin(), v.end());
            cout << "Sorted!\n";
            break;
        case 5:
            reverse(v.begin(), v.end());
            cout << "Reversed!\n";
            break;
        case 6:
            v.clear();
            cout << "Cleared!\n";
            break;
        }
    } while (choice != 7);
    return 0;
}
