package pe.edu.unsch.entities;
// Generated 04-jul-2019 9:16:15 by Hibernate Tools 5.3.0.Beta2

/**
 * Docente generated by hbm2java
 */
public class Docente implements java.io.Serializable {

	private String dniDocente;
	private CargaAcademica cargaAcademica;
	private SemestreAcademico semestreAcademico;
	private String nombresApellidos;

	public Docente() {
	}

	public Docente(String dniDocente, CargaAcademica cargaAcademica, SemestreAcademico semestreAcademico,
			String nombresApellidos) {
		this.dniDocente = dniDocente;
		this.cargaAcademica = cargaAcademica;
		this.semestreAcademico = semestreAcademico;
		this.nombresApellidos = nombresApellidos;
	}

	public String getDniDocente() {
		return this.dniDocente;
	}

	public void setDniDocente(String dniDocente) {
		this.dniDocente = dniDocente;
	}

	public CargaAcademica getCargaAcademica() {
		return this.cargaAcademica;
	}

	public void setCargaAcademica(CargaAcademica cargaAcademica) {
		this.cargaAcademica = cargaAcademica;
	}

	public SemestreAcademico getSemestreAcademico() {
		return this.semestreAcademico;
	}

	public void setSemestreAcademico(SemestreAcademico semestreAcademico) {
		this.semestreAcademico = semestreAcademico;
	}

	public String getNombresApellidos() {
		return this.nombresApellidos;
	}

	public void setNombresApellidos(String nombresApellidos) {
		this.nombresApellidos = nombresApellidos;
	}

}