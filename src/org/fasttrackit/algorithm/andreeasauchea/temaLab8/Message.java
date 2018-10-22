package org.fasttrackit.algorithm.andreeasauchea.temaLab8;

public class Message {

    private String title;
    private String bodyText;

    Message(String title, String bodyText){
        this.title = title;
        this.bodyText = bodyText;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBodyText() {
        return bodyText;
    }

    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }
}
