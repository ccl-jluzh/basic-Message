package cn.com.huacloud.basic.message.dto.result;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

/**发送详情DTO
 * Created by zhoudw
 * 2020-09-29 11:13.
 */
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuerySendListDTO extends BasicModel {

    /**
     * 编号
     */
    private Long userMsgId;

    /**
     * 接收人
     */
    private String receiver;


    //状态 消息状态（0待发送；1已接收；2已读；）
    private Integer status;

    /**
     * 接收人日志
     */
    private List<QuerySendLogDTO> sendLogDTOS = new ArrayList<>();

}
