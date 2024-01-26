package Week06;

public class Answer1 {
	public static void dbWork(DataAccessObject db) {
		db.select();
		db.insert();
		db.update();
		db.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDB());
		dbWork(new MySqlDB());
	}
}
