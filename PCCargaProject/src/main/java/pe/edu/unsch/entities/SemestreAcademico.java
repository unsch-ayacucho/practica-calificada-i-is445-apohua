package pe.edu.unsch.entities;
// Generated 05-jul-2019 17:30:45 by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * SemestreAcademico generated by hbm2java
 */
@Entity
@Table(name = "SemestreAcademico", catalog = "cargabd")
public class SemestreAcademico implements java.io.Serializable {

	private int idSemestreAcademico;
	private String semestreAcademico;
	private Set<Docente> docentes = new HashSet<Docente>(0);

	public SemestreAcademico() {
	}

	public SemestreAcademico(int idSemestreAcademico, String semestreAcademico) {
		this.idSemestreAcademico = idSemestreAcademico;
		this.semestreAcademico = semestreAcademico;
	}

	public SemestreAcademico(int idSemestreAcademico, String semestreAcademico, Set<Docente> docentes) {
		this.idSemestreAcademico = idSemestreAcademico;
		this.semestreAcademico = semestreAcademico;
		this.docentes = docentes;
	}
	@Id
	@Column(name = "idSemestreAcademico", unique = true, nullable = false, length = 8)
	public int getIdSemestreAcademico() {
		return this.idSemestreAcademico;
	}

	public void setIdSemestreAcademico(int idSemestreAcademico) {
		this.idSemestreAcademico = idSemestreAcademico;
	}
	@Column(name = "SemestreAcademico", nullable = false, length = 50)
	public String getSemestreAcademico() {
		return this.semestreAcademico;
	}

	public void setSemestreAcademico(String semestreAcademico) {
		this.semestreAcademico = semestreAcademico;
	}
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "SemestreAcademico")
	public Set<Docente> getDocentes() {
		return this.docentes;
	}

	public void setDocentes(Set<Docente> docentes) {
		this.docentes = docentes;
	}

}
