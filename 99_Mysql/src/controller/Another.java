package controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;


import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.misc.TransactionManager;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.SelectArg;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import model.Account;

public class Another {

	// we are using the in-memory H2 database
	//private final static String DATABASE_URL = "jdbc:h2:mem:account";
	private final static String DATABASE_URL = "jdbc:mysql://localhost:3306/aula16?useTimezone=true&serverTimezone=UTC";
	

	private Dao<Account, Integer> accountDao;

	public static void main(String[] args) throws Exception {
		// turn our static method into an instance of Main
		new Another().doMain(args);
	}	
	
	
	private void doMain(String[] args) throws Exception {
		ConnectionSource connectionSource = null;
		try {
			// create our data-source for the database
			connectionSource = new JdbcConnectionSource(DATABASE_URL, "root", "alunolab");
			// setup our database and DAOs
			setupDatabase(connectionSource);
			// read and write some data
			//readWriteData();
			// do a bunch of bulk operations
			//readWriteBunch();
			// show how to use the SelectArg object
			useSelectArgFeature();
			// show how to use the SelectArg object
			//useTransactions(connectionSource);
			System.out.println("\n\nIt seems to have worked\n\n");
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

		accountDao = DaoManager.createDao(connectionSource, Account.class);

		// if you need to create the table
		//TableUtils.createTable(connectionSource, Account.class);
	}	

	/**
	 * Example of created a query with a ? argument using the {@link SelectArg} object. You then can set the value of
	 * this object at a later time.
	 */
	private void useSelectArgFeature() throws Exception {

		String name1 = "foo";
		String name2 = "bar";
		String name3 = "baz";
		assertEquals(1, accountDao.create(new Account(name1)));
		assertEquals(1, accountDao.create(new Account(name2)));
		assertEquals(1, accountDao.create(new Account(name3)));

		QueryBuilder<Account, Integer> statementBuilder = accountDao.queryBuilder();
		SelectArg selectArg = new SelectArg();
		// build a query with the WHERE clause set to 'name = ?'
		statementBuilder.where().like(Account.NAME_FIELD_NAME, selectArg);
		PreparedQuery<Account> preparedQuery = statementBuilder.prepare();

		// now we can set the select arg (?) and run the query
		selectArg.setValue(name1);
		List<Account> results = accountDao.query(preparedQuery);
		assertEquals("Should have found 1 account matching our query", 1, results.size());
		assertEquals(name1, results.get(0).getName());

		selectArg.setValue(name2);
		results = accountDao.query(preparedQuery);
		assertEquals("Should have found 1 account matching our query", 1, results.size());
		assertEquals(name2, results.get(0).getName());

		selectArg.setValue(name3);
		results = accountDao.query(preparedQuery);
		assertEquals("Should have found 1 account matching our query", 1, results.size());
		assertEquals(name3, results.get(0).getName());
	}	
	
}
