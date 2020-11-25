package cn.com.huacloud.basic.message.dto;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * @program: msg-center
 * @description: 税务消息DTO
 * @author: wanli
 * @create: 2020-08-03 18:47
 **/
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class MsgClientDTO extends BasicModel {
    @ApiModelProperty(value = "客户端id",example = "dzswj")
    private String clientId;
    @ApiModelProperty(value = "客户端秘钥",example = "123456")
    private String secret;
}
