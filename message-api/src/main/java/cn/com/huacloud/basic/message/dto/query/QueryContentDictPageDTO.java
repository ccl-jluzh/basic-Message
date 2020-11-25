package cn.com.huacloud.basic.message.dto.query;

import io.swagger.annotations.ApiModel;
import lombok.*;

/**
 * Created by zhoudw
 * 2020-09-28 15:11.
 */
@Data
@Setter
@Getter
@NoArgsConstructor
@ApiModel(description = "内容字典列表请求DTO")
public class QueryContentDictPageDTO extends BaseQueryPageDTO{
}
