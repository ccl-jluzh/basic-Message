package cn.com.huacloud.basic.message.dto;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import lombok.*;

/**
 * @program: msg-center
 * @description: 推送到mq的消息封装
 * @author: wanli
 * @create: 2020-08-03 18:47
 **/
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel("推送到mq的消息封装")
public class MqMessageDTO extends BasicModel {

     //消息
     private  Object msg;



}
