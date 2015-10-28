package escola.musica.bean;

import javax.faces.bean.ManagedBean;
import escola.musica.modelo.Curso;

@ManagedBean
public class CursoBean {

	//Instanciando um novo curso
	private Curso curso = new Curso();

	
	//Getters e Setters
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}
