/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

/**
 *
 * @author LENOVO
 */
// Abstract Factory Creator
abstract class ReportCreator {

    public abstract Report createReport();

    public void generateReport(String content, StyleOptions styleOptions) {
        Report report = createReport();
        report.addContent(content);
        report.applyStyles(styleOptions);
        System.out.println(report.generateContent());
    }
}
