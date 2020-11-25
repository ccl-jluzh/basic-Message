package cn.com.huacloud.basic.message.dto;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import lombok.*;

/**
 * Created by zhoudw
 * 2020-09-18 11:21.
 */
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(description = "策略接收人，抄送人实体DTO")
public class MsgStrategyUserDTO extends BasicModel {

    /**
     * 主键ID
     */
    private Long id;

//    /**
//     * 策略id
//     */
//    private Long strategyId;

    /**
     * 类型:(0接收人，1抄送人)
     */
    private Integer type;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 邮箱
     */
    private String mail;

}
