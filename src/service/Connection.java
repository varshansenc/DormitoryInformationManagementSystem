package service;

public interface Connection{
	java.sql.Connection GetConnection();
	void close();
}
