package com.sola.webdemo.service.SongArtist.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sola.webdemo.entity.SongArtist;
import com.sola.webdemo.mapper.SongArtistMapper;
import com.sola.webdemo.service.SongArtist.ISongArtistService;
import com.sola.webdemo.service.song.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongArtistServiceImpl implements ISongArtistService {

    @Autowired
    private SongArtistMapper songArtistMapper;

    @Override
    public int insertSong(String data) {
        int num = 0;
        JSONObject json = JSON.parseObject(data);
        Long songId = json.getLong("songId");
        JSONArray artists = json.getJSONArray("artists");
        for (int i = 0; i < artists.size(); i++) {
            String name = artists.getJSONObject(i).getString("name");
            Long id = artists.getJSONObject(i).getLong("id");
            SongArtist songArtist = new SongArtist(0L, songId, id, -1L);
            num += songArtistMapper.insertSelective(songArtist);

        }
        return num;
    }

}
