package part2;

public class Mjp020_ForEach {
    public static void main(String[] args) {
        int carp=1;
        int arr1[] = new int[5];
        int arr2[] = {5, 10, 15, 20, 25};

        for (int i:arr2
             ) {
            System.out.println(i+" ");
        }
        for (int i:arr2
        ) {
            System.out.print(i+"\t");
            carp*=i;
        }

        System.out.println("\n\nCarpimlari : "+carp);
    }
    
}
