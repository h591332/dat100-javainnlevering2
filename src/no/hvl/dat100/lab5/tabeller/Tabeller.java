package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		System.out.print("[");
		for (int tall : tabell) {
			System.out.print(tall+ " ");
		}
		System.out.println("]");
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String stg="[";
		int kma= tabell.length -1;
		for(int i =0; i<tabell.length;i++) {
			stg += tabell[i];
			if(i<kma) {
				stg += ",";
			}
		}
		stg+= "]";
		return stg;
	}

	// c)
	public static int summer(int[] tabell) {
		int sum=0;
		
		//metode 1
		/*
		for(int i = 0; i<tabell.length;i++) {
			sum += tabell[i];
		}
		*/
		
		//metode 2
		/*
		int i=0;
		while(i<tabell.length) {
			sum+=tabell[i];
			i++;
		}
		*/
		
		//metode 3
		for(int i : tabell) {
			sum+= i;
		}
		
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean found=false;
		int pos=0;
		while (!found && pos <tabell.length) {
			if(tall == tabell[pos]) {
				found=true;
			}
			pos++;
		}
		return found;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int pos=-1;
		for(int i=0; i<tabell.length; i++) {
			if(tall==tabell[i]) {
				pos=i;
			}
		}
		return pos;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] rev= new int[tabell.length];
		int tmp= tabell.length-1;
		for(int i=0; i<tabell.length;i++) {
			rev[tmp]=tabell[i];
			tmp--;
		}
		return rev;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean sorted=true;
		int i=0;
		while(sorted && i<tabell.length-1) {
			if(tabell[i]<=tabell[i+1]) {
			}
			else {
				sorted=false;
			}
			i++;
		}
		return sorted;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] comb = new int[tabell1.length+tabell2.length];
		int pos=0;
		for(int i : tabell1) {
			comb[pos]=i;
			pos++;
		}
		for(int i : tabell2) {
			comb[pos]=i;
			pos++;
		}
		return comb;
	}
}
