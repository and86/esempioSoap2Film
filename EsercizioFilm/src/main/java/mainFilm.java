import java.util.List;

import it.alfasoft.andrea.bean.Film;
import it.alfasoft.andrea.servizio.Servizio;


public class mainFilm {

	public static void main(String[] args) {
		Servizio s=new Servizio();
		
List<Film> film=s.getTuttiFilm();
		
		for(Film f:film){
			System.out.println(f.getNomeFilm());
			
		}
		
//		Film f1=new Film("aaaaa",2015,"aaa","Mov1","Drammatico");
//		Film f2=new Film("bbbbb",2016,"bbb","Mov2","Drammatico");
//		Film f3=new Film("ccccc",2013,"ccc","Mov3","Drammatico");
//		
//		s.registraFilm(f1);
//		s.registraFilm(f2);
//		s.registraFilm(f3);
		

	}

}
