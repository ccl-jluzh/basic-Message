package cn.com.huacloud.basic.message.dto;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import lombok.*;

/**
 * @program: msg-center
 * @description: 消息扩展信息
 * @author: wanli
 * @create: 2020-08-03 18:52
 **/
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MsgExtentDTO extends BasicModel {

     private String link;

     private String refNum;

}
