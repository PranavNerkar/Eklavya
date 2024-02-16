-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: eklavya
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `category` (
  `category_id` int NOT NULL AUTO_INCREMENT,
  `category_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `content`
--

DROP TABLE IF EXISTS `content`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `content` (
  `content_id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `description` varchar(500) DEFAULT NULL,
  `course_tutorid` int DEFAULT NULL,
  `video_id` int DEFAULT NULL,
  PRIMARY KEY (`content_id`),
  KEY `video_id_idx` (`video_id`),
  CONSTRAINT `video_id` FOREIGN KEY (`video_id`) REFERENCES `video` (`video_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `content`
--

LOCK TABLES `content` WRITE;
/*!40000 ALTER TABLE `content` DISABLE KEYS */;
/*!40000 ALTER TABLE `content` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `course` (
  `course_id` int NOT NULL AUTO_INCREMENT,
  `course_title` varchar(45) DEFAULT NULL,
  `course_description` varchar(500) DEFAULT NULL,
  `course_active` tinyint(1) DEFAULT '0',
  `category_id` int DEFAULT NULL,
  PRIMARY KEY (`course_id`),
  KEY `category_id_idx` (`category_id`),
  CONSTRAINT `category_id` FOREIGN KEY (`category_id`) REFERENCES `category` (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `course_tutor`
--

DROP TABLE IF EXISTS `course_tutor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `course_tutor` (
  `coursetutor_id` int NOT NULL AUTO_INCREMENT,
  `course_id` int DEFAULT NULL,
  `tut_id` int DEFAULT NULL,
  `course_price` decimal(10,2) DEFAULT NULL,
  `course_duration` decimal(4,2) DEFAULT NULL,
  `other_course_details` varchar(300) DEFAULT NULL,
  `flag` tinyint(1) DEFAULT NULL,
  `course_tutorcol` varchar(45) DEFAULT '0',
  PRIMARY KEY (`coursetutor_id`),
  KEY `course_id_idx` (`course_id`),
  KEY `tut_id_idx` (`tut_id`),
  CONSTRAINT `course_id` FOREIGN KEY (`course_id`) REFERENCES `course` (`course_id`),
  CONSTRAINT `tut_id` FOREIGN KEY (`tut_id`) REFERENCES `tutor` (`tut_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course_tutor`
--

LOCK TABLES `course_tutor` WRITE;
/*!40000 ALTER TABLE `course_tutor` DISABLE KEYS */;
/*!40000 ALTER TABLE `course_tutor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feedback`
--

DROP TABLE IF EXISTS `feedback`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `feedback` (
  `feedback_id` int NOT NULL AUTO_INCREMENT,
  `user_id` int NOT NULL,
  `coursetutor_id` int DEFAULT NULL,
  `comment` varchar(500) DEFAULT NULL,
  `rating` decimal(2,1) DEFAULT NULL,
  `feedback_date` date DEFAULT NULL,
  PRIMARY KEY (`feedback_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feedback`
--

LOCK TABLES `feedback` WRITE;
/*!40000 ALTER TABLE `feedback` DISABLE KEYS */;
/*!40000 ALTER TABLE `feedback` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `login_id` int NOT NULL AUTO_INCREMENT,
  `user_name` varchar(45) NOT NULL,
  `user_id` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `role_id` int DEFAULT NULL,
  PRIMARY KEY (`login_id`),
  UNIQUE KEY `user_id_UNIQUE` (`user_id`),
  KEY `role_id_idx` (`role_id`),
  CONSTRAINT `role_id` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES (1,'Snehal','snehal12@gmail.com','Snehal@123',2),(2,'Shushant','Sushant@23gmail.com','Shushant@123',1),(3,'Ashish','Ashish23@gmail.com','Ashish23@',3),(24,'Pranav','pranavnerkar321@gmail.com','Pmn@1234',1),(25,'Pranav','pranavnerkar3231@gmail.com','Pmn@1234',2);
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `role_id` int NOT NULL AUTO_INCREMENT,
  `role_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'Student'),(2,'Tutor'),(3,'Admin');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `securty_que`
--

DROP TABLE IF EXISTS `securty_que`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `securty_que` (
  `sque_id` int NOT NULL AUTO_INCREMENT,
  `securty_que` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`sque_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `securty_que`
--

LOCK TABLES `securty_que` WRITE;
/*!40000 ALTER TABLE `securty_que` DISABLE KEYS */;
INSERT INTO `securty_que` VALUES (1,'What is the name of your favorite Indian movie?'),(2,'What is the name of the street you grew up on?'),(3,'What is your favorite Indian dish?'),(4,'What is the name of your first pet?'),(5,'What is the name of the school you attended in the 10th grade?');
/*!40000 ALTER TABLE `securty_que` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `stu_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `contact_no` varchar(10) NOT NULL,
  `age` int NOT NULL,
  `gender` varchar(45) NOT NULL,
  `aadhar_no` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `stream` varchar(45) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `active` int DEFAULT NULL,
  `dob` datetime(6) DEFAULT NULL,
  `sque_id` int DEFAULT NULL,
  `answer` varchar(45) NOT NULL,
  `login_id` int DEFAULT NULL,
  PRIMARY KEY (`stu_id`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  UNIQUE KEY `Contact_no_UNIQUE` (`contact_no`),
  KEY `login_id_idx` (`gender`),
  KEY `login_id_idx1` (`login_id`),
  KEY `sque_id_idx` (`sque_id`),
  CONSTRAINT `login_id` FOREIGN KEY (`login_id`) REFERENCES `login` (`login_id`),
  CONSTRAINT `sque_id` FOREIGN KEY (`sque_id`) REFERENCES `securty_que` (`sque_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'Pranav','Nerkar','pranavnerkar321@gmail.com','8605146518',24,'Male',NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,3,'Poha',24);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tutor`
--

DROP TABLE IF EXISTS `tutor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tutor` (
  `tut_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `contact_no` varchar(10) NOT NULL,
  `age` int NOT NULL,
  `gender` varchar(45) NOT NULL,
  `aadhar_no` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `experience` int DEFAULT NULL,
  `about_you` varchar(200) DEFAULT NULL,
  `active` int DEFAULT NULL,
  `sque_id` int DEFAULT NULL,
  `answer` varchar(45) NOT NULL,
  `login_id` int DEFAULT NULL,
  PRIMARY KEY (`tut_id`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  UNIQUE KEY `contact_no_UNIQUE` (`contact_no`),
  UNIQUE KEY `tut_id_UNIQUE` (`tut_id`),
  UNIQUE KEY `aadhar_no_UNIQUE` (`aadhar_no`),
  KEY `login_id_idx` (`login_id`),
  KEY `sque_id_idx` (`sque_id`),
  CONSTRAINT `FKjqtcus3i0xs1kuu97sj0h61v8` FOREIGN KEY (`sque_id`) REFERENCES `securty_que` (`sque_id`),
  CONSTRAINT `FKl1rt8nehbxr5dhg25rs46vfih` FOREIGN KEY (`login_id`) REFERENCES `login` (`login_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tutor`
--

LOCK TABLES `tutor` WRITE;
/*!40000 ALTER TABLE `tutor` DISABLE KEYS */;
INSERT INTO `tutor` VALUES (1,'Snehal','Mam','snehal12@gmail.com','9898989898',30,'Female',NULL,'India','Maharashtra','Pune',5,NULL,NULL,2,'Pune',1),(13,'Pranav','Nerkar','pranavnerkar3231@gmail.com','8605146518',25,'Male',NULL,NULL,NULL,NULL,0,NULL,0,1,'pune',25);
/*!40000 ALTER TABLE `tutor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `video`
--

DROP TABLE IF EXISTS `video`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `video` (
  `video_id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `description` varchar(500) DEFAULT NULL,
  `video_url` varchar(255) DEFAULT NULL,
  `duration` decimal(3,2) DEFAULT NULL,
  PRIMARY KEY (`video_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `video`
--

LOCK TABLES `video` WRITE;
/*!40000 ALTER TABLE `video` DISABLE KEYS */;
/*!40000 ALTER TABLE `video` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-16 19:28:35
