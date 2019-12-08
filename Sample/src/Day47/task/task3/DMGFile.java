package Day47.task.task3;

import Day47.example.javaInterface.ex3.ReadFile;

public class DMGFile implements ReadFile {
    @Override
    public void connect() {
        System.out.println( "Connect to DMGFile" );
    }

    @Override
    public void getData() {
        System.out.println( "Get from DMGFile" );

    }

    @Override
    public void saveData() {
        System.out.println( "Save to DMGFile" );

    }

    @Override
    public void updateData() {
        System.out.println( "Update DMGFile" );

    }
}
