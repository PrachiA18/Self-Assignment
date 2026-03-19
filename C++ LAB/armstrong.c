#include<stdio.h>
int main(){
    int num, rem, sum=0,  orgnum;
    printf("Enter a number");
    scanf("%d", &num);
    orgnum = num;
    while(num !=0){
        rem = num%10;
        num = num/10;
        sum = sum + rem*rem*rem;
    }
    if(sum == orgnum){
        printf(" Numeber is armstrong");
    }
    else{
        printf("is not armstrong number");
    }
}