package cn.com.huacloud.basic.message.dto.query;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import io.swagger.annotations.ApiModel;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

/**历史消息请求DTO
 * Created by zhoudw
 * 2020-09-25 10:14.
 */
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "历史消息请求DTO")
public class QueryMsgGroupPageDTO extends BasicModel {

    private String clientId;

    /**
     * 状态
     */
    private List status = new ArrayList<>();

    /**
     * 渠道id
     */
    private Integer channelId;

    /**
     * 一级分类
     */
    private Integer oneTypeLevel;

    /**
     * 二级分类
     */
    private Integer twoTypeLevel;


    private String searchKey;


}
