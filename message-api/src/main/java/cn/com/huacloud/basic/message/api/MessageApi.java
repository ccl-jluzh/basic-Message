package cn.com.huacloud.basic.message.api;

/**
 * @ClassName : MessageApi
 * @Description :
 * @Author : xuye0422
 * @Date: 2020-10-21 10:57
 */
public class MessageApi {

    //-----------attach ---------//
    public static final String ATTACH_UPLOAD = "/attach/upload";
    public static final String ATTACH_DOWNLOAD = "/attach/download";
    public static final String ATTACH_DELETE = "/attach/delete";

    //---------content dict----------//
    public static final String CONTENTDICT_ADD = "/dict/add";
    public static final String CONTENTDICT_UPDATE = "/dict/update";
    public static final String CONTENTDICT_ONE_ID = "/dict/one/id";
    public static final String CONTENTDICT_BATCHDELETE = "/dict/batchDelete";
    public static final String CONTENTDICT_LIST = "/dict/list";
    public static final String CONTENTDICT_LIST_ALL = "/dict/list/all";

    //---------content dict type----------//
    public static final String CONTENT_DICT_TYPE_ADD = "/dict/type/add";
    public static final String CONTENT_DICT_TYPE_UPDATE = "/dict/type/update";
    public static final String CONTENT_DICT_TYPE_DELETE = "/dict/type/delete";
    public static final String CONTENT_DICT_TYPE_LIST = "/dict/type/list";
    public static final String CONTENT_DICT_LIST_BY_TYPE = "/dict/type/dictListByType";


    //----------message---------//
    public static final String MESSAGE_SENDMSG = "/sendMsg";
    public static final String MESSAGE_GETMSG = "/getMsg";
    public static final String MESSAGE_USERMSGPAGE = "/userMsgPage";
    public static final String MESSAGE_UPDATEMSGSTATUS = "/updateMsgStatus";
    public static final String MESSAGE_RESENDMSG = "/reSendMsg";
    public static final String MESSAGE_WEBSOCKET_SENDMSG = "/websocketSendMsg";

    //------message group-------//
    public static final String MESSAGEGROUP_LIST = "/group/list";
    public static final String MESSAGEGROUP_ONE_ID = "/group/one/id";
    public static final String MESSAGEGROUP_SENDLIST = "/group/sendList";
    public static final String MESSAGEGROUP_BATCHDELETE = "/group/batchDelete";
    public static final String MESSAGEGROUP_MESSAGEGROUPADD = "/group/messageGroupAdd";

    //-------msgban------//
    public static final String MSGBAN_BANMSGTYPE = "/msgban/banMsgType";
    public static final String MSGBAN_FINDBYUSERID = "/msgban/findByUserId";
    public static final String MSGBAN_VALIDATE = "/msgban/validate";

    //-------paramconfig------//
    public static final String PARAMCONFIG_ADD = "/param/config/add";
    public static final String PARAMCONFIG_UPDATE = "/param/config/update";
    public static final String PARAMCONFIG_ONE = "/param/config/one";
    public static final String PARAMCONFIG_LIST = "/param/config/list";

    //------pushchannel------//
    public static final String PUSHCHANNEL_ADD = "/channel/add";
    public static final String PUSHCHANNEL_UPDATE = "/channel/update";
    public static final String PUSHCHANNEL_ONE_ID = "/channel/one/id";
    public static final String PUSHCHANNEL_LIST = "/channel/list";

    //-------strategy-----//
    public static final String STRATEGY_ADD = "/strategy/add";
    public static final String STRATEGY_UPDATE = "/strategy/update";
    public static final String STRATEGY_ONE_ID = "/strategy/one/id";
    public static final String STRATEGY_LIST = "/strategy/list";
    public static final String STRATEGY_BATCHDELETE = "/strategy/batchDelete";
    public static final String STRATEGY_UPDATESTATE_ID = "/strategy/updateState/{id}";
    public static final String STRATEGY_SENDMSG = "/strategy/sendMsg";

    //-----template-----//
    public static final String TEMPLATE_ADD = "/template/add";
    public static final String TEMPLATE_UPDATE = "/template/update";
    public static final String TEMPLATE_BATCHRECYCLE = "/template/batchRecycle";
    public static final String TEMPLATE_BATCHRESTORE = "/template/batchRestore";
    public static final String TEMPLATE_BATCHDELETE = "/template/batchDelete";
    public static final String TEMPLATE_ONE_ID = "/template/one/id";
    public static final String TEMPLATE_ONE_CODE = "/template/one/code";
    public static final String TEMPLATE_LIST = "/template/list";
    public static final String STRATEGY_TEMPLATE_LIST = "/template/strategyTemplate/list";

    //------typeinfo-----//
    public static final String TYPEINFO_ADD = "/typeinfo/add";
    public static final String TYPEINFO_UPDATE = "/typeinfo/update";
    public static final String TYPEINFO_ONE_ID = "/typeinfo/one/id";
    public static final String TYPEINFO_LIST = "/typeinfo/list";
    public static final String TYPEINFO_LISTTEMPLATES = "/typeinfo/listTemplates";
    public static final String TYPEINFO_GETLISTBYLEVEL = "/typeinfo/getListByLevel";
    public static final String TYPEINFO_DEL_ID = "/typeinfo/del/id";
    public static final String TYPEINFO_IMPORT = "/typeinfo/import";

    //-----user-----//
    public static final String USER_FINDTENANTLIST = "/user/findTenantList";
    public static final String USER_FINDUSERLIST = "/user/findUserList";
    public static final String USER_FINDGROUPTREE = "/user/findGroupTree";
    public static final String USER_FINDROLELIST = "/user/findRoleList";
}
