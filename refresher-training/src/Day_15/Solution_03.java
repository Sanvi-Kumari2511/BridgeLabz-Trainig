package Day_15;

 class Solution_03 {
     public static <T> void printArray(T[] arr) {
         for (int i = 0; i < arr.length; i++) {
             System.out.println(arr[i]);
         }

     }

        public static void main(String[] args) {

            Integer[] intArray = {1, 2, 3};
            String[] stringArray = {"Hello", "World"};

            printArray(intArray);
            printArray(stringArray);
    }
}