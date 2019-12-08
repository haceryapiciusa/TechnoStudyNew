package Day47.task.task3;

import Day47.example.javaInterface.ex3.ReadFile;

public class EXEFile implements ReadFile {
    @Override
    public void connect() {
        System.out.println( "Connect to EXEFile" );

    }

    @Override
    public void getData() {
        System.out.println( "Get from EXEFile" );

    }

    @Override
    public void saveData() {
        System.out.println( "Save to EXEFile" );

    }

    @Override
    public void updateData() {
        System.out.println( "Update EXEFile" );

    }
}
