package Visitor;

import java.io.File;

public class DirectoryNode implements FileSystemNode {
    private File directory;

    public DirectoryNode(File directory) { this.directory = directory; }
    public File getDirectory() { return directory; }

    public void visit(PrintVisitor v) {
        v.visitDirectoryNode(this);
    }
    public FileSystemNode[] getChildren() { //Get the children of the directory
        File[] files = directory.listFiles();
        FileSystemNode[] children = new FileSystemNode[files.length];
        for (int i = 0; i < files.length; i++) {
            File f = files[i];
            if (f.isDirectory())
                children[i] = new DirectoryNode(f);
            else
                children[i] = new FileNode(f);
        }
        return children;
    }
}
