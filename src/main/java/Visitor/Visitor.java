package Visitor;

import java.io.File;

public class Visitor {
    public static void main(String[] args){
        File f = new File("Visitor/FileForTest");
        DirectoryNode node = new DirectoryNode(f); //Start always with directory
        PrintVisitor pv = new PrintVisitor();
        node.visit(pv);
    }
}
