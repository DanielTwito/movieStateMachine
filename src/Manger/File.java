package Manger;

public class File {

    private String fileName;
    private int fileSize;

    public File(String fileName, int fileSize) {
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    public String getFileName() {
        return fileName;
    }

    public int getFileSize() {
        return fileSize;
    }

    public boolean Comparison(File x) {
        if (x.getFileName() == this.getFileName() && x.getFileSize() == this.getFileSize())
            return true;
        return false;
    }
}
