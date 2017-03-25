package tool.log4j.custom;

import org.apache.log4j.Level;

/**
 * Created by geyao on 2017/3/25.
 */
public class Persistence extends Level {

    protected Persistence(int level, String levelStr, int syslogEquivalent) {
        super(level, levelStr, syslogEquivalent);
    }
}
