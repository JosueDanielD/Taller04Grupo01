/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package taller;

/**
 *
 * @author CMONTES
 */
public class ReportManagerSingleton {
    private static ReportManagerSingleton instance;

    private ReportManagerSingleton() {}

    public static ReportManagerSingleton getInstance() {
        if (instance == null) {
            instance = new ReportManagerSingleton();
        }
        return instance;
    }

    public void generateReport() {
        System.out.println("Generando reportes en singleton");
    }

    public void viewReport() {
        System.out.println("Viendo reportes en singleton");
    }
}
