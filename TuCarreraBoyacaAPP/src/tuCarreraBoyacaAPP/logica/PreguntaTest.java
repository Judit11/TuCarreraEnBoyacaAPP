package tuCarreraBoyacaAPP.logica;

public class PreguntaTest {

	private  int id;
	
	private String descripcion;
	
	private String respuesta1;
	
	private String respuesta2;
	
	private String respuesta3;
	
	private String respuesta4;

	private int respuestaCorrecta;
	
	public PreguntaTest (){
		id=0;
		descripcion="";
		respuesta1="";
		respuesta2="";
		respuesta3="";
		respuesta4="";
		respuestaCorrecta=0;
		
	}
	
	public String toString(){
		return null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getRespuesta1() {
		return respuesta1;
	}

	public void setRespuesta1(String respuesta1) {
		this.respuesta1 = respuesta1;
	}

	public String getRespuesta2() {
		return respuesta2;
	}

	public void setRespuesta2(String respuesta2) {
		this.respuesta2 = respuesta2;
	}

	public String getRespuesta3() {
		return respuesta3;
	}

	public void setRespuesta3(String respuesta3) {
		this.respuesta3 = respuesta3;
	}

	public String getRespuesta4() {
		return respuesta4;
	}

	public void setRespuesta4(String respuesta4) {
		this.respuesta4 = respuesta4;
	}

	public int getRespuestaCorrecta() {
		return respuestaCorrecta;
	}

	public void setRespuestaCorrecta(int respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
	}
	
	
}
