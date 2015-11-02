package escola.musica.bean;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import escola.musica.modelo.Curso;
import escola.musica.modelo.TipoCurso;

//ManegedBean declara que esta classe é Bean
@ManagedBean
//SessionScoped significa que os dados desta classe permanecerão ativos
//até o final da seção do usuário.
@SessionScoped
public class CursoBean {

	//Instanciando um novo curso
	private Curso curso = new Curso();
	
	//Criando tipos que será uma lista com os tipos listados no enumTipoCurso
	//Arrays.asList esta convertendo um array de tipos de cursos em lista
	private List<TipoCurso> tipos = Arrays.asList(TipoCurso.values());

	//Criando lista de cursos, que armazenará os cursos já cadastrados
	private List<Curso> cursos = new ArrayList<Curso>();
	
	//Método salvar, por enquanto só apresenta a mensagem "Curso salvo com Sucesso"
	public String salvar(){
		//Adiciona o curso cadastrado na lista de cursos
		cursos.add(curso);
		//Cria uma nova instância de cursos para limpar o formulário
		curso = new Curso();
		//redireciona para a página curso_lista
		return "curso_lista?faces-redirect=true";
	}
	
	//método que retorna a data atual
	public String getDataAtual(){
		return new SimpleDateFormat("dd/MM/yyyy").format(new Date());
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
