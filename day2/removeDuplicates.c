
#include <stdio.h>
void sortArray(int a[], int n)
{
    int temp;
    for(int i = 0; i < n; i++)
    {
        for(int j = i + 1; j < n; j++)
        {
           if(a[i] > a[j])
           {
               temp = a[i];
               a[i] = a[j];
               a[j] = temp;
           }
        }
    }
}

int removeDuplicates(int a[], int n)
{
    sortArray(a, n);
    int j = 0;
    int temp[n];
    
    for(int i = 0; i < n; i++)
    {
        if(a[i] != a[i+1])
            temp[j++] = a[i];
        for(int i = 0; i < j; i++)
            a[i] = temp[i];
    }
    return j;
}

int main()
{
    int n;
    printf("enter the number of elements: \n");
    scanf("%d", &n);
    printf("Enter your elements: \n");
    int a[n], r;
    for(int i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }
    if(n == 0 || n == 1)
        return n;
    else
        r = removeDuplicates(a, n);
    for(int i = 0; i < r; i++)
        printf("\n%d", a[i]);
     
    return 0;
}
