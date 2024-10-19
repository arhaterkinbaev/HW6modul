package ex2;

public class Report {
    private String header;
    private String content;
    private String footer;

    public Report(String header, String content, String footer) {
        this.header = header;
        this.content = content;
        this.footer = footer;
    }

    public void display() {
        System.out.println(header);
        System.out.println(content);
        System.out.println(footer);
    }
}
