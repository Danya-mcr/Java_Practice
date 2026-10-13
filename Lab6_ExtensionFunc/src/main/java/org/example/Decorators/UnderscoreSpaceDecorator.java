package org.example.Decorators;

import org.example.ISourceText;
import org.example.TextDecorator;

public class UnderscoreSpaceDecorator extends TextDecorator {
    public UnderscoreSpaceDecorator(ISourceText source) {
        super(source);
    }

    @Override
    public String getText() {
        return super.getText().replace(" ", "_");
    }
}
