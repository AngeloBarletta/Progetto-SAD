package com.T07.compExec.service;

import com.T07.compExec.api.model.CompExecResults;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Manager {

    //private final String pathMVNProject = "/projectUT/";
    //private final String pathMVNProject_class = "/projectUT/src/main/java/TestPackage/";
    //private final String pathMVNProject_testclass = "/projectUT/src/test/java/TestPackage/";

    private final String pathOriginalProject = "/ProjectUT/";
    private final String pathTempProjects = "/tempRun/";
    private final String pathFileSystem = "/FileSystem/";

    private String pathJacoco = "";
    private String pathProject = "";
    private String pathClass = "";
    private String pathTestClass = "";

    private CompExecResults res;

    public Manager() {
        this.res = new CompExecResults();
    }


    public float CompileRun(String className, String studentLogin, String gameId) {

        List<File> filesClass = (List<File>) FileUtils.listFiles(new File(pathFileSystem + className+ "/"+ className + "SourceCode/"), new String[] { "java" }, false);
        List<File> filesTestClass = (List<File>) FileUtils.listFiles(new File(pathFileSystem + className+ "/" + studentLogin + "/" + gameId + "/TestSourceCode/"), new String[] { "java" }, false);

        File classe = filesClass.get(0);
        File testClasse = filesTestClass.get(0);

        //String urlClasse = pathFileSystem + className+ "/"+ className + "SourceCode/" + "*.java";
        //String urlClassetest = pathFileSystem + className+ "/" + studentLogin + "/" + gameId + "/TestSourceCode/" + className + "Test.java";

        String urlClasse = classe.getAbsolutePath();
        String urlClasseTest = testClasse.getAbsolutePath();

        System.out.println("classi estratte: " + urlClasse);
        System.out.println("classi estratte: " + urlClasseTest);

        long startTime = System.currentTimeMillis();

        pathProject = pathTempProjects+startTime+"/";
        pathClass = pathProject + "src/main/java/TestPackage/";
        pathTestClass = pathProject + "src/test/java/TestPackage/";
        pathJacoco = pathFileSystem + className+ "/" + studentLogin + "/" + gameId + "/TestReport/";

        easyCopyDirectory(pathOriginalProject, pathProject);

        try {
            Path sourceClass = Paths.get(urlClasse);
            Files.copy(sourceClass, Paths.get(pathClass+classe.getName()), StandardCopyOption.REPLACE_EXISTING);

            Path sourceTestClass = Paths.get(urlClasseTest);
            Files.copy(sourceTestClass, Paths.get(pathTestClass + testClasse.getName()), StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Compile(pathProject);
        if (res.getIdResult() == 0) {
            RunTests(pathProject);

            easyCopyDirectory(pathProject+"target/site/jacoco", pathJacoco);
            res.setPathCoverage(pathJacoco);
        }

        try {
            FileUtils.deleteDirectory(new File(pathProject));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        long endTime = System.currentTimeMillis();
        return (float)(endTime - startTime)/1000;

    }

    public float CompileRun(String Class, String TestClass) {

        List<File> filesClass = (List<File>) FileUtils.listFiles(new File(pathFileSystem + Class), new String[] { "java" }, false);
        List<File> filesTestClass = (List<File>) FileUtils.listFiles(new File(pathFileSystem + TestClass), new String[] { "java" }, false);

        File classe = filesClass.get(0);
        File testClasse = filesTestClass.get(0);

        String urlClasse = classe.getAbsolutePath();
        String urlClasseTest = testClasse.getAbsolutePath();

        System.out.println("classi estratte: " + urlClasse);
        System.out.println("classi estratte: " + urlClasseTest);

        long startTime = System.currentTimeMillis();

        pathProject = pathTempProjects+startTime+"/";
        pathClass = pathProject + "src/main/java/TestPackage/";
        pathTestClass = pathProject + "src/test/java/TestPackage/";
        pathJacoco = pathFileSystem + TestClass.replace("TestSourceCode", "TestReport");

        easyCopyDirectory(pathOriginalProject, pathProject);

        try {
            Path sourceClass = Paths.get(urlClasse);
            Files.copy(sourceClass, Paths.get(pathClass+classe.getName()), StandardCopyOption.REPLACE_EXISTING);

            Path sourceTestClass = Paths.get(urlClasseTest);
            Files.copy(sourceTestClass, Paths.get(pathTestClass + testClasse.getName()), StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Compile(pathProject);
        if (res.getIdResult() == 0) {
            RunTests(pathProject);

            easyCopyDirectory(pathProject+"target/site/", pathJacoco);
            res.setPathCoverage(pathJacoco);
        }

        try {
            FileUtils.deleteDirectory(new File(pathProject));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        long endTime = System.currentTimeMillis();
        return (float)(endTime - startTime)/1000;

    }

    public float CompileRun(String className, String studentLogin, String gameId, String urlClasse, String urlClassetest) {

        long startTime = System.currentTimeMillis();

        pathProject = pathTempProjects+startTime+"/";
        pathClass = pathProject + "src/main/java/TestPackage/";
        pathTestClass = pathProject + "src/test/java/TestPackage/";
        pathJacoco = pathFileSystem + className+ "/" + studentLogin + "/" + gameId + "/TestReport/";

        easyCopyDirectory(pathOriginalProject, pathProject);

        try {

            String filenameClass = Paths.get(new URI(urlClasse).getPath()).getFileName().toString();
            String filenameTestClass = Paths.get(new URI(urlClassetest).getPath()).getFileName().toString();

            System.out.println(urlClasse);
            System.out.println(urlClassetest);
            System.out.println(urlClasse.getClass().getSimpleName());

            InputStream inClass = new URL(urlClasse).openStream();
            Files.copy(inClass, Paths.get(pathClass+filenameClass), StandardCopyOption.REPLACE_EXISTING);
            Files.copy(Paths.get(pathClass+filenameClass), Paths.get(pathFileSystem + className+ "/"+ className + "SourceCode/"+filenameClass), StandardCopyOption.REPLACE_EXISTING);

            InputStream inTestClass = new URL(urlClassetest).openStream();
            Files.copy(inTestClass, Paths.get(pathTestClass+filenameTestClass), StandardCopyOption.REPLACE_EXISTING);
            Files.copy(Paths.get(pathTestClass+filenameTestClass), Paths.get(pathFileSystem + className+ "/" + studentLogin + "/" + gameId + "/TestSourceCode/"+filenameTestClass), StandardCopyOption.REPLACE_EXISTING);

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

        //chiamo il compilatore

        Compile(pathProject);

        if (res.getIdResult() == 0) {
            RunTests(pathProject);

            easyCopyDirectory(pathProject+"target/site/jacoco", pathJacoco);
            res.setPathCoverage(pathJacoco);
        }

        try {
            FileUtils.deleteDirectory(new File(pathProject));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        long endTime = System.currentTimeMillis();
        return (float)(endTime - startTime)/1000;

    }

    private void Compile(String pathMVNProject) {
        Compiler c = new Compiler();
        c.Compile(pathMVNProject, res);
    }

    private void RunTests(String pathMVNProject) {
        TestRunner t = new TestRunner();
        t.RunTests(pathMVNProject, res);
    }

    public CompExecResults getRes() {
        return res;
    }

    private void easyCopyDirectory (String source, String destination) {

        try {
            File sourceDirectory = new File(source);
            File destinationDirectory = new File(destination);
            FileUtils.copyDirectory(sourceDirectory, destinationDirectory);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
