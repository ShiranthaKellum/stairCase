#include <iostream>

using namespace std;

int main () {
    int i, j, k, n;

    cout << "n = ";
    cin >> n;

    for (i = 0; i < n; i++) {
        for (j = 1; j < n-i; j++ ){
            cout << " ";

        }
        for (k = 0; k < i+1; k++){
            cout << "#";

        }
        cout << endl;

    }
}