package com.mfg.beginner;
import java.io.*;
import java.util.*;

public class New{
	static void stack_build(Stack<Integer>stack) {
		for(int i=0;i<6;i++) {
			stack.push(i);
		}
	}
	
	static void stack_pop(Stack<Integer>stack) {
		for(int i=0;i<6;i++) {
			int element = stack.pop();
			System.out.println("All the elements in the stack are -  "+ element);
	}
	}

	static void stack_peek(Stack<Integer>stack) {
		int num2 = stack.peek();
		System.out.println("The topmost element in the array is :  "+ num2);
		
	}
	public static void main(String[] args) {
		Stack<Integer>stack = new Stack<Integer>();
		stack_build(stack);
		stack_peek(stack);
		stack_pop(stack);
	}
}
	
	