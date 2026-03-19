#include<iostream>
using namespace std;

class Demo
{
    int*ptr;
    public :
    Demo()
{
    cout<<"constrcutor is called \n";
    ptr =new int;
    *ptr =10;

}
   

void display () 
{
    cout<<"value of attributes *ptr"<<*ptr<<endl;
}

~ Demo()
{
    cout<<"destrcutor is called\n";
    delete ptr;
}
};
int main()
{
    Demo obj1;
    obj1.display();
}

