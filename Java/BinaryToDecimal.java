import java.util.*;
import java.io.*;
import java.lang.*;
class BinaryToDecimal{  
	public static void main(String args[]){ 
    Scanner scn = new Scanner(System.in);
		String binaryString=scn.next(); 
		int decimal=Integer.parseInt(binaryString,2);  
		System.out.println(decimal);  
	}
}  
