
#include <stdio.h>
// void sortTriplets(int first, int sec, int third)
// {
//     int temp[3];
    
//     for(int i = 0; i < 3; i++){
//         printf("%d\n", temp[i]);
//     }
// }

void findTripletsOfSum(int a[], int n, int sum)
{
    int temp[n-2][3];
    for(int i = 0; i < n - 2; i++)
    {
        for(int j = i + 1; j < n - 1; j++)
        {
            for(int k = j + 1; k < n; k++)
            {
                if(a[i] + a[j] + a[k] == sum)
                {
                    printf("%d %d %d\n", a[i], a[j], a[k]);
                    //sortTriplets(a[i], a[j], a[k]);
                }
            }
        }
    }
    printf("Triplets does not exist for given sum!!!");
}

int main()
{
    int n;
    printf("Enter the no. of elements: \n");
    scanf("%d", &n);
    int a[n];
    printf("Enter your elements: \n");
    for(int i = 0; i < n; i++)
    {
        scanf("%d",&a[i]);
    }
    printf("Enter your sum: \n");
    int sum;
    scanf("%d", &sum);
    findTripletsOfSum(a, n, sum);
    
}

