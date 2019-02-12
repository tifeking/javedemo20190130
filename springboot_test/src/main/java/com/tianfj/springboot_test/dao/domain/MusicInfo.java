package com.tianfj.springboot_test.dao.domain;

public class MusicInfo {

    private Integer id;


    private String singerName;


    private String musicSize;


    private String musicName;


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getSingerName() {
        return singerName;
    }


    public void setSingerName(String singerName) {
        this.singerName = singerName == null ? null : singerName.trim();
    }


    public String getMusicSize() {
        return musicSize;
    }


    public void setMusicSize(String musicSize) {
        this.musicSize = musicSize == null ? null : musicSize.trim();
    }


    public String getMusicName() {
        return musicName;
    }


    public void setMusicName(String musicName) {
        this.musicName = musicName == null ? null : musicName.trim();
    }

    @Override
    public String toString() {
        return "MusicInfo{" +
                "id=" + id +
                ", singerName='" + singerName + '\'' +
                ", musicSize='" + musicSize + '\'' +
                ", musicName='" + musicName + '\'' +
                '}';
    }
}
