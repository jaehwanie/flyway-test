import org.flywaydb.core.Flyway;

public class FlywayMain {

	public static void main(String[] args) {
		String db = "test3";
		// 해당 DB연결 후 migration
		Flyway flyway = Flyway.configure().dataSource("jdbc:mysql://127.0.0.1:3306/"+db,"root","root").load();
		flyway.migrate();
	}

}