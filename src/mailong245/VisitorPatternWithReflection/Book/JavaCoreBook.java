package mailong245.VisitorPatternWithReflection.Book;

import mailong245.VisitorPatternWithReflection.Visitor.Visitor;

public class JavaCoreBook implements ProgramingBook {

    @Override
    public void accept(Visitor v) {
        v.visita(this);
    }

    @Override
    public String getResource() {
        return "Java";
    }

    public String getFavouriteBook() {
        return "The most favourite book of java core";
    }
}