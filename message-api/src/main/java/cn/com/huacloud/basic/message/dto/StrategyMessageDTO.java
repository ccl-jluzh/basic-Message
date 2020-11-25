package cn.com.huacloud.basic.message.dto;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import lombok.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhoudw
 * 2020-09-18 17:19.
 */
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(description = "策略消息推送实体DTO")
public class StrategyMessageDTO extends BasicModel {


    /**
     * 发送人
     */
    private String sender;

    /**
     * 策略id
     */
    private Long strategyId;


    /**
     * 占位符参数
     */
    private Map<String,String> params = new HashMap<>();

    /**
     * 接收人信息
     */
    private List<MsgReceiverDTO> receivers = new ArrayList<>();


    /**
     * 抄送人信息
     */
    private List<MsgReceiverDTO> ccmans = new ArrayList<>();


}
