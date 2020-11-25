package cn.com.huacloud.basic.message.vo;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import cn.com.huacloud.basic.message.dto.MsgStrategyUserDTO;
import cn.com.huacloud.basic.message.dto.MsgTemplateDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.List;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MsgStrategyVO extends BasicModel {
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

}
