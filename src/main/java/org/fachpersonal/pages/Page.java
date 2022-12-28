package org.fachpersonal.pages;

import org.fachpersonal.Program;
import org.fachpersonal.util.Logger;

public abstract class Page {
    protected String name;
    protected Page parent;
    protected Page[] child;

    public Page(String name, Page parent) {
        this.name = name;
        this.parent = parent;
        this.child = new Page[1];
        this.parent.addChild(this);
        Logger.debug("Initialized new Page ["+name+"]");
    }
    public abstract void displayPage();
    protected abstract void changePage();
    protected void changePage(Page child) {
        for (int i = 0; i < this.child.length; i++) {
            if(this.child[i].equals(child)){
                child.displayPage();
            }
        }
    }
    protected void returnToPreviousPage() {
        Program.outputStream.println("Type 'X' to exit Log Page");
        String line;
        do {
            line = Program.inputStream.nextLine();
        }while(!line.equalsIgnoreCase("X"));
        changePage(parent);
    }

    protected void addChild(Page child) {
        Page[] _child = this.child;
        this.child = new Page[_child.length + 1];
        System.arraycopy(_child, 0, this.child, 0, _child.length);
        this.child[_child.length] = child;
        Logger.debug("Added ["+child.name+"] as a child to ["+parent.name+"]");
    }
}
