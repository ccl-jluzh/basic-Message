package cn.com.huacloud.basic.message.dto;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

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
public class QueryMsgDTO extends BasicModel {
    //推送消息的任务id，使用uuid
    private String taskId;
    //推送消息的批次号
    private Integer batchNum;
    //消息类型
    private String msgTypeCode;
    //消息来源
    private String clientId;
    //发件人
    private String sender;
    //收件人
    private String receiver;
    //主消息id
    private Long mainMsgId;
    //用户消息id
    private Long userMsgId;

    private String sendChannel;

    private String status;

    //页码
    @ApiModelProperty(name = "页码",example = "1",required = true)
    private Integer pageNum;
    //每页记录数
    @ApiModelProperty(name = "每页记录数",example = "20",required = true)
    private Integer pageSize;

}
