/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vivie
 */
import java.util.Scanner;

class additionSubtraction extends Fractions{    //Fractions is a superclass(parent class) and additionSubtraction is a subclass(child class)

    public static void add(String add) {    // method add

        Fractions fraction = new Fractions();

        //Fractions class
        //create fraction object
        //to get the value of num1,dem1,num2,dem2 in Fractions class

        int a = num1;     //set the static int num1 from Fractions class
        int b = dem1;     //set the static int dem1 from Fractions class
        int c = num2;     //set the static int num2 from Fractions class
        int d = dem2;     //set the static int dem2 from Fractions class


        int dem3 = b * d;      // integer dem3 is the product of dem1 and dem2 so that the function could have the similar denominator

        int newnum1 = a * d;   // integer newnum1 is the product of num1 and dem2 since the denominator of the first fraction has multiply with
        // the denominator of second fraction, therefore the numerator of first fraction should also do the same.

        int newnum2 = c * b;   // integer newnum2 is the product of num2 and dem1.
        // dominator of second fraction has multiplied with dominator of first fraction.
        // therefore the numerator of second fraction should do the same


        if (add.startsWith("-") && add.contains("+")) {     //the system will run this if add class starts with "-"
            // and contain "+"  in its equation.
            // Example input: -1/5 + 1/6

            int negnumresult = (newnum2 - newnum1);        // -num1/dem1 + num2/dem2 = num2/num2 - num1/dem1

            System.out.println("The result of " + "-" + num1 + "/" + dem1 + " + " + num2 + "/" + dem2 + " is: ");
            System.out.println(negnumresult + "/" + dem3);

            System.out.println();


            reduceForm reduceObj = new reduceForm();        // reduceForm class, reduceObj
            reduceForm.reduceFraction(negnumresult,dem3);          //go to reduceFraction method where negnumresult is x and dem3 is y




        }else if (!add.contains("-")) {            //the condition where the equation does not starts with "-",

            //example: 1/5 + 1/5


            int numresult = (newnum1 + newnum2);      //the final result of addition between newnum1 and newnum2 is assigned as numresult


            System.out.println("The result of " + num1 + "/" + dem1 + " + " + num2 + "/" + dem2 + " is: ");        //print out user input
            System.out.println(numresult + "/" + dem3);       //Print out the result in the format of ( x/y ).

            System.out.println();


            reduceForm reduceObj = new reduceForm();
            reduceForm.reduceFraction(numresult,dem3);         //go to reduceFraction method



        } else if (!add.startsWith("-") && add.contains("-")){
            //the condition where the equation does not starts with "-"
            // and contain "-" in its equation.
            //  Example are 1/5+(-1/5)

            int numresult = (newnum1 - newnum2);

            System.out.println("The result of " + num1 + "/" + dem1 + " + " + "(" + "-" + num2 + "/" + dem2 + ")" + " is: ");
            System.out.println(numresult + "/" + dem3);


            reduceForm reduceObj = new reduceForm();
            reduceForm.reduceFraction(numresult,dem3);                 //go to reduceFraction method


        }

    }

    public static void sub (String sub) {       //still in additionSubtraction class, but another method call sub

        Fractions fraction = new Fractions();   //Fractions class


        int a = num1;   //set static int num1 from Fractions class
        int b = dem1;    //set static int dem1 from Fractions class
        int c = num2;   //set the static int num2 from Fractions class
        int d = dem2;   //set the static int dem2 from Fractions class

        int dem3 = b * d;      // integer dem3 is the product of dem1 and dem2 so that the function could have the similar denominator

        int newnum1 = a * d;   // integer newnum1 is the product of num1 and dem2 since the denominator of the first fraction has multiply with
        // the denominator of second fraction, therefore the numerator of first fraction should also do the same.

        int newnum2 = c * b;   // integer newnum2 is the product of num2 and dem1.
        // dominator of second fraction has multiplied with dominator of first fraction.
        // therefore the numerator of second fraction should do the same


        if ( (sub.startsWith("-")) && (!sub.contains("--")) ) {

            //the system will run this if there sub method starts with "-" and does not contain "--"
            //example input: -1/10 - 2/10

            int negnumresult = (-newnum1 - newnum2);

            System.out.println("The result of " + "-" + num1 + "/" + dem1 + " - " + num2 + "/" + dem2 + " is: ");
            System.out.println(negnumresult + "/" + dem3);

            System.out.println();
            //to make the print out result more tidy


            reduceForm reduceObj = new reduceForm();
            reduceForm.reduceFraction(negnumresult,dem3);       //reduceFraction method to get the reduced form of the fractions
        }

        else if( (sub.contains("--")) && (!sub.startsWith("-"))){
            //example: 1/5 -(-1/10)
            int numresult = (newnum1 + newnum2);      //the final result of subtraction between newnum1 and newnum2 is assigned as numresult.

            System.out.println("The result of " + num1 + "/" + dem1 + " -(-" + num2 + "/" + dem2 + ")" + " is: ");
            System.out.println(numresult + "/" + dem3);       //Print out the result in the format of ( x/y ).

            System.out.println();


            reduceForm reduceObj = new reduceForm();
            reduceForm.reduceFraction(numresult,dem3);       //reduceFraction method to get the reduced form of the fractions
        }

        else if( (sub.contains("-")) && (sub.contains("--"))){          //example: -1/5 -(-1/10)
            int numresult = (-newnum1 + newnum2);      //the final result of subtraction between newnum1 and newnum2 is assigned as numresult.

            System.out.println("The result of " + "-" + num1 + "/" + dem1 + " -(-" + num2 + "/" + dem2 + ")" + " is: ");
            System.out.println(numresult + "/" + dem3);       //Print out the result in the format of ( x/y ).

            System.out.println();

            reduceForm reduceObj = new reduceForm();
            reduceForm.reduceFraction(numresult,dem3);           //reduceFraction method to get the reduced form of the fractions
        }

        else{
            int numresult = (newnum1 - newnum2);      //the final result of subtraction between newnum1 and newnum2 is assigned as numresult.

            System.out.println("The result of " + num1 + "/" + dem1 + " - " + num2 + "/" + dem2 + " is: ");
            System.out.println(numresult + "/" + dem3);       //Print out the result in the format of ( x/y ).

            System.out.println();

            reduceForm reduceObj = new reduceForm();
            reduceForm.reduceFraction(numresult,dem3);       //reduceFraction method to get the reduced form of the fractions
        }
    }



}



class multiplicationDivision extends Fractions{         //Fractions is a superclass(parent class) and multiplicationDivision is a subclass(child class)


    public static void mul(String mul){     //mul method

        Fractions fraction = new Fractions();

        int a = num1;  //set the static int num1 from Fractions class
        int b = dem1;  //set the static int dem1 from Fractions class
        int c = num2;  //set the static int num2 from Fractions class
        int d = dem2;  //set the static int dem2 from Fractions class

        int newdem = b * d;   //multiplication of the denominator of two fractions

        if(mul.startsWith("-") && !mul.contains("*-")) {    //the system will run this if mul method starts with "-" symbol and does not contain "*-"

            int mulnumresult = -a * c;            //example -1/5 * 2/5

            System.out.println("The result of " + "-" + num1 + "/" + dem1 + " * " + num2 + "/" + dem2 + " is: ");
            System.out.println(mulnumresult + "/" + newdem);       //Print out the result in the format of ( x/y ).

            System.out.println();

            reduceForm reduceObj = new reduceForm();
            reduceForm.reduceFraction(mulnumresult,newdem);   //reduceFraction method to get the reduced form of the fractions
        }

        else if ( (!mul.startsWith("-")) && (mul.contains("*-"))) {                       //run this if mul method does not starts with "-" and contain *-

            int mulnumresult = a * -c;

            System.out.println("The result of " + + num1 + "/" + dem1 + " * (-" + num2 + "/" + dem2 + ")" + " is: ");
            System.out.println(mulnumresult + "/" + newdem);

            System.out.println();

            reduceForm reduceObj = new reduceForm();
            reduceForm.reduceFraction(mulnumresult,newdem);     //reduceFraction method to get the reduced form of the fractions
        }

        else if ((mul.startsWith("-")) && (mul.contains("*-"))){            //run this if mul method starts with "-" and contain *-

            int mulnumresult = a * c;

            System.out.println("The result of " + "-" + num1 + "/" + dem1 + " * (-" + num2 + "/" + dem2 + ")" + " is: ");
            System.out.println(mulnumresult + "/" + newdem);

            System.out.println();

            reduceForm reduceObj = new reduceForm();
            reduceForm.reduceFraction(mulnumresult,newdem);     //reduceFraction method to get the reduced form of the fractions

        }



        else {              //run this if input does not match any of the requirements above

            int mulnewnum = a * c;                          //example: 1/5 * 2/5

            System.out.println("The result of " + num1 + "/" + dem1 + " * " + num2 + "/" + dem2 + " is: ");
            System.out.println(mulnewnum + "/" + newdem);       //Print out the result in the format of ( x/y ).

            System.out.println();


            reduceForm reduceObj = new reduceForm();
            reduceForm.reduceFraction(mulnewnum,newdem);        //reduceFraction method to get the reduced form of the fractions

        }



    }

    public static void div(String div){         //div method, still inside multiplicationDivision class

        Fractions fraction = new Fractions();

        int a = num1;  //set the static int num1 from Fractions class
        int b = dem1;  //set the static int dem1 from Fractions class
        int c = num2;  //set the static int num2 from Fractions class
        int d = dem2;  //set the static int dem2 from Fractions class

        //division of num1/dem1  and  num2/dem2 is   num1/dem1 * dem2/num2.

        int newnum = a * d;   //new numerator is the product of num1 and dem2
        int newdem = b * c;   //new denominator is the product of dem1 and num2

        if ((div.startsWith("-") &&  (!div.contains("/-")) )) {    //the system will run this if starts with "-" and do not have "/-"

            System.out.println("The result of " + "-" + num1 + "/" + dem1 + " / " + num2 + "/" + dem2 + " is: ");
            System.out.println( (-newnum) + "/" + newdem);       //Print out the result in the format of ( x/y ).

            System.out.println();

            reduceForm reduceObj = new reduceForm();
            reduceForm.reduceFraction( (-newnum) ,newdem);      //reduceFraction method to get the reduced form of the fractions
        }

        else if ( (div.contains("/-")) && (div.startsWith("-")) ){               //will run this if div method have "/-" and starts with"-"
            //example: -1/2 /(-1/2)

            System.out.println("The result of " + "-" + num1 + "/" + dem1 + " / " + "-" + num2 + "/" + dem2 + " is: ");
            System.out.println( (-newnum) + "/" + (-newdem) );

            System.out.println();

            reduceForm reduceObj = new reduceForm();
            reduceForm.reduceFraction( (-newnum) , (-newdem) );
        }

        else {              //example : 1/5 / 2/5
            System.out.println("The result of " + num1 + "/" + dem1 + " / " + num2 + "/" + dem2 + " is: ");
            System.out.println(newnum + "/" + newdem);       //Print out the result in the format of ( x/y ).

            System.out.println();

            reduceForm reduceObj = new reduceForm();
            reduceForm.reduceFraction(newnum,newdem);
        }
    }

}

class reduceForm extends Fractions{     //class for reduced form of fraction, Fractions is the parent class and reduceForm is a child class.

    public static void reduceFraction(int x, int y)    //method for reduced function

    {
        int d;
        d = gcd(x, y);  //d is the greatest common divisor (gcd) of x and y

        x = x / d;          //finding the x after divided into its lowest form
        y = y / d;              //finding y after divided into its lowest form

        if (x==0 || y == 0) {       //when x is 0 , the output is 0. (Not a reduced form)
            System.out.println("The reduced form is " + 0);
        }
        else if ( x==y ){       //when x equals to y, the reduced form should be 1

            System.out.println("The reduced form is " + 1);
    }
        else {
            System.out.println("x = " + x + ", y = " + y);
            System.out.println("The reduced form is: " + x + "/" + y);
        }
    }

    public static int gcd(int a, int b)      //greatest common divisor (gcd) method of two integers
    {
        // Using Euclidean algorithm

        if (a == 0 || b ==0)            //if both integer is 0, the gcd is going to be 0
            return 0;

        if (a == b)                 //if a is equal to b, therefore the gcd is going to be a or b.
            return a;

        if (a > b)                      //the value of a bigger than b
                                            // the bigger value should be subtracted, in this case, a should minus b
            return gcd(a-b,b);          //call the gcd function to satisfy the condition (return a / return 0)


        else                         // other condition
                                            //    the bigger value should be subtracted.
            return gcd(a,b-a);      //gcd function to satisfy the condition

    }


}



public class Fractions {        //Fractions class   (main class)

    static int num1; //make numerator 1 as static integer so that it is able to be read in array
    static int dem1;   //make denominator 1 as static integer so that it is able to be read in array
    static int num2;   //make numerator 2 as static integer so that it is able to be read in array
    static int dem2;  //make denominator 2 as static integer so that it is able to be read in array


    public static void main(String[] args) {

        System.out.println("Input equation of 2 fractions: ");
        Scanner sc = new Scanner(System.in);           //Scanner for user input from keyboard
        String input = sc.nextLine();              //input as a String, taking the input from scanner (sc)
        input = input.replaceAll("[ ]", "");           //replace " "(space) with "", so that the input of 5 / 6 + 4 / 7 will become 5/6+4/7


        String[] fraction = input.split("/|\\+|\\-|\\*");        //make the user input into arrays and split them into
        // different arrays when there is "/,+,-,*" symbols

        //math_symbolCheck method in Fractions class to check the user input for containing any errors in the input equation
        if (math_symbolCheck(input)) {

            int number_of_try = 0;          //the number of tries
            int attempts = 3;            //number of attempts provided to the user.



            do {
                attempts--;          //number of attempts decreases as user type the wrong input.
                if (attempts == number_of_try) {            //when the attempts have reached the number of tries (0) , error message will come out
                    System.out.println("You have reached the maximum number of tries!");
                    System.out.println("Please restart the program.");
                    System.exit(0);                 //exit program
                } else {
                    System.out.println("Error, you have input the wrong format! Please try again. " + "You have (" + attempts + ") more attempts left.");
                    input = sc.nextLine();      //scanner for entering another number

                    if (!math_symbolCheck(input)) {     // the user does not input the incorrect format( false )
                        break;                          //break the loop  [refer to math_symbolCheck method]
                    }
                }
            } while (attempts < 3);     //only do the loop where the attempt number is smaller than 3




        }  else if (!input.contains("+*") || (!input.contains("+/")) || (!input.contains("-*")) || (!input.contains("+-")) || (!input.contains("-+"))
                || (!input.contains("-/")) || (!input.contains("/+")) || (!input.contains("/*")) || (!input.contains("//")) || (!input.contains("++"))
                || (!input.contains("--")) || (!input.contains("**")) || (!input.contains("*/")) || (!input.contains("*+"))){

            //system will print out the user input if it is in the correct format

            System.out.println(input);
        }


        input = input.replaceAll("[ ]", "").replaceAll("\\(", "").replaceAll("\\)", "");
        //replace " " and "()" with "",
        // (ignore the spaces between numbers)so that the input of 5 / 6 + 4 / 7 will become 5/6+4/7
        //ignore the brackets () so that 5/6 + (-5/6) can be calculated.


        //fraction has already been defined previously, the system has already recognise fraction as array.
        fraction = input.split("/|\\+|\\-|\\*");        //make the user input into arrays and split them into
        // different arrays when there is "/,+,-,*" symbols

        if ((!input.startsWith("-")) && ((input.contains("+-")) || (input.contains("-+")) || (input.contains("--"))
                || (input.contains("*-")) || (input.contains("/-")) || (input.contains("-+")))) {
            //state a condition where the user input does not start with "-" and contain
            // "+-" or "-+" or "--" or "*-" or "/-" or "-+"
            // since the brackets have been replaced with "", therefore +(- will become +-
            //example input: 15/2 -(-1/2)

            System.out.println(fraction[0] + fraction[1] + fraction[3] + fraction[4]);          //fraction[2] in this case are ""


            num1 = Integer.parseInt(fraction[0]);   //convert user inputs in strings inside 1st slot of array(fraction) into integer
            dem1 = Integer.parseInt(fraction[1]);
            num2 = Integer.parseInt(fraction[3]);
            dem2 = Integer.parseInt(fraction[4]);


        } else if((input.startsWith("-")) && (  (input.contains("+-")) || (input.contains("-+")) || (input.contains("--"))
                || (input.contains("*-")) || (input.contains("/-")) || (input.contains("-+"))) ){
            //if input starts with "-"  and contain // "+-" or "-+" or "--" or "*-" or "/-" or "-+"
            //example input: -15/2 -(-1/2)


            System.out.println("-" + fraction[1] + fraction[2] + fraction[3] + fraction[4] + fraction[5]);        //fraction[0] is "-"

            num1 = Integer.parseInt(fraction[1]);   //convert user inputs in strings inside 1st slot of array(fraction) into integer
            dem1 = Integer.parseInt(fraction[2]);
            num2 = Integer.parseInt(fraction[4]);
            dem2 = Integer.parseInt(fraction[5]);



        }else if (input.startsWith("-") ) {       //for user input of -a/b + c/d and others


            System.out.println("-" + fraction[1] + fraction[2] + fraction[3] + fraction[4]);      // fraction array index [0] will have the "-" symbol which is invalid in java.
            //therefore only fraction array index [1] to [4] will be printed out

            num1 = Integer.parseInt(fraction[1]);   //convert user inputs in strings inside 1st slot of array(fraction) into integer
            dem1 = Integer.parseInt(fraction[2]);
            num2 = Integer.parseInt(fraction[3]);
            dem2 = Integer.parseInt(fraction[4]);

        }else if (!input.startsWith("-") ) {
            System.out.println(fraction[0] + fraction[1] + fraction[2] + fraction[3]);         //print out user input arranged in arrays that was been split through "/"

            num1 = Integer.parseInt(fraction[0]); //convert the user input in string inside first slot of array into integer
            dem1 = Integer.parseInt(fraction[1]);      //convert the user input in string inside second slot of array into integer
            num2 = Integer.parseInt(fraction[2]);    //convert the user input in string inside third slot of array into integer
            dem2 = Integer.parseInt(fraction[3]);   //convert the user input in string inside fourth slot of array into integer

        }


        if ( (input.contains("+")) || (input.contains("+") && (input.startsWith("-")))) {
            //detect user input for containing "+"  or where there's "+" symbol inside and the fraction[0] is "-"


            additionSubtraction addsubObj = new additionSubtraction();
            addsubObj.add(input);            //go to add method based on the user input


        } else if ( (input.indexOf("-")==3) ){    //detect user input where the position of "-" is equal to 3
            // 1/4 - 1/6 (position of "-" is 3)

            additionSubtraction addsubObj = new additionSubtraction();
            addsubObj.sub(input);            //go to sub method based on the user input


        } else if (input.contains("*")) {       //detect user input for containing "*"

            multiplicationDivision muldivObj = new multiplicationDivision();
            muldivObj.mul(input);          //go to mul method based on user input.


        } else if ((!input.startsWith("-")) && input.charAt(3)== '/'|| input.charAt(4)== '/' || input.charAt(5)== '/') {      //detect the input character on the 3rd index, 4th index and 5th index if contain '/'
            //the 3rd index is for two fractions with one value place, for example 4/5 / 2/5
            //the 4th index is for two fractions with two value place, for example  22/4 / 62/3
            //the 5th index is for two fractions with three value place, for example 234/123 / 902/421

            multiplicationDivision muldivObj = new multiplicationDivision();
            muldivObj.div(input);                  //go to div method based on user input.

        } else if ( (input.startsWith("-") )){          //detect where the user input is start with "-"

            additionSubtraction addsubObj = new additionSubtraction();
            addsubObj.sub(input);
        }


    }

    /**
     * Check for input math symbol (either correct or wrong)
     * @param input
     * @return
     */

    private static boolean math_symbolCheck(String input) {

        if (input.contains("+*") || input.contains("+/") || input.contains("-*") || input.contains("+-") || input.contains("-+")
                || input.contains("-/") || input.contains("/+") || input.contains("/*") || input.contains("//") || input.contains("++")
                || input.contains("--") || input.contains("**") || input.contains("*/") || input.contains("*+") || input.contains("*-")) {
            //all the invalid math symbol

            return true;        //return true if input contain invalid math symbol
            //the do-while loop will continue

        } else {
            return false;       //return false if input does not contain invalid math symbol
            //exit loop.
        }
    }


}










