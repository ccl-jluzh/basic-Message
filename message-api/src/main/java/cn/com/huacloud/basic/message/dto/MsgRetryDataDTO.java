package cn.com.huacloud.basic.message.dto;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import lombok.*;

import java.util.Date;

/**
 * ClassName: MsgRetryDataDTO
 * Description:
 * date: 2020/8/13 15:05
 *
 * @author linhuanyou
 */
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MsgRetryDataDTO extends BasicModel {
    //业务Id
    private String dataId;
    //最大次数
    private Integer maxRetryCount;
    //api信息
    private String apiInfo;
    //错误信息
    private String errorMessage;

    private Date startTime;
    private Date endTime;

    /*是否自动重试 1-->自动重试 0-->手动将错误消息重试*/
    private Integer isAuto=1;
}
