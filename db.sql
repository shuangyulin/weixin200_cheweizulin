/*
SQLyog Ultimate v11.3 (64 bit)
MySQL - 5.7.32-log : Database - shequcheweizulin
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`shequcheweizulin` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `shequcheweizulin`;

/*Table structure for table `chewei` */

DROP TABLE IF EXISTS `chewei`;

CREATE TABLE `chewei` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `chewei_name` varchar(200) DEFAULT NULL COMMENT '车位地址 Search111 ',
  `chewei_photo` varchar(200) DEFAULT NULL COMMENT '车位图片',
  `chewei_types` int(11) DEFAULT NULL COMMENT '车位类型 Search111',
  `chewei_number` int(11) DEFAULT NULL COMMENT '车位数量',
  `chewei_jiage` decimal(10,2) DEFAULT NULL COMMENT '车位价格(月)',
  `chewei_content` text COMMENT '车位详情',
  `insert_time` timestamp NULL DEFAULT NULL COMMENT '发布时间',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间 show1 show2 photoShow',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='车位信息';

/*Data for the table `chewei` */

insert  into `chewei`(`id`,`chewei_name`,`chewei_photo`,`chewei_types`,`chewei_number`,`chewei_jiage`,`chewei_content`,`insert_time`,`create_time`) values (1,'车位地址1','http://localhost:8080/shequcheweizulin/upload/chewei1.jpg',1,250,'685.25','车位详情1','2022-03-10 10:41:03','2022-03-10 10:41:03'),(2,'车位地址2','http://localhost:8080/shequcheweizulin/upload/chewei2.jpg',1,435,'277.35','车位详情2','2022-03-10 10:41:03','2022-03-10 10:41:03'),(3,'车位地址3','http://localhost:8080/shequcheweizulin/upload/chewei3.jpg',3,63,'708.99','车位详情3','2022-03-10 10:41:03','2022-03-10 10:41:03'),(4,'车位地址4','http://localhost:8080/shequcheweizulin/upload/chewei4.jpg',3,84,'556.92','车位详情4','2022-03-10 10:41:03','2022-03-10 10:41:03'),(5,'车位地址5','http://localhost:8080/shequcheweizulin/upload/chewei5.jpg',1,429,'745.03','车位详情5','2022-03-10 10:41:03','2022-03-10 10:41:03');

/*Table structure for table `cheweishenqing` */

DROP TABLE IF EXISTS `cheweishenqing`;

CREATE TABLE `cheweishenqing` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `chewei_id` int(11) DEFAULT NULL COMMENT '车位',
  `yonghu_id` int(11) DEFAULT NULL COMMENT '用户',
  `cheweishenqing_shijian` int(11) DEFAULT NULL COMMENT '租赁时间',
  `cheweishenqing_yesno_types` int(11) DEFAULT NULL COMMENT '审核结果 Search111',
  `cheweishenqing_yesno_text` text COMMENT '审核原因',
  `insert_time` timestamp NULL DEFAULT NULL COMMENT '发布时间',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='车位申请';

/*Data for the table `cheweishenqing` */

insert  into `cheweishenqing`(`id`,`chewei_id`,`yonghu_id`,`cheweishenqing_shijian`,`cheweishenqing_yesno_types`,`cheweishenqing_yesno_text`,`insert_time`,`create_time`) values (1,1,1,120,4,NULL,'2022-03-10 10:41:03','2022-03-10 10:41:03'),(2,2,2,99,1,'','2022-03-10 10:41:03','2022-03-10 10:41:03'),(4,4,2,154,1,NULL,'2022-03-10 10:41:03','2022-03-10 10:41:03'),(5,5,2,187,1,NULL,'2022-03-10 10:41:03','2022-03-10 10:41:03'),(7,5,1,3,1,'','2022-03-10 11:58:09','2022-03-10 11:58:09'),(8,4,1,12,2,'通过审核','2022-03-10 14:15:12','2022-03-10 14:15:12'),(9,2,1,12,4,'审核结果通过','2022-03-10 14:18:07','2022-03-10 14:18:07');

/*Table structure for table `config` */

DROP TABLE IF EXISTS `config`;

CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';

/*Data for the table `config` */

insert  into `config`(`id`,`name`,`value`) values (1,'轮播图1','http://localhost:8080/shequcheweizulin/upload/config1.jpg'),(2,'轮播图2','http://localhost:8080/shequcheweizulin/upload/config2.jpg'),(3,'轮播图3','http://localhost:8080/shequcheweizulin/upload/config3.jpg');

/*Table structure for table `dictionary` */

DROP TABLE IF EXISTS `dictionary`;

CREATE TABLE `dictionary` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `dic_code` varchar(200) DEFAULT NULL COMMENT '字段',
  `dic_name` varchar(200) DEFAULT NULL COMMENT '字段名',
  `code_index` int(11) DEFAULT NULL COMMENT '编码',
  `index_name` varchar(200) DEFAULT NULL COMMENT '编码名字  Search111 ',
  `super_id` int(11) DEFAULT NULL COMMENT '父字段id',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8 COMMENT='字典表';

/*Data for the table `dictionary` */

insert  into `dictionary`(`id`,`dic_code`,`dic_name`,`code_index`,`index_name`,`super_id`,`beizhu`,`create_time`) values (1,'chewei_types','车位类型',1,'车位类型1',NULL,NULL,'2022-03-10 10:40:52'),(2,'chewei_types','车位类型',2,'车位类型2',NULL,NULL,'2022-03-10 10:40:52'),(3,'chewei_types','车位类型',3,'车位类型3',NULL,NULL,'2022-03-10 10:40:52'),(4,'cheweishenqing_yesno_types','审核结果',1,'处理中',NULL,NULL,'2022-03-10 10:40:52'),(5,'cheweishenqing_yesno_types','审核结果',2,'通过',NULL,NULL,'2022-03-10 10:40:52'),(6,'cheweishenqing_yesno_types','审核结果',3,'拒绝',NULL,NULL,'2022-03-10 10:40:52'),(7,'cheweishenqing_yesno_types','审核结果',4,'已缴费',NULL,NULL,'2022-03-10 10:40:52'),(8,'tichushenshu_types','申述原因',1,'申述原因1',NULL,NULL,'2022-03-10 10:40:52'),(9,'tichushenshu_types','申述原因',2,'申述原因2',NULL,NULL,'2022-03-10 10:40:52'),(10,'tichushenshu_types','申述原因',3,'申述原因3',NULL,NULL,'2022-03-10 10:40:52'),(11,'tichushenshu_status_types','申述结果',1,'未处理',NULL,NULL,'2022-03-10 10:40:52'),(12,'tichushenshu_status_types','申述结果',2,'已处理',NULL,NULL,'2022-03-10 10:40:52'),(13,'sex_types','性别',1,'男',NULL,NULL,'2022-03-10 10:40:52'),(14,'sex_types','性别',2,'女',NULL,NULL,'2022-03-10 10:40:52'),(15,'news_types','公告类型',1,'公告类型1',NULL,NULL,'2022-03-10 10:40:52'),(16,'news_types','公告类型',2,'公告类型2',NULL,NULL,'2022-03-10 10:40:52'),(17,'news_types','公告类型',3,'公告类型3',NULL,NULL,'2022-03-10 10:40:52'),(18,'forum_state_types','帖子状态',1,'发帖',NULL,NULL,'2022-03-10 10:40:52'),(19,'forum_state_types','帖子状态',2,'回帖',NULL,NULL,'2022-03-10 10:40:52');

/*Table structure for table `forum` */

DROP TABLE IF EXISTS `forum`;

CREATE TABLE `forum` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `forum_name` varchar(200) DEFAULT NULL COMMENT '帖子标题  Search111 ',
  `yonghu_id` int(11) DEFAULT NULL COMMENT '用户',
  `users_id` int(11) DEFAULT NULL COMMENT '管理员',
  `forum_content` text COMMENT '发布内容',
  `super_ids` int(11) DEFAULT NULL COMMENT '父id',
  `forum_state_types` int(11) DEFAULT NULL COMMENT '帖子状态',
  `insert_time` timestamp NULL DEFAULT NULL COMMENT '发帖时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '修改时间',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间 show2',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='论坛';

/*Data for the table `forum` */

insert  into `forum`(`id`,`forum_name`,`yonghu_id`,`users_id`,`forum_content`,`super_ids`,`forum_state_types`,`insert_time`,`update_time`,`create_time`) values (1,'帖子标题1',1,NULL,'发布内容1',NULL,1,'2022-03-10 10:41:03','2022-03-10 10:41:03','2022-03-10 10:41:03'),(2,'帖子标题2',1,NULL,'发布内容2',NULL,1,'2022-03-10 10:41:03','2022-03-10 10:41:03','2022-03-10 10:41:03'),(3,'帖子标题3',2,NULL,'发布内容3',NULL,1,'2022-03-10 10:41:03','2022-03-10 10:41:03','2022-03-10 10:41:03'),(4,'帖子标题4',2,NULL,'发布内容4',NULL,1,'2022-03-10 10:41:03','2022-03-10 10:41:03','2022-03-10 10:41:03'),(5,'帖子标题5',3,NULL,'发布内容5',NULL,1,'2022-03-10 10:41:03','2022-03-10 10:41:03','2022-03-10 10:41:03'),(6,NULL,1,NULL,'评论内容1',5,2,'2022-03-10 14:18:22',NULL,'2022-03-10 14:18:22'),(7,NULL,NULL,1,'管理回复',5,2,'2022-03-10 14:22:31',NULL,'2022-03-10 14:22:31');

/*Table structure for table `news` */

DROP TABLE IF EXISTS `news`;

CREATE TABLE `news` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `news_name` varchar(200) DEFAULT NULL COMMENT '公告标题  Search111 ',
  `news_types` int(11) DEFAULT NULL COMMENT '公告类型  Search111 ',
  `news_photo` varchar(200) DEFAULT NULL COMMENT '公告图片',
  `insert_time` timestamp NULL DEFAULT NULL COMMENT '公告时间',
  `news_content` text COMMENT '公告详情',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间 show1 show2 nameShow',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='公告信息';

/*Data for the table `news` */

insert  into `news`(`id`,`news_name`,`news_types`,`news_photo`,`insert_time`,`news_content`,`create_time`) values (1,'公告标题1',2,'http://localhost:8080/shequcheweizulin/upload/news1.jpg','2022-03-10 10:41:03','公告详情1','2022-03-10 10:41:03'),(2,'公告标题2',2,'http://localhost:8080/shequcheweizulin/upload/news2.jpg','2022-03-10 10:41:03','公告详情2','2022-03-10 10:41:03'),(3,'公告标题3',3,'http://localhost:8080/shequcheweizulin/upload/news3.jpg','2022-03-10 10:41:03','公告详情3','2022-03-10 10:41:03'),(4,'公告标题4',1,'http://localhost:8080/shequcheweizulin/upload/news4.jpg','2022-03-10 10:41:03','公告详情4','2022-03-10 10:41:03'),(5,'公告标题5',1,'http://localhost:8080/shequcheweizulin/upload/news5.jpg','2022-03-10 10:41:03','公告详情5','2022-03-10 10:41:03');

/*Table structure for table `tichushenshu` */

DROP TABLE IF EXISTS `tichushenshu`;

CREATE TABLE `tichushenshu` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `yonghu_id` int(11) DEFAULT NULL COMMENT '用户',
  `chewei_name` varchar(200) DEFAULT NULL COMMENT '申诉问题 ',
  `tichushenshu_types` int(11) DEFAULT NULL COMMENT '申述原因',
  `tichushenshu_status_types` int(11) DEFAULT NULL COMMENT '申述结果',
  `insert_time` timestamp NULL DEFAULT NULL COMMENT '发布时间',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='提出申述';

/*Data for the table `tichushenshu` */

insert  into `tichushenshu`(`id`,`yonghu_id`,`chewei_name`,`tichushenshu_types`,`tichushenshu_status_types`,`insert_time`,`create_time`) values (1,1,'申诉问题1',2,1,'2022-03-10 10:41:03','2022-03-10 10:41:03'),(2,3,'申诉问题2',3,1,'2022-03-10 10:41:03','2022-03-10 10:41:03'),(3,1,'申诉问题3',2,1,'2022-03-10 10:41:03','2022-03-10 10:41:03'),(4,3,'申诉问题4',1,1,'2022-03-10 10:41:03','2022-03-10 10:41:03'),(5,2,'申诉问题5',2,2,'2022-03-10 10:41:03','2022-03-10 10:41:03'),(6,1,'申述问题6',1,2,'2022-03-10 14:19:30','2022-03-10 14:19:30');

/*Table structure for table `token` */

DROP TABLE IF EXISTS `token`;

CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='token表';

/*Data for the table `token` */

insert  into `token`(`id`,`userid`,`username`,`tablename`,`role`,`token`,`addtime`,`expiratedtime`) values (1,1,'admin','users','管理员','rcret9wfu7zoxadjopujqqrk86k51guw','2022-03-10 10:23:28','2022-03-10 15:21:31'),(2,1,'a1','yonghu','用户','q6jrt4i6as0kfl8jvqsai8iwsnnrl8s9','2022-03-10 11:09:51','2022-03-10 15:27:51');

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';

/*Data for the table `users` */

insert  into `users`(`id`,`username`,`password`,`role`,`addtime`) values (1,'admin','admin','管理员','2022-05-01 00:00:00');

/*Table structure for table `yonghu` */

DROP TABLE IF EXISTS `yonghu`;

CREATE TABLE `yonghu` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(200) DEFAULT NULL COMMENT '账户',
  `password` varchar(200) DEFAULT NULL COMMENT '密码',
  `yonghu_name` varchar(200) DEFAULT NULL COMMENT '用户姓名 Search111 ',
  `yonghu_photo` varchar(255) DEFAULT NULL COMMENT '头像',
  `sex_types` int(11) DEFAULT NULL COMMENT '性别 Search111 ',
  `yonghu_phone` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `yonghu_id_number` varchar(200) DEFAULT NULL COMMENT '用户身份证号 ',
  `yonghu_email` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `new_money` decimal(10,2) DEFAULT NULL COMMENT '余额',
  `yonghu_delete` int(11) DEFAULT '1' COMMENT '假删',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='用户';

/*Data for the table `yonghu` */

insert  into `yonghu`(`id`,`username`,`password`,`yonghu_name`,`yonghu_photo`,`sex_types`,`yonghu_phone`,`yonghu_id_number`,`yonghu_email`,`new_money`,`yonghu_delete`,`create_time`) values (1,'a1','123456','用户姓名1','http://localhost:8080/shequcheweizulin/upload/yonghu1.jpg',1,'17703786901','410224199610232001','1@qq.com','9037.40',1,'2022-03-10 10:41:03'),(2,'a2','123456','用户姓名2','http://localhost:8080/shequcheweizulin/upload/yonghu2.jpg',2,'17703786902','410224199610232002','2@qq.com','10000.00',1,'2022-03-10 10:41:03'),(3,'a3','123456','用户姓名3','http://localhost:8080/shequcheweizulin/upload/yonghu3.jpg',1,'17703786903','410224199610232003','3@qq.com','10000.00',1,'2022-03-10 10:41:03');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
