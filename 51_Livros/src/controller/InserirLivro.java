package controller;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import model.Livros;
import model.Perm;
import model.User;
public class InserirLivro {

	// we are using the in-memory H2 database
	//private final static String DATABASE_URL = "jdbc:h2:mem:account";
	private final static String DATABASE_URL = 
			"jdbc:mysql://localhost:3306/aula24?useTimezone=true&serverTimezone=UTC";
	
	private Dao<Livros, Integer> livrosDao;
	private Dao<User, Integer> userDao;
	private Dao<Perm, Integer> permDao;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		new InserirLivro().doMain(args);
	}
	private void doMain(String[] args) throws Exception {
		ConnectionSource connectionSource = null;
		try {
			// create our data-source for the database
			connectionSource = new JdbcConnectionSource(DATABASE_URL, "root", "alunolab");
			// setup our database and DAOs
			escreveLivro(connectionSource);
			System.out.println("\n\nParece que tudo deu certo... :)\n\n");
		} finally {
			// destroy the data source which should close underlying connections
			if (connectionSource != null) {
				connectionSource.close();
			}
		}
	}	
	
	/**
	 * Setup our database and DAOs
	 */
	private void escreveLivro(ConnectionSource connectionSource) throws Exception {
		livrosDao = DaoManager.createDao(connectionSource, Livros.class);
		userDao = DaoManager.createDao(connectionSource, User.class);
		permDao = DaoManager.createDao(connectionSource, Perm.class);
		
		String name = "Jim Coakley";
		Livros livros = new Livros(9788565484596L, "Livros de Magia", 1, 1987, "Fisico", 203, "Panini", "Neil Gaiman");
		
		// persist the account object to the database
		livrosDao.create(livros);
		int id = livros.getId();
		System.out.println(id);
		//verifyDb(id, livros);

		// assign a password
		//account.setPassword("_secret");
		// update the database after changing the object
		//accountDao.update(account);
		//verifyDb(id, account);

	}	

}
