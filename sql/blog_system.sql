CREATE DATABASE blog_system DEFAULT CHARSET utf8mb4 COLLATE utf8mb4_bin;
USE blog_system;
DROP TABLE IF EXISTS `t_article`;
CREATE TABLE `t_article`  (
                              `id` bigint(20) NOT NULL AUTO_INCREMENT,
                              `title` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '文章标题',
                              `content` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL COMMENT '文章具体内容',
                              `created` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '发表时间',
                              `modified` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '修改时间',
                              `categories` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT '默认分类' COMMENT '文章分类',
                              `tags` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '文章标签',
                              `allow_comment` tinyint(1) NOT NULL DEFAULT 1 COMMENT '是否允许评论',
                              `thumbnail` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '文章缩略图',
                              PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_article
-- ----------------------------
INSERT INTO `t_article` VALUES (1, '2019新版Java学习路线图', 'Java学习路线图具体内容具体内容具体内容具体内容具体内容具体内容具体内容', '2019-10-10 00:00:00', NULL, '默认分类', '2019,Java,学习路线图', 1, NULL);
INSERT INTO `t_article` VALUES (2, '2019新版Python学习线路图', '据悉，Python已经入驻小学生教材，未来不学Python不仅知识会脱节，可能与小朋友都没有了共同话题~~所以，从今天起不要再找借口，不要再说想学Python却没有资源，赶快行动起来，Python等你来探索', '2019-10-10 00:00:00', NULL, '默认分类', '2019,Java,学习路线图', 1, NULL);
INSERT INTO `t_article` VALUES (3, 'JDK 8——Lambda表达式介绍', 'Lambda表达式是JDK8中一个重要的新特性，它使用一个清晰简洁的表达式来表达一个接口，同时Lambda表达式也简化了对集合以及数组数据的遍历、过滤和提取等操作。下面，本篇文章就对Lambda表达式进行简要介绍，并进行演示说明', '2019-10-10 00:00:00', NULL, '默认分类', '2019,Java,学习路线图', 1, NULL);
INSERT INTO `t_article` VALUES (4, '函数式接口', '虽然Lambda表达式可以实现匿名内部类的功能，但在使用时却有一个局限，即接口中有且只有一个抽象方法时才能使用Lamdba表达式代替匿名内部\n类。这是因为Lamdba表达式是基于函数式接口实现的，所谓函数式接口是指有且仅有一个抽象方法的接口，Lambda表达式就是Java中函数式编程的体现，只有确保接口中有且仅有一个抽象方法，Lambda表达式才能顺利地推导出所实现的这个接口中的方法', '2019-10-10 00:00:00', NULL, '默认分类', '2019,Java,学习路线图', 1, NULL);

