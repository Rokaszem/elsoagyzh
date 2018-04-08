package zh2011A;

public class Main {

	public static void main(String[] args) {
		int elozo = Integer.parseInt(args[0]);
		int kovetkezo = Integer.parseInt(args[1]);
		int d = kovetkezo - elozo;
		int ujD = 0;
		double ujQ = 0;
		double q = (double) kovetkezo / elozo;

		boolean szamtani = true;
		boolean mertani = true;
		boolean fibo = true;

		for (int i = 2; i < args.length; i++) {
			elozo = kovetkezo;
			kovetkezo = Integer.parseInt(args[i]);
			if (szamtani) {
				ujD = kovetkezo - elozo;
				if (ujD != d) {
					szamtani = false;
				}
			}
			if (mertani) {
				ujQ = (double) kovetkezo / elozo;
				if (ujQ != q) {
					mertani = false;
				}
			}
			if (fibo) {
				if (args[i] == (args[i - 1] + args[i - 2])) {
					fibo = false;
				}
			}

			if (!mertani && !szamtani && !fibo) {
				System.out.println("A sorozat nem számtani, mértani vagy fibonacci-sorozat!");
				break; // felesleges folytatni
			}
		}

		if (szamtani) {
			System.out.println("A sorozat számtani sorozatot alkot: a1 = " + args[0] + ", d = " + ujD);
		}

		if (mertani) {
			System.out.println("A sorozat mértani sorozatot alkot: a1 = " + args[0] + ", q = " + ujQ);
		}

		if (fibo) {
			System.out.println("A sorozat fibonacci-sorozat.");
		}
		// Lehet egyszerre számtani és mértani? pl. 1 1 1 1 1 1

	}

}
