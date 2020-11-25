package cn.com.huacloud.basic.message.dto.query;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import io.swagger.annotations.ApiModel;
import lombok.*;

/**
 * 基本列表请求DTO
 * Created by zhoudw
 * 2020-08-11 19:15.
 */
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "基本列表请求DTO")
public class BaseQueryPageDTO extends BasicModel {

    private String searchKey;

}
