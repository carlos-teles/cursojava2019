package model;

public class Pessoa {
	private String nome;
	private String rg;
	private String cpf;
	private String telefone;
	private String email;
	public String nomepublico;

	/**
	 * @return the nomepublico
	 */
	public String getNomepublico() {
		return nomepublico;
	}

	/**
	 * @param nomepublico the nomepublico to set
	 */
	public void setNomepublico(String nomepublico) {
		this.nomepublico = nomepublico;
	}

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
	 * @return the rg
	 */
	public String getRg() {
		return rg;
	}

	/**
	 * @param rg the rg to set
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public Pessoa() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Pessoa(String nome, String rg, String cpf, String telefone) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	
	public Pessoa(String nome, String rg, String cpf, String telefone, String email) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
	}

}
