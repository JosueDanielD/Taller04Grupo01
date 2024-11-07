/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

/**
 *
 * @author LENOVO
 */
class ColorDecorator extends ReportDecorator {

    public ColorDecorator(ReportComponent reportComponent) {
        super(reportComponent);
    }

    @Override
    public String generate() {
        return super.generate() + " con ajustes de color";
    }
}
