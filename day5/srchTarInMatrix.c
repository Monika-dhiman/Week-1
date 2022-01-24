
#include <stdio.h>

int main()
{
    printf("Enter the no. of rows and columns: \n");
    int rows, cols;
    scanf("%d%d", &rows, &cols);
    int a[rows][cols];
    printf("Enter your elements: \n");
    for(int i = 0; i < rows; i++)
    {
        for(int j = 0; j < cols; j++)
        {
            scanf("%d", &a[i][j]);
        }
    }
    printf("enter your target to find: ");
    int target;
    scanf("%d", &target);
    int r = 0;
    int c = rows - 1;
    while(r < cols && c >= 0)
    {
        if(a[r][c] == target)
        {
            printf("%d%d",r,c);
            break;
        }
        else if(target > a[r][c])
            r++;
        else
            c--;
    }
    printf("Target is not found!!!!");
    return 0;
}
