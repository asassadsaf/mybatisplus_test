package com.fkp;

import lombok.SneakyThrows;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;
import org.yaml.snakeyaml.representer.Representer;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author fengkunpeng
 * @version 1.0
 * @description
 * @date 2024/8/1 19:21
 */
public class PropertiesConvertYml {


    public static void main(String[] args) throws IOException {
        String propertiesFilePath = "C:\\Users\\fengkunpeng\\Desktop\\config.properties";
        String yamlFilePath = "C:\\Users\\fengkunpeng\\Desktop\\config.yml";

        convertPropertiesToYaml(propertiesFilePath, yamlFilePath);
    }

    public static void convertPropertiesToYaml(String propertiesFilePath, String yamlFilePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(propertiesFilePath));
        BufferedWriter writer = new BufferedWriter(new FileWriter(yamlFilePath));

        Map<String, Object> yamlData = new LinkedHashMap<>();
        Map<String, String> comments = new LinkedHashMap<>();
        String line;
        String currentComment = "";

        while ((line = reader.readLine()) != null) {
            if (line.trim().isEmpty()) {
                currentComment = "";
            } else if (line.trim().startsWith("#")) {
                currentComment += line + "\n";
            } else {
                String[] parts = line.split("=", 2);
                if (parts.length == 2) {
                    String key = parts[0].trim();
                    String value = parts[1].trim();
                    yamlData.put(key, value);
                    if (!currentComment.isEmpty()) {
                        comments.put(key, currentComment);
                    }
                    currentComment = "";
                }
            }
        }

        DumperOptions options = new DumperOptions();
        options.setIndent(2);
        options.setPrettyFlow(true);
        Yaml yaml = new Yaml(new Constructor(), new Representer(), options);

        // Write YAML data with comments
        for (Map.Entry<String, Object> entry : yamlData.entrySet()) {
            if (comments.containsKey(entry.getKey())) {
                writer.write(comments.get(entry.getKey()));
            }
            writer.write(entry.getKey() + ": " + entry.getValue());
            writer.newLine();
        }

        reader.close();
        writer.close();
    }
}
