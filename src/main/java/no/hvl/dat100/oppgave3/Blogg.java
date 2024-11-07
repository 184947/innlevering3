package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {
	
	private Innlegg[] Innleggtabell;
	private int nesteledig;
	

	// TODO: objektvariable 

	public Blogg() {
		this.Innleggtabell = new Innlegg[20];
		this.nesteledig = 0;
		
		
		//throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public Blogg(int lengde) {
		this.Innleggtabell = new Innlegg[lengde];
		this.nesteledig = 0;
		//throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public int getAntall() {
		return nesteledig;
		//throw new UnsupportedOperationException(TODO.method());
	}
	
	public Innlegg[] getSamling() {
		return Innleggtabell;
		//throw new UnsupportedOperationException(TODO.method());

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i < nesteledig; i++) {
            if (Innleggtabell[i].erLik(innlegg)) {
                return i; }
		}
            return -1;

		//throw new UnsupportedOperationException(TODO.method())
	}

	public boolean finnes(Innlegg innlegg) {
		return finnInnlegg(innlegg) != -1;
		//throw new UnsupportedOperationException(TODO.method());
	}

	public boolean ledigPlass() {
		return nesteledig < Innleggtabell.length;
		//throw new UnsupportedOperationException(TODO.method());

	}
	
	public boolean leggTil(Innlegg innlegg) {
		 if (!finnes(innlegg) && ledigPlass()) {
	            Innleggtabell[nesteledig] = innlegg;
	            nesteledig++;
	            return true;
	            }
		 return false;

		//throw new UnsupportedOperationException(TODO.method());
	}
	
	
	public String toString() {
		 StringBuilder sb = new StringBuilder();
	        sb.append(nesteledig).append("\n");
	        for (int i = 0; i < nesteledig; i++) {
	            sb.append(Innleggtabell[i].toString());
	        }
	        return sb.toString();
		//throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}