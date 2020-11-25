package cn.com.huacloud.basic.message.dto.query;

import io.swagger.annotations.ApiModel;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 模板列表请求DTO
 * Created by zhoudw
 * 2020-08-11 19:07.
 */
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("模板列表请求DTO")
public class QueryTemplatePageDTO extends BaseQueryPageDTO{

    /**
     * 渠道id
     */
    private Integer channelId;

    /**
     * 当前状态：Y可用，N不可用
     */
    private String currentState;

    /**
     * 一级分类
     */
    private List<String> oneTypeLevels = new ArrayList<>();

    /**
     * 二级分类
     */
    private List<String>  twoTypeLevels = new ArrayList<>();

}
