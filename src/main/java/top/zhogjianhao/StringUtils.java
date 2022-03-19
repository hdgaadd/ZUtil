package top.zhogjianhao;

import lombok.NonNull;

/**
 * 字符串工具类
 */
public class StringUtils extends org.apache.commons.lang3.StringUtils {

  /**
   * 删除开头，忽略大小写
   *
   * @param str    被删除的字符串
   * @param remove 需要删除的开头字符串
   * @return 删除后的字符串
   */
  public static String removeStartIgnoreCase(final String str, final String remove) {
    if (str.toLowerCase().startsWith(remove.toLowerCase())) {
      return substring(str, remove.length());
    }
    return str;
  }

  /**
   * 删除结尾，忽略大小写
   *
   * @param str    被删除的字符串
   * @param remove 需要删除的结尾字符串
   * @return 删除后的字符串
   */
  public static String removeEndIgnoreCase(final String str, final String remove) {
    if (str.toLowerCase().endsWith(remove.toLowerCase())) {
      return substring(str, 0, str.length() - remove.length());
    }
    return str;
  }

  /**
   * 转换为下划线命名
   *
   * @param source 需要转换的内容
   * @return 转换后的内容
   */
  public static String toUnderscore(@NonNull final String source) {
    if (isBlank(source)) {
      return null;
    }
    StringBuilder sb = new StringBuilder(source);
    int temp = 0;
    if (!source.contains(" ")) {
      for (int i = 0; i < source.length(); i++) {
        // 如果为大写字母且不为开头
        if (Character.isUpperCase(source.charAt(i)) && !source.startsWith(String.valueOf(source.charAt(i)))) {
          // 在大写字母前插入下划线
          sb.insert(i + temp, "_");
          temp += 1;
        }
      }
    }
    return sb.toString().toLowerCase();
  }

  /**
   * 字符串重复 n 遍
   *
   * @param source 字符串
   * @param n      重复次数
   * @return 重复 n 遍的字符串
   */
  public static String nCopies(@NonNull final String source, final long n) {
    if (isBlank(source) || n < 1) {
      return null;
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      sb.append(source);
    }
    return sb.toString();
  }
}
