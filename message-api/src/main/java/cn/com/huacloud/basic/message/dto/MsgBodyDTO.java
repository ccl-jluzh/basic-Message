package cn.com.huacloud.basic.message.dto;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.List;
import java.util.Map;

/**
 * @program: msg-center
 * @description: 消息体,记录推送消息的实际内容
 * @author: wanli
 * @create: 2020-08-03 18:52
 **/
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MsgBodyDTO extends BasicModel {
     //消息类型
     private String msgTypeCode;
     //消息标题
     private String title;
     //消息内容
     private String content;

     //扩展信息
     private Map<String,Object> extentInfo;

     //附件信息
     private List<MsgAttachDTO> attachList;
}
