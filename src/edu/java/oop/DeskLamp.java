package edu.java.oop;
public class DeskLamp {
    final int VOLT;
    private boolean power;
    private int brightness;

    public DeskLamp(int VOLT) {
        this.VOLT = VOLT;
    }

    public void powerOn(){
        if(power) {System.out.println("이미 전원이 켜져있습니다");return;}
        this.brightness=1;
        power=true;
        System.out.println("램프가 켜졌습니다.");
    }
    public void powerOff(){
        if(!power) {System.out.println("이미 전원이 꺼져있습니다");return;}
        this.brightness=0;
        power=false;
        System.out.println("램프가 꺼졌습니다.");
    }
    public int getBrightness() {
        return brightness;
    }
    public void setBrightness(int brightness) {
        if(brightness>3||brightness<0){
            System.out.println("밝기 설정 범위를 벗어났습니다. 1~3 사이를 선택해주세요");
            return;
        }
        if(brightness==0)powerOff();

        this.brightness = brightness;
        System.out.println("밝기가 "+brightness+"으로 설정됐습니다");
    }
    public String toString(){
        String isOn;if(power) isOn = "On";else{isOn="Off";}
        return "현재 파워 상태 : "+isOn+", 밝기 : "+brightness;
    }
}
