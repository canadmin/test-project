import java.util.Scanner;

public class Main {

    public static void sayilariEkranaBas(int X, int N){ // 3 5
        if(X <= N){
            System.out.println(X);
            X = X + 1;
            sayilariEkranaBas(X,N);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz");
        int X= scn.nextInt();
        System.out.println("2. sayıyı giriniz");
        int N= scn.nextInt();

        sayilariEkranaBas(X,N);
//        while( X <= N){
//            System.out.println(X);
//            X = X + 1;
//        }

//        for (int i = X; i <= N; i++ ){
//            System.out.println(i);
//        }
        System.out.println("bitti.");
    }
}