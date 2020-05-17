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
-- Table structure for table `review`
--

DROP TABLE IF EXISTS `review`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `review` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `PaperId` int NOT NULL,
  `ReviewerId` int NOT NULL,
  `Originality_Score` decimal(5,2) NOT NULL,
  `Readability_Score` decimal(5,2) NOT NULL,
  `Merit_Score` decimal(5,2) NOT NULL,
  `Relevance_Score` decimal(5,2) NOT NULL,
  `Recommendation` varchar(500) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `review`
--

LOCK TABLES `review` WRITE;
/*!40000 ALTER TABLE `review` DISABLE KEYS */;
INSERT INTO `review` VALUES (1,71147,20,90.45,92.89,89.01,92.30,'To begin with, in order to reduce the impact of a given issue, Sony Computer Entertainment (SCE) needs to conduct a proper analysis and outline the best course of actions.'),(2,71345,21,95.45,96.89,90.01,92.45,'All in all, when the policy is changed and all employees are fully aware of it, it is of utmost importance to create a proper marketing campaign, especially on the web due to the fact that the majority of people spend their free time on the Internet.'),(3,71675,22,87.90,87.67,81.01,82.45,'The marketing campaign will feature new innovative changes regarding customer service, as well as, how these new systems are far more superior from those that are sold by their main competitors.'),(4,71265,23,77.99,75.02,72.87,75.00,'In recent years,a Japanese video game company, generated stable income and is generally considered to be a successful company that has a positive public image.'),(5,71879,24,87.89,95.12,92.37,95.00,' the result will not only eliminate the problem, but will guide the company towards new customer, beneficial outcomes, which is essentially the core idea behind this recommendation.');
/*!40000 ALTER TABLE `review` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-20 18:55:02
