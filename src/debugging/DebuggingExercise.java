package debugging;

public class DebuggingExercise {
    public static void main(String[] args) {
       
        //create an int array we want to sort using bubble sort algorithm
        int array[] = new int[]{5,0,-35,45,150,3};
           
        //print array before sorting using bubble sort algorithm
        System.out.println("Original array");
        for(int el : array){
            System.out.print(el + " ");
        }
           
        sort(array);
           
        System.out.println("");
           
        //print array after sorting using bubble sort algorithm
        System.out.println("Sorted array");
        for(int el : array){
            System.out.print(el + " ");
        }
    }
       
    private static void sort(int[] array) {
           
        int n = array.length;
        int temp = 0;
           
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                   
                if(array[j-1] > array[j]){
                    //swap the elements!
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
       
    }
}

