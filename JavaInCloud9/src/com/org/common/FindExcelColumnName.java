package com.org.common;

/*
 * https://www.geeksforgeeks.org/find-excel-column-name-given-number/
 */
public class FindExcelColumnName {
	
	public static void main(String[] args) {
		
		System.out.println(findColumnName(78));
		
	}
	
	public static String findColumnName(int columnNumber) {
		
		StringBuffer columnName = new StringBuffer();
		while(columnNumber > 0){
			
			//Find reminder
			int reminder = columnNumber%26;
			if(reminder == 0){
				columnName.append('Z');
				columnNumber = (columnNumber/26)-1;
			}
			else{
				columnName.append((char)((reminder-1)+'A'));
				columnNumber = columnNumber/26;
			}
		}
		return columnName.reverse().toString();
	}

}
