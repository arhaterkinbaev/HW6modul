package ex2;

public class ReportDirector {
    public void constructReport(IReportBuilder builder) {
        builder.setHeader("Отчет заголовок");
        builder.setContent("Содержимое отчета...");
        builder.setFooter("Отчет подвал");
    }
}
