#include<stdio.h>
int rows, cols;
void clockWise(int mat[rows][cols],int left, int right, int top, int down)
{
    int dir = 0;
    while(left <= right && top <= down)
    {
        if(dir == 0)
        {
            for(int i = left; i <= right; i++)
                printf("%d ",mat[top][i]);
            top++;
        }
        if(dir == 1)
        {
            for(int i = top; i <= down; i++)
                printf("%d ",mat[i][right]);
            right--;
        }
        if(dir == 2)
        {
            for(int i = right; i >= left; i--)
                printf("%d ",mat[down][i]);
            down--;
        }
        if(dir == 3)
        {
            for(int i = down; i >= top; i--)
                printf("%d ", mat[i][left]);
            left++;
        }
        dir = (dir + 1) % 4;
    }
    
}
void antiClockWise(int mat[rows][cols], int left, int right, int top, int down)
{
 int dir = 0;
    while(left <= right && top <= down)
    {
        if(dir == 0)
        {
            for(int i = right; i >= left; i--)
                printf("%d ",mat[down][i]);
            down--;
        }
        if(dir == 1)
        {
            for(int i = down; i >= top; i--)
                printf("%d ",mat[i][left]);
            left++;
        }
        if(dir == 2)
        {
            for(int i = left; i <= right; i++)
                printf("%d ",mat[top][i]);
            top++;
        }
        if(dir == 3)
        {
            for(int i = top; i <= down; i++)
               
                printf("%d ", mat[i][right]);
            right--;
        }
        dir = (dir + 1) % 4;
    }   
}
int main()
{
    //int rows, cols;
    printf("enter the number of rows and columns: \n");
    scanf("%d%d",&rows, &cols);
    int mat[rows][cols];
    printf("Enter your elements: \n");
    for(int i = 0; i < rows; i++)
    {
        for(int j = 0; j < cols; j++)
            scanf("%d",&mat[i][j]);
    }
    int left = 0; 
    int right = cols -1;
    int top = 0;
    int down = rows - 1;
    printf("Clock Wise: \n");
    clockWise(mat, left, right, top, down);
    printf("\nAnti Clock Wise: \n");
    antiClockWise(mat, left, right, top, down);
    
}
