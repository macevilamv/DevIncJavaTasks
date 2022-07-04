package by.incubator.task10;

public class EmptyFileException extends Exception{
    private String path;

    EmptyFileException(String message, String filePath) {
        super(message);
        this.path = filePath;
    }

    EmptyFileException(String message, String filePath, Throwable cause) {
        super(message, cause);
        this.path = filePath;
    }
}
