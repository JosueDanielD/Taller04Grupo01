/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

/**
 *
 * @author LENOVO
 */
class TelegramAdapter implements NotificationInterface {
    private TelegramAPI telegramAPI;

    public TelegramAdapter(TelegramAPI telegramAPI) {
        this.telegramAPI = telegramAPI;
    }

    @Override
    public void sendReport(String message) {
        telegramAPI.sendTelegramMsg(message);
    }
}