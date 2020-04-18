# database_assignment
SQL assignment - CS 623 - using basic SQL queries to create a 'paper review database'


# creating a database with SQL queries for a 'paper review database':

![](ER%20DIAGRAM%203.34.pdf)

step 1: first download mySQL Installer (only windows) 
        link : https://dev.mysql.com/downloads/installer/
        
step 2: then click on the downloaded file and then proceed to download the file step by step.

step 3: Using the mySQL command line client we start creating the database.

step 4: create a database. 

```mySQL
CREATE DATABASE database_name;
```
Step 5: then use that database to create tables.

```mySQL
USE database_name;
```
Step 6: creation of tables: For example,

```mySQL
CREATE TABLE table_name                         #creating tables and their columns with their respective data types 
    -> (
    -> column_num1     VARCHAR (320) NOT NULL,    #email address of the author
    -> column_num2    VARCHAR (150) NOT NULL,    #first name of the author
    -> column_num3      VARCHAR (150) NOT NULL,    #last name of the author
    -> PRIMARY KEY   (column_num1)                #make the EmailAddr the primary id
    -> );
```

Step 7: a) For each table created, columns are to be populated with data.

```mySQL
INSERT INTO table_name (column_num1, column_num2, column_num3) VALUES            #populating data using INSERT command
    -> ('jbutt@gmail.com', 'James', 'Butt'),
    -> ('kris@gmail.com', 'Kris', 'Marrier'),
    -> ('art@venere.org', 'Art', 'Venere'),
    -> ('lpaprocki@hotmail.com', 'Lenna', 'Paprocki'),
    -> ('amaclead@gmail.com', 'Abel', 'Maclead');
```

        b) to display the created table.
       
        SElECT * FROM table_name;                  # using the * selects the whole data of the particular table
        +-----------------------+-----------+----------+
        | EmailAddr             | FirstName | LastName |
        +-----------------------+-----------+----------+
        | amaclead@gmail.com    | Abel      | Maclead  |
        | art@venere.org        | Art       | Venere   |
        | jbutt@gmail.com       | James     | Butt     |
        | kris@gmail.com        | Kris      | Marrier  |
        | lpaprocki@hotmail.com | Lenna     | Paprocki |
        +-----------------------+-----------+----------+
      
 # Note: 
 1) if there is any column to be added in the table, use this commmand:
 
 ```
 ALTER TABLE table_name ADD COLUMN column_num4 int(10) unsigned NOT NULL AFTER column_name3;
 ```
 
 ```
  SElECT * FROM table_name;
+-----------------------+---------------+-------------+-------------+
| column_num1           | column_num2   | column_num3 | column_num4 |
+-----------------------+-----------+----------+--------------------+
| amaclead@gmail.com    | Abel          | Maclead     |  1          |
| art@venere.org        | Art           | Venere      |  2          |
| jbutt@gmail.com       | James         | Butt        |  3          |
| kris@gmail.com        | Kris          | Marrier     |  4          |
| lpaprocki@hotmail.com | Lenna         | Paprocki    |  5          |
+-----------------------+-----------+----------+--------------------+
```
2) if the column wants to be dropped, use this command:

```
ALTER TABLE table_name DROP column_num4;
```
