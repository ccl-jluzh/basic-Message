package cn.com.huacloud.basic.message.dto;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import lombok.*;

/**
 * @program: msg-center
 * @description: 发送短信实体
 * @author: wanli
 * @create: 2020-08-11 19:51
 **/
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SmsDTO extends BasicModel {
    private String mobile;

    private String content;
}
