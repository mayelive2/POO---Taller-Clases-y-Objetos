
package concursos;

/**
 *
 * @author Mayeleen Rodriguez Gomez
 *         cod:2016114118 
 */
public class Envio {
    
    private String nombre_equipo;
    private int numero_problema;
    private String respuesta;
    
    public Envio(String nombre_equipo, int numero_problema, String respuesta) {
        
        super();
	this.nombre_equipo = nombre_equipo;
	this.numero_problema = numero_problema;
	this.respuesta = respuesta;
    }
    
    public String getNombre_equipo() {
        return nombre_equipo;
    }
    
    public int getNumero_problema() {
        return numero_problema;
    }
    
    public String getRespuesta() {
        return respuesta;
    }
    
    
}
