package cn.com.huacloud.basic.message.vo;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import lombok.*;

import java.util.Date;

@ToString
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MsgTemplateVO extends BasicModel {
    /**
     * 主键ID
     */

    private Long id;

    /**
     * 模板编号
     */

    private String templateCode;

    /**
     * 模板标题
     */

    private String templateTitle;

    /**
     * 描述
     */
    private String description;

    /**
     * 渠道id
     */

    private Integer channelId;

    /**
     * 策略引用数
     */

    private Integer strategyNum;

    /**
     * 一级分类
     */

    private Integer msgTypeOneLevel;


    private String msgTypeOneLevelName;

    /**
     * 二级分类
     */

    private Integer msgTypeTwoLevel;


    private String msgTypeTwoLevelName;
    /**
     * Y有效|N无效
     */

    private String currentState;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 创建者
     */
    private String creator;

    /**
     * 更新时间
     */
    private Date updatedTime;

    /**
     * 更新者
     */
    private String updator;

    /**
     * 客户端系统id
     */
    private String clientId;

    /**
     * 模板内容
     */
    private String templateContext;

}
