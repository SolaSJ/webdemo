/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : soladb

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2018-03-21 00:18:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for artist
-- ----------------------------
DROP TABLE IF EXISTS `artist`;
CREATE TABLE `artist` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `artist_id` bigint(20) NOT NULL,
  `artist_name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of artist
-- ----------------------------
INSERT INTO `artist` VALUES ('1', '101', '田馥甄');
INSERT INTO `artist` VALUES ('2', '102', '周杰伦');
INSERT INTO `artist` VALUES ('3', '103', '冯提莫');

-- ----------------------------
-- Table structure for artist_identity
-- ----------------------------
DROP TABLE IF EXISTS `artist_identity`;
CREATE TABLE `artist_identity` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `identity_name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of artist_identity
-- ----------------------------
INSERT INTO `artist_identity` VALUES ('1', '歌手');
INSERT INTO `artist_identity` VALUES ('2', '作词者');
INSERT INTO `artist_identity` VALUES ('3', '指挥家');

-- ----------------------------
-- Table structure for song
-- ----------------------------
DROP TABLE IF EXISTS `song`;
CREATE TABLE `song` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `song_id` bigint(20) NOT NULL,
  `song_name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of song
-- ----------------------------
INSERT INTO `song` VALUES ('1', '35', '七里香');
INSERT INTO `song` VALUES ('2', '36', '佛系少女');
INSERT INTO `song` VALUES ('3', '37', '小幸运');

-- ----------------------------
-- Table structure for song_r_artist
-- ----------------------------
DROP TABLE IF EXISTS `song_r_artist`;
CREATE TABLE `song_r_artist` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `song_id` int(11) NOT NULL,
  `artist_id` int(11) NOT NULL,
  `artist_identity_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of song_r_artist
-- ----------------------------
INSERT INTO `song_r_artist` VALUES ('1', '37', '101', '-1');
INSERT INTO `song_r_artist` VALUES ('2', '37', '101', '-1');
