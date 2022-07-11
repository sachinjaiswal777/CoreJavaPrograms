package com.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {
	public static void main(String[] args) {
		
		//try {
			try {
				CheckedException.readFile();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	}
	
	public static void readFile() throws FileNotFoundException {
		File f = new File("C://abcd");
		
		if(f==null){
			throw new FileNotFoundException();
		}
	}
}
