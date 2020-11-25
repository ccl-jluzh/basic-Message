package cn.com.huacloud.basic.message.dto;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.List;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(description = "策略实体DTO")
public class MsgStrategyDTO extends BasicModel {
    /**
     * 主键ID
     */
    @ApiModelProperty(value = "消息主体id",required = false,hidden = true)
    private Long id;

    /**
     * 策略编号
     */
    @ApiModelProperty(value = "策略编号")
    private String strategyCode;

    /**
     * 标题
     */
    @ApiModelProperty(value = "标题")
    private String title;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;

    /**
     * Y有效|N无效
     */
    @ApiModelProperty(value = "是否有效")
    private String currentState;

    //引用模板列表
    @ApiModelProperty(value = "接收人列表",required = true,hidden = false)
    private List<MsgTemplateDTO> templateList;

    //接收人列表
    @ApiModelProperty(value = "接收人列表",required = true,hidden = false)
    private List<MsgStrategyUserDTO> receiverList;

    //抄送人列表
    @ApiModelProperty(value = "抄送人列表",required = true,hidden = false)
    private List<MsgStrategyUserDTO> ccmanList;

    @ApiModelProperty(value = "cron表达式")
    private String cron;


    @ApiModelProperty(value = "配置类型")
    private String configType;

    @ApiModelProperty(value = "任务ID")
    private String jobCode;
}
