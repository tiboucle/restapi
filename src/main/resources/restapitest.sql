-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 26, 2018 at 02:44 AM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `restapitest`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `select_all` (IN `table_name` VARCHAR(100))  BEGIN
	SET @query_statement = CONCAT('SELECT * FROM ', table_name, ' ORDER BY id');
    PREPARE statement FROM @query_statement;
    EXECUTE statement;
    DEALLOCATE PREPARE statement;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `first_name` varchar(100) NOT NULL,
  `last_name` varchar(100) NOT NULL,
  `date_of_birth` date NOT NULL,
  `street_address` varchar(255) NOT NULL,
  `city` varchar(100) NOT NULL,
  `province` varchar(100) NOT NULL,
  `telephone` varchar(12) NOT NULL,
  `email` varchar(100) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `modified_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `first_name`, `last_name`, `date_of_birth`, `street_address`, `city`, `province`, `telephone`, `email`, `created_at`, `modified_at`) VALUES
(1, 'Ajat', 'Sudrajat', '1989-02-04', 'Jl. Panyileukan No.16', 'Bandung', 'Jawa Barat', '082118208420', 'ajat.sudrajat76@gmail.om', '2018-02-24 13:04:59', NULL),
(2, 'Dila', 'silvana', '1970-01-08', 'Jl. Panyileukan No.16', 'Bandung', 'Jawa Barat', '082118208420', 'dila.silvana@gmail.om', '2018-02-24 14:47:59', '2018-02-24 14:47:58'),
(3, 'Bryan', 'Sudrajat', '1970-01-08', 'Jl. Panyileukan No.16', 'Bandung', 'Jawa Barat', '082118208420', 'bryan@gmail.om', '2018-02-24 14:42:15', NULL),
(5, 'arya', 'Sudrajat', '1989-02-04', 'Jl. Panyileukan No.16', 'Bandung', 'Jawa Barat', '082118208420', 'raisa@gmail.om', '2018-02-24 14:45:48', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD KEY `name_index` (`first_name`,`last_name`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
