package com.ponicamedia.android.whitenoise.Models;

import java.io.Serializable;

public class Sound {


    private String name;
    private int path_img;
    private int path_sound;
    private int path_sound_duplicate;
    private int sound_sec = 0;
    private float volume;
    private boolean enabled;


    public Sound(String _name,int _path_img,int _path_sound, int path_sound_duplicate, float _volume, boolean _enable, int _sound_sec){
        this.name = _name;
        this.path_img = _path_img;
        this.volume = _volume;
        this.enabled = _enable;
        this.path_sound = _path_sound;
        this.path_sound_duplicate = path_sound_duplicate;
        this.sound_sec = _sound_sec;
    }

    public int getPath_sound_duplicate() {
        return path_sound_duplicate;
    }

    public void setPath_sound_duplicate(int path_sound_duplicate) {
        this.path_sound_duplicate = path_sound_duplicate;
    }

    public int getPath_img() {
        return path_img;
    }

    public void setPath_img(int path_img) {
        this.path_img = path_img;
    }

    public int getPath_sound() {
        return path_sound;
    }

    public void setPath_sound(int path_sound) {
        this.path_sound = path_sound;
    }

    public String getName() {
        return name;
    }

    public int getSound_sec() {
        return sound_sec;
    }

    public void setSound_sec(int sound_sec) {
        this.sound_sec = sound_sec;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

}
