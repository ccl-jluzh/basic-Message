package cn.com.huacloud.basic.message.vo;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import cn.com.huacloud.basic.message.dto.MsgStrategyDTO;
import cn.com.huacloud.basic.message.dto.MsgTemplateDTO;
import lombok.*;

import java.util.Date;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MsgMainGroupVO extends BasicModel {
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

    /**
     * 策略DTO
     */
    private MsgStrategyDTO msgStrategyDTO;

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
    private Integer sendnumSucc;

    /**
     * 发送总数
     */
    private Integer sendnumTotal;

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


}
