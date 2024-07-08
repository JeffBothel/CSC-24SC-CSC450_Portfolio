////////////////////////////////////////////////////////////////////////
/// CSU - 24SC - CSC450: Programming III - Portfolio Project - C++  ///
/// Author: Jeffrey D. Bothel                                        ///
/// Date: 2024-07-07                                                 ///
////////////////////////////////////////////////////////////////////////

#include <iostream>
#include <string>
#include <thread>

using namespace std;

// Function that increments the variable to the count of 20 and prints the value along the way
void incrementThread (int& var) {
    while(var < 20) {
        cout << "Incrementing var +1: " << var << endl;
        var++;
    }
};

// Function that increments the variable to the count of 0 from current value while printing the value along the way
void decrementThread (int& var) {
    while(var > 0) {
        cout << "Decrementing var -1: " << var << endl;
        var--;
    }
};

// Main entry to the point of the program
int main() {
    int incrementer = 0;
    string str1 = "first";
    string str2 = "second";

    // Demonstrating the incrementThread function in a thread
    thread t1(incrementThread, incrementer);
    t1.join();
    cout << "Incrementer value: " << incrementer << endl;

    // Demonstrating the decrementThread function in a thread
    thread t2(decrementThread, incrementer);
    t2.join();
    cout << "Incrementer value: " << incrementer << endl;

    return 0;
};