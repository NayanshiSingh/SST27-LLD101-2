package com.example.config;

import java.nio.file.Path;

public class App {
    public static void main(String[] args) throws Exception {
        String path = args.length > 0 ? args[0] : "app.properties";
        AppSettings instance = AppSettings.getInstance();
        instance.loadFromFile(Path.of(path)); 
        System.out.println("app.name=" + instance.get("app.name"));
        System.out.println("instance=" + System.identityHashCode(instance));
    }
}