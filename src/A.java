
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class A {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	Statement st=connection.createStatement();
	ResultSet rs =st.executeQuery("select * from Staff");
	while (rs.next()) {
		System.out.println(rs.getInt(1)+" "+rs.getString(2));
	}
}
}
