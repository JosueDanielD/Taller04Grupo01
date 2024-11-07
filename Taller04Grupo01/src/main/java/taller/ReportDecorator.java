/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

/**
 *
 * @author LENOVO
 */
abstract class ReportDecorator extends ReportComponent {
    protected ReportComponent reportComponent;

    public ReportDecorator(ReportComponent reportComponent) {
        this.reportComponent = reportComponent;
    }

    @Override
    public String generate() {
        return reportComponent.generate();
    }
}
