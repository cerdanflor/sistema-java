-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 25-05-2016 a las 10:37:01
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `muebleria`
--
CREATE DATABASE `muebleria` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `muebleria`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `abonos`
--

CREATE TABLE IF NOT EXISTS `abonos` (
  `id` int(100) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `costo` int(100) NOT NULL,
  `sugerido` int(100) NOT NULL,
  `abono` int(100) NOT NULL,
  `saldo` int(100) NOT NULL,
  `fecha` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `abonos`
--

INSERT INTO `abonos` (`id`, `nombre`, `apellido`, `descripcion`, `costo`, `sugerido`, `abono`, `saldo`, `fecha`) VALUES
(251115, 'cliente3', 'apellido31', 'sala', 14200, 2366, 0, 14200, '2015-11-14'),
(251115, 'cliente3', 'apellido31', 'sala', 14200, 2366, 2366, 11834, '2015-11-14'),
(1254, 'prueba', 'paterno', 'laptop', 7500, 625, 0, 7500, '2015-11-15'),
(1254, 'prueba', 'paterno', 'laptop', 7500, 625, 600, 6900, '2015-11-15'),
(6378, 'cliente', 'skj', 'laptop', 7500, 1250, 0, 7500, '2015-11-18'),
(6378, 'cliente', 'skj', 'laptop', 7500, 1250, 600, 6900, '2015-11-18');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `articulos`
--

CREATE TABLE IF NOT EXISTS `articulos` (
  `articulo` int(100) NOT NULL,
  `descripcion` varchar(65) NOT NULL,
  `area` varchar(60) NOT NULL,
  `precioC` int(100) NOT NULL,
  `precioA` int(100) NOT NULL,
  PRIMARY KEY (`articulo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `articulos`
--

INSERT INTO `articulos` (`articulo`, `descripcion`, `area`, `precioC`, `precioA`) VALUES
(2398, 'play station 4', 'electronica', 8500, 12700),
(4219, 'xbox one', 'electronica', 7500, 11200),
(4958, 'laptop', 'electronica', 5000, 7500),
(9802, 'sala', 'hogar', 7500, 14200),
(12345, 'recamara', 'hogar', 5500, 9000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE IF NOT EXISTS `clientes` (
  `cliente` int(100) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `paterno` varchar(40) NOT NULL,
  `materno` varchar(40) NOT NULL,
  `direccion` varchar(40) NOT NULL,
  `telefono` varchar(25) NOT NULL,
  PRIMARY KEY (`cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`cliente`, `nombre`, `paterno`, `materno`, `direccion`, `telefono`) VALUES
(1234, 'cliente', 'apellido1', 'apellido2', 'conocido', '-209'),
(1254, 'prueba', 'paterno', 'materno', 'conocido', '388'),
(5210, 'cliente4', 'apellido4', 'materno4', 'conocifo', '-388'),
(6378, 'cliente', 'skj', 'hjsag', 'conocido', '-27'),
(7896, 'cliente2', 'apellido1cliente2', 'apellido2cliente2', 'conocido', '-438'),
(251115, 'cliente3', 'apellido31', 'apellido32', 'conocido', '-466');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `creditos`
--

CREATE TABLE IF NOT EXISTS `creditos` (
  `venta` int(100) NOT NULL,
  `cliente` int(100) NOT NULL,
  `nombre` varchar(65) NOT NULL,
  `apellido` varchar(65) NOT NULL,
  `articulo` int(100) NOT NULL,
  `precioA` int(100) NOT NULL,
  `plazo` varchar(40) NOT NULL,
  `abono` int(100) NOT NULL,
  `fecha` date NOT NULL,
  PRIMARY KEY (`venta`),
  KEY `cliente` (`cliente`),
  KEY `articulo` (`articulo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `creditos`
--

INSERT INTO `creditos` (`venta`, `cliente`, `nombre`, `apellido`, `articulo`, `precioA`, `plazo`, `abono`, `fecha`) VALUES
(393301, 7896, 'cliente2', 'apellido1cliente2', 9802, 14200, '24 semanas', 591, '2015-11-14'),
(644786, 7896, 'cliente2', 'apellido1cliente2', 12345, 9000, '12 semanas', 750, '2015-11-10'),
(778939, 251115, 'cliente3', 'apellido31', 9802, 14200, '6 meses', 2366, '2015-11-14'),
(804707, 6378, 'cliente', 'skj', 4958, 7500, '6 meses', 1250, '2015-11-18'),
(926338, 7896, 'cliente2', 'apellido1cliente2', 4219, 11200, '6 meses', 1866, '2015-11-14'),
(931466, 1254, 'prueba', 'paterno', 4958, 7500, '12 quincenas', 625, '2015-11-15'),
(965851, 1234, 'cliente', 'apellido1', 9802, 14200, '24 quincenas', 591, '2015-11-13');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE IF NOT EXISTS `ventas` (
  `venta` int(100) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `paterno` varchar(50) NOT NULL,
  `articulo` int(100) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `pago` varchar(35) NOT NULL,
  `cliente` int(100) DEFAULT '0',
  `precio` int(100) NOT NULL,
  `cantidad` int(100) DEFAULT '0',
  `total` int(100) DEFAULT '0',
  `fecha` date NOT NULL,
  KEY `cliente` (`cliente`),
  KEY `articulo` (`articulo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`venta`, `nombre`, `paterno`, `articulo`, `descripcion`, `pago`, `cliente`, `precio`, `cantidad`, `total`, `fecha`) VALUES
(281894, 'cliente', 'apellido', 2398, 'play station 4', 'ticket', 0, 8500, 1, 0, '2015-11-11'),
(281894, 'cliente', 'apellido', 4219, 'xbox one', 'ticket', 0, 7500, 1, 0, '2015-11-11'),
(281894, 'cliente', 'apellido', 4219, 'xbox one', 'ticket', 0, 7500, 1, 0, '2015-11-11'),
(281894, 'cliente', 'apellido', 9802, 'sala', 'ticket', 0, 7500, 1, 0, '2015-11-11'),
(714362, 'cliente', 'paterno', 2398, 'play station 4', 'ticket', 0, 8500, 1, 0, '2015-11-13'),
(714362, 'cliente', 'paterno', 12345, 'recamara', 'factura', 0, 5500, 1, 0, '2015-11-13'),
(411750, 'prueba1', 'ap', 9802, 'sala', 'ticket', 0, 7500, 1, 0, '2015-11-15'),
(435932, 'gh', 'hjg', 4958, 'laptop', 'ticket', 0, 5000, 1, 0, '2015-11-18');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `creditos`
--
ALTER TABLE `creditos`
  ADD CONSTRAINT `creditos_ibfk_1` FOREIGN KEY (`cliente`) REFERENCES `clientes` (`cliente`),
  ADD CONSTRAINT `creditos_ibfk_2` FOREIGN KEY (`articulo`) REFERENCES `articulos` (`articulo`);

--
-- Filtros para la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD CONSTRAINT `ventas_ibfk_2` FOREIGN KEY (`articulo`) REFERENCES `articulos` (`articulo`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
