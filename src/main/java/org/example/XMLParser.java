package org.example;

import tools.jackson.dataformat.xml.XmlMapper;

import java.io.File;

public class XMLParser implements Parser{

    public Mission parse()
    {
        XmlMapper mapper = new XmlMapper();
        Mission mission = mapper.readValue(new File("src/main/resources/Mission A.xml"), Mission.class);

        System.out.println(mission);

        return null;
    }
}
