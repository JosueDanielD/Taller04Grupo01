/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

/**
 *
 * @author LENOVO
 */
class WhatsAppAdapter implements NotificationInterface {
    private WhatsAppAPI whatsappAPI;

    public WhatsAppAdapter(WhatsAppAPI whatsappAPI) {
        this.whatsappAPI = whatsappAPI;
    }

    @Override
    public void sendReport(String message) {
        whatsappAPI.sendWSMsg(message);
    }
}