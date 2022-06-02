/*
 * Michael Durso
 * 2/6/2020
 * CMPT 435L 111 
 * Assignment 1
 */

public class Problem1 {

	public static int reverse(int x)
	{
		/*Given a 32-bit signed integer x, reverse digits of x.
		Example 1:
		Input: 123
		Output: 321

		Example 2:
		Input: -123
		Output: -321

		Example 3:
		Input: 120
		Output: 21
		*/
		// Complete this method
		// Feel free to change return type or parameters
		int rev_num = 0;
		//Check if x is negative
		if (x > 0) {
          while(x > 0)
          {
            rev_num = rev_num * 10 + x  % 10; //update rev_num by adding the last rev num to the new last digit
            x = x / 10; // get the next digit 
          }
        return rev_num;
		}
		// come here since x is negative, multiply x by negative 1 for reversing the number
		else {
		  x = x * -1;
          while(x > 0)
          {
            rev_num = rev_num * 10 + x  % 10;
            x = x / 10;
          }
        return rev_num * -1; // add the negative back to the number so it is still negative
		}
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test1 = 123;
		int test2 = -95;
		int test3 = 890;

		System.out.println("Input: " + test1 + " Output: " + reverse(test1));
		System.out.println("Input: " + test2 + " Output: " + reverse(test2));
		System.out.println("Input: " + test3 + " Output: " + reverse(test3));



	}

}
