
package concursos;

import java.util.ArrayList;

/**
 *
 * @author Mayeleen Rodriguez Gomez
 *         cod:2016114118 
 */
public class Concurso {
    
    private String nombre;
    private int numero_problemas = 5;
    private ArrayList<String> equipos = new ArrayList<String>();
    private int numero_equipos = this.equipos.size();
    private ArrayList<Envio> envios = new ArrayList<Envio>();
	
    public Concurso(String nombre, int num_problemas) {
        this.nombre = nombre;
	this.numero_problemas = num_problemas;
    }
	
    public Concurso(String nombre){
        this.nombre = nombre;
    }
	
    public void agregar_equipos(String...equipos){
        boolean equipo_repetido = false;
        for(String equipo : equipos){
            int repetido = 0;
            for(String equipo2 : equipos){
                if(equipo == equipo2){
                    repetido += 1;
		}
            }
            if(repetido >= 2){
                equipo_repetido = true;
		break;
            }
        }
	if(equipo_repetido){
            System.out.println("No puedes repetir los nombres de los equipos. Intenta de nuevo.");
	}else{
            for(String equipo : equipos){
                this.equipos.add(equipo);
            }
	System.out.println("A�adiste satisfactoriamente los equipos");
	}
        
    }
	
    public boolean eliminar_equipo(String eliminado){
        boolean retorno = false;
	if(this.equipos != null){
            for(String equipo : this.equipos){
		if(equipo == eliminado){
                    this.equipos.remove(equipo);
                    for(Envio envio : this.envios){
                        if(envio.getNombre_equipo() == equipo){
                            this.envios.remove(envio);
			}
                    }
		retorno = true;
		break;
		}
            }
	}
	return retorno;
    }
	
    public Envio registrar_Envio(String nombre_equipo, int num_problema, String respuesta){
        Envio retorno_envio = null;
	if(this.equipos.contains(nombre_equipo)){
            if(num_problema < this.numero_problemas && num_problema > 0){
                if(respuesta != null && respuesta != " "){
                    retorno_envio = new Envio(nombre_equipo, num_problema, respuesta);
		}
            }
	}
	return retorno_envio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero_problemas() {
        return numero_problemas;
    }

    public ArrayList<String> getEquipos() {
        return equipos;
    }

    public int getNumero_equipos() {
        return numero_equipos;
    }

    public ArrayList<Envio> getEnvios() {
        return envios;
    }
    
    
}
