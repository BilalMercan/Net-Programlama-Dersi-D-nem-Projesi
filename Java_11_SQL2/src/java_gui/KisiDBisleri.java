

package java_gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A
 */
public class KisiDBisleri {
	private final String connectionUrl;
	private final String user;
	private final String pass;

	public KisiDBisleri(String connectionUrl, String user, String pass) {
		this.connectionUrl = connectionUrl;
		this.user = user;
		this.pass = pass;
	}
	
	public ArrayList<Kisi> KisiListesi(){
		ArrayList<Kisi> Listem = new ArrayList<>();
		try (Connection con = DriverManager.getConnection(connectionUrl, user, pass))
		{
		    Statement stmt = con.createStatement(); 
            String SQL = "SELECT  [Id], [Adi], [Soyad], [TC], [Adres], [Tel], [Mail], [Bolum], [Maas], [Kayit], [Gorev] FROM [IKVT].[dbo].[Listee]";
			String SQL2 = "WHERE (Adi LIKE N'xxx%')";
            ResultSet rs = stmt.executeQuery(SQL);
       
			// Iterate through the data in the result set and display it.
			while(rs.next()){
				Kisi k=new Kisi();
				//Retrieve by column name
				k.setId(rs.getInt("Id"));
				k.setAdi(rs.getString("Adi"));
                                k.setSoyad(rs.getString("Soyad"));
                                k.setTC(rs.getString("TC"));
                                k.setAdres(rs.getString("Adres"));
                                k.setTel(rs.getString("Tel"));
                                k.setMail(rs.getString("Mail"));
                                k.setBolum(rs.getString("Bolum"));
                                k.setMaas(rs.getString("Maas"));
                                k.setKayit(rs.getString("Kayit"));
                                k.setGorev(rs.getString("Gorev"));
				Listem.add(k);
			}
			rs.close();
			//con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return Listem;
	}
		
	public int KisiSil(String Kid, String Adi, String Soyad, String TC, String Adres, String Tel, String Mail, String Bolum, String Maas, String Kayit, String Gorev )
	{
        int say = -1;
		Boolean giris_hazir = 
			(Kid.length()>0) &&		// kayit no olmali
			(Adi.length()>0) &&		// adi yazilmali		// telefon yazilmali
		        (Soyad.length()>0)&&
                        (TC.length()>0) &&
                        (Adres.length()>0) &&
                        (Tel.length()>0) &&
                        (Mail.length()>0) &&
                        (Bolum.length()>0) &&
                        (Maas.length()>0) &&
                        (Kayit.length()>0) &&
                        (Gorev.length()>0) ;
                        
                        
		int id=-1;
		
		try {
			id = Integer.valueOf(Kid);
		} catch (Exception e) {
			return say;
		}
				
		if (!giris_hazir)
			return say;

        try (  Connection con = DriverManager.getConnection(connectionUrl,user,pass); ) 
        {
			String SQL1 = "DELETE FROM dbo.Listee WHERE Id=?";
			PreparedStatement stmt = con.prepareStatement(SQL1);
			stmt.setInt(1, id);			
            say = stmt.executeUpdate();
			stmt.close();
            con.close();
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
		
    	return say;
	}

	public int KisiGuncellle(String Kid, String Adi, String Soyad, String TC, String Adres, String Tel, String Mail, String Bolum, String Maas, String Kayit, String Gorev )
	{
        int say = -1;
		Boolean giris_hazir = 
			(Kid.length()>0) &&		// kayit no olmali
			(Adi.length()>0) &&		// adi yazilmali		// telefon yazilmali
		        (Soyad.length()>0)&&
                        (TC.length()>0) &&
                        (Adres.length()>0) &&
                        (Tel.length()>0) &&
                        (Mail.length()>0) &&
                        (Bolum.length()>0) &&
                        (Maas.length()>0) &&
                        (Kayit.length()>0) &&
                        (Gorev.length()>0) ;
                        
                        
                        
		int id=-1;
		
		try {
			id = Integer.valueOf(Kid);
		} catch (Exception e) {
			return say;
		}
				
		if (!giris_hazir)
			return say;

        try (  Connection con = DriverManager.getConnection(connectionUrl,user,pass); ) 
        {
			String SQL1 = "UPDATE dbo.Listee SET Adi=?, Soyad=?, TC=?, Adres=?, Tel=?, Mail=?, Bolum=?, Maas=?, Kayit=?, Gorev=? WHERE Id= ?";
			PreparedStatement stmt = con.prepareStatement(SQL1);
			stmt.setString(1, Adi);		// 1. parametreyi ekle = Adi bilgisi
                        stmt.setString(2, Soyad);
                        stmt.setString(3, TC);
                        stmt.setString(4, Adres);
                        stmt.setString(5, Tel);	
                        stmt.setString(6, Mail);
                        stmt.setString(7, Bolum);
                        stmt.setString(8, Maas);
                        stmt.setString(9, Kayit);
                        stmt.setString(10, Gorev);
                        stmt.setInt(11, id);			// 2. parametreyi ekle = Tel bilgisi
            say = stmt.executeUpdate();
			stmt.close();
            con.close();
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
		
        return say;
	}

	public int KisiEkle(String Kid, String Adi, String Soyad, String TC, String Adres, String Tel, String Mail, String Bolum, String Maas, String Kayit, String Gorev )
	{
        int say = -1;
		Boolean giris_hazir = 
			(Kid.length()==0) &&	// kayit no bos olmali
			(Adi.length()>0) &&		// adi yazilmali
			(Soyad.length()>0)&&
                        (TC.length()>0) &&
                        (Adres.length()>0) &&
                        (Tel.length()>0)&&
                        (Mail.length()>0) &&
                        (Bolum.length()>0) &&
                        (Maas.length()>0) &&
                        (Kayit.length()>0) &&
                        (Gorev.length()>0) ;
                        		// telefon yazilmali
		
		if (!giris_hazir)
			return say;

        try (  Connection con = DriverManager.getConnection(connectionUrl,user,pass); ) 
        {
			String SQL1 = "INSERT INTO dbo.Listee (Adi, Soyad, TC, Adres, Tel, Mail, Bolum, Maas, Kayit, Gorev) VALUES (?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(SQL1);
			stmt.setString(1, Adi);		// 1. parametreyi ekle = Adi bilgisi
			stmt.setString(2, Soyad);
                        stmt.setString(3, TC);
                        stmt.setString(4, Adres);
                        stmt.setString(5, Tel);
                        stmt.setString(6, Mail);
                        stmt.setString(7, Bolum);
                        stmt.setString(8, Maas);
                        stmt.setString(9, Kayit);
                        stmt.setString(10, Gorev);
                        
                        say = stmt.executeUpdate();
			stmt.close();
            con.close();
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
		
		return say;
	}

}
