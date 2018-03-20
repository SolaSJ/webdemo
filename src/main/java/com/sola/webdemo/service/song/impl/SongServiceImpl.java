package com.sola.webdemo.service.song.impl;

import com.sola.webdemo.mapper.SongMapper;
import com.sola.webdemo.service.song.ISongService;
import org.springframework.beans.factory.annotation.Autowired;

public class SongServiceImpl implements ISongService {

    @Autowired
    private SongMapper songMapper;

}
