package org.example;

public class Television {
    private String brandTv;
    private String modelTv;
    private int currentVolumeTv;
    private int currentChannelTv;
    private boolean childLock;
    private int childLockCode;
    Television(String brandTv, String modelTv, int currentVolumeTv, int currentChannelTv){

        this.brandTv = brandTv;
        this.modelTv = modelTv;
        this.currentVolumeTv = currentVolumeTv;
        this.currentChannelTv = currentChannelTv;
        this.childLock = false;
        this.childLockCode = 0;
    }
    public void setBrandTv(String brandTv){

        this.brandTv = brandTv;
    }
    public String getBrandTv(){

        return this.brandTv;
    }
    public void setModelTv(String modelTv){

        this.modelTv = modelTv;
    }
    public String getModelTv(){

        return this.modelTv;
    }
    public void setCurrentVolumeTv(int currentVolumeTv){

        this.currentVolumeTv = currentVolumeTv;
    }
    public int getCurrentVolumeTv(){

        return this.currentVolumeTv;
    }
    public void setCurrentChannelTv(int currentChannelTv){

        this.currentChannelTv = currentChannelTv;
    }
    public int getCurrentChannelTv(){
        return this.currentChannelTv;
    }
    public void increaseCurrentChannel(){

        currentChannelTv += 1;
    }
    public void decreaseCurrentChannel(){

        currentChannelTv -= 1;
    }
    public void increaseCurrentVolume(){

        currentVolumeTv += 1;
    }
    public void decreaseCurrentVolume(){

        currentVolumeTv -= 1;
    }
    public void setChildLock(int childLockCode){
        if(childLock == false) {
            this.childLockCode = childLockCode;
            this.childLock = true;
        }
    }

    public void removeChildLock(int childLockCodePin){
        if (childLock == true && childLockCodePin == childLockCode){
            this.childLock = false;

        }
    }

}
