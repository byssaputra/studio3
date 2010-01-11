package com.aptana.editor.css.parsing.ast;

public class CSSMediaNode extends CSSNode {

    private String[] fMedias;

    public CSSMediaNode(String[] medias, int start, int end) {
        fMedias = medias;
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        text.append("@media"); //$NON-NLS-1$
        for (String media : fMedias) {
            text.append(" ").append(media); //$NON-NLS-1$
        }
        text.append("{").append("}"); //$NON-NLS-1$ //$NON-NLS-2$
        return text.toString();
    }
}
