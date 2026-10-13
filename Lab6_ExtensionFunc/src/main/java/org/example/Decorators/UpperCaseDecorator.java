package org.example.Decorators;

import org.example.ISourceText;
import org.example.TextDecorator;

public class UpperCaseDecorator extends TextDecorator {
    public UpperCaseDecorator(ISourceText source) {
        super(source);
    }

    @Override
    public String getText() {
        return super.getText().toUpperCase();
    }
}
