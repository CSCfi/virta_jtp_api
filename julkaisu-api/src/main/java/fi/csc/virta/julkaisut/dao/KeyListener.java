package fi.csc.virta.julkaisut.dao;

import com.querydsl.sql.SQLBaseListener;
import com.querydsl.sql.SQLListenerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.ResultSet;
import java.sql.SQLException;

public class KeyListener extends SQLBaseListener {

    private final Logger log = LoggerFactory.getLogger(getClass());

    private Long key = null;

    @Override
    public void executed(SQLListenerContext context) {
        try {
            ResultSet keys = context.getPreparedStatement().getGeneratedKeys();
            keys.next();
            key = keys.getLong(1);
        } catch (SQLException e) {
            log.error("Could not get generated keys!", e);
        }
        super.executed(context);
    }

    public Long getKey() {
        return key;
    }
}