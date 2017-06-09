/** ============table user============*/

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` INT AUTO_INCREMENT COMMENT 'id',
  `name` VARCHAR(50) NOT NULL COMMENT '用户名',
  `password` VARCHAR(100) NULL COMMENT '密码',
  `email` VARCHAR(100) NULL COMMENT '邮箱',
  `phone` VARCHAR(100) NULL COMMENT '电话',
  PRIMARY KEY (`id`)
) ENGINE=INNODB CHARSET=utf8;