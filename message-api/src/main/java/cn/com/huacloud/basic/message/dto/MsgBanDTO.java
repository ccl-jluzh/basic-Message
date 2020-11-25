package cn.com.huacloud.basic.message.dto;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;


/**
 * @program: msg-center
 * @description: 消息屏蔽DTO
 * @author: wanli
 * @create: 2020-08-03 18:47
 **/
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MsgBanDTO extends BasicModel {

    private String userId;

    private String msgTypeCode;

    private String banFlag;

}
