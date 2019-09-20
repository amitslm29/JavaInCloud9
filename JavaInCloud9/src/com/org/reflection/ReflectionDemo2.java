package com.org.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo2 {

	public static void main(String[] args) {

		//Load a class
		Class<Employee> empClass = Employee.class;

		/*
		 * getConstructors() returns only public constructors
		 * defined in Employee class
		 */
		Constructor[] constructors1 = empClass.getConstructors();
		for(Constructor con : constructors1) {
			System.out.println(con);
		}
		
		
		/*
		 * getDeclaredConstructors() returns both public and private 
		 * constructors defined in Employee class
		 */
		Constructor[] constructors2 = empClass.getDeclaredConstructors();
		for(Constructor con : constructors2) {
			System.out.println(con);
		}

		/*
		 * getMethods() returns all public methods defined
		 * in Employee class and all its parent classes 
		 */
		Method[] methods1 = empClass.getMethods();
		for(Method met : methods1) {
			System.out.println(met);
		}

		
		/*
		 * getDeclaredMethods() returns all public and private
		 * methods defined only in Employee class
		 */
		Method[] methods2 = empClass.getDeclaredMethods();
		for(Method met : methods2) {
			System.out.println(met);
		}

		
		/*
		 * getFields() returns only public fields defined
		 * in Employee class
		 */
		Field[] fields1 = empClass.getFields();
		for(Field fld : fields1) {
			System.out.println(fld);
		}

		
		/*
		 * getDeclaredFields() returns both private and
		 * public fields defined in Employee class
		 */
		Field[] fields2 = empClass.getDeclaredFields();
		for(Field fld : fields2) {
			System.out.println(fld);
		}

	}

}
