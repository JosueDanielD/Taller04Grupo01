/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

/**
 *
 * @author LENOVO
 */
// implementacion concreta
class MailNotification implements NotificationInterface {

    @Override
    public void sendNotif(String message) {
        System.out.println("Enviando mail de notificacion: " + message);
    }
}
