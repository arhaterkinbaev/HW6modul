package ex2;

public class HtmlReportBuilder implements IReportBuilder {
    private String header;
    private String content;
    private String footer;

    public void setHeader(String header) {
        this.header = "<h1>" + header + "</h1>";
    }

    public void setContent(String content) {
        this.content = "<p>" + content + "</p>";
    }

    public void setFooter(String footer) {
        this.footer = "<footer>" + footer + "</footer>";
    }

    public Report getReport() {
        return new Report(header, content, footer);
    }
}
