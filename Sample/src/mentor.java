public class mentor {
    // 2.Given an arrays of ints, check if the array contains a 2 next to a 2 somewhere
    public static void main(String[] args) {
        int [] array = {1,2,3};
        for (int i = 0; i <array.length ; i++) {
            if(i == 2){
                System.out.println("i have" );
            }
        }

// 3.given an array and find the squares of the array elements
// {2,4,5,8}
//{4,16,25,64}

        for (int i = 0; i < array.length; i++) {
            int asquare = array[i]*array[i];
            System.out.println(asquare);
        }
// find the prime numbers between 1 and 50

// prime number is a number that is divided by only 1 and itself
// Example:7,11,13,
        int i=0;
        int j=0;

        for( i=1;i<=50;i++) {

            int counter = 0;

            for ( j = i; j >= 1; j--) {

                if (i % j == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                System.out.println(i+ " is a prime number");
            }
        }

 //Write a Java program to segregate all 0s on left side and all 1s on right side of a given array of 0s and 1s.
// Output:{0,0,0,0,0,1,1,1}

    }
}

