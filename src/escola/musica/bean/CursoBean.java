package escola.musica.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import escola.musica.modelo.Curso;
import escola.musica.modelo.TipoCurso;

//ManegedBean declara que esta classe � Bean
@ManagedBean
//SessionScoped significa que os dados desta classe permanecer�o ativos
//at� o final da se��o do usu�rio.
@SessionScoped
public class CursoBean {

	//Instanciando um novo curso
	private Curso curso = new Curso();
	
	//Criando tipos que ser� uma lista com os tipos listados no enumTipoCurso
	//Arrays.asList esta convertendo um array de tipos de cursos em lista
	private List<TipoCurso> tipos = Arrays.asList(TipoCurso.values());

	//Criando lista de cursos, que armazenar� os cursos j� cadastrados
	private List<Curso> cursos = new ArrayList<Curso>();
	
	//M�todo salvar, por enquanto s� apresenta a mensagem "Curso salvo com Sucesso"
	public String salvar(){
		//Adiciona o curso cadastrado na lista de cursos
		cursos.add(curso);
		//Cria uma nova inst�ncia de cursos para limpar o formul�rio
		curso = new Curso();
		//redireciona para a p�gina curso_lista
		return "curso_lista?faces-redirect=true";
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

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
	

}
