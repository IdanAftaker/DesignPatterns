package Visitor;

public interface FileSystemNode {
    void visit(PrintVisitor v);
}
