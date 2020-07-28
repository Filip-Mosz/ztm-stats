package FilipM.inbound;

import FilipM.model.ZtmData;

import java.io.IOException;
import java.util.Optional;

public class DataProvider {

    private static final String URL = "http://ckan2.multimediagdansk.pl/gpsPositions";

    public static Optional<ZtmData> getZtmData(){
        String rawJson;
        try {
            rawJson = ZtmRawDataProvider.requestCurrentData(URL);
        } catch (IOException e) {
            System.out.println("Error getting data from " + URL);
            e.printStackTrace();
            return Optional.empty();
        }
        return Optional.ofNullable(DataMapper.mapJsonToZtmData(rawJson));
    }
}
