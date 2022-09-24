package com.cgblearn.enum_;

/**
 * @author cgb
 * @version 1.0
 */

@SuppressWarnings("all")
public class EnumDetail {

    public static void main(String[] args) {
        Music.ClassicMUSIC.playing();
    }
}
@SuppressWarnings("all")
interface IPlaying{

     void playing();
}
@SuppressWarnings("all")
enum Music implements IPlaying{
    ClassicMUSIC;

    @Override
    public void playing() {
        System.out.println("播放好听的音乐");
    }
}