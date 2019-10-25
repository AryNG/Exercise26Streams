package com.exercise26Strams.app;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.Scanner;
public class FileWritter {

	public static void main(String[] args) {
		final int Limit =24;
		File thisFile = null;
		FileWriter thisWriter = null;
		BufferedWriter buffer = null;
		Scanner input = new Scanner(System.in);
		
		int table=0;
		
		try {
			thisFile = new File("E:\\A\\b.txt");
			thisWriter = new FileWriter(thisFile); //with ",true" you can add text over and over.
			buffer = new BufferedWriter(thisWriter);
			System.out.println("Input the multiplication table:");
			table=input.nextInt();
			for (int i=0; i<=Limit;i++) {
				System.out.println(String.format("%d x %d = %d",table,i,table,table*i));
				buffer.write(String.format("%d x %d = %d \n",table,i,table,table*i));
			}
			
			
			
			input.close();
			
			
		} catch(IOException e) {
			e.printStackTrace();	
		}
		finally {
				try {
					buffer.close();
					thisWriter=null;
					thisFile=null;
					}
				catch (IOException e) {
					e.printStackTrace();
				}
		 	}
		}

	}

