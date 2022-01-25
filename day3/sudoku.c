#include <stdio.h>
#define  N 9
int isSafe(int grid[N][N], int r, int c, int num)
{
    int i, j;
    for( i = 0; i < N; i++){
        if(grid[i][c] == num)
            return 0;
    }
    for(j = 0; j < N; j++)
    {
        if(grid[r][j] == num)
            return 0;
    }
    int startRow = r - (r % 3);
    int startCol = c - (c % 3);
    for(i = startRow; i < startRow + 3; i++)
    {
        for(j = startCol; j < startCol + 3; j++)
        {
            if(grid[i][j] == num)
                return 0;
        }
    }
    return 1;
    
}
int findEmptySpace(int grid[N][N], int *r, int *c)
{
    for(*r = 0; *r < N; (*r)++)
    {
        for(*c = 0; *c < N; (*c)++)
            if(grid[*r][*c] == 0)
                return 1;
    }
    return 0;
}

int solveSudoku(int grid[N][N])
{
    int r, c;
    printf("%d %d", r, c);
    if(!findEmptySpace(grid, &r, &c))
        return 1;
    for(int num = 1; num <= 9; num++)
    {
        if(isSafe(grid, r, c, num))
        {
            grid[r][c] = num;
            if(solveSudoku(grid))
                return 1;
            grid[r][c] = 0;
        }
    }
    return 0;
}
// void printGrid(int grid[N][N])
// {
//     for(int r = 0; r < N; r++)
//     {
//         for(int c = 0; c < N; c++)
//             printf("%d ",grid[r][c]);
//         printf("\n");
//     }
// }
int main()
{
    int grid[N][N] ={
       { 5, 3, 0, 0, 7, 0, 9, 0, 0 },
       { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
       { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
       { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
       { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
       { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
       { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
       { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
       { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
   };
   if(solveSudoku(grid) == 1)
        //printGrid(grid);
        printf("true");
    else
        printf("false");
    
}
