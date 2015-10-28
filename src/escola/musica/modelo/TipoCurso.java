package escola.musica.modelo;

public enum TipoCurso {

	//Declaração dos itens do enum utilizando construtor para vincular o conteúdo com sua respectiva
	//apresentação ao usuário final
	CORDAS("Cordas"), MADEIRAS("Madeiras"), METAIS("Metais"), PERCUSSAO("Percussão");

	
	//Variável vai armazenar qual string será apresentada ao usuário final
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
