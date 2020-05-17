# database assignment Project - part 2
JDBC JAVA application - PaperReviewDatabase

# initalization 

Step 1: get a connection to database
Step 2: Create a statement 
Step 3: Execute SQL query 
Step 4: Process the result set 

# queries executed: 

1. Query 1: paper details by the authors primary key
 
 ```mySQL
 SELECT Paper.p_id,Paper.paper_title,Paper.paper_abstract,Author.EmailAddr,Author.FirstName,Author.LastName FROM Author INNER JOIN Paper on Author.a_id=Paper.a_id where Author.a_id="+author_id +";
 ```
Doing an inner join between the two tables author and paper and getting the following data output: 
 p_id, paper_title, paper_abstract, emailaddr, firstname, lastname

2. Query 2: review for a paper by paper's id

```mySQL
SELECT reviewer_id,readability_score,originality_score,relevance_score,merit_score FROM Review where p_id="+paper_id+";
```

3. Query 3: count of all papers submitted

```mySQL
select Count(*) from Paper;
```
Outputting the count of papers submitted.

4. Query 4: insert data into paper table and author table 

```mySQL
"INSERT INTO Author (LastName, FirstName, EmailAddr) values( '"+LastName+"', '"+FirstName+"', '"+EmailAddr+"')";
"SELECT * FROM Author where FirstName='"+FirstName+"' AND LastName='"+LastName+"' AND EmailAddr='"+EmailAddr+"';";
INSERT INTO Paper (paper_abstract, paper_title, paper_filename ,a_id) values( '"+paper_abstract+"', '"+paper_title+"', '"+paper_filename+"',"+author_id+");";
```

5. Query 5: delete the row from the authors table by author id 

```mySQL
"DELETE FROM author WHERE a_id='"+author_id+"';";
"DELETE FROM paper WHERE a_id='"+author_id+"';";
```
