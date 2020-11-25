package cn.com.huacloud.basic.message.dto;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import lombok.*;

/**
 * @program: msg-center
 * @description: 消息
 * @author: wanli
 * @create: 2020-08-03 18:52
 **/
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MsgAttachDTO extends BasicModel {
    //文件id
    private String fileId;
     //文件名称
    private String fileName;
    //文件url
    private String fileUrl;

}
