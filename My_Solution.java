package misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class main_misc {
    private static HashMap<String,String> cache = new HashMap<>();
	public static void main(String[] args) {
	   
		
	
		System.out.println(fib(7));
		
	}
	
	private static int fib(int n) {
		int ant = 0;
		int curr = 0;
		for(int i = 0;i <= n;i++) {
			if(i == 0) {
				curr = 0;
				ant = 0;
			}
			if(i == 1 || i == 2) {
				curr = 1;
				ant = 1;
			}
			if(i >= 3) {
				int d = curr;
				curr += ant;
				ant = d;
				
			}
		}
		return curr;
	}
	
	
	}
    
	
	
	
	
	
	
	
	
	

	


	
	

	
		
	
	


	

	
	

