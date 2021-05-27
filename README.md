### mybatis plus demon ###


### 1. create DB and table ###
`CREATE TABLE `tb_user` (
 `id` BIGINT(20) not null AUTO_INCREMENT,
 `user_name` VARCHAR(20) not null,
 `password` VARCHAR(20) NOT NULL,
 `name` VARCHAR(20) not null,
 `age` int(11) DEFAULT NULL,
 `email` VARCHAR(50) default null,
 PRIMARY key(`id`)
 ) ENGINE=INNODB auto_increment=1 default CHARSET=utf8;`

`
insert into `tb_user` (`id`, `user_name`, `password`, `name`, `age`, `email`) VALUES
(1, 'zhangsan', '123456', 'zhansan', 18, 'zhansan@com.cn'),
(2, 'lisi', '123456', 'lisi', 18, 'lisi@com.cn'),
(3, 'wangwu', '123456', 'wangwu', 18, 'wangwu@com.cn'),
(4, 'zhaoliu', '123456', 'zhaoliu', 18, 'zhaoliu@com.cn'),
(5, 'chenqi', '123456', 'chenqi', 18, 'chenqi@com.cn'),
(6, 'zhouba', '123456', 'zhouba', 18, 'zhouba@com.cn'),
(7, 'gujiu', '123456', 'gujiu', 18, 'gujiu@com.cn');
`  