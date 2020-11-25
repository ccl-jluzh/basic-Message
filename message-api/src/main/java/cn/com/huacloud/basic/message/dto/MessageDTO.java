package cn.com.huacloud.basic.message.dto;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.Date;
import java.util.List;

/**
 * @program: msg-center
 * @description: 消息DTO
 * @author: wanli
 * @create: 2020-08-03 18:47
 **/
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(description = "消息推送实体DTO")
public class MessageDTO extends BasicModel {

    @ApiModelProperty(value = "消息主体id",required = false,hidden = true)
    private Long msgId;

    @ApiModelProperty(value = "消息分组表id",required = false,hidden = true)
    private Long groupId;

    /**
     * 推送消息的任务id，使用uuid
     */
    @ApiModelProperty(value = "推送消息的任务id，使用uuid",required = false,hidden = true,example = "3a1a6451-3394-4051-8831-7e1b0f13a1d0")
    private String taskId;

    /**
     * 推送消息的批次号
     */
    @ApiModelProperty(value = "相同任务ID分批推送的批次号",required = false,hidden = false)
    private Integer batchNum;

    /**
     * 推送类型  0即时推送    1定时推送
     */
    @ApiModelProperty(value = "推送类型",required = true,allowableValues = "0,1",example = "0")
    private Integer sendType;

    /**
     * 消息推送时间
     */
    @ApiModelProperty(value = "推送时间",required = false,example = "2020-08-15 07:14:03")
    private Date sendTime;

    /**
     * 消息推送优先级，默认为1，最大为10
     */
    @ApiModelProperty(value = "推送优先级",required = true,allowableValues = "1,2,3,4,5,6,7,8,9,10",example = "1")
    private Integer priority ;

    /**
     * 消息来源
     */
    @ApiModelProperty(value = "消息来源",required = false,hidden = true)
    private String clientId;

    /**
     * 发件人
     */
    @ApiModelProperty(value = "发件人",required = true,hidden = false)
    private String sender;

    /**
     * 消息推送渠道
     */
    @ApiModelProperty(value = "推送渠道",required = true,hidden = false)
    private Integer sendChannel;

    //消息模板类型
    //private Integer templateType;

    /**
     * 消息体
     */
    @ApiModelProperty(value = "消息体",required = true,hidden = false)
    private MsgBodyDTO msgBody;

    /**
     * 接收人列表
     */
    @ApiModelProperty(value = "接收人列表",required = true,hidden = false)
    private List<MsgReceiverDTO> receiverList;

    //抄送人列表
    @ApiModelProperty(value = "抄送人列表",required = true,hidden = false)
    private List<MsgReceiverDTO> ccmanList;

    private Long templateId;

    private String status;

    /*是否为xxl-job的定时任务 0 --> 否 1-->是*/
    private Integer isTiming=0;

    /*是否自动重试 1-->自动重试 0-->手动将错误消息重试*/
    private Integer isAuto=1;

    /*是否是失败手动重试的消息 0-->不是 1-->是*/
    private Integer isReSendMsg=0;

}
