class threeSum {

    public static int threesum(int a[]) {
        int n = a.length;
        int count=0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                for (int k = j + 1; k < n; k++)
                    if (a[i] + a[j] + a[k] == 0)
                       { count++;
                        System.out.printf("%d %d %d\n",a[i],a[j],a[k]);
                       }
        return count;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,-2,-1,-3,0};
        long start= System.nanoTime();

        System.out.println(threesum(a));
        long stop= System.nanoTime();
        System.out.println((stop-start)/1000000 +"ms");
    }
}