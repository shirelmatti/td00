
package fr.dauphine.ja.mattishirel.td00;

import java.util.ArrayList;

public class PrimeCollection {
private ArrayList<Integer> numbers;
public PrimeCollection() {
numbers=new ArrayList<Integer>();
}
public void initRandom(int n, int m) {
for(int i=0; i<n;i++) {
int x=(int)(Math.random()*(m+1));
numbers.add(x);
}
}
	private boolean isPrime(int p) {
		if(p==1) return false;
			int i=2;
			while(i<=Math.sqrt(p)) {
				if(p%i==0) {
				return false;
				}
			i++;
		}
	return true;
	}
	public void printPrimes() {
		for(int i:numbers) {
			if(isPrime(i)) {
			System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		PrimeCollection p=new PrimeCollection();
		p.initRandom(100, 1000);
		p.printPrimes();
	}
}
