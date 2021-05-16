struct pair
{
  int min;
  int max;
}; 
 
struct pair getMinMax(int arr[], int n)
{
  struct pair minmax;    
  int i;
  minmax.max = arr[0];
  minmax.min = arr[0];
  /*If there is only one element then return it as min and max both*/
 
     for(i = 1;i<n;i++)
     {
         if (arr[i] > minmax.max)
             minmax.max = arr[i];

         else if (arr[i] < minmax.min)
             minmax.min = arr[i];
     }

     return minmax;

}

int main()
{
    int arr[] = {1000, 11, 445, 1, 330, 3000};
    int arr_size = 6;
    struct pair minmax = getMinMax(arr, arr_size);
    printf("\nMinimum element is %d", minmax.min);
    printf("\nMaximum element is %d", minmax.max);
    getchar();
}
