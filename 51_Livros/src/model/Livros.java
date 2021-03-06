package model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "livros")
public class Livros {

	// for QueryBuilder to be able to find the fields
	public static final String ISBN_FIELD_NAME = "isbn";
	public static final String TITULO_FIELD_NAME = "titulo";
	public static final String EDICAO_FIELD_NAME = "edicao";
	public static final String ANO_FIELD_NAME = "ano";
	public static final String FORMATO_FIELD_NAME = "formato";
	public static final String PAGINAS_FIELD_NAME = "paginas";
	public static final String EDITORA_FIELD_NAME = "editora";
	public static final String AUTOR_FIELD_NAME = "autor";


	@DatabaseField(generatedId = true)
	private int id;

	@DatabaseField(columnName = ISBN_FIELD_NAME, canBeNull = false)
	private long isbn;

	@DatabaseField(columnName = TITULO_FIELD_NAME, canBeNull = false)
	private String titulo;

	// Exemplo //int isbn = 9786590053817;
	@DatabaseField(columnName = EDICAO_FIELD_NAME, canBeNull = false)
	private int edicao;

	@DatabaseField(columnName = ANO_FIELD_NAME, canBeNull = false)
	private int ano;

	@DatabaseField(columnName = FORMATO_FIELD_NAME, canBeNull = false)
	private String formato;

	@DatabaseField(columnName = PAGINAS_FIELD_NAME, canBeNull = false)
	private int paginas;

	@DatabaseField(columnName = EDITORA_FIELD_NAME, canBeNull = false)
	private String editora;

	@DatabaseField(columnName = AUTOR_FIELD_NAME, canBeNull = false)
	private String autor;


	
	public int getId() {
		return id;
	}	
	
	/**
	 * @return the isbn
	 */
	public long getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the edicao
	 */
	public int getEdicao() {
		return edicao;
	}

	/**
	 * @param edicao the edicao to set
	 */
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	/**
	 * @return the ano
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * @param ano the ano to set
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}

	/**
	 * @return the formato
	 */
	public String getFormato() {
		return formato;
	}

	/**
	 * @param formato the formato to set
	 */
	public void setFormato(String formato) {
		this.formato = formato;
	}

	/**
	 * @return the paginas
	 */
	public int getPaginas() {
		return paginas;
	}

	/**
	 * @param paginas the paginas to set
	 */
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	/**
	 * @return the editora
	 */
	public String getEditora() {
		return editora;
	}

	/**
	 * @param editora the editora to set
	 */
	public void setEditora(String editora) {
		this.editora = editora;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Livros() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Livros(long isbn, String titulo, int edicao, int ano, String formato, int paginas, String editora,
			String autor) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.edicao = edicao;
		this.ano = ano;
		this.formato = formato;
		this.paginas = paginas;
		this.editora = editora;
		this.autor = autor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Livros [isbn=" + isbn + ", titulo=" + titulo + ", edicao=" + edicao + ", ano=" + ano + ", formato="
				+ formato + ", paginas=" + paginas + ", editora=" + editora + ", autor=" + autor + ", getIsbn()="
				+ getIsbn() + ", getTitulo()=" + getTitulo() + ", getEdicao()=" + getEdicao() + ", getAno()=" + getAno()
				+ ", getFormato()=" + getFormato() + ", getPaginas()=" + getPaginas() + ", getEditora()=" + getEditora()
				+ ", getAutor()=" + getAutor() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
