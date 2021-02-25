package fi.csc.virta.julkaisut.Util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.NotFoundException;

public class CounterUtil {

    private static final Logger log = LoggerFactory.getLogger(CounterUtil.class);

    public static void checkCount(CountingConverter converter) {
        log.info("Found {} results", converter.getCount());
        if (converter.getCount() == 0) {
            throw new NotFoundException("Entity not found!");
        }
    }
}
