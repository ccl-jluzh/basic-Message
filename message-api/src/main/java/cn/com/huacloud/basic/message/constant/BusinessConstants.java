package cn.com.huacloud.basic.message.constant;


/**业务常量
 * Created by zhoudw
 * 2020-09-18 15:13.
 */
public class BusinessConstants {
    //模板


    //策略
      //接收人类型  接收/抄送
    public static final Integer STRATEGY_USER_RECEIVER = 0;
    public static final Integer STRATEGY_USER_CCMAN = 1;
    //分类

    //消息分组（历史消息）
      //发送状态
    public static final String MESSAGE_GROUP_SEND_STATUS_RUNNING = "running";
    public static final String MESSAGE_GROUP_SEND_STATUS_FINSIH = "finish";
    public static final String MESSAGE_GROUP_SEND_STATUS_FAIL = "fail";

}
