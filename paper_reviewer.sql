-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: paper
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `reviewer`
--

DROP TABLE IF EXISTS `reviewer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reviewer` (
  `EmailAddr` varchar(320) NOT NULL,
  `FirstName` varchar(150) NOT NULL,
  `LastName` varchar(150) NOT NULL,
  `PhoneNum` varchar(50) NOT NULL,
  `AuthorFeedback` varchar(300) NOT NULL,
  `CommiteeFeedback` varchar(300) NOT NULL,
  `Affiliation` varchar(20) NOT NULL,
  PRIMARY KEY (`EmailAddr`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reviewer`
--

LOCK TABLES `reviewer` WRITE;
/*!40000 ALTER TABLE `reviewer` DISABLE KEYS */;
INSERT INTO `reviewer` VALUES ('corygibes@gmail.com','Cory','Gibes','9787532222','Average','Work on the Research methodology','IEEE'),('elza@yahoo.com','Elza','Lipke','9737963667','Excellent','Work on the reference part of the paper','ACM'),('lai.gato@gato.org','Lai','Gato','9534876696','Good','Be more specific on the conclusions part','ACM'),('mmunns@cox.net','Myra','Munns','9696196991','good work','work on the conditions offered','IEEE'),('tshields@gmail.com','Tyra','Shields','9856438920','Average','Recommendations should be specified','ACM');
/*!40000 ALTER TABLE `reviewer` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-20 18:55:03
