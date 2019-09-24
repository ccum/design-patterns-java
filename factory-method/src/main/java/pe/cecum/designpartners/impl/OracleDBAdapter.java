package pe.cecum.designpartners.impl;

import java.sql.Connection;

import pe.cecum.designpartners.IDBAdapter;

public class OracleDBAdapter  implements IDBAdapter{
	
	private static final String DB_PROPERTIES = "META-INF/DBOracle.properties";
	private static final String DB_SERVICE_PROP = "service";
	private static final String DB_HOST_PROP = "host";
	private static final String DB_PASSWORD_PROP="password";
	private static final String DB_PORT_PROP = "port";
	private static final String DB_USER_PROP = "user";
	
	static {
		try {
			//new OracleDriver();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	@Override
	public Connection getConection() {
		// TODO Auto-generated method stub
		return null;
	}

}
