/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : sys_user

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-10-10 15:53:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(60) DEFAULT NULL COMMENT '姓名',
  `login_name` varchar(30) DEFAULT NULL COMMENT '登录名',
  `email` varchar(30) DEFAULT NULL COMMENT '邮箱',
  `age` int(2) DEFAULT NULL COMMENT '年龄',
  `password` varchar(30) DEFAULT NULL COMMENT '密码',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `last_login_time` datetime DEFAULT NULL COMMENT '最后登录时间',
  `status` int(11) DEFAULT NULL COMMENT '状态：0 启用、 1 禁用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='用户信息表';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', '张三', 'zhangsan', 'zhangsan@qq.com', '22', '000000', '2018-10-10 02:10:25', '2018-10-10 02:10:32', '0');
INSERT INTO `sys_user` VALUES ('2', '李四', 'lisi', 'lisi@qq.com', '23', '000000', '2018-07-28 02:26:51', '2018-10-10 02:26:49', '1');
INSERT INTO `sys_user` VALUES ('3', '王五', 'wangwu', 'wangwu@qq.com', '24', '000000', '2018-10-10 16:22:47', '2018-10-10 10:00:43', '0');
INSERT INTO `sys_user` VALUES ('4', '管理员', 'admin', 'admin@qq.com', '99', '000000', '2018-10-10 16:22:47', '2018-10-10 10:00:43', '0');
INSERT INTO `sys_user` VALUES ('5', '王五1', 'wangwu1', 'wangwu1@qq.com', '24', '000000', '2018-10-10 16:22:47', '2018-10-10 10:00:43', '0');
INSERT INTO `sys_user` VALUES ('6', '王五2', 'wangwu2', 'wangwu2@qq.com', '24', '000000', '2018-10-10 16:22:47', '2018-10-10 10:00:43', '0');
INSERT INTO `sys_user` VALUES ('7', '王五3', 'wangwu3', 'wangwu3@qq.com', '24', '000000', '2018-10-10 16:22:47', '2018-10-10 10:00:43', '0');
INSERT INTO `sys_user` VALUES ('8', '王五4', 'wangwu4', 'wangwu4@qq.com', '24', '000000', '2018-10-10 16:22:47', '2018-10-10 10:00:43', '0');
INSERT INTO `sys_user` VALUES ('9', '王五5', 'wangwu5', 'wangwu5@qq.com', '24', '000000', '2018-10-10 16:22:47', '2018-10-10 10:00:43', '0');
INSERT INTO `sys_user` VALUES ('10', '王五6', 'wangwu6', 'wangwu6@qq.com', '24', '000000', '2018-10-10 16:22:47', '2018-10-10 10:00:43', '0');
INSERT INTO `sys_user` VALUES ('11', '王五7', 'wangwu7', 'wangwu7@qq.com', '24', '000000', '2018-10-10 16:22:47', '2018-10-10 10:00:43', '0');
INSERT INTO `sys_user` VALUES ('12', '王五8', 'wangwu8', 'wangwu8@qq.com', '24', '000000', '2018-10-10 16:22:47', '2018-10-10 10:00:43', '0');
INSERT INTO `sys_user` VALUES ('13', '王五9', 'wangwu9', 'wangwu9@qq.com', '24', '000000', '2018-10-10 16:22:47', '2018-10-10 10:00:43', '0');
INSERT INTO `sys_user` VALUES ('14', '王五10', 'wangwu10', 'wangwu10@qq.com', '24', '000000', '2018-10-10 16:22:47', '2018-10-10 10:00:43', '0');
INSERT INTO `sys_user` VALUES ('15', '王五11', 'wangwu11', 'wangwu11@qq.com', '24', '000000', '2018-10-10 16:22:47', '2018-10-10 10:00:43', '0');
INSERT INTO `sys_user` VALUES ('16', '王五12', 'wangwu12', 'wangwu12@qq.com', '24', '000000', '2018-10-10 16:22:47', '2018-10-10 10:00:43', '0');
INSERT INTO `sys_user` VALUES ('17', '王五13', 'wangwu13', 'wangwu13@qq.com', '24', '000000', '2018-10-10 16:22:47', '2018-10-10 10:00:43', '0');
INSERT INTO `sys_user` VALUES ('18', '王五14', 'wangwu14', 'wangwu14@qq.com', '24', '000000', '2018-10-10 16:22:47', '2018-10-10 10:00:43', '0');
INSERT INTO `sys_user` VALUES ('19', '王五15', 'wangwu15', 'wangwu15@qq.com', '24', '000000', '2018-10-10 16:22:47', '2018-10-10 10:00:43', '0');
INSERT INTO `sys_user` VALUES ('20', '王五16', 'wangwu16', 'wangwu16@qq.com', '24', '000000', '2018-10-10 16:22:47', '2018-10-10 10:00:43', '0');
INSERT INTO `sys_user` VALUES ('21', '王五17', 'wangwu17', 'wangwu17@qq.com', '24', '000000', '2018-10-10 16:22:47', '2018-10-10 10:00:43', '0');
INSERT INTO `sys_user` VALUES ('22', '王五18', 'wangwu18', 'wangwu18@qq.com', '24', '000000', '2018-10-10 16:22:47', '2018-10-10 10:00:43', '0');
INSERT INTO `sys_user` VALUES ('23', '王五19', 'wangwu19', 'wangwu19@qq.com', '24', '000000', '2018-10-10 16:22:47', '2018-10-10 10:00:43', '0');
INSERT INTO `sys_user` VALUES ('24', '王五20', 'wangwu20', 'wangwu20@qq.com', '24', '000000', '2018-10-10 16:22:47', '2018-10-10 10:00:43', '0');
INSERT INTO `sys_user` VALUES ('25', '王五21', 'wangwu21', 'wangwu21@qq.com', '24', '000000', '2018-10-10 16:22:47', '2018-10-10 10:00:43', '0');
INSERT INTO `sys_user` VALUES ('26', '王五22', 'wangwu22', 'wangwu22@qq.com', '24', '000000', '2018-10-10 16:22:47', '2018-10-10 10:00:43', '0');
