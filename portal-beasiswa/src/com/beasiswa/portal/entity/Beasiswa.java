package com.beasiswa.portal.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="beasiswa")
public class Beasiswa {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="judul")
	private String judul;
	
	@Column(name="poster")
	private byte[] poster;
	
	@Column(name="syarat_ketentuan")
	private String syaratKetentuan;

	public Beasiswa() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte[] getPoster() {
		return poster;
	}

	public void setPoster(byte[] poster) {
		this.poster = poster;
	}

	public String getSyaratKetentuan() {
		return syaratKetentuan;
	}

	public void setSyaratKetentuan(String syaratKetentuan) {
		this.syaratKetentuan = syaratKetentuan;
	}

	public String getJudul() {
		return judul;
	}

	public void setJudul(String judul) {
		this.judul = judul;
	}

	@Override
	public String toString() {
		return "Beasiswa [id=" + id + ", judul=" + judul + ", poster=" + Arrays.toString(poster) + ", syaratKetentuan="
				+ syaratKetentuan + "]";
	}
	
	
}
