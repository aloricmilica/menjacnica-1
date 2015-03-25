package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {
	
	private LinkedList<Kurs> kursnaLista = new LinkedList<Kurs>();

	public void dodajKurs(Kurs kurs) {
		if(kurs == null || kursnaLista.contains(kurs))
			throw new RuntimeException("Kurs vec postoji u kursnoj listi ili ga niste pravilno uneli");
		kursnaLista.add(kurs);

	}

	public void izbrisiKurs(Kurs kurs) {
		if(!kursnaLista.contains(kurs)) 
			throw new RuntimeException("Kurs nije u kursnoj listi");
		kursnaLista.remove(kurs);

	}

	public LinkedList<Kurs> pronadjiKurs(Valuta valuta, GregorianCalendar datum) {
		
		LinkedList<Kurs> rezultat = new LinkedList<Kurs>();
		
		for (int i = 0; i < kursnaLista.size(); i++) {
			if(valuta == null  || datum == null || !kursnaLista.get(i).getDatum().equals(datum) 
					|| !kursnaLista.get(i).getDatum().equals(datum))
				throw new RuntimeException("Niste uneli valutu i datum, ili ne postoji kurs za trazeni datum");
					rezultat.add(kursnaLista.get(i));
			}
		return rezultat;
	}

}
