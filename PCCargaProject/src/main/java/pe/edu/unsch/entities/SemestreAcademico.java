package pe.edu.unsch.entities;
// Generated 04-jul-2019 9:16:15 by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * SemestreAcademico generated by hbm2java
 */
public class SemestreAcademico implements java.io.Serializable {

	private int idSemestreAcademico;
	private String semestreAcademico;
	private Set docentes = new HashSet(0);

	public SemestreAcademico() {
	}

	public SemestreAcademico(int idSemestreAcademico, String semestreAcademico) {
		this.idSemestreAcademico = idSemestreAcademico;
		this.semestreAcademico = semestreAcademico;
	}

	public SemestreAcademico(int idSemestreAcademico, String semestreAcademico, Set docentes) {
		this.idSemestreAcademico = idSemestreAcademico;
		this.semestreAcademico = semestreAcademico;
		this.docentes = docentes;
	}

	public int getIdSemestreAcademico() {
		return this.idSemestreAcademico;
	}

	public void setIdSemestreAcademico(int idSemestreAcademico) {
		this.idSemestreAcademico = idSemestreAcademico;
	}

	public String getSemestreAcademico() {
		return this.semestreAcademico;
	}

	public void setSemestreAcademico(String semestreAcademico) {
		this.semestreAcademico = semestreAcademico;
	}

	public Set getDocentes() {
		return this.docentes;
	}

	public void setDocentes(Set docentes) {
		this.docentes = docentes;
	}

}