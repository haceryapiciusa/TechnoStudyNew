package Day47.task.task3;

import Day47.example.javaInterface.ex3.ReadFile;

public class TxtFile implements ReadFile {
    @Override
    public void connect() {
        System.out.println( "Connect to TxtFile" );

    }

    @Override
    public void getData() {
        System.out.println( "Get from TxtFile" );
    }

    @Override
    public void saveData() {
        System.out.println( "Save to TxtFile" );

    }

    @Override
    public void updateData() {
        System.out.println( "Update TxtFile" );

    }
}
