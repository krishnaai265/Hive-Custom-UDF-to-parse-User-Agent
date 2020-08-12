import nl.bitwalker.useragentutils.UserAgent;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;
import java.util.HashMap;
import java.util.Map;

public class UserAgentParserUDF extends UDF {
    public static final String KEY_DEVICE = "device";
    public static final String KEY_OS = "os";
    public static final String KEY_BROWSER = "browser";
    public static final String KEY_USER_AGENT = "ua";

    public Map<String, String> evaluate(Text s) {
        UserAgent userAgent = UserAgent.parseUserAgentString(s.toString());
        Map<String, String> map = new HashMap<String, String>();
        map.put(KEY_DEVICE, userAgent.getOperatingSystem().getDeviceType().getName());
        map.put(KEY_OS, userAgent.getOperatingSystem().getName());
        map.put(KEY_BROWSER, userAgent.getBrowser().getGroup().toString());
        map.put(KEY_USER_AGENT, userAgent.getBrowser().getBrowserType().getName());
        return map;
    }
}
