-- MySQL dump 10.13  Distrib 5.5.47, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: library_database
-- ------------------------------------------------------
-- Server version	5.5.47-0ubuntu0.14.04.1-log

drop database if exists library_database;
create database library_database;
use library_database;

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
-- Table structure for table `Books`
--

DROP TABLE IF EXISTS `Books`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Books` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(45) NOT NULL,
  `year` int(10) NOT NULL,
  `publisher` varchar(45) NOT NULL,
  `annotation` text NOT NULL,
  `count` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;



--
-- Dumping data for table `Books`
--

LOCK TABLES `Books` WRITE;
/*!40000 ALTER TABLE `Books` DISABLE KEYS */;
INSERT INTO `Books` VALUES ('1', 'The Sirens of Titan', '1959', 'Dell Publishing', 'The Sirens of Titan is a comic science fiction novel. It involves issues of free will, omniscience, and the overall purpose of human history. Much of the story revolvesaround a Martian invasion of Earth.', '2'),
('2', 'Slaughterhouse-Five', '1969', 'Delacorte', 'Slaughterhouse-Five, or The Children''s Crusade: A Duty-Dance with Death is ascience fiction-infused anti-war novel. It follows the life and experiences of Billy Pilgrim, from his early years to his time as an American soldier and chaplain''s assistant during World War II, to the postwar years, with Billy occasionally traveling through time itself.', '3'),
('3', 'The Shining', '1977', 'Doubleday', 'The Shining centers on the life of Jack  Torrance, an aspiring writer and recovering alcoholic who accepts a position as the off-season caretaker of the historic OverlookHotel in the Colorado Rockies. His family accompanies him on this job, including his young son Danny Torrance, who possesses "the shining", an array of psychic abilities that allow Danny to see the hotel''s horrific past. Soon, after a winter storm leaves them snowbound, the supernatural forces inhabiting the hotel influence Jack''s sanity, leaving his wife and son in incredible danger.', '7'),
('4', 'Fahrenheit 451', '1953', 'Ballantine Books', 'The novel presents a future American society where books are outlawed and "firemen" burn any that are found. The book''s tagline explains the title: "Fahrenheit451 – the temperature at which book paper catches fire, and burns..." The lead character, Guy Montag, is a fireman who becomes disillusioned with his role of censoring literature and destroying knowledge, eventually quitting his job and committing himself to the preservation of literary and cultural writings.', '4'),
('5', 'Murder on the Orient Express', '1934', 'Collins Crime Club', 'It''s a detective novel by featuring the Belgian detective Hercule Poirot. The elegant train of the 1930s, the Orient Express, is stopped by heavy snowfall.  A murder is discovered, and Poirot''s trip home to London from the Middle East is interrupted to solve the murder.', '7'),
('6', 'It', '1986', 'Viking Press', 'The story follows the experiences of seven children as they are terrorized by an evil entity that exploits the fears of its victims to disguise itself while hunting its prey. "It" primarily appears in the form of Pennywise the Dancing Clown to attract its preferred prey of young children. The novel is told through narratives alternating between two periods and is largely told in the third-person omniscient mode. It deals with themes that eventually became King staples: the power of memory, childhood trauma, and its recurrent echoes in adulthood and overcoming evil through mutual trust and sacrifice.', '4'),
('7', 'Pride and Prejudice', '1813', 'Thomas Egerton', 'The novel follows the character development of Elizabeth Bennet, the dynamic protagonist of the book who learns about the repercussions of hasty judgments and comes to appreciate the difference between superficial goodness and actual goodness. Its humor lies in its honest depiction of manners, education, marriage, and money during the Regency era in Great Britain.', '1'),
('8', 'The Illustrated Man', '1951', 'Doubleday & Company', 'The Illustrated Man is a 1951 collection of eighteen science fiction short stories.  A recurring theme throughout the eighteen stories is the conflict of the cold mechanics of technology and the psychology of people. The unrelated stories are tied together by the frame device of "The Illustrated Man", a vagrant former member of a carnival freak show with an extensively tattooed body whom the unnamed narrator meets.', '3'),
('9', 'Harry Potter and the Philosopher''s Stone', '1997', 'Bloomsbury', 'The story follows Harry Potter, a young wizard who discovers his magical heritage on his eleventh birthday when he receives a letter of acceptance to Hogwarts School of Witchcraft and Wizardry. Harry makes close friends and a few enemies during his first year at the school, and with the help of his friends, Harry faces an attempted comeback by the dark wizard Lord Voldemort, who killed Harry''s parents, but failed to kill Harry when he was just 15 months old.', '2'),
('10', 'Romeo and Juliet', '2018', 'Millenium Publications', 'The book is about two young star-crossed lovers whose deaths ultimately reconcile their feuding families. Today, the title characters are regarded as archetypal young lovers.', '3'),
('11', 'The Alchemist', '1988', 'HarperTorch', 'The Alchemist follows the journey of an Andalusian shepherd boy named Santiago. Believing a recurring dream to be prophetic, he asks a Gypsy fortune teller in the nearby town about its meaning. The woman interprets the dream as a prophecy telling the boy that he will discover a treasure at the Egyptian pyramids.', '2'),
('12', 'His Bright Light', '2000', 'Millenium Publications', 'From the day he was born, Nick Traina was his mother''s joy. By the age of 19, he was dead. This is the author''s personal story of the son she lost to manic depression and the lessons she learned during his courageous battle against the illness.', '1'),
('13', 'The Old Man and the Sea', '1952', 'Charles Scribner''s Sons', 'The story centers on an aging fisherman who engages in an epic battle to catch a giant marlin. The stripped-down existence of the fisherman Santiago is crafted in a spare, elemental style that is as eloquently dismissive as a shrug of the old man''s powerful shoulders.', '2'),
('14', 'Sense and Sensibility', '1811', 'Thomas Egerton', 'The novel follows the three Dashwood sisters as they must move with their widowed mother from the estate on which they grew up,   Norland Park. Because Norland is passed down to John, the product of Mr. Dashwood''s first marriage, and his young son, the four Dashwood women need to look for a new home. They have the opportunity to rent a modest home, Barton Cottage, on the property of a distant relative, Sir John Middleton. There they experience love, romance, and heartbreak.', '2'),
('15', 'Misery', '1987', 'Viking Press', 'The novel''s narrative is based on the relationship of its two main characters – the popular writer Paul Sheldon and his psychotic fan Annie Wilkes. When Paul is seriously injured following a car accident,   former nurse Annie brings him to her home, where Paul receives treatment and doses of pain medication. Gradually, Paul realizes that he is a prisoner and is forced to indulge his captor''s whims.', '4'),
('16', 'Kaleidoscope', '1987', 'Dell Publishing', 'The story revolves around three sisters born to a French mother and an American father. The father kills the mother and then commits suicide. The story features the events of each girl''s life. Separated after the death of their parents, each one is raised quite differently. They are later reunited by an estranged, family friend: the lawyer who placed them in the homes where they spent their childhoods. They later find out that he is part of the reason their father killed their mother.', '1');
/*!40000 ALTER TABLE `Books` ENABLE KEYS */;
UNLOCK TABLES;




--
-- Table structure for table `Authors`
--

DROP TABLE IF EXISTS `Authors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Authors` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Authors`
--

LOCK TABLES `Authors` WRITE;
/*!40000 ALTER TABLE `Authors` DISABLE KEYS */;
INSERT INTO `Authors` VALUES (1,'Ray','Bradbury'),(2,'Kurt','Vonnegut'),(3,'Ernest','Hemingway'), ('4', 'Agatha', 'Christie'), ('5', 'J.K.', 'Rowling'), ('6', 'Stephen', 'King'), ('7', 'William', 'Shakespear'), ('8', 'Paulo', 'Coelho'), ('9', 'Jane', 'Austen'), ('10', 'Danielle', 'Steel');
/*!40000 ALTER TABLE `Authors` ENABLE KEYS */;
UNLOCK TABLES;



--
-- Table structure for table `Author_Book_Map`
--

DROP TABLE IF EXISTS `Author_Book_Map`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Author_Book_Map` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `author_id` int(10) unsigned NOT NULL,
  `book_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Author_Book_Map_1` (`author_id`),
  KEY `FK_Author_Book_Map_2` (`book_id`),
  CONSTRAINT `FK_Author_Book_Map_1` FOREIGN KEY (`author_id`) REFERENCES `Authors` (`id`),
  CONSTRAINT `FK_Author_Book_Map_2` FOREIGN KEY (`book_id`) REFERENCES `Books` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;


--
-- Dumping data for table `Author_Book_Map`
--

LOCK TABLES `Author_Book_Map` WRITE;
/*!40000 ALTER TABLE `Author_Book_Map` DISABLE KEYS */;
INSERT INTO `Author_Book_Map` VALUES (1,2,1),(2,2,2),(3,6,3),(4,1,4),(5,4,5),(6,6,6),(7,9,7),(8,1,8),(9,5,9),(10,7,10),(11,8,11),(12,10,12), (13,3,13),(14,9,14),(15,6,15),(16,10,16);

/*!40000 ALTER TABLE `Author_Book_Map` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Genre_Book_Map`
--

DROP TABLE IF EXISTS `Genre_Book_Map`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Genre_Book_Map` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `genre_id` int(10) unsigned NOT NULL,
  `book_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Genre_Book_Map_1` (`genre_id`),
  KEY `FK_Genre_Book_Map_2` (`book_id`),
  CONSTRAINT `FK_Genre_Book_Map_1` FOREIGN KEY (`genre_id`) REFERENCES `Genres` (`id`),
  CONSTRAINT `FK_Genre_Book_Map_2` FOREIGN KEY (`book_id`) REFERENCES `Books` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;


--
-- Dumping data for table `Genre_Book_Map`
--

LOCK TABLES `Genre_Book_Map` WRITE;
/*!40000 ALTER TABLE `Genre_Book_Map` DISABLE KEYS */;
INSERT INTO `Genre_Book_Map` VALUES ('1', '4', '1'),('2', '4', '2'),('3', '5', '3'),('4', '4', '4'),('5', '3', '5'),('6', '5', '6'),('7', '6', '7'),('8', '4', '8'),('9', '2', '9'),('10', '7', '10'),('11', '1', '11'),('12', '8', '12'),('13', '9', '13'),('14', '6', '14'),('15', '10', '15'),('16', '6', '16');
/*!40000 ALTER TABLE `Genre_Book_Map` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `Issue_Book`
--

DROP TABLE IF EXISTS `Issue_Book`;

/*!40101 SET @saved_cs_client     = @@character_set_client */;

/*!40101 SET character_set_client = utf8 */;

CREATE TABLE `Issue_Book` (

`id` int(10) unsigned NOT NULL AUTO_INCREMENT,

`book_id` int(10) unsigned NOT NULL,
`customer_id` int(10) unsigned NOT NULL,

`issue_date` date NOT NULL,
`expected_return_date` date NOT NULL,

`actual_return_date` date NULL,

PRIMARY KEY (`id`),
  
KEY `FK_Issue_Book_1` (`book_id`),
  
KEY `FK_Issue_Book_2` (`customer_id`),

CONSTRAINT `FK_Issue_Book_1` FOREIGN KEY (`book_id`) REFERENCES `Books` (`id`),

CONSTRAINT `FK_Issue_Book_2` FOREIGN KEY (`customer_id`) REFERENCES `Customers` (`id`)

) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;




--
-- Dumping data for table `Issue_Book`
--


LOCK TABLES `Issue_Book` WRITE;
/*!40000 ALTER TABLE `Issue_Book` DISABLE KEYS */;
INSERT INTO `Issue_Book` VALUES ('1', '10', '3', '2020-06-27', '2020-07-07', '2020-07-02'), ('2', '5', '2', '2020-06-12', '2020-06-22', '2020-06-27'), ('3', '15', '5', '2020-01-31', '2020-02-10', '2020-03-19'), ('4', '5', '1', '2020-07-20', '2020-07-30', null);
/*!40000 ALTER TABLE `Issue_Book` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `Customers`
--

DROP TABLE IF EXISTS `Customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Customers` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `birth_date` date NOT NULL,
  `email` varchar(45) NOT NULL,
  `total_fine` double unsigned NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Customers`
--

LOCK TABLES `Customers` WRITE;
/*!40000 ALTER TABLE `Customers` DISABLE KEYS */;
INSERT INTO `Customers` VALUES (1,'Monica','Geller','1983-05-01','monica@yahoo.com', null),(2,'Regina','Phalange','1980-10-21','phoebe@gmail.com', null),(3,'Rachel','Green','1987-06-27','rachel@yahoo.com', null),(4,'Ross','Geller','1985-02-14','ross@gmail.com', null),(5,'Joseph','Tribiani','1990-08-12','joey@yahoo.com', null),(6,'Chandler','Bing','1988-01-15','chandler@inbox.lv', null);

/*!40000 ALTER TABLE `Customers` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `Genres`
--

DROP TABLE IF EXISTS `Genres`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Genres` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Genres`
--

LOCK TABLES `Genres` WRITE;
/*!40000 ALTER TABLE `Genres` DISABLE KEYS */;
INSERT INTO `Genres` VALUES (1,'Drama'),(2,'Fantasy'),(3,'Crime Fiction'),(4,'Science-Fiction'),(5,'Horror'), (6,'Romance'),(7,'Tragedy'),(8,'Biography'),(9,'Fiction'),(10,'Thriller'),(11,'Mystery'),(12,'Historical Fiction'),(13,'Memoir'),(14,'Cooking'),(15,'Art'),(16,'Sel-Help'),(17,'Family and Relationship'),(18,'Children'),(19,'Humor'),(20,'Travel');
/*!40000 ALTER TABLE `Genres` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-03-08 12:08:12
