/** ============table user============*/

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` INT AUTO_INCREMENT COMMENT 'id',
  `name` VARCHAR(50) NOT NULL COMMENT '�û���',
  `password` VARCHAR(100) NULL COMMENT '����',
  `email` VARCHAR(100) NULL COMMENT '����',
  `phone` VARCHAR(100) NULL COMMENT '�绰',
  PRIMARY KEY (`id`)
) ENGINE=INNODB CHARSET=utf8;