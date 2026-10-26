package org.example.Components.Players;

import org.example.Components.Base.BaseFunctions;

public class BasePlayer extends BaseFunctions {
    public void eject() {
        System.out.println("Извлечь диск");
    }

    public void pause() {
        System.out.println("Поставить на паузу");
    }

    public void play() {
        System.out.println("Запустить");
    }

    public void stop() {
        System.out.println("Остановить");
    }
}
