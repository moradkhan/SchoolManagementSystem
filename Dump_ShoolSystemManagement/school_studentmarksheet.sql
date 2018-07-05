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
-- Table structure for table `studentmarksheet`
--

DROP TABLE IF EXISTS `studentmarksheet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `studentmarksheet` (
  `Student_Roll_Number` int(11) NOT NULL,
  `Student_Name` varchar(50) DEFAULT NULL,
  `Student_Father_Name` varchar(50) DEFAULT NULL,
  `Student_Class` varchar(50) DEFAULT NULL,
  `Class_Section` varchar(50) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `Bangla` int(11) DEFAULT NULL,
  `English` int(11) DEFAULT NULL,
  `Math` int(11) DEFAULT NULL,
  `Biology` int(11) DEFAULT NULL,
  `History` int(11) DEFAULT NULL,
  `Social_Science` int(11) DEFAULT NULL,
  `General_Science` int(11) DEFAULT NULL,
  `Physics` int(11) DEFAULT NULL,
  `Chemistry` int(11) DEFAULT NULL,
  `Total_Marks` int(11) DEFAULT NULL,
  `Average` double DEFAULT NULL,
  `Grade` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Student_Roll_Number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentmarksheet`
--

LOCK TABLES `studentmarksheet` WRITE;
/*!40000 ALTER TABLE `studentmarksheet` DISABLE KEYS */;
INSERT INTO `studentmarksheet` VALUES (101,'Morad','Amir ali','One','Blue','2017-12-08',50,50,60,60,60,60,60,50,85,535,59,'B');
/*!40000 ALTER TABLE `studentmarksheet` ENABLE KEYS */;
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
