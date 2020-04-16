USE [IKVT]
GO

UPDATE [dbo].[Listee]
   SET [Adi] = <Adi, varchar(50),>
      ,[Soyad] = <Soyad, varchar(50),>
      ,[TC] = <TC, nchar(11),>
      ,[Adres] = <Adres, varchar(50),>
      ,[Tel] = <Tel, nchar(11),>
      ,[Mail] = <Mail, varchar(50),>
      ,[Bolum] = <Bolum, varchar(50),>
      ,[Maas] = <Maas, varchar(50),>
      ,[Kayit] = <Kayit, date,>
      ,[Gorev] = <Gorev, varchar(50),>
 WHERE <Search Conditions,,>
GO

