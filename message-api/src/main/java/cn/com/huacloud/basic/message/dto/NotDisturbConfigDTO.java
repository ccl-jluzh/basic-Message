package cn.com.huacloud.basic.message.dto;

import cn.com.huacloud.basic.datasource.model.BasicModel;
import cn.com.huacloud.basic.message.utils.DateUtil;
import lombok.*;

import java.util.Date;

/**
 * ClassName: NotDisturbConfigDTO
 * Description:
 * date: 2020/8/5 10:35
 *
 * @author linhuanyou
 */
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class NotDisturbConfigDTO extends BasicModel {

    private String notDisturbStartTime;

    private String notDisturbEndTime;

    public boolean isInNotDisturbTimeTnterval(Date nowDate){
        return isInNotDisturbTimeTnterval(nowDate,notDisturbStartTime,notDisturbEndTime);
    }

    public boolean isInNotDisturbTimeTnterval(String startTime,String endTime){
        return isInNotDisturbTimeTnterval(new Date(),startTime,endTime);
    }

    public boolean isInNotDisturbTimeTnterval(Date nowDate,String startTime,String endTime){
        return DateUtil.isInTimeTnterval(nowDate,startTime,endTime);
    }

    public Date nextDay(Date nowDate){
        return DateUtil.nextDay(DateUtil.getYyyy_mm_dd_hh_mm_ss(DateUtil.getYyyy_mm_dd(nowDate) + " " + this.notDisturbStartTime.trim()));
    }

}
