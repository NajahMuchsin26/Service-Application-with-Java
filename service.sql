-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 27, 2021 at 04:54 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.3.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `service`
--

-- --------------------------------------------------------

--
-- Table structure for table `pelayanan`
--

CREATE TABLE `pelayanan` (
  `Name` varchar(40) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Category` varchar(40) NOT NULL,
  `Price_Per_Hour` varchar(20) NOT NULL,
  `No_Telp` varchar(20) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Email` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pelayanan`
--

INSERT INTO `pelayanan` (`Name`, `Gender`, `Category`, `Price_Per_Hour`, `No_Telp`, `Address`, `Email`) VALUES
('Brandon Suryono', 'Male', 'Laundry Service', '50', '086433656212', 'Jalan Ahmad Basuki, Blok A4-01', 'brandon_yono@yahoo.com'),
('David Wijaksono', 'Male', 'Driver', '52', '081453626743', 'Jalan Soekarno Hatta, Blok A1-01', 'david_W@gmail.com'),
('Rachel Cerny', 'Female', 'Private Teacher', '56', '088234766612', 'Jalan Citra Emeralda IIA , Blok C1-08', 'rachel_c@yahoo.com'),
('Siska feriansyah', 'Female', 'Hairstylist', '76', '089898981234', 'Jalan Ahmad Yani, Blok C7-05', 'siskaferian@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `request`
--

CREATE TABLE `request` (
  `Name_R` varchar(40) NOT NULL,
  `Address_R` varchar(100) NOT NULL,
  `No_Telp_R` varchar(20) NOT NULL,
  `Duration_Of_R` varchar(10) NOT NULL,
  `Date_Time` varchar(20) NOT NULL,
  `Total` varchar(20) NOT NULL,
  `Name` varchar(40) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Category` varchar(20) NOT NULL,
  `Price_Per_Hour` varchar(20) NOT NULL,
  `No_Telp` varchar(20) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Email` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `request`
--

INSERT INTO `request` (`Name_R`, `Address_R`, `No_Telp_R`, `Duration_Of_R`, `Date_Time`, `Total`, `Name`, `Gender`, `Category`, `Price_Per_Hour`, `No_Telp`, `Address`, `Email`) VALUES
('Miftahul Khair', 'Jalan Perdana Kusuma, Blok C5-02', '089787656434', '3', '24-11-2021 /  7:00', '150', 'Brandon Suryono', 'Male', 'Laundry Service', '50', '086433656212', 'Jalan Ahmad Basuki, Blok A4-01', 'brandon_yono@yahoo.com'),
('Rasya', 'Jalan Muhammad Hatta, Blok B2-07', '089765456123', '2', '22-10-2021 / 13:00', '104', 'David Wijaksono', 'Male', 'Driver', '52', '081453626743', 'Jalan Soekarno Hatta, Blok A1-01', 'david_W@gmail.com'),
('Tasya', 'Jalan Tunjungan IVB, Blok B1-09', '087454343212', '2', '25-11-2021 / 10:00', '112', 'Rachel Cerny', 'Female', 'Private Teacher', '56', '088234766612', 'Jalan Citra Emeralda IIA , Blok C1-08', 'rachel_c@yahoo.com');

-- --------------------------------------------------------

--
-- Table structure for table `tabellogin`
--

CREATE TABLE `tabellogin` (
  `Username` varchar(40) NOT NULL,
  `Password` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tabellogin`
--

INSERT INTO `tabellogin` (`Username`, `Password`) VALUES
('najahmuchsin', '123qwerty'),
('miftahul', 'admin123'),
('m_tazkia', '123zxcvb'),
('admin_1', '123admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pelayanan`
--
ALTER TABLE `pelayanan`
  ADD PRIMARY KEY (`Name`),
  ADD KEY `Name` (`Name`);

--
-- Indexes for table `request`
--
ALTER TABLE `request`
  ADD PRIMARY KEY (`Name_R`),
  ADD KEY `Name` (`Name`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `request`
--
ALTER TABLE `request`
  ADD CONSTRAINT `request_ibfk_1` FOREIGN KEY (`Name`) REFERENCES `pelayanan` (`Name`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
