package model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "perm")

public class Perm {

	public static final String NOME_PERM_FIELD_NAME = "nome_perm";
	public static final String NUM_PERM_FIELD_NAME = "num_perm";

	@DatabaseField(generatedId = true)
	private int id;

	@DatabaseField(columnName = NOME_PERM_FIELD_NAME, canBeNull = false)
	private String nome_perm;

	@DatabaseField(columnName = NUM_PERM_FIELD_NAME, canBeNull = false)
	private int num_perm;

	/**
	 * @return the nome_perm
	 */
	public String getNome_perm() {
		return nome_perm;
	}

	/**
	 * @param nome_perm the nome_perm to set
	 */
	public void setNome_perm(String nome_perm) {
		this.nome_perm = nome_perm;
	}

	/**
	 * @return the num_perm
	 */
	public int getNum_perm() {
		return num_perm;
	}

	/**
	 * @param num_perm the num_perm to set
	 */
	public void setNum_perm(int num_perm) {
		this.num_perm = num_perm;
	}

	public Perm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perm(String nome_perm, int num_perm) {
		super();
		this.nome_perm = nome_perm;
		this.num_perm = num_perm;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Perm [nome_perm=" + nome_perm + ", num_perm=" + num_perm + ", getNome_perm()=" + getNome_perm()
				+ ", getNum_perm()=" + getNum_perm() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
