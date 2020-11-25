package cn.com.huacloud.basic.message.dto.result;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.Date;

/**
 * Created by zhoudw
 * 2020-09-29 14:24.
 */
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuerySendLogDTO extends BasicModel {

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+08")
    private Date sendTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+08")
    private Date receiveTime;

    //状态 消息状态（0待发送；1已接收；2已读；）
    private Integer status;

    /**
     * 失败日志
     */
    private String log;

}
