package Visitor;

import java.io.File;

/**
 * @author Idan Aftaker on 02/12/2018
 * @project DesignPatterns
 *
 * In Visitor pattern, we use a visitor class which changes the executing algorithm of an element class.
 * By this way, execution algorithm of element can vary as and when visitor varies.
 * This pattern comes under behavior pattern category.
 * As per the pattern, element object has to accept the visitor object so that visitor object handles the operation on the element object.
 */
public class Visitor {
    public static void main(String[] args){
        File f = new File("Visitor/FileForTest");
        DirectoryNode node = new DirectoryNode(f); //Start always with directory
        PrintVisitor pv = new PrintVisitor();
        node.visit(pv);
    }
}
