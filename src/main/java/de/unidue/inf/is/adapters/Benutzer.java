package de.unidue.inf.is.adapters;

public class Benutzer {
	
	private String email;
	private String name;
	private String beschreibung;
	private Konto konto;
	
	public Benutzer(String email, String name, String beschreibung,Konto konto) {
		super();
		this.email = email;
		this.name = name;
		this.beschreibung = beschreibung;
		this.konto =konto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBeschreibung() {
		return beschreibung;
	}
	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	public Konto getKonto() {
		return konto;
	}
	public void setKonto(Konto konto) {
		this.konto = konto;
	}
	
	

	
}
