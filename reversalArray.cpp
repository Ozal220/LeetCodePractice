#include<iostream>
#include<vector>
 
using namespace std;

class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        k %= nums.size();
        if(nums.size() > 0 && k > 0) {
            int nextStep;
            int nextNum;
            int temp = nums.at(0);
            while(k--)
            {
                nextNum;
                temp = nums.at(0);
                for(int current = 0; current < nums.size()-1; current++)
                {
                    // nextStep = (current + 1) % nums.size();
                    
                    nextNum = nums.at(current+1);
                    nums.at(current+1) = temp;
                    temp = nextNum;
                }
                nums[0] = temp;
            }
        }
        
        
    }
};


int main(int argc, char const *argv[])
{
    Solution result;
    vector<int> nums({1,2,3,4,5,6,7});

    for(auto n: nums)
        cout << n << " ";
    cout << endl;

    result.rotate(nums, 3);

    for(auto n: nums)
        cout << n << " ";  

    return 0;
}

