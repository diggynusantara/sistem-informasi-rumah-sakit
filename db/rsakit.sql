-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jun 20, 2012 at 05:29 AM
-- Server version: 5.5.8
-- PHP Version: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `rsakit`
--

-- --------------------------------------------------------

--
-- Table structure for table `dokter`
--

CREATE TABLE IF NOT EXISTS `dokter` (
  `KdDok` char(5) NOT NULL,
  `NmDok` char(20) NOT NULL,
  `AlDok01` char(30) NOT NULL,
  `AlDok02` char(30) NOT NULL,
  `KtDok` char(20) NOT NULL,
  `KpDok` char(5) NOT NULL,
  `TlDok` char(10) NOT NULL,
  PRIMARY KEY (`KdDok`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dokter`
--

INSERT INTO `dokter` (`KdDok`, `NmDok`, `AlDok01`, `AlDok02`, `KtDok`, `KpDok`, `TlDok`) VALUES
('DK001', 'Lula K', 'Jl. Banteng Nyeruduk 01', 'Ciledug', 'Jakarta', '12260', '8563-5003'),
('DK002', 'Timbul', 'Injak-Injak Bumi Kav. 054', 'Sabah', 'Malaysia', '69876', '56-982'),
('DK003', 'Topan K', 'Jl. Topan Tiada Tara 002', 'Pejaten', 'Jakarta', '12580', '789-362454'),
('DK004', 'Leysus', 'Jl. Angin Ribut Sekali Kav. 03', 'Daan Mogot', 'Jakarta', '13690', '569-5320'),
('DK005', 'Parto', 'Jl. Kuali Blok 90 Kav. V', 'Kuala Simpang', 'Jambi', '69860', '987-4652'),
('DK006', 'Tessi', 'Jl. Pojok-Pojok Sekali 90', 'Rawamangun', 'Jakarta', '56980', '659-8672'),
('DK007', 'Tri Prakoso', 'Jl.Mawar', 'Ciledug', 'Jakarta', '28155', '076135002');

-- --------------------------------------------------------

--
-- Table structure for table `klinik`
--

CREATE TABLE IF NOT EXISTS `klinik` (
  `KdKln` char(4) NOT NULL,
  `NmKln` char(20) NOT NULL,
  `RngKln` char(10) NOT NULL,
  PRIMARY KEY (`KdKln`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `klinik`
--

INSERT INTO `klinik` (`KdKln`, `NmKln`, `RngKln`) VALUES
('K001', 'Klinik Gigi', 'Ruang 201'),
('K002', 'Klinik THT', 'Ruang 101'),
('K003', 'Klinik Jantung', 'Ruang 102'),
('K004', 'Klinik Kulit', 'Ruang 200'),
('K005', 'Klinik Umum', 'Ruang 100'),
('K006', 'Klinik Bersalin', 'Ruang 104');

-- --------------------------------------------------------

--
-- Table structure for table `kunjung`
--

CREATE TABLE IF NOT EXISTS `kunjung` (
  `KdPsn` char(5) NOT NULL,
  `KdSakit` char(4) NOT NULL,
  `KdRsp` char(4) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kunjung`
--

INSERT INTO `kunjung` (`KdPsn`, `KdSakit`, `KdRsp`) VALUES
('PS001', 'S002', 'R001'),
('PS002', 'S006', 'R002'),
('PS003', 'S005', 'R003'),
('PS004', 'S001', 'R004'),
('PS005', 'S004', 'R005'),
('PS006', 'S007', 'R006'),
('PS007', 'S008', 'R007'),
('PS008', 'S010', 'R008'),
('PS009', 'S009', 'R009');

-- --------------------------------------------------------

--
-- Table structure for table `obat`
--

CREATE TABLE IF NOT EXISTS `obat` (
  `KdObat` char(4) NOT NULL,
  `NmObat` char(20) NOT NULL,
  `KetObat` char(30) NOT NULL,
  `Harga` float NOT NULL,
  PRIMARY KEY (`KdObat`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `obat`
--

INSERT INTO `obat` (`KdObat`, `NmObat`, `KetObat`, `Harga`) VALUES
('O001', 'Ponstan', 'Sakit Gigi', 5000),
('O002', 'Cutton Buds', 'Sakit Telinga', 1000),
('O003', 'Pacekap', 'Sakit Hati', 2500),
('O004', 'Canesten', 'Sakit Kulit', 9500),
('O005', 'Bodrek', 'Sakit Flu', 3000),
('O006', 'Sinse', 'Segala Penyakit', 55000),
('O007', 'Jamu Urat Nadi', 'Sakit Otak', 90000),
('O008', 'Sr. Biji Kedondong', 'Sakit Tenggorokan', 2000),
('O009', 'Kuku Bima TL', 'Bersalin', 1500);

-- --------------------------------------------------------

--
-- Table structure for table `pasien`
--

CREATE TABLE IF NOT EXISTS `pasien` (
  `KdPsn` char(5) NOT NULL,
  `NmPsn` char(20) NOT NULL,
  `AlPsn01` char(30) NOT NULL,
  `AlPsn02` char(30) NOT NULL,
  `KtPsn` char(20) NOT NULL,
  `KpPsn` char(5) NOT NULL,
  `TlPsn` char(15) NOT NULL,
  PRIMARY KEY (`KdPsn`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pasien`
--

INSERT INTO `pasien` (`KdPsn`, `NmPsn`, `AlPsn01`, `AlPsn02`, `KtPsn`, `KpPsn`, `TlPsn`) VALUES
('PS001', 'Ruhayah', 'Jl. Panti Asuhan', 'Pondok  Aren', 'Tangerang', '12270', '731-7765'),
('PS002', 'Syamsudin', 'Jl. KH.Muhasyim', 'Cilandak', 'Jakarta', '69876', '765-9812'),
('PS003', 'Suminah', 'Jl.Pesantren Al-Mamur', 'Ciledug', 'Tangerang', '15156', ''),
('PS004', 'Sumadi', 'Jl. Raya Ceger', 'Pondok Aren', 'Tangerang', '15222', '732-7415'),
('PS005', 'Rosyanti', 'Kampung Pondok Aren', 'Pondok Kacang', 'Tangerang', '69860', '732-5689'),
('PS006', 'Bayhaqi', 'Jl.Kav.Setia Budi', 'Ciledug', 'Tangerang', '15155', ''),
('PS007', 'Rusmiati', 'Jl.M. Saidi', 'Petukangan Sel.', 'Jakarta', '12270', '736-5691'),
('PS008', 'Zulfikar', 'Jl.Ciledug Raya Gg.Shinta', 'Ciledug', 'Tangerang', '15154', ''),
('PS009', 'Muhaimin', 'Jl.Ulujami Raya Gg. Warga', 'Larangan', 'Tangerang', '12320', '737-8055'),
('PS010', 'Simanjuntak', 'Jl.Ciptomangunkusumo', 'Ciledug', 'Tangerang', '15153', '732-8888');

-- --------------------------------------------------------

--
-- Table structure for table `penyakit`
--

CREATE TABLE IF NOT EXISTS `penyakit` (
  `KdSakit` char(4) NOT NULL,
  `NmSakit` char(20) NOT NULL,
  PRIMARY KEY (`KdSakit`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penyakit`
--

INSERT INTO `penyakit` (`KdSakit`, `NmSakit`) VALUES
('S001', 'Sakit Gigi'),
('S002', 'Sakit Telinga'),
('S003', 'Sakit Hati'),
('S004', 'Sakit Tenggorokan'),
('S005', 'Sakit Jantung'),
('S006', 'Sakit Kulit'),
('S007', 'Sakit Flu'),
('S008', 'Sakit Bersalin'),
('S009', 'Sakit Mata'),
('S010', 'Sakit DBD');

-- --------------------------------------------------------

--
-- Table structure for table `perawat`
--

CREATE TABLE IF NOT EXISTS `perawat` (
  `KdPrwt` char(5) NOT NULL,
  `NmPrwt` char(20) NOT NULL,
  `AlPrwt01` char(30) NOT NULL,
  `AlPrwt02` char(30) NOT NULL,
  `KtPrwt` char(20) NOT NULL,
  `KpPrwt` char(5) NOT NULL,
  `TlPrwt` char(15) NOT NULL,
  PRIMARY KEY (`KdPrwt`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `perawat`
--

INSERT INTO `perawat` (`KdPrwt`, `NmPrwt`, `AlPrwt01`, `AlPrwt02`, `KtPrwt`, `KpPrwt`, `TlPrwt`) VALUES
('PR001', 'Nava Urbach', 'Jl. Boleh Juga 201', 'Dago', 'Bandung', '65930', '698-3296'),
('PR002', 'Tamara B.', 'Jl. Singo 76', 'Parangtritis', 'Yogyakarta', '23180', '235-5689'),
('PR003', 'Marshanda', 'Jl. Singo Di Mejo 56', 'Parangtajam', 'Yogyakarta', '23050', '236-8970'),
('PR004', 'Dian Sastro', 'Jl. Suka Donk 001', 'Bringin sewu', 'Jakarta', '17980', '902-1310'),
('PR005', 'Puput Novel', 'Jl. Gandaria Terpojok 59', 'Gandaria', 'Jakarta', '12450', '752-6986'),
('PR006', 'Lulu Tobing', 'Jl. Bungur Gede 212', 'Kedu', 'Jawa Tengah', '12340', '56-523');

-- --------------------------------------------------------

--
-- Table structure for table `resep`
--

CREATE TABLE IF NOT EXISTS `resep` (
  `KdRsp` char(4) NOT NULL,
  `KdObat` char(4) NOT NULL,
  `Jumlah` float NOT NULL DEFAULT '0',
  PRIMARY KEY (`KdRsp`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `resep`
--

INSERT INTO `resep` (`KdRsp`, `KdObat`, `Jumlah`) VALUES
('R001', 'O002', 20),
('R002', 'O006', 15),
('R003', 'O006', 13),
('R004', 'O001', 19),
('R005', 'O008', 56),
('R006', 'O005', 52),
('R007', 'O009', 100),
('R008', 'O006', 32),
('R009', 'O006', 65),
('R010', 'O003', 40);

-- --------------------------------------------------------

--
-- Table structure for table `servis`
--

CREATE TABLE IF NOT EXISTS `servis` (
  `KdSakit` char(4) NOT NULL,
  `KdKln` char(4) NOT NULL,
  `KdDok` char(5) NOT NULL,
  `KdPrwt` char(5) NOT NULL,
  `Tarif` float NOT NULL DEFAULT '0'
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `servis`
--

INSERT INTO `servis` (`KdSakit`, `KdKln`, `KdDok`, `KdPrwt`, `Tarif`) VALUES
('S001', 'K001', 'DK001', 'PR001', 50000),
('S002', 'K002', 'DK002', 'PR002', 50000),
('S003', 'K002', 'DK002', 'PR002', 50000),
('S004', 'K002', 'DK002', 'PR002', 50000),
('S005', 'K003', 'DK003', 'PR003', 50000),
('S006', 'K004', 'DK004', 'PR004', 50000),
('S007', 'K005', 'DK005', 'PR005', 50000),
('S008', 'K006', 'DK006', 'PR006', 50000),
('S009', 'K005', 'DK005', 'PR005', 50000),
('S010', 'K005', 'DK005', 'PR005', 50000);

-- --------------------------------------------------------

--
-- Table structure for table `tarifdok`
--

CREATE TABLE IF NOT EXISTS `tarifdok` (
  `KdDok` char(5) NOT NULL,
  `TrfDok` float NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tarifdok`
--

INSERT INTO `tarifdok` (`KdDok`, `TrfDok`) VALUES
('DK001', 50000),
('DK002', 50000),
('DK003', 50000),
('DK004', 50000),
('DK005', 50000),
('DK006', 50000);
