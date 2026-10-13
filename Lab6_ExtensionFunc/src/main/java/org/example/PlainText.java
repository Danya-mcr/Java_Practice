package org.example;

public class PlainText implements ISourceText{
    private final String text;

    public PlainText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
