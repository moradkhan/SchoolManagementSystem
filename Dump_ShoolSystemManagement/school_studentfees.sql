CREATE DATABASE  IF NOT EXISTS `school` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `school`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: school
-- ------------------------------------------------------
-- Server version	5.7.15-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `studentfees`
--

DROP TABLE IF EXISTS `studentfees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `studentfees` (
  `Student_Roll_Number` int(11) NOT NULL,
  `Student_Name` varchar(50) DEFAULT NULL,
  `Student_Father_Name` varchar(50) DEFAULT NULL,
  `Student_Class` varchar(50) DEFAULT NULL,
  `Class_Section` varchar(50) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `Fees_Balance` double DEFAULT NULL,
  `Back_Amount` double DEFAULT NULL,
  `Monthly_Fees` double DEFAULT NULL,
  `Paid` double DEFAULT NULL,
  `Arears` double DEFAULT NULL,
  `Fee_Pay_Date` date DEFAULT NULL,
  `Month` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Student_Roll_Number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentfees`
--

LOCK TABLES `studentfees` WRITE;
/*!40000 ALTER TABLE `studentfees` DISABLE KEYS */;
INSERT INTO `studentfees` VALUES (101,'steyhtj','ghrtjh','One','Green','2017-12-08',1000,300,800,700,100,'2017-12-08','January'),(102,'steyhtj','ghrtjh','One','Green','2017-12-08',2000,1000,800,1000,-200,'2017-12-08','January'),(103,'ghrtj','ffdgh','Four','Green','2017-12-07',1000,200,800,800,0,'2017-12-07','January'),(104,'arty','t3y','Three','Blue','2017-12-21',1500,700,800,800,0,'2017-12-21','January');
/*!40000 ALTER TABLE `studentfees` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-02  1:51:04
