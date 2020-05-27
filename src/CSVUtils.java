package Ambiente1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CSVUtils {
    /**
     * Returns the WHOLE CSV as a List<List<String>>, first entry are headers of the csv
     *
     * @param file
     * @param seperator
     * @return List<List<String>>
     */
    public static List<List<String>> readCSV(File file, String seperator) {
        try {
            return Files.lines(file.toPath(), StandardCharsets.UTF_8)
                    .map(line -> Arrays.asList(line.split(seperator)))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /**
     * Create a csv String with a given seperator
     *
     * @param data
     * @param seperator
     * @return String
     */
    public static String createCSVString(List<List<String>> data, final String seperator) {
        List<String> csv = new ArrayList<>();
        data.forEach(line ->
                csv.add(line.stream().
                        reduce((t, u) -> t + seperator + u).
                        get() + seperator)
        );
        StringBuilder csvString = new StringBuilder();
        for (String line : csv) {
            csvString.append(line);
            csvString.append("\n");
        }
        return csvString.toString();
    }
    private static final char DEFAULT_SEPARATOR = ',';

    public static void writeLine(Writer w, List<String> values) throws IOException {
        writeLine(w, values, DEFAULT_SEPARATOR, ' ');
    }

    public static void writeLine(Writer w, List<String> values, char separators) throws IOException {
        writeLine(w, values, separators, ' ');
    }

    //https://tools.ietf.org/html/rfc4180
    private static String followCVSformat(String value) {

        String result = value;
        if (result.contains("\"")) {
            result = result.replace("\"", "\"\"");
        }
        return result;

    }

    public static void writeLine(Writer w, List<String> values, char separators, char customQuote) throws IOException {

        boolean first = true;

        //default customQuote is empty

        if (separators == ' ') {
            separators = DEFAULT_SEPARATOR;
        }

        StringBuilder sb = new StringBuilder();
        for (String value : values) {
            if (!first) {
                sb.append(separators);
            }
            if (customQuote == ' ') {
                sb.append(followCVSformat(value));
            } else {
                sb.append(customQuote).append(followCVSformat(value)).append(customQuote);
            }

            first = false;
        }
        sb.append("\n");
        w.append(sb.toString());


    }

    public static void generateFile(String fileName, List<String> reportArray) {

        try {
            FileWriter writer = new FileWriter(fileName);
            StringBuilder sb = new StringBuilder();
            for (String result : reportArray) {
                sb.append(result);
                sb.append("\n");
            }
            writer.write(sb.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
