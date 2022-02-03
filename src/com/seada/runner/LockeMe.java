package com.seada.runner;

import java.util.Scanner;

import com.seada.exceptions.BusinessException;
import com.seda.handler.FileHandler;

public class LockeMe {

	/**
	 * @param args
	 * @throws BusinessException
	 */
	public static void main(String[] args) throws BusinessException {
		// TODO Auto-generated method stub

		Boolean exit_app = true;

		while (exit_app) {
			System.out.println("welcome to LockMe App");

			Scanner sc = new Scanner(System.in); // System.in is a standard input stream

			System.out.print(
					"Choose one of the options below"
					+ " \n 1- Listfiles \n"
					+ " 2- delete file "
					+ "\n 3- add file \n "
					+ "4- exit \n");

			int input = sc.nextInt();

			FileHandler handler = new FileHandler();

			if (input == 1) {

				System.out.print("Enter direcry : ");

				handler.listallFiles(sc.next());
				// hanlder.printlist() ;

			}
			
			if (input==3) 
			{
			
			System.out.println("enter file name") ; 
			handler.deleteFile(sc.next()); 	
			
				
			}

			if (input == 4) {

				System.out.print("Program ended");
				exit_app = false;
				sc.close();
			}
		}

	}
}
