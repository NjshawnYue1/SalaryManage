/*
 Navicat Premium Data Transfer

 Source Server         : test
 Source Server Type    : MySQL
 Source Server Version : 50727
 Source Host           : localhost
 Source Database       : mydb

 Target Server Type    : MySQL
 Target Server Version : 50727
 File Encoding         : utf-8

 Date: 11/15/2019 13:37:32 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `tbl_salary`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_salary`;
CREATE TABLE `tbl_salary` (
  `id` int(11) NOT NULL,
  `base_salary` decimal(10,0) NOT NULL COMMENT '员工基本工资',
  `allowance` decimal(10,0) NOT NULL COMMENT '津贴',
  `bouns` decimal(10,0) NOT NULL COMMENT '奖金',
  `insurance` decimal(10,0) NOT NULL COMMENT '保险',
  `housing_fund` decimal(10,0) NOT NULL COMMENT '住房公积金',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
