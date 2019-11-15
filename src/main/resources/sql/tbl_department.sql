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

 Date: 11/15/2019 13:37:19 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `tbl_department`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_department`;
CREATE TABLE `tbl_department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dep_id` int(4) NOT NULL COMMENT '部门id',
  `dep_name` varchar(5) NOT NULL COMMENT '部门名称',
  `dep_description` text COMMENT '部门描述',
  PRIMARY KEY (`id`),
  KEY `dep_id` (`dep_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `tbl_department`
-- ----------------------------
BEGIN;
INSERT INTO `tbl_department` VALUES ('1', '1', '经理室', null), ('2', '2', '财务科', null), ('3', '3', '技术科', null), ('4', '4', '销售科', null);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
