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

 Date: 11/15/2019 13:37:26 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `tbl_emp`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_emp`;
CREATE TABLE `tbl_emp` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '员工id',
  `emp_name` varchar(10) NOT NULL COMMENT '员工姓名',
  `emp_sex` varchar(2) NOT NULL DEFAULT '男' COMMENT '员工性别',
  `emp_age` int(3) NOT NULL COMMENT '员工年龄',
  `emp_department` int(2) NOT NULL COMMENT '员工部门',
  `emp_career` int(3) NOT NULL COMMENT '员工职位',
  PRIMARY KEY (`id`),
  KEY `emp_department` (`emp_department`),
  KEY `emp_career` (`emp_career`),
  CONSTRAINT `tbl_emp_ibfk_1` FOREIGN KEY (`emp_department`) REFERENCES `tbl_department` (`dep_id`),
  CONSTRAINT `tbl_emp_ibfk_2` FOREIGN KEY (`emp_career`) REFERENCES `tbl_career` (`career_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
