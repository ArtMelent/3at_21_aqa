CREATE SCHEMA `3at_21`;

USE 3at_21;

CREATE TABLE `3at_21`.`student`(
    `id_student` INT NOT NULL,
    `name` VARCHAR(45) NULL,
    `bd` DATETIME NULL,
    `course` INT NULL,
    PRIMARY KEY(`id_student`));

CREATE TABLE `3at_21`.`address` (
  `id_address` INT NOT NULL,
  `country` VARCHAR(45) NULL,
  `city` VARCHAR(45) NULL,
  PRIMARY KEY (`id_address`));
