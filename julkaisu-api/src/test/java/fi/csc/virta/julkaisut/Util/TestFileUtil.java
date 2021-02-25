package fi.csc.virta.julkaisut.Util;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class TestFileUtil {

    public static String readFromFile(String resultFile) throws IOException {
        URL resource = TestFileUtil.class.getResource(resultFile);
        return FileUtils.readFileToString(new File(resource.getFile()));
    }
}