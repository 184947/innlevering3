package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		//throw new UnsupportedOperationException(TODO.method());
		
		PrintWriter skriver = null;
		boolean ok = true;
		try {
			skriver = new PrintWriter(mappe + filnavn);
			String tekst = samling.toString();
			skriver.println(tekst);
		}
		catch (FileNotFoundException e){
			ok = false;
		}
		finally {
			if (skriver != null)
				skriver.close();
		}
		return ok;
	}
}
