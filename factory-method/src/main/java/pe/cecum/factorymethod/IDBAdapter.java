package pe.cecum.factorymethod;
import java.sql.Connection;

public interface IDBAdapter {
	
	public Connection getConection();
}
