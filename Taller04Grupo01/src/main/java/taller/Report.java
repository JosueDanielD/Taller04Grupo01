/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

/**
 *
 * @author LENOVO
 */
interface Report {

    public abstract void addContent(String content);

    public abstract void applyStyles(StyleOptions styleOptions);

    public abstract String generateContent();

}
