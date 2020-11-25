package cn.com.huacloud.basic.message.dto.query;

import lombok.*;

import java.util.List;

/**
 * Created by zhoudw
 * 2020-09-18 15:52.
 */
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class QueryStrategyPageDTO extends BaseQueryPageDTO {

    /**
     * 当前状态：Y可用，N不可用
     */
    private List<String> currentStates;




}
