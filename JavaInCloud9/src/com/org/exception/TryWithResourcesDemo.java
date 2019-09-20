package com.org.exception;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResourcesDemo {

	public static void main(String[] args) {

	}

	public static void printFile() {
		try(FileInputStream input = new FileInputStream("file.txt");
				BufferedInputStream bufferedInput = new BufferedInputStream(input)) {
			int data = bufferedInput.read();
			while(data != -1){
				System.out.print((char) data);
				data = bufferedInput.read();
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
