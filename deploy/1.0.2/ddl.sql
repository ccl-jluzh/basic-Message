ALTER TABLE `basic_message`.`msg_content_dict`
CHANGE COLUMN `creator` `created_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建者' AFTER `created_time`,
CHANGE COLUMN `updator` `updated_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新者' AFTER `updated_time`,
ADD COLUMN `is_delete` tinyint(10) NOT NULL DEFAULT 0 COMMENT '是否已删除' AFTER `updated_by`,
DROP COLUMN `client_id`;



ALTER TABLE `basic_message`.`msg_push_channel`
CHANGE COLUMN `creator` `created_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建者' AFTER `created_time`,
CHANGE COLUMN `updator` `updated_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新者' AFTER `updated_time`,
ADD COLUMN `is_delete` tinyint(10) NOT NULL DEFAULT 0 COMMENT '是否已删除' AFTER `updated_by`,
DROP COLUMN `client_id`;




ALTER TABLE `basic_message`.`msg_strategy`
CHANGE COLUMN `creator` `created_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建者' AFTER `created_time`,
CHANGE COLUMN `updator` `updated_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新者' AFTER `updated_time`,
ADD COLUMN `is_delete` tinyint(10) NOT NULL DEFAULT 0 COMMENT '是否已删除' AFTER `updated_by`,
DROP COLUMN `client_id`;


ALTER TABLE `basic_message`.`msg_template`
CHANGE COLUMN `creator` `created_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建者' AFTER `created_time`,
CHANGE COLUMN `updator` `updated_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新者' AFTER `updated_time`,
ADD COLUMN `is_delete` tinyint(10) NOT NULL DEFAULT 0 COMMENT '是否已删除' AFTER `updated_by`,
DROP COLUMN `client_id`;


ALTER TABLE `basic_message`.`msg_type_info`
ADD COLUMN `created_time` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
ADD COLUMN	`created_by` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '创建者',
ADD COLUMN  `updated_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
ADD COLUMN `updated_by` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '更新者',
ADD COLUMN `is_delete` TINYINT ( 10 ) NOT NULL DEFAULT 0 COMMENT '是否已删除' AFTER `updated_by`,
DROP COLUMN `client_id`;


ALTER TABLE `basic_message`.`msg_main_info`
ADD COLUMN `template_id` bigint(0) NULL COMMENT '模板ID' AFTER `channel_id`;

ALTER TABLE `basic_message`.`msg_main_info`
ADD COLUMN `status` varchar(10) NOT NULL COMMENT '消息状态（runnin:正在发送；finish发送成功；fail：发送失败）' AFTER `template_id`;

ALTER TABLE `basic_message`.`msg_main_info`
ADD COLUMN `send_success` int(0) NULL DEFAULT 0 COMMENT '发送成功数量' AFTER `status`,
ADD COLUMN `send_total` int(0) NULL DEFAULT 0 COMMENT '发送失败数量' AFTER `send_success`;


ALTER TABLE `basic_message`.`msg_main_group`
DROP COLUMN `content`,
DROP COLUMN `template_id`,
DROP COLUMN `status`,
DROP COLUMN `sendNum_succ`,
DROP COLUMN `sendNum_total`,
DROP COLUMN `send_time`;

ALTER TABLE `basic_message`.`msg_main_info`
MODIFY COLUMN `task_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '任务id' AFTER `send_time`;

ALTER TABLE `basic_message`.`msg_retry_data`
CHANGE COLUMN `created_time` `start_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '开始时间' AFTER `error_message`,
CHANGE COLUMN `updated_time` `end_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '结束时间' AFTER `start_time`;


ALTER TABLE `basic_message`.`msg_strategy`
ADD COLUMN `job_code` varchar(255) NULL COMMENT '定时任务code' AFTER `config_type`;


CREATE TABLE `msg_content_dict_template` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `template_id` int(11) NOT NULL COMMENT '模板id',
  `content_dict` int(11) NOT NULL COMMENT '参数id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC COMMENT='消息参数与模板关联表';


CREATE TABLE `msg_content_dict_type` (
  `id` int(13) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(255) NOT NULL COMMENT '模板参数分类名称',
  `parent` int(13) NOT NULL DEFAULT '0' COMMENT '模板参数分类父节点',
  `description` varchar(255) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC COMMENT='模板参数分类表';


CREATE TABLE `msg_content_dict_rel_type` (
  `id` int(13) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `msg_content_dict_type_id` int(13) NOT NULL COMMENT '模板参数分类父节点id',
  `msg_content_dict_id` int(13) NOT NULL COMMENT '模板参数id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC COMMENT='模板参数与分类关联关系表';


CREATE TABLE `msg_template_attachment` (
  `id` int(13) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `msg_template_id` int(13) NOT NULL COMMENT '消息模板id',
  `template_attachment` text NOT NULL COMMENT '模板附件',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC COMMENT='消息模板附件表';
