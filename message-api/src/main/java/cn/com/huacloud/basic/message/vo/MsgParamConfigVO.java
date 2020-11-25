package cn.com.huacloud.basic.message.vo;
import cn.com.huacloud.basic.datasource.model.BasicModel;
import lombok.*;

import java.io.Serializable;

@Data
@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MsgParamConfigVO extends BasicModel implements Serializable  {

    private Integer id;


    private String configName;

    /**
     * 属性值
     */

    private String configValue;



}
