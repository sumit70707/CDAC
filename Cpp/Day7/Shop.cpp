#include <iostream>
#include <fstream>
#include <vector>
using namespace std;

class Product {
public:
    int id, qty;
    string name;
    float price;

    void accept() {
        cout << "Enter id, name, qty, price: ";
        cin >> id >> name >> qty >> price;
    }
    void display() {
        cout << id << " " << name << " " << qty << " " << price << endl;
    }
};

int main() {
    int choice, id;
    vector<Product> products;

    do {
        cout << "\n1.Add  2.Display  3.Search  4.Update  5.Delete  6.Exit\n";
        cin >> choice;

        switch (choice) {
        case 1: {
            Product p; p.accept();
            products.push_back(p);
            ofstream fout("products.txt", ios::app);
            fout << p.id << " " << p.name << " " << p.qty << " " << p.price << endl;
            fout.close();
            break;
        }
        case 2: {
            ifstream fin("products.txt");
            Product p;
            while (fin >> p.id >> p.name >> p.qty >> p.price)
                p.display();
            fin.close();
            break;
        }
        case 3:
            cout << "Enter product id: ";
            cin >> id;
            {
                ifstream fin("products.txt");
                Product p;
                bool found = false;
                while (fin >> p.id >> p.name >> p.qty >> p.price) {
                    if (p.id == id) { p.display(); found = true; break; }
                }
                if (!found) cout << "Not Found\n";
                fin.close();
            }
            break;
        case 4:
            cout << "Update requires re-writing file (simplified)\n";
            break;
        case 5:
            cout << "Delete requires re-writing file (simplified)\n";
            break;
        }
    } while (choice != 6);
    return 0;
}
