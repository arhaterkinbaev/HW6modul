package ex2;

public class TextReportBuilder implements IReportBuilder {
    private String header;
    private String content;
    private String footer;

    public void setHeader(String header) {
        this.header = header;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public Report getReport() {
        return new Report(header, content, footer);
    }
}
