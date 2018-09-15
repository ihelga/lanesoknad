package no.ihk.husbanken.Lanesoknad.soknad;

public class Lanetakere {
	
	String fnr;
	String navn;
	
	public Lanetakere() {
	}
	
	public Lanetakere(String fnr, String navn) {
		super();
		this.fnr = fnr;
		this.navn = navn;
	}

	public String getFnr() {
		return fnr;
	}

	public void setFnr(String fnr) {
		this.fnr = fnr;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}
	

}
