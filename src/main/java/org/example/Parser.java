package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface Parser {
    Mission parse(File file) throws IOException;
}
