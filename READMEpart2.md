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
 select p_id, paper_title, paper_abstract, emailaddr, firstname, lastname from author inner join paper on author.a_id = paper.a_id;
 ```
Doing an inner join between the two tables author and paper and getting the following data output: 
 p_id, paper_title, paper_abstract, emailaddr, firstname, lastname

2. Query 2: review for a paper by paper's id

```mySQL
select r_id, reviewer_id, originality_score, readability_score, merit_score, relevance_score, recommendation from paper inner join review on paper.p_id = review.p_id;
```
Doing an inner join between the two table review and paper to retrive all the data from review table.

3. Query 3: count of all papers submitted

```mySQL
select count(*) from paper;
```
Outputting the count of papers submitted.
