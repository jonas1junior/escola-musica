package escola.musica.modelo;

public enum TipoCurso {

	//Declara��o dos itens do enum utilizando construtor para vincular o conte�do com sua respectiva
	//apresenta��o ao usu�rio final
	CORDAS("Cordas"), MADEIRAS("Madeiras"), METAIS("Metais"), PERCUSSAO("Percuss�o");

	
	//Vari�vel vai armazenar qual string ser� apresentada ao usu�rio final
	private String label;

	
	//Construtor da classe
	private TipoCurso(String label) {
		this.label = label;
	}

	
	//Getters e Setters
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
