/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] array = {3,2,14,1,2,3,6};
			for(int i=0; i < array.length; i++ ){
				if(array[i]==1 && array[i+1]==2 && array[i+2]==3){
					System.out.println(true);
					break;
				}else if(array.length-2 == i-1 ){
					System.out.println(false);
					break;
				}
			}
			
		
	}
}