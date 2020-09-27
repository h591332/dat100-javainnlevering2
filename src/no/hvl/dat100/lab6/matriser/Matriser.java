package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int i=0; i< matrise.length; i++ ) {
			int[] x = matrise[i];
			
			for(int u = 0; u<x.length; u++) {
				int y= x[u];
				System.out.print(y);
			}
			System.out.print("\n");
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String stg="";

		for (int i=0; i< matrise.length; i++ ) {
			
			int[] x = matrise[i];
			
			for(int u = 0; u<x.length; u++) {
				int y= x[u];
				stg+=y+" ";
			}
			stg += "\n";
		}
		return stg;	
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		 int f = matrise.length;
		 int g = matrise[0].length;
			
			int[][] copy = new int[f][g];
			
			for (int i=0; i< matrise.length; i++ ) {
				int[] x = matrise[i];
				
				for(int u = 0; u<x.length; u++) {
					int y= x[u];
					copy[i][u]= y*tall;
				}
			}
			return copy;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		int r=0;
		boolean erLik=true;
		while(r<a.length && erLik) {
			int p=0;
			while (p<a[r].length && erLik) {
				if(!(a[r][p] == b[r][p])) {
					erLik=false;
				}
				p++;
			}
			r++;
		}
		return erLik;
	}
	
	
	
	
	
	
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
