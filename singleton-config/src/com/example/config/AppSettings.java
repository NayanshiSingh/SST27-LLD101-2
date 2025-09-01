package com.example.config;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public class AppSettings implements Serializable {
    private final Properties props = new Properties();

    private AppSettings() {
        if (Holder.INSTANCE != null) {
            throw new IllegalStateException("trying to create second instance using reflection, illegal move");
        }
    }

    private static class Holder{
        static final AppSettings INSTANCE = new AppSettings();
    }
    public static AppSettings getInstance() {
        return Holder.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }

    public void loadFromFile(Path file) {
        try (InputStream in = Files.newInputStream(file)) {
            props.load(in);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public String get(String key) {
        return props.getProperty(key);
    }
}