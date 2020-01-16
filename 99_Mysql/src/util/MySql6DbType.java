package util;

import com.j256.ormlite.db.MysqlDatabaseType;

/**
 * Created by Hoang on 2016-05-21.
 */
public class MySql6DbType extends MysqlDatabaseType {
    @Override
    protected String getDriverClassName() {
        return "com.mysql.cj.jdbc.Driver";
    }

    @Override
    public void loadDriver() {
        // Do nothing:
        // Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'.
        // The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.
    }
}