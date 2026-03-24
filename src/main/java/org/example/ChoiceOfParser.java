package org.example;

import tools.jackson.core.exc.JacksonIOException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ChoiceOfParser {
    public static Mission parse(File file)
    {
        JSONParser jsonParser = new JSONParser();
        XMLParser xmlParser = new XMLParser();
        TXTParser txtParser = new TXTParser();

        try{
            return jsonParser.parse(file);
        }

        catch (JacksonIOException _) {
            System.out.println("Такого файла нет");
            System.exit(200);
        }

        catch (Exception e) {

            try{
                return xmlParser.parse(file);
            }

            catch (Exception ex) {
                try{
                    return txtParser.parse(file);
                }
                catch (FileNotFoundException exx) {
                    System.out.println("Такого файла нет");
                    System.exit(200);
                }

                catch (Exception exxx)
                {
                    System.out.println("Формат файла не подходит");
                    System.exit(500);
                }
            }
        }

        return null;
    }
}
