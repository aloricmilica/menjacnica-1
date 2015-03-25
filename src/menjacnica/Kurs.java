package menjacnica;

import java.util.GregorianCalendar;

public class Kurs {
	
	private double prodajni;
	private double kupovni;
	private double srednji;
	private Valuta valuta;
	private GregorianCalendar datum = new GregorianCalendar();
	
	public double getProdajni() {
		return prodajni;
	}
	
	public void setProdajni(double prodajni) {
		this.prodajni = prodajni;
	}
	
	public double getKupovni() {
		return kupovni;
	}
	
	public void setKupovni(double kupovni) {
		this.kupovni = kupovni;
	}
	
	public double getSrednji() {
		return srednji;
	}
	
	public void setSrednji(double srednji) {
		this.srednji = srednji;
	}
	
	public Valuta getValuta() {
		return valuta;
	}
	
	public void setValuta(Valuta valuta) {
		this.valuta = valuta;
	}
	
	public GregorianCalendar getDatum() {
		return datum;
	}
}
