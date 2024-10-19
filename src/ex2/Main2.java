package ex2;

public class Main2 {
    public static void main(String[] args) {
        ReportDirector director = new ReportDirector();

        IReportBuilder textBuilder = new TextReportBuilder();
        director.constructReport(textBuilder);
        Report textReport = textBuilder.getReport();
        System.out.println("Текстовый отчет:");
        textReport.display();

        IReportBuilder htmlBuilder = new HtmlReportBuilder();
        director.constructReport(htmlBuilder);
        Report htmlReport = htmlBuilder.getReport();
        System.out.println("\nHTML отчет:");
        htmlReport.display();
    }
}
