package cn.com.huacloud.basic.message.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("消息参数类型实体类")
public class ContentDictTypeDTO {

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("参数类型名")
    private String name;

    @ApiModelProperty("父类型Id")
    private Long parent;

    @ApiModelProperty("描述信息")
    private String description;
}
