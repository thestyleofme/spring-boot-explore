/*
 Navicat Premium Data Transfer

 Source Server         : local_mysql5.7.26
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : cus_spring

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 27/09/2020 00:04:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_comment
-- ----------------------------
DROP TABLE IF EXISTS `t_comment`;
CREATE TABLE `t_comment`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL COMMENT '评论内容',
  `author` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '评论作者',
  `article_id` bigint(20) NULL DEFAULT NULL COMMENT '关联的文章id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_comment
-- ----------------------------
INSERT INTO `t_comment` VALUES (1, '很全、很详细', 'luccy', 1);
INSERT INTO `t_comment` VALUES (2, '赞一个', 'tom', 1);
INSERT INTO `t_comment` VALUES (3, '很详细', 'eric', 1);
INSERT INTO `t_comment` VALUES (4, '很好、非常详细', '张三', 1);
INSERT INTO `t_comment` VALUES (5, '很不错', '李四', 2);

SET FOREIGN_KEY_CHECKS = 1;
