
package java_gui;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A
 */
public class Kisi {
	private int id;
	private String Adi;
	private String Tel;
        private String Soyad;
        private String TC;
        private String Adres;
        private String Mail;
        private String Bolum;
        private String Maas;
        private String Kayit;
        private String Gorev;
        

	public Kisi() {
		this.id = -1;
		this.Adi = "";
		this.Tel = "";
                this.Soyad = "";
                this.TC = "";
                this.Adres = "";
                this.Mail = "";
                this.Bolum = "";
                this.Maas = "";
                this.Kayit = "";
                this.Gorev = "";
                
	}
	
	public Kisi(int id, String Adi, String Tel,String Soyad, String TC, String Adres, String Mail, String Bolum, String Maas, String Kayit, String Gorev) {
		this.id = id;
		this.Adi = Adi;
		this.Tel = Tel;
                this.Soyad = Soyad;
                this.TC = TC;
                this.Adres = Adres;
                this.Mail = Mail;
                this.Bolum = Bolum;
                this.Maas = Maas;
                this.Kayit = Kayit;
                this.Gorev = Gorev;
	}

	public String getTel() {
		return Tel;
	}

	public void setTel(String Tel) {
		this.Tel = Tel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdi() {
		return Adi;
	}

	public void setAdi(String Adi) {
		this.Adi = Adi;
	}
        
        public String getSoyad() {
		return Soyad;
	}

	public void setSoyad(String Soyad) {
		this.Soyad = Soyad;
	}
	
        public String getTC() {
		return TC;
	}

	public void setTC(String TC) {
		this.TC = TC;
	}
        
        public String getAdres() {
		return Adres;
	}

	public void setAdres(String Adres) {
		this.Adres = Adres;
	}
        
        public String getMail() {
		return Mail;
	}

	public void setMail(String Mail) {
		this.Mail = Mail;
	}
        
        public String getBolum() {
		return Bolum;
	}

	public void setBolum(String Bolum) {
		this.Bolum = Bolum;
	}
        
        public String getMaas() {
		return Maas;
	}

	public void setMaas(String Maas) {
		this.Maas = Maas;
	}
        
        public String getKayit() {
		return Kayit;
	}

	public void setKayit(String Kayit) {
		this.Kayit = Kayit;
	}
        
        public String getGorev() {
		return Gorev;
	}

	public void setGorev(String Gorev) {
		this.Gorev = Gorev;
	}
        
        
	
}
