package com.proxy.fxproxy;

import javax.tools.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        JavaCompiler javaCompiler= ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager=javaCompiler.getStandardFileManager(null,null,null);
        fileManager.setLocation(StandardLocation.CLASS_OUTPUT, Arrays.asList(new File[] { new File("c:\\classes") }));
        Iterable<? extends JavaFileObject> compilationUnits= fileManager.getJavaFileObjects(new File("D:\\code\\proxydemo\\src\\main\\java\\com\\proxy\\jdkproxy\\Main.java"));
        JavaCompiler.CompilationTask task= javaCompiler.getTask(null,fileManager,null,null,null,compilationUnits);
        task.call();
        fileManager.close();
    }
}
