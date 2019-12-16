/*
SQLyog Ultimate v12.3.1 (64 bit)
MySQL - 5.5.20 : Database - dashboard
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`dashboard` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `dashboard`;

/*Table structure for table `c_tbl_permission` */

DROP TABLE IF EXISTS `c_tbl_permission`;

CREATE TABLE `c_tbl_permission` (
  `ID` int(255) NOT NULL AUTO_INCREMENT COMMENT '唯一标识',
  `PID` int(255) NOT NULL COMMENT '父ID',
  `NAME` varchar(50) NOT NULL COMMENT '名字',
  `OPEN_STATUS` char(1) NOT NULL DEFAULT '0' COMMENT '折叠状态 0折叠 1展开',
  `ACTION_URL` varchar(255) NOT NULL DEFAULT '/' COMMENT '事件地址',
  `ICON` varchar(522) NOT NULL DEFAULT 'icon-lock' COMMENT '图标',
  `STATUS` char(1) NOT NULL COMMENT '记录状态 0无效 1有效',
  `CREATE_TIME` varchar(19) NOT NULL DEFAULT 'CURRENT_TIMESTAMP' COMMENT '记录创建时间',
  `UPDATE_TIME` varchar(19) NOT NULL DEFAULT 'CURRENT_TIMESTAMP' COMMENT '记录修改时间',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

/*Data for the table `c_tbl_permission` */

insert  into `c_tbl_permission`(`ID`,`PID`,`NAME`,`OPEN_STATUS`,`ACTION_URL`,`ICON`,`STATUS`,`CREATE_TIME`,`UPDATE_TIME`) values 
(1,0,'权限管理','1','/permission/index','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(2,0,'用户管理','0','/permission/index','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(3,0,'资源管理','0','/permission/index','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(4,0,'资源审核','0','/permission/index','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(5,0,'系统配置','0','/permission/index','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(10,1,'权限配置','0','/permission/index','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(11,1,'权限分配','0','/permission/index','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(16,2,'邮件系统','0','/permission/index','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(17,2,'博客系统','0','/permission/index','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(18,2,'论坛系统','0','/permission/index','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(19,2,'云盘系统','0','/permission/index','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(20,3,'文件管理','0','/permission/index','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(21,3,'视频管理','0','/permission/index','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(22,3,'图片管理','0','/permission/index','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(23,4,'文件核审','0','/permission/index','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(24,4,'视频核审','0','/permission/index','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(25,4,'图片核审','0','/permission/index','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(26,5,'任务管理','0','/permission/index','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(27,5,'参数配置','0','/permission/index','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(28,10,'配置用户','0','/permission/index','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(29,10,'配置角色','0','/permission/index','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(30,10,'菜单配置','0','/permission/index','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
