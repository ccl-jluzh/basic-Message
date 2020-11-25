package cn.com.huacloud.basic.message.dto;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import cn.com.huacloud.basic.message.common.validator.group.Create;
import cn.com.huacloud.basic.message.common.validator.group.Update;
import lombok.*;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Null;
import java.io.Serializable;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MsgPushChannelDto extends BasicModel implements Serializable {
    /**
     * 主键ID
     */
    private Integer channelId;

    /**
     * 渠道名称
     */
    @Null
    private String clientId;

    /**
     * 渠道名称
     */
    @NotBlank(groups = {Create.class},message = "请输入渠道名称")
    private String channelName;

    /**
     * 描述
     */
    private String description;

    /**
     * 处理器类名
     */
    @NotBlank(groups = {Create.class},message = "请输入渠道处理器")
    @Null(groups = {Update.class})
    private String processor;

    /**
     * 交换机名称
     */
    @NotBlank(groups = {Create.class},message = "请输入渠道的交换机")
    @Null(groups = {Update.class})
    private String exchange;

    /**
     * 队列名称
     */
    @NotBlank(groups = {Create.class},message = "请输入渠道队列名称")
    @Null(groups = {Update.class})
    private String queueName;

    /**
     * 路由键
     */
    @NotBlank(groups = {Create.class},message = "请输入渠道的路由键")
    @Null(groups = {Update.class})
    private String routeKey;

    /**
     * Y有效|N无效
     */
    @Null
    private String currentState;
}
