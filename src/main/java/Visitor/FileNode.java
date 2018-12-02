package Visitor;

import java.io.File;

public class FileNode implements FileSystemNode {
    private File file;

    public FileNode(File file) { this.file = file; }
    public File getFile() { return file; }

    public void visit(PrintVisitor v) {
        v.visitFileNode(this);
    }
}
