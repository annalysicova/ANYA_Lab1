package org.example;

import tools.jackson.databind.ObjectMapper;

import java.io.File;

public class JSONParser implements Parser{
    @Override
    public Mission parse(File file) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(file, Mission.class);
    }
}
