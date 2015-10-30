package escola.musica.bean;

import java.util.Arrays;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import escola.musica.modelo.Curso;
import escola.musica.modelo.TipoCurso;

@ManagedBean
public class CursoBean {

	//Instanciando um novo curso
	private Curso curso = new Curso();
	
	//Criando tipos que será uma lista com os tipos listados no enumTipoCurso
	//Arrays.asList esta convertendo um array de tipos de cursos em lista
	private List<TipoCurso> tipos = Arrays.asList(TipoCurso.values());

	//Método salvar, por enquanto só apresenta a mensagem "Curso salvo com Sucesso"
	public void salvar(){
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Curso salvo com sucesso"));
	}
	
	//Getters e Setters
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public List<TipoCurso> getTipos() {
		return tipos;
	}

	public void setTipos(List<TipoCurso> tipos) {
		this.tipos = tipos;
	}
	
	

}
