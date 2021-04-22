public class linear_search {

    //TODO make it generic 

    public static int linear_searchh(int [] arr,int ele) {
    for (int i=0; i <(arr.length); i++) {
        if(arr[i]==ele) return i;
        }
return -1;
}

public static void main(String[] args) {
    // String arr[] ={"Arr","arra","Rach","Amma","Akka"};
    int[] arr={1,2,4,5,6};
    System.out.println(linear_searchh(arr, 4));
}


}
