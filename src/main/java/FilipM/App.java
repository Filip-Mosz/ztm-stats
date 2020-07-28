package FilipM;

import FilipM.core.DataStorage;
import FilipM.core.UIThread;
import FilipM.inbound.QueryThread;

/**
 * Apka do spamowaia Tristara :D
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Starting ZTM-STATS application" );

        DataStorage dataStorage = new DataStorage();
        QueryThread queryThread = new QueryThread(dataStorage);
        queryThread.setDaemon(true);
        UIThread uiThread = new UIThread(dataStorage);
//        DataProvider dataProvider = new DataProvider();
//        Optional<ZtmData> ztmData = dataProvider.getZtmData();
//
//        System.out.println(ztmData);

        queryThread.start();
        uiThread.start();
    }
}
