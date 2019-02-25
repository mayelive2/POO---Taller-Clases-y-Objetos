
package concursos;

/**
 *
 * @author Mayeleen Rodriguez Gomez
 *         cod:2016114118 
 */

import java.util.ArrayList;

public class Programa {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Concurso sesion1 = new Concurso("Sesion 1", 2);
	Concurso sesion2 = new Concurso("Sesion 2", 3);
	Concurso sesion3 = new Concurso("Sesion 3", 3);
		
	ArrayList<Concurso> concursos = new ArrayList<Concurso>();
	concursos.add(sesion1);
	concursos.add(sesion2);
	concursos.add(sesion3);
		
	for(Concurso concurso : concursos){
            System.out.println(concurso.getNombre());
            concurso.agregar_equipos("Equipo 1", "Equipo 2", "Equipo 3");
            for(String equipo : concurso.getEquipos()){
                concurso.registrar_Envio(equipo, 1, "2");
            }
	}
                
    }
    
}
