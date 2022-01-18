package workspace.mil.matmon.data.exercise.sampler;

import workspace.mil.matmon.data.exercise.sampler.converter.jsonConverter.CsvJsonConverter;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CsvJsonConverter jsonWriter = new CsvJsonConverter();
        jsonWriter.write("C:\\Users\\Oren\\Desktop\\Works\\Military\\2021-2022\\matmon\\code\\sampler\\src\\main\\resources\\MadaReports.csv", "C:\\Users\\Oren\\Desktop\\Works\\Military\\2021-2022\\matmon\\code\\sampler\\src\\main\\mada_reports\\");

    }
}
