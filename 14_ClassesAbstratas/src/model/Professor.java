package model;

public class Professor extends Usuario {
	private String nome ;
	private String especialidade;
	private int matriculaProfessor;
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the especialidade
	 */
	public String getEspecialidade() {
		return especialidade;
	}
	/**
	 * @param especialidade the especialidade to set
	 */
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	/**
	 * @return the matriculaProfessor
	 */
	public int getMatriculaProfessor() {
		return matriculaProfessor;
	}
	/**
	 * @param matriculaProfessor the matriculaProfessor to set
	 */
	public void setMatriculaProfessor(int matriculaProfessor) {
		this.matriculaProfessor = matriculaProfessor;
	}
	
	public Professor() {
		// TODO Auto-generated constructor stub
		super();
	}
	public Professor(String login, String senha, int tipo, String nome,
			String especialidade, int matriculaProfessor) {
			super(login, senha, tipo);
			this.nome = nome;
			this.especialidade = especialidade;
			this.matriculaProfessor = matriculaProfessor;
	}	
		
	@Override
	public void mostrar() {
		System.out.println("Informações do Professor: ");
		System.out.println("Login: " + super.getLogin());
		System.out.println("Senha: *****");
		System.out.println("Matrícula: " + matriculaProfessor);
		System.out.println("Nome: " + nome);
		System.out.println("Especialidade: " + especialidade);
	}
}
