package com.example.git_demo;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class HelloApplication extends Application {
  System.out.println("hello mtf");
}
