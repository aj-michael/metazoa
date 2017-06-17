A bytecode sorter.

To build, run the following commands

    $ javac metazoa/Metazoa.java
    $ jar cmf metazoa/MANIFEST.MF m.jar metazoa/Metazoa.class

To run the example project, run the following commands

    $ javac example/App.java
    $ java -javaagent:m.jar example.App
    [1]    24537 segmentation fault (core dumped)  java -javaagent:m.jar example.App
