package com.sola.webdemo.controller;

import com.sola.webdemo.service.SongArtist.ISongArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SongController {

    @Autowired
    private ISongArtistService songArtistService;

    // 这里由于新增的资源使用自增id, 该语句效果是不幂等的, 使用POST;
    // POST往往不指明具体操作的资源id, 而是在服务器端生成, 如/book, 最后由服务器端生成自增id;
    // 而PUT往往指明具体操作的资源id, 如/book/1;
    @RequestMapping(value = "/song", method = RequestMethod.POST)
    @ResponseBody
    public Object song(String data){
        int i = songArtistService.insertSong(data);
        return i;
    }

}
