package menjacnica.interfejs;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.Kurs;
import menjacnica.Valuta;

public interface MenjacnicaInterfejs {
	
	public void dodajKurs(Kurs kurs);
	public void izbrisiKurs(Kurs kurs);
	public LinkedList<Kurs> pronadjiKurs(Valuta valuta, GregorianCalendar datum);
	
}
