#include<iostream>
using namespace std;
class string1
{
    int len;
    char*ptr;
    public:
     void stringdisplay(){
        cout<<"length is \n"<<len<<endl;
        cout<<"string is\n"<<ptr<<endl;

     }
     string1(char * sptr){
   len=strlen(sptr);;
     }
};