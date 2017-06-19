package mx.com.anzen.bean;

public class ParametrosSP {
	
	// Atributos
	private int tipoDato;
	private String nombreParametro;
	private Object parametro;
	
	// Constructor
	public ParametrosSP(){
	}
	
	public ParametrosSP(int tipoDato, String nombreParametro, Object parametro){
		this.tipoDato = tipoDato;
		this.nombreParametro = nombreParametro;
		this.parametro = parametro;
	}
	
	// Getters and setters
	public int getTipoDato() {
		return tipoDato;
	}
	public void setTipoDato(int tipoDato) {
		this.tipoDato = tipoDato;
	}
	public String getNombreParametro() {
		return nombreParametro;
	}
	public void setNombreParametro(String nombreParametro) {
		this.nombreParametro = nombreParametro;
	}
	public Object getParametro() {
		return parametro;
	}
	public void setParametro(Object parametro) {
		this.parametro = parametro;
	}
	
}
