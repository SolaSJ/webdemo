package com.sola.webdemo.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "song_r_artist")
public class SongArtist {

    @Id
    private Long id;

    @Column(name = "song_id")
    private Long songId;

    @Column(name = "artist_id")
    private Long artistId;

    @Column(name = "artist_identity_id")
    private Long artistIdentityId;

    public SongArtist(Long id, Long songId, Long artistId, Long artistIdentityId) {
        this.id = id;
        this.songId = songId;
        this.artistId = artistId;
        this.artistIdentityId = artistIdentityId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSongId() {
        return songId;
    }

    public void setSongId(Long songId) {
        this.songId = songId;
    }

    public Long getArtistId() {
        return artistId;
    }

    public void setArtistId(Long artistId) {
        this.artistId = artistId;
    }

    public Long getArtistIdentityId() {
        return artistIdentityId;
    }

    public void setArtistIdentityId(Long artistIdentityId) {
        this.artistIdentityId = artistIdentityId;
    }

}
