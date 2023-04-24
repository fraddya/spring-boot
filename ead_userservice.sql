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
-- Database: `ead_userservice`
--

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(100) NOT NULL,
  `firstname` varchar(100) NOT NULL,
  `lastname` varchar(100) NOT NULL,
  `email` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `password`, `firstname`, `lastname`, `email`) VALUES
(1, 'fraddy', '', '', 'matara', 'fraddy@gmail.com'),
(2, 'appolo', '', '', 'matara', 'fraddy@gmail.com'),
(3, 'appolo', '', '', 'matara', 'fraddy@gmail.com'),
(4, 'appolo', 'fghfhgfh', 'dfgdgdfg', 'matara', 'fraddy@gmail.com'),
(5, 'Nadeesha', '123', 'nadeesha', 'ruwa', 'nadee@gmail.com'),
(6, 'FraddyTM', '3454354f', 'ssisi', 'asdasdad', 'ssisisthasiranga@gmail.com'),
(7, 'perera', '12345', 'pera', 'bigon', 'pererabigon56@gmail.com'),
(8, 'FraddyTM', 'XgwXPj8dAtVj2yJ', 'fdd', 'appl', 'mrpanther292@gmail.com'),
(9, 'undefined', 'undefined', 'undefined', 'undefined', 'undefined'),
(10, 'undefined', 'undefined', 'undefined', 'undefined', 'undefined'),
(11, 'sisithat', '12345', 'sisitha', 'liyanage', 'ssisitha@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
