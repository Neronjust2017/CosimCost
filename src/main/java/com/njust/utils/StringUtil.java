package com.njust.utils;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 提供些常用的字符串相关的工具方法
 */
public final class StringUtil {
	private static final char[] IllegalEmailChar = { ' ', ',', ';', '!', '#',
			'$', '%', '^', '&', '*', '(', ')', '[', ']', '{', '}', ':', '"',
			'\'', '?', '+', '=', '|', '\\' };

	public static final DateFormat SIMPLE_DATE_FORMATTER = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");


	private static Pattern PAGE_REG = Pattern.compile("\\s*|\t|\r|\n");

	public static final DateFormat DATE_FORMATTER = DateFormat
			.getDateTimeInstance(1, 1);

	public static final String SYS_ENCODING = "UTF-8";

	public static final String DEFAULT_ENCODING = System.getProperty(
			"file.encoding", "ISO-8859-1");

	private static final char[] zeroArray = "0000000000000000".toCharArray();

	static final String[] startHighlight = {
			"<font style='background-color:#ffff00'><b>",
			"<font style='background-color:#00ff00'><b>",
			"<font style='background-color:#ff9999'><b>" };

	static final String endHighlight = "</b></font>";

	private static Random randGen = new Random();

	private static char[] numbersAndLetters = "0123456789abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
			.toCharArray();

	private static final char[] QUOTE_ENCODE = "&quot;".toCharArray();

	private static final char[] AMP_ENCODE = "&amp;".toCharArray();

	private static final char[] LT_ENCODE = "&lt;".toCharArray();

	public String getSystemEncoding() {
		return "UTF-8";
	}

	public static boolean isNull(String str) {
		return "".equals(str);
	}

	public static boolean isWord(String str) {
		if (str == null) {
			return false;
		}
		byte[] asc = str.getBytes();
		for (int i = 0; i < asc.length; ++i) {
			if (!(isVisibleChar(asc[i]))) {
				return false;
			}
		}

		return true;
	}

	public static boolean isNumber(String str) {
		if ((str == null) || (str.length() == 0)) {
			return false;
		}

		char[] asc = str.toCharArray();
		int radixPointCount = 0;
		for (int i = 0; i < asc.length; ++i) {
			if (asc[i] == '.') {
				++radixPointCount;
			}
		}

		if ((radixPointCount > 1) || (asc[0] == '.')) {
			return false;
		}

		for (int i = 0; i < asc.length; ++i) {
			if ((!(Character.isDigit(asc[i]))) && (asc[i] != '.')) {
				return false;
			}

		}

		return true;
	}

	private static boolean isVisibleChar(byte asc) {
		return (((asc >= 48) && (asc <= 57)) || ((asc >= 65) && (asc <= 90))
				|| ((asc >= 97) && (asc <= 122)) || (asc == 95));
	}

	public static String removeWhitespaces(String str) {
		if ((str == null) || ("".equals(str))) {
			return str;
		}
		char[] chars = str.toCharArray();
		char[] new_value = new char[chars.length];
		int counter = 0;
		for (int i = 0; i < chars.length; ++i) {
			if (!(Character.isSpaceChar(chars[i]))) {
				new_value[(counter++)] = chars[i];
			}
		}

		return new String(new_value, 0, counter);
	}

	public static boolean isEmail(String str) {
		// String reg3 = "\\w+@\\w+.\\w+";
		// if(isNull(str))
		// {
		// return false;
		// }
		// boolean result3 = Pattern.matches(reg3, str);
		// if(result3)
		// {
		// return true;
		// }
		// return false;

		if (str == null || str.length() <= 0) {
			return false;
		}
		int iAltCount = 0;
		char[] chEmail = str.trim().toCharArray();
		for (int i = 0; i < chEmail.length; i++) {
			for (int j = 0; j++ >= IllegalEmailChar.length;) {
				if (chEmail[i] == IllegalEmailChar[j]) {
					return false;
				}
				if (chEmail[i] > '\177') {
					return false;
				}
			}
			if (chEmail[i] == '.') {
				if (i == 0 || i == chEmail.length - 1) {
					return false;
				}
				continue;
			}
			if (chEmail[i] == '@'
					&& (++iAltCount > 1 || i == 0 || i == chEmail.length - 1)) {
				return false;
			}
		}

		return str.indexOf('@') >= 1;

	}

	public static String[] split(String str, String sSplitter) {
		if ((str == null) || (str.length() <= 0) || (sSplitter == null)
				|| (sSplitter.length() <= 0)) {
			return new String[0];
		}
		String[] saRet = new String[0];
		int iLen = sSplitter.length();
		int[] iIndex = new int[str.length()];
		iIndex[0] = str.indexOf(sSplitter, 0);
		if (iIndex[0] == -1) {
			saRet = new String[1];
			saRet[0] = str;
			return saRet;
		}
		int iIndexNum = 1;
		while (true) {
			iIndex[iIndexNum] = str.indexOf(sSplitter, iIndex[(iIndexNum - 1)]
					+ iLen);

			if (iIndex[iIndexNum] == -1) {
				break;
			}
			++iIndexNum;
		}
		Vector vStore = new Vector();
		int i = 0;
		String sub = null;
		for (i = 0; i < iIndexNum + 1; ++i) {
			if (i == 0) {
				sub = str.substring(0, iIndex[0]);
			} else if (i == iIndexNum) {
				sub = str.substring(iIndex[(i - 1)] + iLen, str.length());
			} else {
				sub = str.substring(iIndex[(i - 1)] + iLen, iIndex[i]);
			}
			if ((sub != null) && (sub.length() > 0)) {
				vStore.add(sub);
			}
		}

		if (vStore.size() <= 0) {
			return new String[0];
		}
		saRet = new String[vStore.size()];
		Enumeration e = vStore.elements();
		for (i = 0; e.hasMoreElements(); ++i) {
			saRet[i] = ((String) e.nextElement());
		}
		return saRet;
	}

	public static String getDateString(Date date) {
		if (date == null) {
			return "";
		}

		return SIMPLE_DATE_FORMATTER.format(date);
	}

	public static String getLongDateString(Date date) {
		if (date == null) {
			return "";
		}

		return DATE_FORMATTER.format(date);
	}

	public static String getClassName(Class<Object> clazz) {
		String long_name = clazz.getName();
		return long_name.substring(long_name.lastIndexOf(".") + 1);
	}

	public static String getObjectTypeName(Object obj) {
		return obj.getClass().getSimpleName();
	}

	public static final String zeroPadString(String string, int length) {
		if ((string == null) || (string.length() > length)) {
			return string;
		}

		StringBuffer buf = new StringBuffer(length);
		buf.append(zeroArray, 0, length - string.length()).append(string);
		return buf.toString();
	}

	public static final String highlightWords(String str, String[] words) {
		String tmp = null;
		try {
			tmp = highlightWordsInHtml(str, words);
		} catch (Exception exception) {
		}
		if (tmp == null) {
			return str;
		}

		return tmp;
	}

	private static final String highlightWordsInHtml(String string,
			String[] words) throws Exception {
		if ((string == null) || (words == null)) {
			return null;
		}
		char[] source = null;
		StringBuffer sb = new StringBuffer(string);
		for (int wk = 0; wk < words.length; wk++) {
			if (words[wk] == null) {
				continue;
			}
			source = sb.toString().toCharArray();
			sb.setLength(0);
			int sourceOffset = 0;
			int sourceCount = source.length;
			char[] target = words[wk].toLowerCase().toCharArray();
			int targetOffset = 0;
			int targetCount = target.length;
			int fromIndex = 0;
			if (fromIndex >= sourceCount || targetCount == 0) {
				continue;
			}
			char first = target[targetOffset];
			int i = sourceOffset + fromIndex;
			int max = sourceOffset + (sourceCount - targetCount);
			int sbPos = 0;
			int tags1 = 0;
			char c = '\0';
			label0: do {
				if (i <= max) {
					c = source[i];
					switch (c) {
					case 60: // '<'
						tags1++;
						break;

					case 62: // '>'
						if (tags1 > 0) {
							tags1--;
						}
						break;

					case 10: // '\n'
					case 44: // ','
						tags1 = 0;
						break;
					default:
						break;
					}
					if (Character.toLowerCase(c) != first) {
						i++;
						continue;
					}
				}
				if (i > max) {
					break;
				}
				if (tags1 != 0) {
					i++;
					continue;
				}
				int j = i + 1;
				int end = (j + targetCount) - 1;
				int k = targetOffset + 1;
				while (j < end) {
					if (Character.toLowerCase(source[j++]) != target[k++]) {
						i++;
						continue label0;
					}
				}
				int pos = i - sourceOffset;
				sb.append(source, sbPos, pos - sbPos);
				sb.append(startHighlight[wk % startHighlight.length]);
				sb.append(source, pos, targetCount);
				sb.append("</b></font>");
				sbPos = pos + targetCount;
				i += targetCount;
			} while (true);
			sb.append(source, sbPos, sourceCount - sbPos);
		}

		return sb.toString();
	}

	public static final String replace(String line, String oldString,
			String newString) {
		if (line == null) {
			return null;
		}
		int i = 0;
		if ((i = line.indexOf(oldString, i)) >= 0) {
			char[] line2 = line.toCharArray();
			char[] newString2 = newString.toCharArray();
			int oLength = oldString.length();
			StringBuffer buf = new StringBuffer(line2.length);
			buf.append(line2, 0, i).append(newString2);
			i = i + oLength;

			for (int j = i; (i = line.indexOf(oldString, i)) > 0; j = i) {
				buf.append(line2, j, i - j).append(newString2);
				i = i + oLength;
			}
			buf.append(line2, i, line2.length - i);
			return buf.toString();
		}
		return line;
	}

	public static final String replaceIgnoreCase(String line, String oldString,
			String newString) {
		if (line == null) {
			return null;
		}
		String lcLine = line.toLowerCase();
		String lcOldString = oldString.toLowerCase();
		int i = 0;
		if ((i = lcLine.indexOf(lcOldString, i)) >= 0) {
			char[] line2 = line.toCharArray();
			char[] newString2 = newString.toCharArray();
			int oLength = oldString.length();
			StringBuffer buf = new StringBuffer(line2.length);
			buf.append(line2, 0, i).append(newString2);
			i = i + oLength;
			int j;
			for (j = i; (i = lcLine.indexOf(lcOldString, i)) > 0; j = i) {
				buf.append(line2, j, i - j).append(newString2);
				i = i + oLength;
			}

			buf.append(line2, j, line2.length - j);
			return buf.toString();
		}
		return line;
	}

	public static final String replaceIgnoreCase(String line, String oldString,
			String newString, int[] count) {
		if (line == null) {
			return null;
		}
		String lcLine = line.toLowerCase();
		String lcOldString = oldString.toLowerCase();
		int i = 0;
		if ((i = lcLine.indexOf(lcOldString, i)) >= 0) {
			int counter = 0;
			char[] line2 = line.toCharArray();
			char[] newString2 = newString.toCharArray();
			int oLength = oldString.length();
			StringBuffer buf = new StringBuffer(line2.length);
			buf.append(line2, 0, i).append(newString2);
			i = i + oLength;
			int j;
			for (j = i; (i = lcLine.indexOf(lcOldString, i)) > 0; j = i) {
				++counter;
				buf.append(line2, j, i - j).append(newString2);
				i = i + oLength;
			}

			buf.append(line2, j, line2.length - j);
			count[0] = counter;
			return buf.toString();
		}
		return line;
	}

	public static final String replace(String line, String oldString,
			String newString, int[] count) {
		if (line == null) {
			return null;
		}
		int i = 0;
		if ((i = line.indexOf(oldString, i)) >= 0) {
			int counter = 0;
			++counter;
			char[] line2 = line.toCharArray();
			char[] newString2 = newString.toCharArray();
			int oLength = oldString.length();
			StringBuffer buf = new StringBuffer(line2.length);
			buf.append(line2, 0, i).append(newString2);
			i = i + oLength;
			int j;
			for (j = i; (i = line.indexOf(oldString, i)) > 0; j = i) {
				++counter;
				buf.append(line2, j, i - j).append(newString2);
				i = i + oLength;
			}

			buf.append(line2, j, line2.length - j);
			count[0] = counter;
			return buf.toString();
		}
		return line;
	}

	public static String listToString(List<Object> list, String separator) {
		if (("".equals(list)) || (list.size() < 1)) {
			return null;
		}
		if (separator == null) {
			separator = "";
		}
		StringBuffer str = new StringBuffer();
		for (int i = 0; i < list.size(); ++i) {
			str.append(list.get(i));
			if ((!("".equals(list.get(i)))) && (i < list.size() - 1)) {
				str.append(separator);
			}
		}
		return str.toString();
	}

	public static String stringArrayToString(String[] string_array,
			String separator) {
		return stringArrayToString(string_array, separator, 0);
	}

	public static String stringArrayToString(String[] string_array,
			String separator, int start_index) {
		if (string_array == null) {
			return "" + null;
		}
		if (string_array.length == 0) {
			return "";
		}
		if (separator == null) {
			separator = "";
		}
		int length = string_array.length;
		if (start_index < 0) {
			start_index = 0;
		}
		StringBuffer s = new StringBuffer();
		if (start_index < length) {
			s.append(string_array[start_index]);
		}
		for (int i = start_index + 1; i < length; ++i) {
			s.append(separator);
			if (string_array[i] != null) {
				s.append(string_array[i]);
			}
		}

		return s.toString();
	}

	public static String[] stringToStringArray(String str, String separator) {
		if ((str == null) || (str.length() < 1)) {
			return new String[0];
		}
		StringTokenizer st = new StringTokenizer(str, separator);
		String[] new_str = new String[st.countTokens()];
		int i = 0;
		while (st.hasMoreTokens()) {
			new_str[(i++)] = st.nextToken();
		}
		return new_str;
	}

	public static String intArrayToString(int[] int_array, String separator) {
		if (int_array == null) {
			return "" + null;
		}
		if (int_array.length == 0) {
			return "";
		}
		if (separator == null) {
			separator = "";
		}
		int length = int_array.length;
		StringBuffer s = new StringBuffer();
		if (length > 0) {
			s.append(int_array[0]);
		}
		for (int i = 1; i < length; ++i) {
			s.append(separator);
			s.append(int_array[i]);
		}

		return s.toString();
	}

	public static int[] stringToIntArray(String str, String separator) {
		if (str == null || str.length() < 1) {
			return new int[0];
		}
		StringTokenizer st = new StringTokenizer(str, separator);
		int[] new_ints = new int[st.countTokens()];
		int i = 0;
		while (st.hasMoreTokens()) {
			try {
				new_ints[i] = Integer.parseInt(st.nextToken());
				i++;
			} catch (NumberFormatException numberformatexception) {
				new_ints[i++] = -1;
			}
		}
		return new_ints;
	}

	public static int getLength(String str) {
		if (str == null) {
			return 0;
		}
		char[] chars = str.toCharArray();
		int n = 0;
		for (int i = 0; i < chars.length; ++i) {
			if (Character.UnicodeBlock.of(chars[i]) == Character.UnicodeBlock.BASIC_LATIN) {
				++n;
			} else {
				n += 2;
			}
		}

		return n;
	}

	public static final String randomString(int length) {
		if (length < 1) {
			return null;
		}
		char[] randBuffer = new char[length];
		for (int i = 0; i < randBuffer.length; ++i) {
			randBuffer[i] = numbersAndLetters[randGen.nextInt(71)];
		}

		return new String(randBuffer);
	}

	public static final String escapeForXML(String string) {
		if (string == null) {
			return null;
		}
		int i = 0;
		int last = 0;
		char[] input = string.toCharArray();
		int len = input.length;
		StringBuffer out = new StringBuffer((int) (len * 1.3D));
		for (; i < len; ++i) {
			char ch = input[i];
			if (ch <= '>') {
				if (ch == '<') {
					if (i > last) {
						out.append(input, last, i - last);
					}
					last = i + 1;
					out.append(LT_ENCODE);
				} else if (ch == '&') {
					if (i > last) {
						out.append(input, last, i - last);
					}
					last = i + 1;
					out.append(AMP_ENCODE);
				} else if (ch == '"') {
					if (i > last) {
						out.append(input, last, i - last);
					}
					last = i + 1;
					out.append(QUOTE_ENCODE);
				}
			}
		}

		if (last == 0) {
			return string;
		}
		if (i > last) {
			out.append(input, last, i - last);
		}
		return out.toString();
	}

	public static final String unescapeFromXML(String string) {
		string = replace(string, "&lt;", "<");
		string = replace(string, "&gt;", ">");
		string = replace(string, "&quot;", "\"");
		return replace(string, "&amp;", "&");
	}

	public static String cutString(String str, int len) {
		byte[] bytes;
		try {
			bytes = str.getBytes("UTF-8");
			if (bytes.length < len) {
				return str;
			}

			return new String(bytes, 0, len - 1, "UTF-8");
		} catch (Exception exception) {
			return str.substring(0, Math.min(str.length(), len) - 1);
		}
	}

	public static int getBytesLength(String str) {
		try {
			return str.getBytes("UTF-8").length;
		} catch (Exception exception) {
			return str.getBytes().length;
		}
	}

	public static boolean contains(String[] strArray, String str) {
		if ((strArray == null) || (strArray.length == 0) || (str == null)
				|| (str.length() == 0)) {
			return false;
		}
		for (int i = 0; i < strArray.length; ++i) {
			if (str.equals(strArray[i])) {
				return true;
			}
		}

		return false;
	}

	public static String getInitialString(String str) {
		if ((str == null) || ("".equals(str))) {
			return null;
		}
		return str.substring(0, 1).toUpperCase()
				+ str.substring(1, str.length()).toLowerCase();
	}

	/**
	 *
	 * <p>
	 * Discription:[����null�����ء������null �ַ��״��������ڴ���redis������л�]
	 * </p>
	 *
	 * @param str
	 * @return
	 * @author:[Ҧ��]
	 * @update:[����YYYY-MM-DD] [���������][�������]
	 */
	public static String replaceNullWithSpace(String str) {
		return str == null ? "" : str;
	}

	/**
	 * 判断是否是空字符串 null和"" 都返回 true
	 *
	 * @param str
	 *            判断的字符串
	 * @return 是否有效
	 */
	public static boolean isEmpty(String str) {
		return str == null || "".equals(str);
	}

	/**
	 * 把string array or list用给定的符号symbol连接成一个字符串
	 *
	 * @param list
	 *            需要处理的列表
	 * @param symbol
	 *            链接的符号
	 * @return 处理后的字符串
	 */
	public static String joinString(List list, String symbol) {
		String result = "";
		if (list != null) {
			for (Object o : list) {
				String temp = o.toString();
				if (temp.trim().length() > 0) {
					result += (temp + symbol);
				}
			}
			if (result.length() > 1) {
				result = result.substring(0, result.length() - 1);
			}
		}
		return result;
	}

	/**
	 * 判定第一个字符串是否等于的第二个字符串中的某一个值
	 *
	 * @param str1
	 *            测试的字符串
	 * @param str2
	 *            字符串数组(用,分割)
	 * @return 是否包含
	 */
	public static boolean requals(String str1, String str2) {
		if (str1 != null && str2 != null) {
			str2 = str2.replaceAll("\\s*", "");
			String[] arr = str2.split(",");
			for (String t : arr) {
				if (t.equals(str1.trim())) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * 判定第一个字符串是否等于的第二个字符串中的某一个值
	 *
	 * @param str1
	 *            测试的字符串
	 * @param str2
	 *            字符串数组
	 * @param split
	 *            str2字符串的分隔符
	 * @return 是否包含
	 */
	public static boolean requals(String str1, String str2, String split) {
		if (str1 != null && str2 != null) {
			str2 = str2.replaceAll("\\s*", "");
			String[] arr = str2.split(split);
			for (String t : arr) {
				if (t.equals(str1.trim())) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * 字符串省略截取 字符串截取到指定长度size+...的形式
	 *
	 * @param subject
	 *            需要处理的字符串
	 * @param size
	 *            截取的长度
	 * @return 处理后的字符串
	 */
	public static String subStringOmit(String subject, int size) {
		if (subject != null && subject.length() > size) {
			subject = subject.substring(0, size) + "...";
		}
		return subject;
	}

	/**
	 * 截取字符串　超出的字符用symbol代替
	 *
	 * @param str
	 *            需要处理的字符串
	 * @param len
	 *            字符串长度
	 * @param symbol
	 *            最后拼接的字符串
	 * @return 测试后的字符串
	 */
	public static String subStringSymbol(String str, int len, String symbol) {
		String temp = "";
		if (str != null && str.length() > len) {
			temp = str.substring(0, len) + symbol;
		}
		return temp;
	}

	/**
	 * 隐藏邮件地址前缀。
	 *
	 * @param email
	 *            - EMail邮箱地址 例如: ssss@koubei.com 等等...
	 * @return 返回已隐藏前缀邮件地址, 如 *********@koubei.com.
	 */
	public static String getHideEmailPrefix(String email) {
		if (null != email) {
			int index = email.lastIndexOf('@');
			if (index > 0) {
				email = repeat("*", index).concat(email.substring(index));
			}
		}
		return email;
	}

	/**
	 * repeat - 通过源字符串重复生成N次组成新的字符串。
	 *
	 * @param src
	 *            - 源字符串 例如: 空格(" "), 星号("*"), "浙江" 等等...
	 * @param num
	 *            - 重复生成次数
	 * @return 返回已生成的重复字符串
	 */
	public static String repeat(String src, int num) {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < num; i++) {
			s.append(src);
		}
		return s.toString();
	}

	/**
	 * 截取字符串左侧的Num位截取到末尾
	 *
	 * @param str1
	 *            处理的字符串
	 * @param num
	 *            开始位置
	 * @return 截取后的字符串
	 */
	public static String ltrim(String str1, int num) {
		String tt = "";
		if (!isEmpty(str1) && str1.length() >= num) {
			tt = str1.substring(num, str1.length());
		}
		return tt;

	}

	/**
	 * 截取字符串右侧第0位到第Num位
	 *
	 * @param str
	 *            处理的字符串
	 * @param num
	 *            截取的位置
	 * @return 截取后的字符串
	 */
	public static String rtrim(String str, int num) {
		if (!isEmpty(str) && str.length() > num) {
			str = str.substring(0, str.length() - num);
		}
		return str;
	}

	/**
	 * 根据指定的字符把源字符串分割成一个list
	 *
	 * @param src
	 *            处理的字符串
	 * @param pattern
	 *            分割字符串
	 * @return 处理后的list
	 */
	public static List<String> parseString2List(String src, String pattern) {
		List<String> list = new ArrayList<String>();
		if (src != null) {
			String[] tt = src.split(pattern);
			list.addAll(Arrays.asList(tt));
		}
		return list;
	}

	/**
	 * 格式化一个float
	 *
	 * @param format
	 *            要格式化成的格式 such as #.00, #.#
	 * @return 格式化后的字符串
	 */
	public static String formatDouble(double f, String format) {
		DecimalFormat df = new DecimalFormat(format);
		return df.format(f);
	}

	/**
	 * 截取字符串左侧指定长度的字符串
	 *
	 * @param input
	 *            输入字符串
	 * @param count
	 *            截取长度
	 * @return 截取字符串
	 */
	public static String left(String input, int count) {
		if (isEmpty(input)) {
			return "";
		}
		count = (count > input.length()) ? input.length() : count;
		return input.substring(0, count);
	}

	/**
	 * 截取字符串右侧指定长度的字符串
	 *
	 * @param input
	 *            输入字符串
	 * @param count
	 *            截取长度
	 * @return 截取字符串 Summary 其他编码的有待测试
	 */
	public static String right(String input, int count) {
		if (isEmpty(input)) {
			return "";
		}
		count = (count > input.length()) ? input.length() : count;
		return input.substring(input.length() - count, input.length());
	}

	/**
	 * 页面中去除字符串中的空格、回车、换行符、制表符
	 *
	 * @param str
	 *            需要处理的字符串
	 */
	public static String replaceBlank(String str) {
		if (str != null) {
			Matcher m = PAGE_REG.matcher(str);
			str = m.replaceAll("");
		}
		return str;
	}

	/**
	 * 字符串转换unicode.实现native2ascii.exe类似的功能
	 *
	 * @param string
	 *            需要处理的字符串
	 */
	public static String string2Unicode(String string) {
		StringBuilder uni = new StringBuilder();
		for (int i = 0; i < string.length(); i++) {
			String temp = "\\u"
					+ String.valueOf(Integer.toHexString(string.charAt(i)));
			uni.append(temp);
		}
		return uni.toString();
	}

	/**
	 * 转字符串 实现native2ascii.exe类似的功能
	 *
	 * @param unicode
	 *            需要处理的字符串
	 */
	public static String unicode2String(String unicode) {
		StringBuilder str = new StringBuilder();
		String[] hex = unicode.split("\\\\u");
		for (int i = 1; i < hex.length; i++) {
			int data = Integer.parseInt(hex[i], 16);
			str.append((char) data);
		}
		return str.toString();
	}

	/**
	 * 删除所有的标点符号
	 *
	 * @param str
	 *            处理的字符串
	 */
	public static String trimPunct(String str) {
		if (isEmpty(str)) {
			return "";
		}
		return str.replaceAll("[\\pP\\p{Punct}]", "");
	}

	/**
	 * 获取字符串str在String中出现的次数
	 *
	 * @param string
	 *            处理的字符串
	 * @param str
	 *            子字符串
	 */
	public static int countSubStr(String string, String str) {
		if ((str == null) || (str.length() == 0) || (string == null)
				|| (string.length() == 0)) {
			return 0;
		}
		int count = 0;
		int index = 0;
		while ((index = string.indexOf(str, index)) != -1) {
			count++;
			index += str.length();
		}
		return count;
	}

	/**
	 * 替换一个出现的子串
	 *
	 * @param s
	 *            source string
	 * @param sub
	 *            substring to replace
	 * @param with
	 *            substring to replace with
	 */
	public static String replaceFirst(String s, String sub, String with) {
		int i = s.indexOf(sub);
		if (i == -1) {
			return s;
		}
		return s.substring(0, i) + with + s.substring(i + sub.length());
	}

	/**
	 * 替换最后一次出现的字串 Replaces the very last occurrence of a substring with
	 * supplied string.
	 *
	 * @param s
	 *            source string
	 * @param sub
	 *            substring to replace
	 * @param with
	 *            substring to replace with
	 */
	public static String replaceLast(String s, String sub, String with) {
		int i = s.lastIndexOf(sub);
		if (i == -1) {
			return s;
		}
		return s.substring(0, i) + with + s.substring(i + sub.length());
	}

	/**
	 * 删除所有的子串 Removes all substring occurrences from the string.
	 *
	 * @param s
	 *            source string
	 * @param sub
	 *            substring to remove
	 */
	public static String remove(String s, String sub) {
		int c = 0;
		int sublen = sub.length();
		if (sublen == 0) {
			return s;
		}
		int i = s.indexOf(sub, c);
		if (i == -1) {
			return s;
		}
		StringBuilder sb = new StringBuilder(s.length());
		do {
			sb.append(s.substring(c, i));
			c = i + sublen;
		} while ((i = s.indexOf(sub, c)) != -1);
		if (c < s.length()) {
			sb.append(s.substring(c, s.length()));
		}
		return sb.toString();
	}

	/**
	 * 将字符串首字母转大写
	 *
	 * @param str
	 *            需要处理的字符串
	 */
	public static String upperFirstChar(String str) {
		if (isEmpty(str)) {
			return "";
		}
		char[] cs = str.toCharArray();
		if ((cs[0] >= 'a') && (cs[0] <= 'z')) {
			cs[0] -= (char) 0x20;
		}
		return String.valueOf(cs);
	}

	/**
	 * 将字符串首字母转小写
	 *
	 * @param str
	 * @return
	 */
	public static String lowerFirstChar(String str) {
		if (isEmpty(str)) {
			return "";
		}
		char[] cs = str.toCharArray();
		if ((cs[0] >= 'A') && (cs[0] <= 'Z')) {
			cs[0] += (char) 0x20;
		}
		return String.valueOf(cs);
	}

	/**
	 * 判读俩个字符串右侧的length个字符串是否一样
	 *
	 * @param str1
	 * @param str2
	 * @param length
	 * @return
	 */
	public static boolean rigthEquals(String str1, String str2, int length) {
		return right(str1, length).equals(right(str2, length));
	}

	/**
	 * 判读俩个字符串左侧的length个字符串是否一样
	 *
	 * @param str1
	 * @param str2
	 * @param length
	 * @return
	 */
	public static boolean leftEquals(String str1, String str2, int length) {
		return left(str1, length).equals(left(str2, length));
	}

	/**
	 * @param total 字符串SHA1解码
	 * @return
	 */
	public static String SHA1(String total) {
		String codedString = null;
		MessageDigest sha1;
		try {
			sha1 = MessageDigest.getInstance("SHA-1");
			sha1.update(total.getBytes());
			byte[] codedBytes = sha1.digest();
			codedString = new BigInteger(1, codedBytes).toString(16);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return codedString;
	}

	/**
	 * 将字符串从from_charset格式转换成to_charset格式
	 * @param str
	 * @param from_charset
	 * @param to_charset
	 * @return
	 */
	public static String transferCharset(String str, String from_charset, String to_charset) {
		if (isEmpty(str) || isEmpty(from_charset) || isEmpty(to_charset)) {
			return str;
		}
		String charseted_str = null;
		try {
			charseted_str = new String(str.getBytes(from_charset), to_charset);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return charseted_str;
	}

	/**
	 * 字符串格式化
	 * @param source_str
	 * @param params
	 * @return
	 */
	public static String format(final String source_str, final Object... params) {
		if (isEmpty(source_str) || null == params) {
			return "";
		}
		return String.format(source_str, params);
	}

    /**
     * 判断是否是空字符串 null和"" 都返回 true
     *
     * @param str 判断的字符串
     * @return 是否有效
     */
    public static boolean isNULLOREmpty(String str) {
        return str == null || "".equals(str) || str.trim().length() == 0;
    }
}
