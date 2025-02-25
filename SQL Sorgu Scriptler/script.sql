USE [IKVT]
GO
/****** Object:  User [A]    Script Date: 16.04.2020 23:14:33 ******/
CREATE USER [A] WITHOUT LOGIN WITH DEFAULT_SCHEMA=[dbo]
GO
/****** Object:  User [AJP]    Script Date: 16.04.2020 23:14:33 ******/
CREATE USER [AJP] FOR LOGIN [AJP] WITH DEFAULT_SCHEMA=[dbo]
GO
/****** Object:  User [AVT]    Script Date: 16.04.2020 23:14:33 ******/
CREATE USER [AVT] WITHOUT LOGIN WITH DEFAULT_SCHEMA=[dbo]
GO
sys.sp_addrolemember @rolename = N'db_owner', @membername = N'A'
GO
sys.sp_addrolemember @rolename = N'db_owner', @membername = N'AJP'
GO
sys.sp_addrolemember @rolename = N'db_owner', @membername = N'AVT'
GO
/****** Object:  Table [dbo].[Listee]    Script Date: 16.04.2020 23:14:33 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Listee](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[Adi] [varchar](50) NULL,
	[Soyad] [varchar](50) NULL,
	[TC] [nchar](11) NULL,
	[Adres] [varchar](50) NULL,
	[Tel] [nchar](11) NULL,
	[Mail] [varchar](50) NULL,
	[Bolum] [varchar](50) NULL,
	[Maas] [varchar](50) NULL,
	[Kayit] [date] NULL,
	[Gorev] [varchar](50) NULL,
 CONSTRAINT [PK_Listee] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Listee] ON 

INSERT [dbo].[Listee] ([Id], [Adi], [Soyad], [TC], [Adres], [Tel], [Mail], [Bolum], [Maas], [Kayit], [Gorev]) VALUES (1, N'Steve', N'Jobs', N'US         ', N'00012359764', N'00000000123', N'apple@gmail.com', N'Yönetim Kurulu Başkanı', N'bilinmiyor', CAST(N'1995-01-01' AS Date), N'yok')
INSERT [dbo].[Listee] ([Id], [Adi], [Soyad], [TC], [Adres], [Tel], [Mail], [Bolum], [Maas], [Kayit], [Gorev]) VALUES (12, N'Nikola', N'Tesla', N'US         ', N'00131356477', N'5486513274 ', N'tesla@gmail.com', N'Elektrik', N'2000 $', CAST(N'1856-06-05' AS Date), N'Kablosuz Elektrik')
INSERT [dbo].[Listee] ([Id], [Adi], [Soyad], [TC], [Adres], [Tel], [Mail], [Bolum], [Maas], [Kayit], [Gorev]) VALUES (13, N'Bilal', N'Mercan', N'İstanbul   ', N'11111111111', N'5345689752 ', N'dfsf@gmail.com', N'Flutter', N'15000 TL', CAST(N'1900-01-01' AS Date), N'Guı Tasarımı')
SET IDENTITY_INSERT [dbo].[Listee] OFF
