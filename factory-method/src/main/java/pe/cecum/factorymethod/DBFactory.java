package pe.cecum.factorymethod;

import java.util.Properties;

import pe.cecum.factorymethod.impl.MySQLDBAdapter;
import pe.cecum.factorymethod.impl.OracleDBAdapter;
import pe.cecum.factorymethod.util.PropertiesUtil;

public class DBFactory {

	private static final String DB_FACTORY_PROPERTY_URL = "META- INF/DBFactory.properties";
	private static final String DEFAULT_DB_CLASS_PROP = "defaultDBClass";
	
	public static IDBAdapter getDBAdapter(DBType dbType) {
		switch (dbType) {
		case MySQL:
			return new MySQLDBAdapter();

		case Oracle:
			return new OracleDBAdapter();
		default:
			throw new IllegalArgumentException("no soportado");
		}
		
	}
	
	public static IDBAdapter getDefaultDBAdapter() {
		try {
			Properties pro = PropertiesUtil.loadProperty(DB_FACTORY_PROPERTY_URL);
			String defaultDBClass = pro.getProperty(DEFAULT_DB_CLASS_PROP);
			System.out.println("DefaultDBClass ==> " + defaultDBClass);
			return (IDBAdapter) Class.forName(defaultDBClass).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
