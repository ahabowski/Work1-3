/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a = 11;
		int b = 19;
		if (( a >= 13 && a <= 19 && ( b < 13 || b > 19 ))||(( a < 13 || a > 19 ) && b >= 13 && b <= 19 )){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
	}
}