/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameeducation;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

/**
 *
 * @author User
 */
public class musicStuff {
    Clip clip;
    float prevVol = 0;
    float currVol = 0;
    FloatControl fc;
    boolean mute = false;
    void playMusic(String musicLocation){
        try {
            File musicPath = new File(musicLocation);
            if (musicPath.exists()){
                AudioInputStream audio = AudioSystem.getAudioInputStream(musicPath);
                clip = AudioSystem.getClip();
                clip.open(audio);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
                
            }else {
                System.out.println("cannot find this file");
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public void volumeUp () {
        fc = (FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
        currVol += 1.0f;
        if(currVol > 6.0f){
            currVol = 6.0f;
        }
        fc.setValue(currVol);
    }
    public void volumeDown (){
        fc = (FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
        currVol -= 1.0f;
        if(currVol < -80.0f){
            currVol = -80.0f;
        }
        fc.setValue(currVol);
    }
    public void muteVol () {
        fc = (FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
        if (mute == false){
            prevVol = currVol;
            currVol = -80.0f;
            fc.setValue(currVol);
            mute = true;
        } else if (mute == true) {
            currVol = prevVol;
            fc.setValue(currVol);
            mute = false;
        }
    }
}
