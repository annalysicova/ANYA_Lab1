package org.example;

import tools.jackson.dataformat.xml.XmlMapper;

import java.io.File;

public class XMLParser implements Parser{

    @Override
    public Mission parse(File file)
    {
        XmlMapper mapper = new XmlMapper();
        return mapper.readValue(file, Mission.class);
    }
}
