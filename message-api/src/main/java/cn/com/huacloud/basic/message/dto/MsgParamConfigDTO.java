package cn.com.huacloud.basic.message.dto;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import cn.com.huacloud.basic.message.common.validator.group.Create;
import cn.com.huacloud.basic.message.common.validator.group.Update;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.*;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MsgParamConfigDTO extends BasicModel {
    /**
     * 主键ID
     */

    @Null(groups = {Create.class})
    @NotNull(groups = {Update.class}, message = "请输入参数配置Id")
    private Integer id;

    /**
     * 属性
     */

    @NotBlank(groups = {Create.class}, message = "请输入配置名称")
    private String configName;

    /**
     * 属性值
     */

    @NotBlank(groups = {Create.class}, message = "请输入配置值")
    private String configValue;


}