#include<stdio.h>

#include<stdio.h>

int main()
{
    int num, rem, sum, orgnum;

    for(num = 1; num <= 999; num++)
    {
        orgnum = num;
        sum = 0;

        while(orgnum != 0)
        {
            rem = orgnum % 10;
            sum = sum + rem * rem * rem;
            orgnum = orgnum / 10;
        }

        if(sum == num)
        {
            printf("%d ", num);
        }
    }

    return 0;
}










































// int main(){
//     int num, rem,i, sum;
//     // printf("Enter a number");
//     // scanf("%d", &num);
//     // orgnum = num;
//     for(num=1;num<=999;i++){
//         num = i;
//         while(num!=0){
//             rem = num % 10;
//             sum = sum + rem * rem * rem;
//             num = num/10;
//         }
//         if(sum == num ){
//             printf("%d", num);
//         }
//     }
//     return 0;
// }