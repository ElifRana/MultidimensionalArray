public class Main {

    public static void main(String[] args) {

        int dizi[][] = {{1, -7, 3, -4}, {-1, 6, -8}};

        //her döngüde bireysel dizeye erişiriz.
        for(int[] innerArray:dizi){
            //her döngüde bireysel ögeye erişiriz.
            for(int data:innerArray) {
                System.out.print(data + ", ");
            }
        }
    }
}
