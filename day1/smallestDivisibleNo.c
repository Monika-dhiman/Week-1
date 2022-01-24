#include<stdio.h>
int findHcf(int n1, int n2)
{
    if(n1 == 0)
     return n1;
    else if (n2 == 0)
     return n2;
    else if(n1 == n2)
     return n1;
    else if(n1 < n2)
     return findHcf(n1, n2-n1);
    else
     return findHcf(n1 - n2, n2);
}
void main()
{
    int n = 9;
    int lcm = 1;
    int hcf;
    
    for(int i = 1; i <= n; i++)
    {
        hcf = findHcf(lcm, i);
        lcm = (lcm * i)/ hcf;
    }
    printf("Smallest number divisible by 1 to 9 : %d\n", lcm);
}
