#include<iostream>
using namespace std;
class circle{
    private:
    double radius;
    public:
    double compute_area(){
    return 3.14*radius*radius;
    }
   

};
int main()
{
    circle obj;
    // obj.radius= 6//error
    cout << " Area is: " << obj.compute_area();
}
    