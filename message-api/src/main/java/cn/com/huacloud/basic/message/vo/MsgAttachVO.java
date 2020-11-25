package cn.com.huacloud.basic.message.vo;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import lombok.*;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MsgAttachVO extends BasicModel {
    //文件id
    private String fileId;
    //文件名称
    private String fileName;
    //文件url
    private String fileUrl;
}
