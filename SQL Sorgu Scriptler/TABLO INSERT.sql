USE [IKVT]
GO

INSERT INTO [dbo].[Listee]
           ([Adi]
           ,[Soyad]
           ,[TC]
           ,[Adres]
           ,[Tel]
           ,[Mail]
           ,[Bolum]
           ,[Maas]
           ,[Kayit]
           ,[Gorev])
     VALUES
           (<Adi, varchar(50),>
           ,<Soyad, varchar(50),>
           ,<TC, nchar(11),>
           ,<Adres, varchar(50),>
           ,<Tel, nchar(11),>
           ,<Mail, varchar(50),>
           ,<Bolum, varchar(50),>
           ,<Maas, varchar(50),>
           ,<Kayit, date,>
           ,<Gorev, varchar(50),>)
GO

