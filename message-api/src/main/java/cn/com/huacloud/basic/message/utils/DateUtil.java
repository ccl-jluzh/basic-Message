package cn.com.huacloud.basic.message.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author zhangbao
 * @Description //TODO Java8 时间工具类
 * @Date 2019/12/9 17:50
 * @Version 1.0
 **/
public class DateUtil {

    public static final String YYYY_MM_DD = "yyyy-MM-dd";

    public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    public static final String HH_MM_SS = "HH:mm:ss";

    // 根据指定格式显示日期和时间
    /** yyyy-MM-dd */
    private static final DateTimeFormatter yyyyMMdd_EN = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    /** yyyy-MM-dd HH */
    private static final DateTimeFormatter yyyyMMddHH_EN = DateTimeFormatter.ofPattern("yyyy-MM-dd HH");
    /** yyyy-MM-dd HH:mm */
    private static final DateTimeFormatter yyyyMMddHHmm_EN = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    /** yyyy-MM-dd HH:mm:ss */
    private static final DateTimeFormatter yyyyMMddHHmmss_EN = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    /** HH:mm:ss */
    private static final DateTimeFormatter HHmmss_EN = DateTimeFormatter.ofPattern("HH:mm:ss");
    /** yyyy年MM月dd日 */
    private static final DateTimeFormatter yyyyMMdd_CN = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
    /** yyyy年MM月dd日HH时 */
    private static final DateTimeFormatter yyyyMMddHH_CN = DateTimeFormatter.ofPattern("yyyy年MM月dd日HH时");
    /** yyyy年MM月dd日HH时mm分 */
    private static final DateTimeFormatter yyyyMMddHHmm_CN = DateTimeFormatter.ofPattern("yyyy年MM月dd日HH时mm分");
    /** yyyy年MM月dd日HH时mm分ss秒 */
    private static final DateTimeFormatter yyyyMMddHHmmss_CN = DateTimeFormatter.ofPattern("yyyy年MM月dd日HH时mm分ss秒");
    /** HH时mm分ss秒 */
    private static final DateTimeFormatter HHmmss_CN = DateTimeFormatter.ofPattern("HH时mm分ss秒");



    /**
     * 获取当前日期
     *
     * @return yyyy-MM-dd
     * @author zero 2019/03/30
     */
    public static String getNowDate_EN() {
        return String.valueOf(LocalDate.now());
    }

    /**
     * 获取当前日期
     *
     * @return 字符串yyyy-MM-dd HH:mm:ss
     * @author zero 2019/03/30
     */
    public static String getNowTime_EN() {
        return LocalDateTime.now().format(yyyyMMddHHmmss_EN);
    }

    /** 获取当前时间（yyyy-MM-dd HH） */
    public static String getNowTime_EN_yMdH() {
        return LocalDateTime.now().format(yyyyMMddHH_EN);
    }

    /**
     * 获取当前时间(yyyy-MM-dd)
     * @return
     */
    public static String getNowTime_EN_YMD(){
        return LocalDateTime.now().format(yyyyMMdd_EN);
    }

    /** 获取当前时间（yyyy年MM月dd日） */
    public static String getNowTime_CN_yMdH() {
        return LocalDateTime.now().format(yyyyMMddHH_CN);
    }

    /** 获取当前时间（yyyy-MM-dd HH:mm） */
    public static String getNowTime_EN_yMdHm() {
        return LocalDateTime.now().format(yyyyMMddHHmm_EN);
    }

    /** 获取当前时间（yyyy年MM月dd日HH时mm分） */
    public static String getNowTime_CN_yMdHm() {
        return LocalDateTime.now().format(yyyyMMddHHmm_CN);
    }

    /** 获取当前时间（HH时mm分ss秒） */
    public static String getNowTime_CN_HHmmss() {
        return LocalDateTime.now().format(HHmmss_CN);
    }

    /**
     * 根据日期格式，获取当前时间
     *
     * @param formatStr 日期格式<br>
     *        <li>yyyy</li>
     *        <li>yyyy-MM-dd</li>
     *        <li>yyyy-MM-dd HH:mm:ss</li>
     *        <li>HH:mm:ss</li>
     * @return
     * @author zero 2019/03/30
     */
    public static String getTime(String formatStr) {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(formatStr));
    }

    /**
     * 获取中文的当前日期
     *
     * @return yyyy年mm月dd日
     * @author zero 2019/03/30
     */
    public static String getNowDate_CN() {
        return LocalDate.now().format(yyyyMMdd_CN);
    }

    /**
     * 获取中文当前时间
     *
     * @return yyyy年MM月dd日HH时mm分ss秒
     * @author zero 2019/03/30
     */
    public static String getNowTime_CN() {
        return LocalDateTime.now().format(yyyyMMddHHmmss_CN);
    }

    /**
     * LocalDate 转 Date
     *
     * @param localDate
     * @return Date
     */
    public static Date localDateToDate(LocalDate localDate) {
        if (localDate == null) {
            return null;
        }
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zdt = localDate.atStartOfDay(zoneId);
        return Date.from(zdt.toInstant());
    }

    /**
     * LocalDate 转 Date
     *
     * @param localDateTime
     * @return Date
     */
    public static Date localDateTimeToDate(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return null;
        }
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }


    /**
     * LocalDate 转 String
     * @param localDate
     * @param formatStr
     * @return
     */
    public static String dateToString(LocalDate localDate,String formatStr){
        if (localDate == null) {
            return null;
        }
        return localDate.format(DateTimeFormatter.ofPattern(formatStr));
    }

    /**
     * LocalDateTime 转 String
     * @param localDate
     * @param formatStr
     * @return
     */
    public static String dateTimeToString(LocalDateTime localDate,String formatStr){
        if (localDate == null) {
            return null;
        }
        return localDate.format(DateTimeFormatter.ofPattern(formatStr));
    }


    /**
     * String 转 LocalDateTime
     * @param date
     * @return
     */
    public static LocalDateTime stringToLocalDateTime(String date){
        DateTimeFormatter dtf = yyyyMMddHHmmss_EN;
        LocalDateTime parse = LocalDateTime.parse(date, dtf);
        return parse;
    }

    /**
     * String 转 LocalDate
     * @param date
     * @return
     */
    public static LocalDate stringToLocalDate(String date){
        DateTimeFormatter dtf = yyyyMMddHHmmss_EN;
        LocalDate parse = LocalDate.parse(date, dtf);
        return parse;
    }

    /**
     * String  转 Date
     * @param date
     * @return
     */
    public static Date stringToDate(String date){
        DateTimeFormatter dtf = yyyyMMddHHmmss_EN;
        LocalDateTime parse = LocalDateTime.parse(date, dtf);
        return localDateTimeToDate(parse);
    }


    public static Date stringToDateFormat(String date, String format){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
        LocalDateTime parse = LocalDateTime.parse(date, dtf);
        return localDateTimeToDate(parse);
    }

    public static boolean isInTimeTnterval(Date nowTime, String startDate, String endDate){
        Date startTime = getHh_mm_ss(startDate);
        Date endTime = getHh_mm_ss(endDate);
        Date currentTime = getHh_mm_ss(getHh_mm_ss(nowTime));
        if(startTime.getTime() <= currentTime.getTime() && currentTime.getTime() <= endTime.getTime()){
            return false;
        } else {
            return true;
        }
    }

    public static Date getHh_mm_ss(String date) {
        try {
            String nowStr = getNowTime_EN_YMD()+ " " + date;
            return stringToDate(nowStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getHh_mm_ss(Date date) {
        return  hh_mm_ss.format(date);
    }


    public static String getYyyy_mm_dd(Date date) {
        return  yyyy_mm_dd.format(date);
    }

    public static Date getYyyy_mm_dd_hh_mm_ss(String date) {
        try {
            return  yyyy_mm_dd_hh_mm_ss.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Date nextDay(Date date){
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DAY_OF_MONTH,1);     //利用Calendar 实现 Date日期+1天
        return  c.getTime();
    }

    private static DateFormat hh_mm_ss = null;
    private static DateFormat yyyy_mm_dd = null;
    private static DateFormat yyyy_mm_dd_hh_mm_ss = null;

    //初始化
    static {
        hh_mm_ss = new SimpleDateFormat(HH_MM_SS);
        yyyy_mm_dd = new SimpleDateFormat(YYYY_MM_DD);
        yyyy_mm_dd_hh_mm_ss = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS);
    }


/*    public static void main(String[] args){
        Date now = getHh_mm_ss("10:20:11");
        //yyyyMMdd_EN
        String nowStr = DateUtil.getNowTime_EN_YMD()+ " 10:20:11";
        now =DateUtil.stringToDate(nowStr);


        boolean result = isInTimeTnterval(now, "23:10:10", "10:20:10");
        Date nowTime = new Date();
        System.out.println(nextDay(getYyyy_mm_dd_hh_mm_ss(getYyyy_mm_dd(nowTime) + " 10:20:10")));
    }*/


}
