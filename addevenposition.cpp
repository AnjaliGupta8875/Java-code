
#include <iostream>

using namespace std;

int main() {
    int n = 2345678;
    int evenSum = 0;
    int oddSum = 0;
    
    for (int i = 0; i < to_string(n).length(); i++) {
        
        int digitValue = (int)(to_string(n)[i] - '0');
        if (i % 2 == 0) {
            evenSum += digitValue;
        } else {
            oddSum += digitValue;
        }
    }
    
    cout << "Sum of even-positioned digits: " << evenSum << endl;
    cout << "Sum of odd-positioned digits: " << oddSum << endl;
    
    return 0;
}



