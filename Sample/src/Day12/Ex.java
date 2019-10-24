package Day12;

public class Ex {
    public static void main(String[] args) {
        System.out.println("FOR ------------");
        for(int i = 1;i<=5; i++){
            System.out.println(i);
        }

        System.out.println("BAD FOR -----------");
        int k =1;
        for(;k<=5;){
            System.out.println(k);
            k++;
        }
        System.out.println("WHILE -----------");
        int j=1;
        while(j<=5){
            System.out.println(j);
            j++;
        }
    }
}
