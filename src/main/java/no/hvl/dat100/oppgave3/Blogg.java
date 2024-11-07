package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {
	
	private Innlegg[] Innleggtabell;
	private int nesteledige;
	

	// TODO: objektvariable 

	public Blogg() {
		this.Innleggtabell = new Innlegg[20];
		this.nesteledige = 0;
		
		
		//throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public Blogg(int lengde) {
		this.Innleggtabell = new Innlegg[lengde];
		this.nesteledige = 0;
		//throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public int getAntall() {
		return nesteledige;
		//throw new UnsupportedOperationException(TODO.method());
	}
	
	public Innlegg[] getSamling() {
		return Innleggtabell;
		//throw new UnsupportedOperationException(TODO.method());

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i < nesteledige; i++) {
            if (Innleggtabell[i].erLik(innlegg)) {
                return i;
		}
            
            return -1;

		//throw new UnsupportedOperationException(TODO.method());
	}

	public boolean finnes(Innlegg innlegg) {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean ledigPlass() {
		throw new UnsupportedOperationException(TODO.method());

	}
	
	public boolean leggTil(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}
	
	public String toString() {
		throw new UnsupportedOperationException(TODO.method());
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