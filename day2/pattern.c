#include <stdio.h>
int checkNumber(int n)
{
    int r =  n / 2;
    if(r != 0 && n > 4)
        return 1;
    else
        return 0;
}
void pattern(int n)
{
    int s = 1;
    int m = n;
    for(int i = 1; i <= n; i++)
    {
        for(int j = 1; j <= n; j++ )
        {
            int r = (n/2) + 1;
            if(r == i && r == j)
                printf("/");
             else if(j == s)
                printf("\\");
            else if(j == m)
                printf("/");
            
            else
             printf("*");
        }
        s++;
        m--;
        printf("\n");
    }
}
int main()
{
    printf("Enter a number which should be Greater than 4 and should be odd: \n");
    int n;
    scanf("%d",&n);
    int check = checkNumber(n);
    if(check == 1)
        pattern(n);
    else
    {
        printf("Number is not valid!!!");
        
    }
    
}