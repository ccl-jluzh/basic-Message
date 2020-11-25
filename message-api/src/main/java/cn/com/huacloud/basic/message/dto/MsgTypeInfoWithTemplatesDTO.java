package cn.com.huacloud.basic.message.dto;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import lombok.*;

import java.util.List;

/** 模板分类和属于该分类的模板合集
 * Created by zhoudw
 * 2020-10-14 19:55.
 */
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MsgTypeInfoWithTemplatesDTO extends BasicModel {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 消息类型名称
     */
    private String typeName;

    /**
     * 父类别id
     */
    private Integer parentId;

    /**
     * 是否有数据
     */
    private boolean hasData;

    List<MsgTypeInfoWithTemplatesDTO> children;

    //属于此分类的模板数据
    List<MsgTemplateDTO> msgTemplateDTOS;
}
