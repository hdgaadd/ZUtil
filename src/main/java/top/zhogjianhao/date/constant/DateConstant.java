package top.zhogjianhao.date.constant;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.ResolverStyle;
import java.util.Locale;

/**
 * 时间常量
 */
public class DateConstant {

  /**
   * 默认解析模式：严格模式（<a href="https://rumenz.com/java-topic/java/date-time/resolverstyle-strict-date-parsing/index.html">Java 8 ResolverStyle.STRICT - Strict date time parsing example</a>）
   */
  public static final ResolverStyle DEFAULT_RESOLVER_STYLE = ResolverStyle.STRICT;
  /**
   * 默认区域：英语
   */
  public static final Locale DEFAULT_LOCALE = Locale.ENGLISH;
  /**
   * Date 对象最小年份
   */
  public static final long DEFAULT_MIN_DATE_YEAR = 1970;
  /**
   * 当前系统时区
   */
  public static final ZoneId SYSTEM_ZONE_ID = ZoneId.systemDefault();
  /**
   * 当前系统时区偏移
   */
  public static final ZoneOffset SYSTEM_ZONE_OFFSET = OffsetDateTime.now(SYSTEM_ZONE_ID).getOffset();
}
