package cn.com.huacloud.basic.message.dto;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import lombok.*;

import java.util.List;

/**模板前端请求 DTO
 * Created by zhoudw
 * 2020-08-19 16:01.
 */
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MsgTemplateDTO extends BasicModel {
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
     * 渠道名称
     */
    private MsgPushChannelDto msgPushChannel;

    /**
     * 一级分类id
     */
    private Integer msgTypeOneLevel;

    /**
     * 一级分类姓名
     */
    private String msgTypeOneLevelName;

    /**
     * 二级分类
     */
    private Integer msgTypeTwoLevel;

    /**
     * 二级分类姓名
     */
    private String msgTypeTwoLevelName;

    /**
     * 模板内容
     */
    private String templateContext;

    /*附件*/
    private List<String> attachments;
}
