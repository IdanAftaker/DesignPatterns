package Visitor;

public class PrintVisitor { //Concrete Element
    int level = 0;

    public void visitFileNode(FileNode node) { //For files
        for (int i = 0; i < level; i++)
            System.out.print("\t");
        System.out.println(node.getFile().getName());
    }

    public void visitDirectoryNode(DirectoryNode node) { //For directory
        for (int i = 0; i < level; i++)
            System.out.print("\t");
        System.out.println(node.getDirectory().getName());

        level++;
        for (FileSystemNode c : node.getChildren()) {
            c.visit(this);
        }
        level--;
    }

}
