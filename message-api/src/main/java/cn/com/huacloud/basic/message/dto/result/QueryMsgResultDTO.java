package cn.com.huacloud.basic.message.dto.result;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import lombok.*;

import java.util.Date;

/**
 * @program: msg-center
 * @description: 查询消息Dto
 * @author: wanli
 * @create: 2020-08-03 18:47
 **/
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(description = "查询消息Dto")
public class QueryMsgResultDTO extends BasicModel {
    //推送消息的任务id，使用uuid
    private String taskId;
    //推送消息的批次号
    private Integer batchNum;
    //推送类型  0即时推送    1定时推送
    private Integer sendType;

    //消息推送时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+08")
    private Date sendTime;

    //消息推送优先级，默认为0，最大为10
    private Integer priority;

    //消息来源
    private String clientId;

    //发件人
    private String sender;

    //接收人
    private String receiver;

    //状态 消息状态（0待发送；1已接收；2已读；）
    private Integer status;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+08")
    private Date receiveTime;

    //消息推送渠道
    private Integer sendChannel;

    //消息模板类型
    private Integer templateType;

    private Long mainMsgId;
    private Long userMsgId;
    private String msgType;
    private String title;
    private String content;

}
