package FilipM.inbound;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.stream.Collectors;

public class ZtmRawDataProvider {

    public static String requestCurrentData(String urlAsString) throws IOException {
        URL url = new URL(urlAsString);

        try (InputStream in = url.openStream()) {
            byte[] bytes = in.readAllBytes();
            return new String(bytes, Charset.defaultCharset());
            //BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            //return reader.lines().collect(Collectors.joining(System.lineSeparator()));
        }
    }
}
