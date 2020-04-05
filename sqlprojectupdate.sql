-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema cityproject
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema cityproject
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `cityproject` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `cityproject` ;

-- -----------------------------------------------------
-- Table `cityproject`.`city`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cityproject`.`city` (
  `cityId` INT NOT NULL,
  `score` INT NULL DEFAULT NULL,
  `pollution` INT NULL DEFAULT NULL,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`cityId`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `cityproject`.`district`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cityproject`.`district` (
  `districtId` INT NOT NULL,
  `rating` INT NULL DEFAULT NULL,
  `city_id` INT NULL DEFAULT NULL,
  PRIMARY KEY (`districtId`),
  INDEX `district_fk0` (`city_id` ASC) VISIBLE,
  CONSTRAINT `district_fk0`
    FOREIGN KEY (`city_id`)
    REFERENCES `cityproject`.`city` (`cityId`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `cityproject`.`place`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cityproject`.`place` (
  `placeId` INT NOT NULL,
  `type` VARCHAR(45) NULL DEFAULT NULL,
  `geometry` VARCHAR(45) NULL DEFAULT NULL,
  `proximity` VARCHAR(45) NULL DEFAULT NULL,
  `address` VARCHAR(45) NULL DEFAULT NULL,
  `picture` VARCHAR(45) NULL DEFAULT NULL,
  `capacity` INT NULL DEFAULT NULL,
  `disponibility` INT NULL DEFAULT NULL,
  `icon` VARCHAR(45) NULL DEFAULT NULL,
  `contact` VARCHAR(45) NULL DEFAULT NULL,
  `district_id` INT NULL DEFAULT NULL,
  PRIMARY KEY (`placeId`),
  INDEX `place_fk0` (`district_id` ASC) VISIBLE,
  CONSTRAINT `place_fk0`
    FOREIGN KEY (`district_id`)
    REFERENCES `cityproject`.`district` (`districtId`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
