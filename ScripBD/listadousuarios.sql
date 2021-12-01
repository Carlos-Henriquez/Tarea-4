-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-12-2021 a las 03:36:29
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 7.3.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `datosusuarios`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `listadousuarios`
--

CREATE TABLE `listadousuarios` (
  `Usuario` varchar(100) NOT NULL,
  `Nombre` varchar(100) NOT NULL,
  `Apellido` varchar(100) NOT NULL,
  `CorreoElectronico` varchar(100) NOT NULL,
  `Telefono` int(15) NOT NULL,
  `Contraseña` varchar(100) NOT NULL,
  `ConfirmarContraseña` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `listadousuarios`
--

INSERT INTO `listadousuarios` (`Usuario`, `Nombre`, `Apellido`, `CorreoElectronico`, `Telefono`, `Contraseña`, `ConfirmarContraseña`) VALUES
('CarlosH', 'Carlos', 'Henriquez', 'CH@gmail.com', 0, '123', '123');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
