#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main() {
    int choice;
    string data, line;

    do {
        cout << "\n1.Write File  2.Read File  3.Copy File  4.Exit\n";
        cin >> choice;

        switch (choice) {
        case 1: {
            ofstream fout("data.txt");
            cout << "Enter text (end with #): ";
            while (true) {
                cin >> data;
                if (data == "#") break;
                fout << data << " ";
            }
            fout.close();
            break;
        }
        case 2: {
            ifstream fin("data.txt");
            while (getline(fin, line)) cout << line << endl;
            fin.close();
            break;
        }
        case 3: {
            ifstream fin("data.txt");
            ofstream fout("copy.txt");
            while (getline(fin, line)) fout << line << endl;
            fin.close(); fout.close();
            cout << "Copied!\n";
            break;
        }
        }
    } while (choice != 4);
    return 0;
}
