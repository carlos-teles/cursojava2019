package controller;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import model.*;

public class DropTables {

	// we are using the in-memory H2 database
	//private final static String DATABASE_URL = "jdbc:h2:mem:account";
	private final static String DATABASE_URL = 
			"jdbc:mysql://localhost:3306/aula24?useTimezone=true&serverTimezone=UTC";
	
	private Dao<Livros, Integer> livrosDao;
	private Dao<User, Integer> userDao;
	private Dao<Perm, Integer> permDao;
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		new DropTables().doMain(args);
	}
	private void doMain(String[] args) throws Exception {
		ConnectionSource connectionSource = null;
		try {
			// create our data-source for the database
			connectionSource = new JdbcConnectionSource(DATABASE_URL, "root", "alunolab");
			// setup our database and DAOs
			setupDatabase(connectionSource);
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
	private void setupDatabase(ConnectionSource connectionSource) throws Exception {
		livrosDao = DaoManager.createDao(connectionSource, Livros.class);
		userDao = DaoManager.createDao(connectionSource, User.class);
		permDao = DaoManager.createDao(connectionSource, Perm.class);
		
		// if you need to create the table
		TableUtils.dropTable(connectionSource, Livros.class, true);
		TableUtils.dropTable(connectionSource, User.class, true);
		TableUtils.dropTable(connectionSource, Perm.class, true);
		
	}	
}
