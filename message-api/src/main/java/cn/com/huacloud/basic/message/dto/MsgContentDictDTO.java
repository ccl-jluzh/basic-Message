package cn.com.huacloud.basic.message.dto;


import cn.com.huacloud.basic.datasource.model.BasicModel;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MsgContentDictDTO extends BasicModel {

    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 属性
     */
    private String propertyName;

    /**
     * 属性值
     */
    private String propertyValue;

    /**
     * 注释
     */
    private String comment;


    /*一级分类Id*/
    private Long msgContentDictTpyeOneId;

    /*二级分类ID*/
    private Long msgContentDictTpyeTwoId;
}
