package mypac;

public class PrintTriangle {
    public static void main(String[] args) {
        int size = 5;
        int num = 1;

        for(int i = size-1; i >= 0; i--){
            for(int j = 0; j<=i; j++){
                System.out.printf("%-5d", num, " ");
                num++;
            }
            num = 1;
            System.out.println();
        }
    }
}
