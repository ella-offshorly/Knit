package Base;

import io.cucumber.datatable.DataTable;

import java.util.*;

public class CucumberUtil {
    //     removed this concept because of version issues in DataTable
    //     public static synchronized Map<String, String> TableDictionaryConverter(DataTable table) {
    public static synchronized Map<String, String> TableDictionaryConverter(List<List<String>> data) {

        Map<String, String> mapTable = new HashMap<String, String>();
        for(List<String> rows: data) {
            mapTable.put(rows.get(0), rows.get(1));
        }
        //data = Arrays.asList(new ArrayList<String>(mapTable.keySet()), new ArrayList<String>(mapTable.values()));
       // DataTable dataTable = DataTable.create(data);
        // }
        return mapTable;
    }
}
