/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

/**
 *
 * @author LENOVO
 */
public class FontDecorator extends ReportDecorator {

    public FontDecorator(ReportComponent reportComponent) {
        super(reportComponent);
    }

    @Override
    public String generate() {
        return super.generate() + " con cambios de fuente";
    }
}
