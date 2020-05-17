import java.sql.*;


public class PaperReviewDriver{
	public static void main(String[] args) {
		
	
		try {
			//1. get a connection to database
			Connection myConn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/paper", "root", "Vera@2111996");
		
			//2. Create a statement 
			Statement myStmt = myConn1.createStatement();
			//3. Execute SQL query 
			ResultSet myRs = myStmt.executeQuery("select p_id, paper_title, paper_abstract, emailaddr, firstname, lastname from author inner join paper on author.a_id = paper.a_id");
			//4. Process the result set 
			while (myRs.next()) {
				System.out.println(myRs.getInt("p_id") + ", " + myRs.getString("paper_title") + ", " + myRs.getString("paper_abstract") + ", " + myRs.getString("emailaddr") + ", " + myRs.getString("firstname") + ", " + myRs.getString("lastname") + ", " );
			}
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
		
	System.out.println(" ");
	
		try {
			//1. get a connection to database
			Connection myConn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/paper", "root", "Vera@2111996");
		
			//2. Create a statement 
			Statement myStmt = myConn1.createStatement();
			//3. Execute SQL query 
			ResultSet myRs = myStmt.executeQuery("select r_id, reviewer_id, originality_score, readability_score, merit_score, relevance_score, recommendation from paper inner join review on paper.p_id = review.p_id");
			//4. Process the result set 
			while (myRs.next()) {
				System.out.println(myRs.getInt("r_id") + ", " + myRs.getInt("reviewer_id") + ", " + myRs.getInt("originality_score") + ", " + myRs.getInt("readability_score") + ", " + myRs.getInt("merit_score") + ", " + myRs.getInt("relevance_score") + ", " + myRs.getString("recommendation") + ", " );
			}
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
	
		
		System.out.println(" ");
		
		try {
			//1. get a connection to database
			Connection myConn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/paper", "root", "Vera@2111996");
		
			//2. Create a statement 
			Statement myStmt = myConn1.createStatement();
			//3. Execute SQL query 
			ResultSet myRs = myStmt.executeQuery("select count(*) from paper");
			//4. Process the result set 
			while (myRs.next()) {
				System.out.println("There are "+ myRs.getInt("count(*)")+" papers submitted.");
			}
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
		
			
	}
}
