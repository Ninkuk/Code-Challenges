#include <chrono>
#include <iostream>
using namespace std;
using namespace std::chrono;

int main()
{
    // Get starting timepoint
    auto start = high_resolution_clock::now();

    //doStuff
    int x;
    cin >> x;

    // Get ending timepoint
    auto stop = high_resolution_clock::now();

    // Get duration. Substart timepoints to get durarion. To cast it to proper unit use duration cast method
    auto duration = duration_cast<microseconds>(stop - start);
    cout << "Time taken by function: " << duration.count() / 1000000 << " seconds";
    cout << " = " << duration.count() << " microseconds" << endl;

    return 0;
}