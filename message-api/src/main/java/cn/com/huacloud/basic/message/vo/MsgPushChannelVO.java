package cn.com.huacloud.basic.message.vo;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MsgPushChannelVO extends BasicModel implements Serializable {
    /**
     * 主键ID
     */

    private Integer channelId;

    /**
     * 渠道名称
     */

    private String clientId;

    /**
     * 渠道名称
     */

    private String channelName;

    /**
     * 描述
     */
    private String description;

    /**
     * 处理器类名
     */

    private String processor;

    /**
     * 交换机名称
     */

    private String exchange;

    /**
     * 队列名称
     */

    private String queueName;

    /**
     * 路由键
     */

    private String routeKey;

    /**
     * Y有效|N无效
     */

    private String currentState;

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
