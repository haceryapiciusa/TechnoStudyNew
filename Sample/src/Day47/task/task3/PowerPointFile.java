package Day47.task.task3;

import Day47.example.javaInterface.ex3.ReadFile;

public class PowerPointFile implements ReadFile {
    public void connect() {
        System.out.println( "Connect to PowerPoint" );
    }

    public void getData() {
        System.out.println( "Get from PowerPoint" );
    }

    @Override
    public void saveData() {
        System.out.println( "Save to PowerPoint" );
    }

    @Override
    public void updateData() {
        System.out.println( "Update PowerPoint" );
    }
}
