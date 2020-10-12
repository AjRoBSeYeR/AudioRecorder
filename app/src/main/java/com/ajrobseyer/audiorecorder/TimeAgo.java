package com.ajrobseyer.audiorecorder;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TimeAgo {

    public String getTimeAgo(long duration) {
        Date now = new Date();

        long seconds = TimeUnit.MILLISECONDS.toSeconds(now.getTime() - duration);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(now.getTime() - duration);
        long hours = TimeUnit.MILLISECONDS.toHours(now.getTime() - duration);
        long days = TimeUnit.MILLISECONDS.toDays(now.getTime() - duration);

        if(seconds < 60){
            return "Justo ahora";
        } else if (minutes == 1) {
            return "Hace un minuto";
        } else if (minutes > 1 && minutes < 60) {
            return "Hace "+ minutes + " minutos";
        } else if (hours == 1) {
            return "Hace una hora";
        } else if (hours > 1 && hours < 24) {
            return "Hace "+hours + " horas";
        } else if (days == 1) {
            return "Hace un día";
        } else {
            return "Hace "+days + " días";
        }

    }

}
