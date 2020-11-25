package cn.com.huacloud.basic.message.dto;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import lombok.*;

/**
 * @program: msg-center
 * @description: 消息接收者
 * @author: wanli
 * @create: 2020-08-03 18:53
 **/
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MsgReceiverDTO extends BasicModel {
    //接收人类型
    private String jsrType;

    //接收人识别号
    private String jsrsbh;

    //手机号
    private String mobile;

    //邮箱
    private String email;
}
