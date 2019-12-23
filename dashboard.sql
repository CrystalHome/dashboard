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
CREATE DATABASE /*!32312 IF NOT EXISTS*/dashboard /*!40100 DEFAULT CHARACTER SET utf8 */;

USE dashboard;

/*Table structure for table c_tbl_permission */

DROP TABLE IF EXISTS c_tbl_permission;

CREATE TABLE c_tbl_permission (
  ID int(255) NOT NULL AUTO_INCREMENT COMMENT '唯一标识',
  PID int(255) NOT NULL COMMENT '父ID',
  NAME varchar(50) NOT NULL COMMENT '资源名称',
  COMMENTS varchar(255) NOT NULL COMMENT '备注',
  ACTION_URL varchar(255) NOT NULL DEFAULT '/' COMMENT '事件地址',
  ICON varchar(522) NOT NULL DEFAULT 'icon-lock' COMMENT '图标',
  STATUS char(1) NOT NULL COMMENT '记录状态 0无效 1有效',
  CREATE_TIME varchar(19) NOT NULL DEFAULT 'CURRENT_TIMESTAMP' COMMENT '记录创建时间',
  UPDATE_TIME varchar(19) NOT NULL DEFAULT 'CURRENT_TIMESTAMP' COMMENT '记录修改时间',
  PRIMARY KEY (ID)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

/*Data for the table c_tbl_permission */

DELETE FROM c_tbl_permission WHERE 1=1;
TRUNCATE TABLE c_tbl_permission;

insert  into c_tbl_permission(ID,PID,NAME,COMMENTS,ACTION_URL,ICON,STATUS,CREATE_TIME,UPDATE_TIME) values 
(1,0,'权限管理','','/permission/index','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(2,1,'权限配置','','/permission/index','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(3,0,'角色管理','','/defaultAction','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(4,3,'角色配置','','/defaultAction','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(5,0,'系统管理','','/defaultAction','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(6,5,'任务管理','','/defaultAction','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(7,5,'参数配置','','/defaultAction','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(8,0,'用户管理','','/defaultAction','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(9,8,'邮件系统','','/defaultAction','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(10,8,'博客系统','','/defaultAction','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(11,8,'论坛系统','','/defaultAction','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(12,8,'云盘系统','','/defaultAction','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(13,8,'监控系统','','/defaultAction','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(14,8,'日志系统','','/defaultAction','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(15,0,'资源管理','','/defaultAction','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(16,15,'文件管理','','/defaultAction','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(17,15,'视频管理','','/defaultAction','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(18,15,'图片管理','','/defaultAction','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(19,15,'文件核审','','/defaultAction','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(20,15,'视频核审','','/defaultAction','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(21,15,'图片核审','','/defaultAction','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(22,15,'文章管理','','/defaultAction','icon-lock','1','2019-12-08 23:55:45','2019-12-08 23:55:45');

/*Table structure for table c_tbl_role */

DROP TABLE IF EXISTS c_tbl_role;

CREATE TABLE c_tbl_role (
  ID int(255) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  NAME varchar(30) NOT NULL COMMENT '角色名称',
  COMMENTS varchar(255) NOT NULL COMMENT '备注',
  STATUS char(1) NOT NULL DEFAULT '0' COMMENT '记录状态 0无效 1有效',
  CREATE_TIME varchar(19) NOT NULL COMMENT '记录创建时间',
  UPDATE_TIME varchar(19) NOT NULL COMMENT '记录修改时间',
  PRIMARY KEY (ID)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table c_tbl_role */

DELETE FROM c_tbl_role WHERE 1=1;
TRUNCATE TABLE c_tbl_role;


insert  into c_tbl_role(ID,NAME,COMMENTS,STATUS,CREATE_TIME,UPDATE_TIME) values 
(1,'Admin','系统管理员','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(2,'EMAIL','邮件系统管理员','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(3,'BLOG','博客系统管理员','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(4,'FORUM','论坛系统管理员','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(5,'CLOUD','云盘系统管理员','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(6,'LOG','日志系统管理员','1','2019-12-08 23:55:45','2019-12-08 23:55:45'),
(7,'MONITOR','监控系统管理员','1','2019-12-08 23:55:45','2019-12-08 23:55:45');

/*Table structure for table c_tbl_role_permission */

DROP TABLE IF EXISTS c_tbl_role_permission;

CREATE TABLE c_tbl_role_permission (
  ID int(255) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  PRIMARY KEY (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table c_tbl_role_permission */

DELETE FROM c_tbl_role_permission WHERE 1=1;
TRUNCATE TABLE c_tbl_role_permission;


/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
