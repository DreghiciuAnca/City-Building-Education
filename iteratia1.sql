-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema Iteration1
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Iteration1
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Iteration1` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `Iteration1` ;

-- -----------------------------------------------------
-- Table `Iteration1`.`City`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Iteration1`.`City` (
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `score` INT NULL DEFAULT NULL,
  `pollution` INT NULL DEFAULT NULL,
  `idCity` INT NOT NULL,
  PRIMARY KEY (`idCity`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `Iteration1`.`District`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Iteration1`.`District` (
  `rating` INT NULL DEFAULT NULL,
  `id_district` INT NOT NULL,
  `city_id` INT NULL,
  INDEX `city_id` (`city_id` ASC) VISIBLE,
  PRIMARY KEY (`id_district`),
  CONSTRAINT `distric_city`
    FOREIGN KEY (`city_id`)
    REFERENCES `Iteration1`.`City` (`idCity`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `Iteration1`.`Place`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Iteration1`.`Place` (
  `placeId` INT NOT NULL,
  `type` INT NOT NULL,
  `geometry` INT NOT NULL,
  `proximity` VARCHAR(45) NULL DEFAULT NULL,
  `address` VARCHAR(45) NULL DEFAULT NULL,
  `picture` INT NULL DEFAULT NULL,
  `capacity` INT NULL DEFAULT NULL,
  `disponibility` INT NULL DEFAULT NULL,
  `contact` VARCHAR(45) NULL DEFAULT NULL,
  `district_id` INT NOT NULL,
  PRIMARY KEY (`placeId`),
  INDEX `district_id` (`district_id` ASC) VISIBLE,
  INDEX `type` (`type` ASC) VISIBLE,
  INDEX `geometry` (`geometry` ASC) VISIBLE,
  INDEX `picture` (`picture` ASC) VISIBLE,
  CONSTRAINT `place_district`
    FOREIGN KEY (`district_id`)
    REFERENCES `Iteration1`.`District` (`id_district`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `Iteration1`.`geometry`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Iteration1`.`geometry` (
  `idgeometry` INT NOT NULL,
  `width` INT NULL DEFAULT NULL,
  `height` INT NULL DEFAULT NULL,
  `center_x` INT NULL DEFAULT NULL,
  `center_y` INT NULL DEFAULT NULL,
  PRIMARY KEY (`idgeometry`),
  CONSTRAINT `geometry_place`
    FOREIGN KEY (`idgeometry`)
    REFERENCES `Iteration1`.`Place` (`geometry`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `Iteration1`.`picture`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Iteration1`.`picture` (
  `idpicture` INT NOT NULL,
  `picture` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idpicture`),
  CONSTRAINT `picture_place`
    FOREIGN KEY (`idpicture`)
    REFERENCES `Iteration1`.`Place` (`placeId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `Iteration1`.`place_type`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Iteration1`.`place_type` (
  `idplace_type` INT NOT NULL,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `display_name` VARCHAR(45) NULL DEFAULT NULL,
  `icon` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idplace_type`),
  CONSTRAINT `placetype_place`
    FOREIGN KEY (`idplace_type`)
    REFERENCES `Iteration1`.`Place` (`type`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
