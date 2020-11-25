package cn.com.huacloud.basic.message.dto;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.Date;

/**
 * Created by zhoudw
 * 2020-09-25 15:11.
 */
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MsgMainGroupDTO extends BasicModel {

    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 模板id
     */
    private Long strategyId;

    /**
     * 策略编号
     */
    private String strategyCode;

    private String strategyName;

    /**
     * 模板id
     */
    private Long templateId;

    /**
     * 模板DTO
     */
    private MsgTemplateDTO msgTemplateDTO;

    /**
     * 消息状态（running 正在发送；finish发送结束；）
     */
    private String status;

    /**
     * 消息来源
     */
    private String clientId;

    /**
     * 发送成功数
     */
    private Integer sendSuccess;

    /**
     * 发送总数
     */
    private Integer sendTotal;

    /**
     * 发送类型（0即时推送 1定时推送）
     */
    private Integer sendType;

    /**
     * 发送人
     */
    private String sender;

    /**
     * 发送时间
     */
    private Date sendTime;

    /**
     * 消息内容
     */
    private String content;



    @ApiModelProperty(value = "消息策略")
    private MsgStrategyDTO msgStrategyDTO;

}
