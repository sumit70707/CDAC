#include <iostream>
using namespace std;

int main() {
    int choice, qty, total = 0;
    do {
        cout << "\n--- Pizza Shop Menu ---\n";
        cout << "1. Margherita (200)\n2. Cheese Burst (300)\n3. Veggie (250)\n4. Exit\n";
        cout << "Enter choice: ";
        cin >> choice;
        if (choice >= 1 && choice <= 3) {
            cout << "Enter quantity: ";
            cin >> qty;
        }
        switch(choice) {
            case 1: total += 200 * qty; break;
            case 2: total += 300 * qty; break;
            case 3: total += 250 * qty; break;
            case 4: cout << "Total Bill = " << total; break;
            default: cout << "Invalid choice!";
        }
    } while(choice != 4);
    return 0;
}
