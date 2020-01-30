package com.solvd.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class JsonParser<T> {

    private static final Logger LOGGER = Logger.getLogger(JsonParser.class);

    public void marchallToFile(Object objectToWrite, String filePath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            OutputStream outputStream = new FileOutputStream(filePath);
            mapper.writeValue(outputStream, objectToWrite);
        } catch (IOException e) {
            LOGGER.error(e.getMessage(), e);
        }
    }

    public T unmarshall(String filePath, Class<T> aClass) {
        T result = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            InputStream inputStream = new FileInputStream(filePath);
            result = mapper.readValue(inputStream, aClass);
        } catch (IOException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return result;
    }
}
