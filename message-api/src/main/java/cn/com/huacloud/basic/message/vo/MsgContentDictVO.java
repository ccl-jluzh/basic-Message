package cn.com.huacloud.basic.message.vo;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import lombok.*;

import java.util.Date;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MsgContentDictVO extends BasicModel {
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

    /**
     * 渠道所属客户端
     */

    private String clientId;

    /**
     * 创建时间
     */

    private Date createdTime;

    /**
     * 创建者
     */

    private String creator;

    /**
     * 更新时间
     */

    private Date updatedTime;

    /**
     * 更新者
     */

    private String updator;

}
