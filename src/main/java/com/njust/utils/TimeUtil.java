package com.njust.utils;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class TimeUtil {

	/**
	 * 返回当前日期时间字符串<br>
	 * 默认格式:yyyy-mm-dd hh:mm:ss
	 * 
	 * @return String 返回当前字符串型日期时间
	 */
	public static String getCurrentTime() {
		String returnStr = null;
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		returnStr = f.format(date);
		return returnStr;
	}

	/**
	 * 从当前日期开始 yyyy-MM-dd,前推num天，得到日期集合（包括当前）
	 * 为适应数据库视图v_cash_nonCash的create_time时间格式
	 * 得到的日期集合的格式为180317（表示18年3月17号）
	 * author: mjp
	 * CreateTime:2018/5/8
	 */
	public static List<String> getTimeListFromNowByNum(int num){

		SimpleDateFormat f = new SimpleDateFormat("yyMMdd");

		Calendar ca = Calendar.getInstance();
		List<String> timeList = new LinkedList<>();
		ca.add(Calendar.DAY_OF_MONTH,-num);
		Date start = ca.getTime();
		ca.setTime(start);
		//timeList.add(f.format(start));
		int i= 0;
		while(i<num) {
			ca.add(Calendar.DAY_OF_MONTH, 1);
			timeList.add(f.format(ca.getTime()));
			i++;
		}
		return timeList;
	}

	/**
	 * 给定日期的区间 如2018-03-21 - 2018-03-23
	 * 返回日期区间集合[2018-03-21,2018-03-22,2018-03-23]
	 * @param dateRange
	 * @return
	 */
	public static List<String> getTimesByDateRange(String dateRange) throws Exception{
		//处理dateRange，得到两个起始日期
		String startTime = dateRange.substring(0,10);
		String endTime = dateRange.substring(13,23);
		//得到时间集合
		List<String> dates = new LinkedList<>();
		SimpleDateFormat f1 = new SimpleDateFormat("yyyy-MM-dd");

		Date start = f1.parse(startTime);
		Date end = f1.parse(endTime);
		if(start.equals(end)){
			dates.add(f1.format(start));
		}
		else {
			Calendar ca = Calendar.getInstance();
			ca.setTime(start);
			dates.add(f1.format(start));
			while (true) {
				ca.add(Calendar.DAY_OF_MONTH, 1);
				Date test = ca.getTime();
				dates.add(f1.format(test));
				if (test.equals(end)) {
					break;
				}
			}
		}
		return dates;
	}

	/**
	 * 根据前台传过来的日期区间datRange（格式：2018-05-05 - 2018-05-08）
	 * 转换为时间集合（180505,180506,180507,180508）
	 * author: mjp
	 * CreateTime:2018/5/9
	 * @param dateRange
	 * @return
	 */
	public static List<String> getTimeListByDateRange(String dateRange) throws ParseException,StringIndexOutOfBoundsException{

		//处理dateRange，得到两个起始日期
		String startTime = dateRange.substring(0,10);
		String endTime = dateRange.substring(13,23);
		//得到时间集合
		List<String> dates = new LinkedList<>();
		SimpleDateFormat f1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat f2 = new SimpleDateFormat("yyMMdd");

		Date start = f1.parse(startTime);
		Date end = f1.parse(endTime);
		if(start.equals(end)){
			dates.add(f2.format(start));
		}
		else {
			Calendar ca = Calendar.getInstance();
			ca.setTime(start);
			dates.add(f2.format(start));
			while (true) {
				ca.add(Calendar.DAY_OF_MONTH, 1);
				Date test = ca.getTime();
				dates.add(f2.format(test));
				if (test.equals(end)) {
					break;
				}
			}
		}
		return dates;
	}

	/**
	 * 返回当前日期时间字符串<br>
	 * 默认格式:yyyymmddhhmmss
	 * 
	 * @return String 返回当前字符串型日期时间
	 */
	public static BigDecimal getCurrentTimeAsNumber() {
		String returnStr = null;
		SimpleDateFormat f = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		returnStr = f.format(date);
		return new BigDecimal(returnStr);
	}

	/**
	 * 返回自定义格式的当前日期时间字符串
	 * 
	 * @param format
	 *            格式规则
	 * @return String 返回当前字符串型日期时间
	 */
	public static String getCurrentTime(String format) {
		String returnStr = null;
		SimpleDateFormat f = new SimpleDateFormat(format);
		Date date = new Date();
		returnStr = f.format(date);
		return returnStr;
	}

	/**
	 * 返回当前字符串型日期
	 * 
	 * @return String 返回的字符串型日期
	 */
	public static String getCurDate() {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = simpledateformat.format(calendar.getTime());
		return strDate;
	}

	/**
	 * 返回当前字符串型日期
	 * 
	 * @param format
	 *            格式规则
	 * 
	 * @return String 返回的字符串型日期
	 */
	public static String getCurDate(String format) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpledateformat = new SimpleDateFormat(format);
		String strDate = simpledateformat.format(calendar.getTime());
		return strDate;
	}

	/**
	 * 返回TimeStamp对象
	 * 
	 * @return
	 */
	public static Timestamp getCurrentTimestamp() {
		Timestamp obj = new Timestamp(System.currentTimeMillis());
		return obj;
	}

	/**
	 * 将字符串型日期转换为日期型
	 * 
	 * @param strDate
	 *            字符串型日期
	 * @param srcDateFormat
	 *            源日期格式
	 * @param dstDateFormat
	 *            目标日期格式
	 * @return Date 返回的util.Date型日期
	 */
	public static Date stringToDate(String strDate, String srcDateFormat, String dstDateFormat) {
		Date rtDate = null;
		Date tmpDate = (new SimpleDateFormat(srcDateFormat)).parse(strDate, new ParsePosition(0));
		String tmpString = null;
		if (tmpDate != null) {
			tmpString = (new SimpleDateFormat(dstDateFormat)).format(tmpDate);
		}
		if (tmpString != null) {
			rtDate = (new SimpleDateFormat(dstDateFormat)).parse(tmpString, new ParsePosition(0));
		}
		return rtDate;
	}

	/**
	 * 将字符串返回成util.Date型日期
	 * 
	 * @param datetime
	 *            格式为"yyyy-MM-dd HH:mm:ss"
	 * @return
	 * @throws Exception
	 */
	public static Date dateFormat(String datetime) throws Exception {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 创建日期转换对象HH:mm:ss为时分秒，年月日为yyyy-MM-dd
		return df.parse(datetime);// 将字符串转换为date类型
	}

	public static String timestampToString(Timestamp ts) throws Exception {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");// 创建日期转换对象HH:mm为时分，年月日为yyyy-MM-dd
		return df.format(ts);

	}

}
