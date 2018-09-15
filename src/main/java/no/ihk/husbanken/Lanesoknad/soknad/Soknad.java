package no.ihk.husbanken.Lanesoknad.soknad;

import java.util.List;

public class Soknad {
	
	private String behov;
	private int lanebelop;
	private List<Lanetakere> lanetakere;
	
	public Soknad() {
	}
	
	public Soknad(List<Lanetakere> lanetakere, String behov,
			int lanebelop) {
		super();
		this.lanetakere = lanetakere;
		this.behov = behov;
		this.lanebelop = lanebelop;
	}

	public Soknad(Soknad soknad) {
	}

	public String getBehov() {
		return behov;
	}

	public void setBehov(String behov) {
		this.behov = behov;
	}

	public int getLanebelop() {
		return lanebelop;
	}

	public void setLanebelop(int lanebelop) {
		this.lanebelop = lanebelop;
	}
	
	public List<Lanetakere> getLanetakere() {
		return lanetakere;
	}

	public void setLanetakere(List<Lanetakere> lanetakere) {
		this.lanetakere = lanetakere;
	}

	@Override
	public String toString() {
		return "Soknad [behov=" + behov + ", lanebelop=" + lanebelop
				+ ", lanetakere=" + lanetakere + "]";
	}


}
