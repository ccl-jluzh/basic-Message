package cn.com.huacloud.basic.message.dto;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import lombok.*;

/** 分类前端请求DTO
 * Created by zhoudw
 * 2020-08-19 16:25.
 */
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MsgTypeInfoDTO extends BasicModel {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 消息类型码
     */
    private String typeCode;

    /**
     * 消息类型名称
     */
    private String typeName;

    /**
     * 消息类型级别
     */
    private Integer typeLevel;

    /**
     * 父类别id
     */
    private Integer parentId;

}
