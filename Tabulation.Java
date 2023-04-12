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
		
		
		
		int[] tab = new int[n+1];
		
		for(int i = 0;i < tab.length;i++) {
			if(i == 0) {
				tab[i] = 0;
			}
			if(i == 1 || i == 2) {
				tab[i] = 1;
			}
			if(i >= 3) {
				tab[i] = tab[i-1] + tab[i-2];
			}
		}
		return tab[n];
	}
	
	
	}
    
	
	
	
	
	
	
	
	
	

	


	
	

	
		
	
	


	

	
	

