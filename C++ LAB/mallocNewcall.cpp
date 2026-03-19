#include<iostream>
using namespace std;
class Test
{
    int x;
    public:
    Test()
    {
      cout<<"constrcutor is called \n";
    }
    ~Test()
    {
        cout<<"destrcutor is called \n";
    }
   
};

int main ()
{
    Test *ptr =new Test();
    delete ptr ; 
    Test *ptr1 =(Test*)malloc(sizeof(Test));
    free (ptr);

}
