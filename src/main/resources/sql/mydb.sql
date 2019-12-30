/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50528
 Source Host           : localhost:3306
 Source Schema         : mydb

 Target Server Type    : MySQL
 Target Server Version : 50528
 File Encoding         : 65001

 Date: 30/12/2019 21:22:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tbl_career
-- ----------------------------
DROP TABLE IF EXISTS `tbl_career`;
CREATE TABLE `tbl_career`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `career_id` int(11) NOT NULL COMMENT '职位id',
  `career_name` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '职位名称',
  `career_description` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '职位描述',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `career_id`(`career_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tbl_career
-- ----------------------------
INSERT INTO `tbl_career` VALUES (1, 1, '管理人员', '负责管理各方面工作');
INSERT INTO `tbl_career` VALUES (2, 2, '财务人员', '负责计算各类财务信息');
INSERT INTO `tbl_career` VALUES (3, 3, '技术人员', NULL);
INSERT INTO `tbl_career` VALUES (4, 4, '销售人员', NULL);
INSERT INTO `tbl_career` VALUES (5, 5, '测试职业', NULL);

-- ----------------------------
-- Table structure for tbl_department
-- ----------------------------
DROP TABLE IF EXISTS `tbl_department`;
CREATE TABLE `tbl_department`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dep_id` int(4) NOT NULL COMMENT '部门id',
  `dep_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '部门名称',
  `dep_description` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '部门描述',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `dep_id`(`dep_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tbl_department
-- ----------------------------
INSERT INTO `tbl_department` VALUES (1, 1, '经理室', NULL);
INSERT INTO `tbl_department` VALUES (2, 2, '财务科', NULL);
INSERT INTO `tbl_department` VALUES (3, 3, '技术科', NULL);
INSERT INTO `tbl_department` VALUES (4, 4, '销售科', NULL);
INSERT INTO `tbl_department` VALUES (5, 5, '212121', NULL);
INSERT INTO `tbl_department` VALUES (6, 64535, 'sqsqdwqdwq', NULL);
INSERT INTO `tbl_department` VALUES (7, 122, '1121', NULL);

-- ----------------------------
-- Table structure for tbl_emp
-- ----------------------------
DROP TABLE IF EXISTS `tbl_emp`;
CREATE TABLE `tbl_emp`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '员工id',
  `emp_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '员工姓名',
  `emp_sex` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '男' COMMENT '员工性别',
  `emp_age` int(3) NOT NULL COMMENT '员工年龄',
  `emp_department` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '员工部门',
  `emp_career` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '员工职位',
  `emp_username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `emp_password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `emp_department`(`emp_department`) USING BTREE,
  INDEX `emp_career`(`emp_career`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tbl_emp
-- ----------------------------
INSERT INTO `tbl_emp` VALUES (1, '顾安', '男', 20, '开发部', 'Java开发', 'admin', 'admin');
INSERT INTO `tbl_emp` VALUES (2, '陈新', '男', 22, '开发部', '前端开发', 'zcy', 'zcy');
INSERT INTO `tbl_emp` VALUES (3, '朱朝阳', '男', 18, '开发部', 'Java开发', 'ga', 'ga');
INSERT INTO `tbl_emp` VALUES (4, '朱朝阳', '男', 20, '开发部', 'Java开发', NULL, NULL);
INSERT INTO `tbl_emp` VALUES (5, '顾安', '男', 22, '开发部', '前端开发', NULL, NULL);
INSERT INTO `tbl_emp` VALUES (6, '测试员工1', '男', 21, '行业应用开发部', '全栈工程师', NULL, NULL);
INSERT INTO `tbl_emp` VALUES (7, '测试员工2', '女', 22, '前端', '前端页面开发', NULL, NULL);

-- ----------------------------
-- Table structure for tbl_salary
-- ----------------------------
DROP TABLE IF EXISTS `tbl_salary`;
CREATE TABLE `tbl_salary`  (
  `id` int(11) NOT NULL,
  `base_salary` decimal(10, 0) NOT NULL COMMENT '员工基本工资',
  `allowance` decimal(10, 0) NOT NULL COMMENT '津贴',
  `bouns` decimal(10, 0) NOT NULL COMMENT '奖金',
  `insurance` decimal(10, 0) NOT NULL COMMENT '保险',
  `housing_fund` decimal(10, 0) NOT NULL COMMENT '住房公积金',
  `emp_id` int(11) DEFAULT NULL COMMENT '关联',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tbl_salary
-- ----------------------------
INSERT INTO `tbl_salary` VALUES (1, 2000, 2000, 200, 100, 200, 1);
INSERT INTO `tbl_salary` VALUES (2, 1000, 122, 1000, 1111, 230, 2);
INSERT INTO `tbl_salary` VALUES (3, 300, 2999, 100, 100, 100, 3);

-- ----------------------------
-- Table structure for ware
-- ----------------------------
DROP TABLE IF EXISTS `ware`;
CREATE TABLE `ware`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `basesalary` int(10) DEFAULT NULL,
  `empid` int(11) DEFAULT NULL,
  `house` int(10) DEFAULT NULL,
  `losejob` int(10) DEFAULT NULL,
  `ware` int(10) DEFAULT NULL,
  `extra` int(10) DEFAULT NULL,
  `finals` int(10) DEFAULT NULL,
  `empName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 36 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of ware
-- ----------------------------
INSERT INTO `ware` VALUES (29, 1000, 1, 22, 111, 145, 11, 1289, '顾安');
INSERT INTO `ware` VALUES (30, 1000, 2, 22, 111, 145, 11, 1289, '陈新');
INSERT INTO `ware` VALUES (31, 1000, 3, 22, 111, 145, 11, 1289, '朱朝阳');
INSERT INTO `ware` VALUES (32, 1000, 4, 22, 111, 145, 11, 1289, '朱朝阳');
INSERT INTO `ware` VALUES (33, 1000, 5, 22, 111, 145, 11, 1289, '顾安');
INSERT INTO `ware` VALUES (34, 1000, 6, 22, 111, 145, 11, 1289, '测试员工1');
INSERT INTO `ware` VALUES (35, 1000, 7, 22, 111, 145, 11, 1289, '测试员工2');

SET FOREIGN_KEY_CHECKS = 1;
