
package checkingyourbillaftermarket;

import java.util.Scanner;

public class Checkingyourbillaftermarket {

    public static double moneY(int num1){
        Scanner keyInput = new Scanner(System.in);
        //Declare variables
        double [] money = new double [num1];
        double sum = 0;
        //Get the money of each merchandise from the user
        for(int i = 0; i< num1; i++){
            money[i] = keyInput.nextDouble();
            sum = sum + money[i];
        }
        //Return back the sum
        return sum;
    }
    
    public static double num(String rax){
        //Declare variables
        String sign1;
        int i = 0;
        double num;
        char sign;
        //Determine the number if a decimal or percentage.
        sign = rax.charAt(rax.length() - 1);
        //Convert char to string
        sign1 = String.valueOf(sign);
        if(sign1.equals("%")){
            num = Double.parseDouble(rax.substring(i,rax.length() - 1));
            num = num / 100;
        }
        else{
            num = Double.parseDouble(rax);
        }
        //Return the tax rate back to the main program
        return num;
    }
    
    public static double sum1(double num,double sum){
        //Calculate the sum
        double sums = (num + 1 ) * sum;
        // Keep two decimal places
        sums = sums * 100;
        sums = Math.round (sums);
        sums = sums / 100;
        //Return back the sum
        return sums;
    }
    
    public static void main(String[] args) {
        Scanner keyInput = new Scanner(System.in);
        //Declare variables
        String rax;
        int num1;
        double sums,sum;
        //Describe the rule
        System.out.println("This program will help you check your bill after you bought something from supermaket.");
        System.out.println("Please enter tax rate.");
        rax = keyInput.nextLine();
        double num = num(rax);
        System.out.println("Please enter how many things did you buy?");
        num1 = keyInput.nextInt();
        System.out.println("Please enter the money of each merchandise.");
        sum = moneY(num1);
        sums = sum1(num,sum);
        System.out.println("The tax is " + rax + " You need to pay " + sums);
    }
    
}
