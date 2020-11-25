package cn.com.huacloud.basic.message.vo;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import lombok.*;

import java.util.List;


@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MsgTypeInfoVO extends BasicModel {
    /**
     * 主键
     */

    private Integer id;

    /**
     * 消息类型码
     */
    private String typeCode;

    /**
     * 消息类型名称
     */
    private String typeName;

    /**
     * 消息类型级别
     */
    private Integer typeLevel;

    /**
     * 父类别id
     */
    private Integer parentId;


    /**
     * 客户端id
     */
    private String clientId;

    /**
     * 必传标志（Y必传/N非必传，必传消息不能被屏蔽）
     */
    private String mustSendFlag;

    /**
     * 免打扰标志（Y免打扰/N非免打扰）
     */
    private String avoidDisturbFlag;


    List<MsgTypeInfoVO> children;

}
