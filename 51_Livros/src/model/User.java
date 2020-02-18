package model;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "user")

public class User {

	// for QueryBuilder to be able to find the fields
	public static final String LOGIN_FIELD_NAME = "login";
	public static final String SENHA_FIELD_NAME = "senha";
	public static final String EMAIL_FIELD_NAME = "email";
	public static final String NOME_FIELD_NAME = "nome";
	public static final String CPF_FIELD_NAME = "cpf";
	public static final String UNP_FIELD_NAME = "user_num_perm";
	public static final String LIVROS_FIELD_NAME = "livros";
	
	@DatabaseField(generatedId = true)
	private int id;

	@DatabaseField(columnName = LOGIN_FIELD_NAME, canBeNull = false)
	private String login;

	@DatabaseField(columnName = SENHA_FIELD_NAME, canBeNull = false)
	private String senha;

	@DatabaseField(columnName = EMAIL_FIELD_NAME, canBeNull = false)
	private String email;

	@DatabaseField(columnName = NOME_FIELD_NAME, canBeNull = false)
	private String nome;

	@DatabaseField(columnName = CPF_FIELD_NAME, canBeNull = false, unique = true)
	private String cpf;
	
	@DatabaseField(columnName = UNP_FIELD_NAME)
	private int user_num_perm;	
	
	@DatabaseField(columnName = LIVROS_FIELD_NAME, canBeNull = true, dataType=DataType.SERIALIZABLE)
	private Livros livros[] = new Livros[10];	

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
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

	public User(String login, String senha, String email, String nome, String cpf) {
		super();
		this.login = login;
		this.senha = senha;
		this.email = email;
		this.nome = nome;
		this.cpf = cpf;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [login=" + login + ", senha=" + senha + ", email=" + email + ", nome=" + nome + ", cpf=" + cpf
				+ "]";
	}

}
