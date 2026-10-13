package org.example;

public abstract class TextDecorator implements ISourceText{
    protected final ISourceText wrapper;

    public TextDecorator(ISourceText source) {
        this.wrapper = source;
    }

    @Override
    public String getText() {
        return wrapper.getText();
    }
}
