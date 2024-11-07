/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

/**
 *
 * @author LENOVO
 */
class StyleDecorator extends ReportDecorator {

    public StyleDecorator(ReportComponent reportComponent) {
        super(reportComponent);
    }

    @Override
    public String generate() {
        return super.generate() + " con estilos";
    }
}
