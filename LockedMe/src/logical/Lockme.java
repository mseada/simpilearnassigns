/**
 * 
 */
package logical;

import java.util.Scanner;

import implemts.FileHandler;

/**
 * @author Mseada
 *
 */
public class Lockme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("welcome to LockMe App")	 ; 
	
	Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  

	System.out.print("Choose one of the options below \n 1- Listfiles \n 2- delete file \n 3- add file \n");  
	
	int  input = sc.nextInt();
	
	FileHandler handler = new FileHandler();
	
	if (input ==1) {
		
		System.out.print("Enter direcry : ") ;
		
		handler.listfiles(sc.next()) ; 
		
	}
	sc.close();
	}  
}
