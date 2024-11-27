package com.example.ex05_recyclerview01a;

import java.util.ArrayList;

public class SceneInfo {
    private int imgId;
    private String description;
    private String country;

    public SceneInfo(String description, int imgId) {
        this.description = description;
        this.imgId = imgId;
    }
    public SceneInfo(String description, int imgId, String country) {
        this.description = description;
        this.imgId = imgId;
        this.country = country;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {

        this.description = description;
    }
    public int getImgId() {

        return imgId;
    }
    public void setImgId(int imgId) {

        this.imgId = imgId;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public static SceneInfo[] getMyListDataArray(){
        SceneInfo[] myListData = new SceneInfo[] {
                new SceneInfo("Email", android.R.drawable.ic_dialog_email),
                new SceneInfo("Info", android.R.drawable.ic_dialog_info),
                new SceneInfo("Delete", android.R.drawable.ic_delete),
                new SceneInfo("Dialer", android.R.drawable.ic_dialog_dialer),
                new SceneInfo("Alert", android.R.drawable.ic_dialog_alert),
                new SceneInfo("Map", android.R.drawable.ic_dialog_map),
                new SceneInfo("Email", android.R.drawable.ic_dialog_email),
                new SceneInfo("Info", android.R.drawable.ic_dialog_info),
                new SceneInfo("Delete", android.R.drawable.ic_delete),
                new SceneInfo("Dialer", android.R.drawable.ic_dialog_dialer),
                new SceneInfo("Alert", android.R.drawable.ic_dialog_alert),
                new SceneInfo("Map", android.R.drawable.ic_dialog_map),
        };
        return myListData;
    }
    public static ArrayList<SceneInfo> getMyListDataArrayList(){
        ArrayList<SceneInfo> myList = new ArrayList<SceneInfo>();
        String description = "萬里長城";
        int imgId = R.drawable.longtown;
        String country = "中國";
        SceneInfo mysceneInfo = new SceneInfo(description, imgId, country);
        myList.add(mysceneInfo);
        //-----------------------------------
        description = "紫禁城";
        imgId = R.drawable.purplecity;
        country = "中國";
        mysceneInfo = new SceneInfo(description, imgId, country);
        myList.add(mysceneInfo);
        //-----------------------------------
        description = "圓明園";
        imgId = R.drawable.grave;
        country = "中國";
        mysceneInfo =new SceneInfo(description, imgId, country);
        myList.add(mysceneInfo);
        //-----------------------------------
        description = "巴黎鐵塔";
        imgId = R.drawable.parispedal;
        country = "法國";
        mysceneInfo =new SceneInfo(description, imgId, country);
        myList.add(mysceneInfo);//-----------------------------------
        description = "凡爾賽宮";
        imgId = R.drawable.versailles;
        country = "法國";
        mysceneInfo =new SceneInfo(description, imgId, country);
        myList.add(mysceneInfo);//-----------------------------------
        description = "塞納河";
        imgId = R.drawable.seineriver;
        country = "法國";
        mysceneInfo =new SceneInfo(description, imgId, country);
        myList.add(mysceneInfo);//-----------------------------------
        description = "孔廟";
        imgId = R.drawable.confuciustemple;
        country = "台灣";
        mysceneInfo =new SceneInfo(description, imgId, country);
        myList.add(mysceneInfo);//-----------------------------------
        description = "大笨鐘";
        imgId = R.drawable.bigben;
        country = "英國";
        mysceneInfo =new SceneInfo(description, imgId, country);
        myList.add(mysceneInfo);//-----------------------------------
        description = "新天鵝堡";
        imgId = R.drawable.schwansteincastle;
        country = "德國";
        mysceneInfo =new SceneInfo(description, imgId, country);
        myList.add(mysceneInfo);//-----------------------------------
        description = "城隍廟";
        imgId = R.drawable.citygodtemple;
        country = "台灣";
        mysceneInfo =new SceneInfo(description, imgId, country);
        myList.add(mysceneInfo);

        return myList;
    }
}
