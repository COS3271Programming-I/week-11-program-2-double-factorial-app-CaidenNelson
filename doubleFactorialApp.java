import java.util.Scanner;

public class doubleFactorial {

    static Scanner userinput = new Scanner(System.in);

    static int factorial(int num){
        int total = 1;

        if(num % 2 == 0){
            for(int i = 0; i < num+1; i++){
                if(i%2 ==0 && i > 0){
                    total = total*i;
                }
            }
        }
        if(num % 2 != 0){
            for(int i = 0; i < num+1; i++){
                if(i % 2 != 0){
                    total = total*i;

                }
            }
        }

        return total;

    }

    public static void main(String[] args) {
        int userNum;
        int userFactorial;

        System.out.println("Please select a number less than 20");
        userNum = userinput.nextInt();

        while(userNum > 20 ){
            System.out.println("Please enter a number less than 20");
            userNum = userinput.nextInt();
        }

        userFactorial = factorial(userNum);

        System.out.println("The double factorial of "+ userNum +" is equal to "+ userFactorial);

    }
}
