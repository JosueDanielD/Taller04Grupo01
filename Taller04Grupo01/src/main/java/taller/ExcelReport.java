/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

/**
 *
 * @author LENOVO
 */
class ExcelReport extends Report {
    @Override
    public void addContent(String content) {
        System.out.println("Añadiendo contenido al reporte de Excel");
    }

    @Override
    public void applyStyles(StyleOptions styleOptions) {
        System.out.println("Aplicando contenido al reporte de Excel");
    }

    @Override
    public String generateContent() {
        return "Contenido de reporte de Excel";
    }
}
