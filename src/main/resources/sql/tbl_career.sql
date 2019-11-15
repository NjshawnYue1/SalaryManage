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

 Date: 11/15/2019 13:37:12 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `tbl_career`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_career`;
CREATE TABLE `tbl_career` (
  `id` int(11) NOT NULL,
  `career_id` int(11) NOT NULL COMMENT '职位id',
  `career_name` varchar(5) NOT NULL COMMENT '职位名称',
  `career_description` text COMMENT '职位描述',
  PRIMARY KEY (`id`),
  KEY `career_id` (`career_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `tbl_career`
-- ----------------------------
BEGIN;
INSERT INTO `tbl_career` VALUES ('1', '1', '管理人员', '负责管理各方面工作'), ('2', '2', '财务人员', '负责计算各类财务信息'), ('3', '3', '技术人员', null), ('4', '4', '销售人员', null);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
