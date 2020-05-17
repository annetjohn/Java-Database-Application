import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
public class PaperReviewDriver {
static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
static final String DB_URL = "jdbc:mysql://localhost/paper";
static final String USER = "root";
static final String PASS = "Vera@2111996";
public static void main(String[] args) {
// TODO Auto-generated method stub

System.out.println("1.Get paper details by author id");
System.out.println("2.Get paper reviews by paper id");
System.out.println("3.Get Number of papers submitted");
System.out.println("4.Create new Paper submission");
System.out.println("5.Delete Author by Author Id");
System.out.println("Please select your option: ");
PaperReviewDriver paperReviewObject=new PaperReviewDriver();
Scanner scanner = new Scanner(System.in);
int option=scanner.nextInt();
switch(option) {
case 1:{
System.out.println("Enter Author id: ");
int author_id=scanner.nextInt();
paperReviewObject.getPaperDetailsByPaperId(author_id);
break;
}
case 2:{
System.out.println("Enter Paper id: ");
int paper_id=scanner.nextInt();
paperReviewObject.getAllReviewsByPaperId(paper_id);
break;
}
case 3:{
paperReviewObject.getCountOfPapersSubmitted();
break;
}
case 4:{
System.out.println("Enter First Name of Author:");
String first_name=scanner.next();
System.out.println("Enter Last Name of Author:");
String last_name=scanner.next();
System.out.println("Enter Email Address:");
String email=scanner.next();
System.out.println("Enter Abstract of Paper:");
String abstracts=scanner.next();
System.out.println("Enter Title of Paper:");
String title=scanner.next();
System.out.println("Enter File Name");
String file_name=scanner.next();
paperReviewObject.createPaperSubmission(first_name,last_name,email,abstracts,title,file_name);
break;
}
case 5:{
System.out.println("Enter Author id:");
int author_id=scanner.nextInt();
paperReviewObject.deleteAuthorByAuthorId(author_id);
break;

}
default:{
System.out.println("Not a valid option");
break;
}
}
scanner.close();
}
public void getPaperDetailsByPaperId(int author_id) {
Connection conn = null;
  Statement stmt = null;
  try {
 System.out.println("Connecting to database...");
 conn = DriverManager.getConnection(DB_URL,USER,PASS);
 System.out.println("Creating statement...");
     stmt = conn.createStatement();
     String sql;
     sql = "SELECT Paper.p_id,Paper.paper_title,Paper.paper_abstract,Author.EmailAddr,Author.FirstName,Author.LastName FROM Author INNER JOIN Paper on Author.a_id=Paper.a_id where Author.a_id="+author_id +";";   
     ResultSet rs = stmt.executeQuery(sql);
     while(rs.next()) {
     int p_id=rs.getInt("p_id");
     String paper_title=rs.getString("paper_title");
     String paper_abstracts=rs.getString("paper_abstract");
     String EmailAddr=rs.getString("EmailAddr");
     String FirstName=rs.getString("FirstName");
     String LastName=rs.getString("LastName");
     System.out.println("paper id: "+p_id+"\t"+"title: "+paper_title+"\t"+"abstract: "+paper_abstracts+"\t"+"email address: "+EmailAddr+"\t"+"first_name: "+FirstName+"\t"+"last_name: "+LastName);
     }
     rs.close();
     stmt.close();
     conn.close();
  }
  catch(SQLException se) {
  System.out.print("Error Occured");
  }

}
public void getAllReviewsByPaperId(int paper_id) {
Connection conn = null;
  Statement stmt = null;
  try {
 System.out.println("Connecting to database...");
 conn = DriverManager.getConnection(DB_URL,USER,PASS);
 System.out.println("Creating statement...");
     stmt = conn.createStatement();
     String sql;
     sql = "SELECT reviewer_id,readability_score,originality_score,relevance_score,merit_score FROM Review where p_id="+paper_id+";";
     ResultSet rs = stmt.executeQuery(sql);
     while(rs.next()) {
     int reviewer_id=rs.getInt("reviewer_id");
     int readability_score=rs.getInt("readability_score");
     int originality_score=rs.getInt("originality_score");
     int relevance_score=rs.getInt("relevance_score");
     int merit_score=rs.getInt("merit_score");
     System.out.println("reviewer: "+reviewer_id+"\t"+"readability: "+readability_score+"\t"+"originality: "+originality_score+"\t"+"relevance: "+relevance_score+"\t"+"merit_score: "+merit_score);
     }
     rs.close();
     stmt.close();
     conn.close();
  }
  catch(SQLException se) {
  System.out.print("Error Occured");
  }

}

public void getCountOfPapersSubmitted() {
Connection conn = null;
  Statement stmt = null;
  try {
 System.out.println("Connecting to database...");
 conn = DriverManager.getConnection(DB_URL,USER,PASS);
 System.out.println("Creating statement...");
     stmt = conn.createStatement();
     String sql;
     sql = "select Count(*) from Paper;";
     ResultSet rs = stmt.executeQuery(sql);
     while(rs.next()) {
     int count=rs.getInt("Count(*)");
     System.out.println("No of papers submitted: "+count);
     }
     rs.close();
     stmt.close();
     conn.close();
  }
  catch(SQLException se) {
  System.out.print("Error Occured");
  }

}
public void createPaperSubmission(String FirstName,String LastName,String EmailAddr,String paper_abstract,String paper_title,String paper_filename) {
Connection conn = null;
  Statement stmt = null;
  try {
 System.out.println("Connecting to database...");
 conn = DriverManager.getConnection(DB_URL,USER,PASS);
 System.out.println("Creating statement...");
     stmt = conn.createStatement();
     String sql;
     sql = "INSERT INTO Author (LastName, FirstName, EmailAddr) values( '"+LastName+"', '"+FirstName+"', '"+EmailAddr+"')";
     stmt.execute(sql);
     sql="SELECT * FROM Author where FirstName='"+FirstName+"' AND LastName='"+LastName+"' AND EmailAddr='"+EmailAddr+"';";
     ResultSet rs= stmt.executeQuery(sql);
     int author_id=1;
     while(rs.next()) {
     author_id=rs.getInt("a_id");
     }
     sql="INSERT INTO Paper (paper_abstract, paper_title, paper_filename ,a_id) values( '"+paper_abstract+"', '"+paper_title+"', '"+paper_filename+"',"+author_id+");";
     stmt.execute(sql);
     System.out.println("Inserted into tables successfully");
     stmt.close();
     conn.close();
  }
  catch(SQLException se) {
  System.out.print("Error Occured");
  }

}
public void deleteAuthorByAuthorId(int author_id) {
Connection conn = null;
  Statement stmt = null;
  try {
  int authorIsDeleted=0;
 System.out.println("Connecting to database...");
 conn = DriverManager.getConnection(DB_URL,USER,PASS);
 System.out.println("Creating statement...");
     stmt = conn.createStatement();
     String sql;

     sql = "SELECT a_id from author where a_id='"+author_id+"';";
     ResultSet rs = stmt.executeQuery(sql);
     while(rs.next()) {
     
     if (author_id==rs.getInt("a_id"))
     {
     sql = "DELETE FROM author WHERE a_id='"+author_id+"';";
     stmt.execute(sql);
     sql = "DELETE FROM paper WHERE a_id='"+author_id+"';";
     stmt.execute(sql);
     System.out.println("Deleted row successfully");
     authorIsDeleted=1;
     break;
     }
     }
     if (authorIsDeleted!=1)
     {
     System.out.println("AuthorId is not in the List");
     }
     stmt.close();
     conn.close();
  }
  catch(SQLException se) {
  System.out.print("Error Occured");
  System.out.println(se.getMessage());;
  }

}



}