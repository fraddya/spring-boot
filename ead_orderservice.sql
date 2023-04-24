-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 24, 2023 at 09:24 AM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ead_orderservice`
--

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `cartype` varchar(20) DEFAULT NULL,
  `pickup` varchar(30) DEFAULT NULL,
  `dropadd` varchar(30) DEFAULT NULL,
  `dates` varchar(20) DEFAULT NULL,
  `times` varchar(20) DEFAULT NULL,
  `passenger` varchar(10) DEFAULT NULL,
  `userid` varchar(11) NOT NULL,
  `username` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`id`, `name`, `email`, `cartype`, `pickup`, `dropadd`, `dates`, `times`, `passenger`, `userid`, `username`) VALUES
(1, 'fraddy', 'ssisitha@gmail.com', 'van', 'matara', 'galle', '20010128', '12.30', '5', '0', ''),
(2, 'fraddy', 'ssisitha@gmail.com', 'van', 'matara', 'galle', '20010128', '12.30', '5', '0', ''),
(3, 'asdasd', 'appolo@gmail.com', 'suv', 'dfdf', 'dsfsfsf', '2023-03-31', '03:04', '4', '0', ''),
(4, 'fraddy', 'ssisitha@gmail.com', 'van', 'matara', 'galle', '20010128', '12.30', '5', '0', ''),
(8, 'sisitha', 'ssisithasiranga@gmail.com', 'van', 'matara', 'deniyaya', '2023-03-31', '02:04', '3', '7', 'FraddyTM');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
