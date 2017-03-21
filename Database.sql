-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.1.19-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win32
-- HeidiSQL Version:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for hangman
CREATE DATABASE IF NOT EXISTS `hangman` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `hangman`;

-- Dumping structure for table hangman.users
CREATE TABLE IF NOT EXISTS `users` (
  `UserID` int(11) NOT NULL AUTO_INCREMENT,
  `VName` varchar(50) DEFAULT NULL,
  `Score` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`UserID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1 COMMENT='Table for users';

-- Dumping data for table hangman.users: ~0 rows (approximately)
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;

-- Dumping structure for table hangman.words
CREATE TABLE IF NOT EXISTS `words` (
  `Words` int(11) NOT NULL AUTO_INCREMENT,
  `Word` text,
  `Text` text,
  PRIMARY KEY (`Words`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1 COMMENT='Table of words';

-- Dumping data for table hangman.words: ~5 rows (approximately)
/*!40000 ALTER TABLE `words` DISABLE KEYS */;
REPLACE INTO `words` (`Words`, `Word`, `Text`) VALUES
	(1, 'GREEN', NULL),
	(2, 'HOUSE', NULL),
	(3, 'ELEPHANT', NULL),
	(4, 'PILGRIM', NULL),
	(5, 'MONOLITH', NULL);
/*!40000 ALTER TABLE `words` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
