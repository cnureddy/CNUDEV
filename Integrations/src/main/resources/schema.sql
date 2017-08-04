/*create database appintegration_service;*/

CREATE TABLE IF NOT EXISTS `application` (
  `app_id` INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  `app_name` VARCHAR(45) NOT NULL,
  `Created_by` INTEGER UNSIGNED NOT NULL,
  `Creation_date` DATETIME NOT NULL,
  `Last_updated_by` INTEGER UNSIGNED NOT NULL,
  `last_update_date` DATETIME NOT NULL,
  `status` INT(2) UNSIGNED NOT NULL,
  `del_flag` INT(2) UNSIGNED NOT NULL,
  PRIMARY KEY (`app_id`)
)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `integration` (
  `application_id` INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  `application_name` VARCHAR(45) NOT NULL,
  `app_id` INTEGER NOT NULL,
  `client_id` VARCHAR(100),
  `client_secret` VARCHAR(100),
  `red_url` VARCHAR(250),
  `Created_by` INTEGER UNSIGNED NOT NULL,
  `Creation_date` DATETIME NOT NULL,
  `Last_updated_by` INTEGER UNSIGNED NOT NULL,
  `last_update_date` DATETIME NOT NULL,
  `status` INT(2) UNSIGNED NOT NULL,
  `del_flag` INT(2) UNSIGNED NOT NULL,
  PRIMARY KEY (`application_id`)
)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `appintegration_service`.`token` (
  `token_id` INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  `application_id` INTEGER NOT NULL,
  `token` VARCHAR(100),
  `email` VARCHAR(250),
  `expires_on` DATETIME NOT NULL,
  `Created_by` INTEGER UNSIGNED NOT NULL,
  `Creation_date` DATETIME NOT NULL,
  `Last_updated_by` INTEGER UNSIGNED NOT NULL,
  `last_update_date` DATETIME NOT NULL,
  `status` INT(2) UNSIGNED NOT NULL,
  `del_flag` INT(2) UNSIGNED NOT NULL,
  PRIMARY KEY (`token_id`)
)
ENGINE = InnoDB;