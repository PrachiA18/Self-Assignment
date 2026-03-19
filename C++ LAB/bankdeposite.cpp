#include<iostream>
using namespace std;
class AC{
    public:
    int accNo, balance;
    void accept(){
        cout<<"\n accept value for accNo and balance\n";
        cin>>accNo>>balance;
    }
    void display(){
        cout<<"account no is"<<accNo<<"\n"<<"balance is"<<balance <<endl;
    }
    void withdraw(int amt){
        if(amt<balance){
            balance=balance-amt;
            cout<<"remaining balance is"<<balance;
        }
        else{
            cout<<"insufficient balance time to deposite the money\n"
        }
    }

        };
        int main()
        {
           AC a1;
           a1.accept();
           a1.withdraw(500);
           return 0;
        }

   3

   



