USE [julkaisut]
GO
/****** Object:  Table [dbo].[Avainsanat]    Script Date: 30.11.2015 16:05:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Avainsanat](
	[AvainsanaID] [bigint] IDENTITY(1,1) NOT NULL,
	[JulkaisuID] [bigint] NOT NULL,
	[Sana] [nvarchar](100) NULL,
	[Luoja] [nvarchar](30) NOT NULL CONSTRAINT [DF_Avainsanat_Luoja]  DEFAULT (original_login()),
	[Luontipaivamaara] [datetime2](4) NOT NULL CONSTRAINT [DF_Avainsanat_Luontipaivamaara]  DEFAULT (getdate()),
	[Paivittaja] [nvarchar](30) NULL,
	[Paivityspaivamaara] [datetime2](4) NULL,
 CONSTRAINT [PK_Avainsanat_AvainsanaID] PRIMARY KEY CLUSTERED
(
	[AvainsanaID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Hanke]    Script Date: 30.11.2015 16:05:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Hanke](
	[HankeID] [bigint] IDENTITY(1,1) NOT NULL,
	[JulkaisuID] [bigint] NOT NULL,
	[OrgID] [bigint] NOT NULL,
	[Hankenumero] [nvarchar](100) NULL,
	[Luoja] [nvarchar](30) NOT NULL CONSTRAINT [DF_Hanke_Luoja]  DEFAULT (original_login()),
	[Luontipaivamaara] [datetime2](4) NOT NULL CONSTRAINT [DF_Hanke_Luontipaivamaara]  DEFAULT (getdate()),
	[Paivittaja] [nvarchar](30) NULL,
	[Paivityspaivamaara] [datetime2](4) NULL,
 CONSTRAINT [PK_Hanke_HankeID] PRIMARY KEY CLUSTERED
(
	[HankeID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ISBN]    Script Date: 30.11.2015 16:05:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ISBN](
	[ISBNID] [bigint] IDENTITY(1,1) NOT NULL,
	[JulkaisuID] [bigint] NOT NULL,
	[ISBN] [nvarchar](100) NULL,
	[Luoja] [nvarchar](30) NOT NULL CONSTRAINT [DF_ISBN_Luoja]  DEFAULT (original_login()),
	[Luontipaivamaara] [datetime2](4) NOT NULL CONSTRAINT [DF_ISBN_Luontipaivamaara]  DEFAULT (getdate()),
	[Paivittaja] [nvarchar](30) NULL,
	[Paivityspaivamaara] [datetime2](4) NULL,
 CONSTRAINT [PK_ISBN_ISBNID] PRIMARY KEY CLUSTERED
(
	[ISBNID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ISSN]    Script Date: 30.11.2015 16:05:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ISSN](
	[ISSNID] [bigint] IDENTITY(1,1) NOT NULL,
	[JulkaisuID] [bigint] NOT NULL,
	[ISSN] [nvarchar](100) NULL,
	[Luoja] [nvarchar](30) NOT NULL CONSTRAINT [DF_ISSN_Luoja]  DEFAULT (original_login()),
	[Luontipaivamaara] [datetime2](4) NOT NULL CONSTRAINT [DF_ISSN_Luontipaivamaara]  DEFAULT (getdate()),
	[Paivittaja] [nvarchar](30) NULL,
	[Paivityspaivamaara] [datetime2](4) NULL,
 CONSTRAINT [PK_ISSN_ISSNID] PRIMARY KEY CLUSTERED
(
	[ISSNID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[JulkaisunKoulutusala]    Script Date: 30.11.2015 16:05:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[JulkaisunKoulutusala](
	[JKoulutusalaID] [bigint] IDENTITY(1,1) NOT NULL,
	[JulkaisuID] [bigint] NOT NULL,
	[KoulutusalaID] [bigint] NOT NULL,
	[Jnro] [int] NULL,
	[Luoja] [nvarchar](30) NOT NULL CONSTRAINT [DF_koulutusalat_Luoja]  DEFAULT (original_login()),
	[Luontipaivamaara] [datetime2](4) NOT NULL CONSTRAINT [DF_koulutusalatt_Luontipaivamaara]  DEFAULT (getdate()),
	[Paivittaja] [nvarchar](30) NULL,
	[Paivityspaivamaara] [datetime2](4) NULL,
 CONSTRAINT [PK_JulkaisunKoulutusala_JKoulutsalaID] PRIMARY KEY CLUSTERED
(
	[JKoulutusalaID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[JulkaisunOrgYksikko]    Script Date: 30.11.2015 16:05:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[JulkaisunOrgYksikko](
	[JOrgYksikkoID] [bigint] IDENTITY(1,1) NOT NULL,
	[JulkaisuID] [bigint] NOT NULL,
	[YksikkoID] [bigint] NOT NULL,
	[Luoja] [nvarchar](30) NOT NULL CONSTRAINT [DF_JulkaisunOrgYksikko_Luoja]  DEFAULT (original_login()),
	[Luontipaivamaara] [datetime2](4) NOT NULL CONSTRAINT [DF_JulkaisunOrgYksikko_Luontipaivamaara]  DEFAULT (getdate()),
	[Paivittaja] [nvarchar](30) NULL,
	[Paivityspaivamaara] [datetime2](4) NULL,
	[VanhempiID] [bigint] NULL,
 CONSTRAINT [PK_JulkaisunOrgYksikko_JOrgYksikkoID] PRIMARY KEY CLUSTERED
(
	[JOrgYksikkoID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[JulkaisunTieteenala]    Script Date: 30.11.2015 16:05:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[JulkaisunTieteenala](
	[JTieteenalaID] [bigint] IDENTITY(1,1) NOT NULL,
	[JulkaisuID] [bigint] NOT NULL,
	[TieteenalaID] [bigint] NOT NULL,
	[Jnro] [int] NULL,
	[Luoja] [nvarchar](30) NOT NULL CONSTRAINT [DF_JulkaisunTieteenala_Luoja]  DEFAULT (original_login()),
	[Luontipaivamaara] [datetime2](4) NOT NULL CONSTRAINT [DF_JulkaisunTieteenala_Luontipaivamaara]  DEFAULT (getdate()),
	[Paivittaja] [nvarchar](30) NULL,
	[Paivityspaivamaara] [datetime2](4) NULL,
 CONSTRAINT [PK_JulkaisunTieteenala_JTieteenalaID] PRIMARY KEY CLUSTERED
(
	[JTieteenalaID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Julkaisut]    Script Date: 30.11.2015 16:05:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Julkaisut](
	[JulkaisuID] [bigint] IDENTITY(1,1) NOT NULL,
	[JulkaisunTunnus] [nvarchar](50) NOT NULL,
	[JulkaisunTila] [int] NULL,
	[JulkaisuTyyppi] [nvarchar](2) NOT NULL,
	[IlmoitusVuosi] [int] NULL,
	[OrgID] [bigint] NOT NULL,
	[JulkaisuVuosi] [int] NULL,
	[JulkaisunNimi] [nvarchar](500) NULL,
	[Tekijatiedot] [nvarchar](800) NULL,
	[TekijoidenLkm] [int] NULL,
	[Sivunumero] [nvarchar](100) NULL,
	[Artikkelinumero] [int] NULL,
	[ISBN] [nvarchar](100) NULL,
	[Volyymi] [nvarchar](200) NULL,
	[LehdenNumero] [nvarchar](200) NULL,
	[Kustannuspaikka] [nvarchar](200) NULL,
	[EmojulkaisunNimi] [nvarchar](500) NULL,
	[EmojulkaisunToimittajat] [nvarchar](500) NULL,
	[YhteisjulkaisuKV] [int] NULL,
	[YhteisjulkaisuSHP] [int] NULL,
	[YhteisjulkaisuTutkimuslaitos] [int] NULL,
	[YhteisjulkaisuMuu] [int] NULL,
	[JulkaisunKansainvalisyys] [int] NULL,
	[AvoinSaatavuusKoodi] [int] NULL,
	[EVOjulkaisu] [int] NULL,
	[DOI] [nvarchar](200) NULL,
	[PysyvaOsoite] [nvarchar](400) NULL,
	[LahdetietokannanTunnus] [nvarchar](400) NULL,
	[JulkaisunOrgTunnus] [nvarchar](100) NULL,
	[JufoTunnus] [nvarchar](5) NULL,
	[JufoLuokka] [nvarchar](1) NULL,
	[Julkaisumaa] [nvarchar](20) NULL,
	[LehdenNimi] [nvarchar](500) NULL,
	[ISSN] [nvarchar](100) NULL,
	[KonferenssinNimi] [nvarchar](500) NULL,
	[KustantajanNimi] [nvarchar](500) NULL,
	[JulkaisunKieli] [nvarchar](20) NULL,
	[Luoja] [nvarchar](30) NOT NULL CONSTRAINT [DF_JulkaisutF_Luoja]  DEFAULT (original_login()),
	[Luontipaivamaara] [datetime2](4) NOT NULL CONSTRAINT [DF_JulkaisutF_Luontipaivamaara]  DEFAULT (getdate()),
	[Paivittaja] [nvarchar](30) NULL,
	[Paivityspaivamaara] [datetime2](4) NULL,
 CONSTRAINT [PK_JulkaisutF_JulkaisuID] PRIMARY KEY CLUSTERED
(
	[JulkaisuID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY],
 CONSTRAINT [julkaisut_julkaisuntunnus_uniq] UNIQUE NONCLUSTERED
(
	[JulkaisunTunnus] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[JulkaisutXML]    Script Date: 30.11.2015 16:05:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[JulkaisutXML](
	[JulkaisuXMLid] [bigint] IDENTITY(1,1) NOT NULL,
	[JulkaisuID] [bigint] NOT NULL,
	[xmldata] [xml] NULL,
	[Luoja] [nvarchar](30) NOT NULL CONSTRAINT [DF_JulkaisutXML_Luoja]  DEFAULT (original_login()),
	[Luontipaivamaara] [datetime2](4) NOT NULL CONSTRAINT [DF_JulkaisutXML_Luontipaivamaara]  DEFAULT (getdate()),
	[Paivittaja] [nvarchar](30) NULL,
	[Paivityspaivamaara] [datetime2](4) NULL,
 CONSTRAINT [PK_JulkaisutXML_JulkaisuXMLid] PRIMARY KEY CLUSTERED
(
	[JulkaisuXMLid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Koulutusala]    Script Date: 30.11.2015 16:05:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Koulutusala](
	[KoulutusalaID] [bigint] IDENTITY(1,1) NOT NULL,
	[Koodi] [nvarchar](5) NOT NULL,
	[Nimi] [nvarchar](100) NULL,
	[Alkamispaivmaara] [datetime] NULL,
	[Paattymispaivamaara] [datetime] NULL,
	[Luoja] [nvarchar](30) NOT NULL CONSTRAINT [DF_Koulutusalakoodit_Luoja]  DEFAULT (original_login()),
	[Luontipaivamaara] [datetime2](4) NOT NULL CONSTRAINT [DF_Koulutusalakoodit_Luontipaivamaara]  DEFAULT (getdate()),
	[Paivittaja] [nvarchar](30) NULL,
	[Paivityspaivamaara] [datetime2](4) NULL,
 CONSTRAINT [PK_KOulutusalatKoodit_KoulutusalaID] PRIMARY KEY CLUSTERED
(
	[KoulutusalaID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Organisaatio]    Script Date: 30.11.2015 16:05:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Organisaatio](
	[OrgID] [bigint] IDENTITY(1,1) NOT NULL,
	[OrgTunnus] [nvarchar](100) NOT NULL,
	[Nimi] [nvarchar](100) NULL,
	[Tyyppi] [int] NULL,
	[Luoja] [nvarchar](30) NOT NULL CONSTRAINT [DF_Organisaatio_Luoja]  DEFAULT (original_login()),
	[Luontipaivamaara] [datetime2](4) NOT NULL CONSTRAINT [DF_Organisaatio_Luontipaivamaara]  DEFAULT (getdate()),
	[Paivittaja] [nvarchar](30) NULL,
	[Paivityspaivamaara] [datetime2](4) NULL,
 CONSTRAINT [PK_Organisaatio_OrgID] PRIMARY KEY CLUSTERED
(
	[OrgID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[OrgYksikko]    Script Date: 30.11.2015 16:05:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[OrgYksikko](
	[YksikkoID] [bigint] IDENTITY(1,1) NOT NULL,
	[OrgID] [bigint] NOT NULL,
	[YksikkoKoodi] [nvarchar](200) NULL,
	[Nimi] [nvarchar](100) NULL,
	[Luoja] [nvarchar](30) NOT NULL CONSTRAINT [DF_orgyksikko_Luoja]  DEFAULT (original_login()),
	[Luontipaivamaara] [datetime2](4) NOT NULL CONSTRAINT [DF_orgyksikko_Luontipaivamaara]  DEFAULT (getdate()),
	[Paivittaja] [nvarchar](30) NULL,
	[Paivityspaivamaara] [datetime2](4) NULL,
 CONSTRAINT [PK_OrgYksikko_YksikkoID] PRIMARY KEY CLUSTERED
(
	[YksikkoID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[TekijanOrgYksikko]    Script Date: 30.11.2015 16:05:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TekijanOrgYksikko](
	[TOrgYksikkoID] [bigint] IDENTITY(1,1) NOT NULL,
	[TekijaID] [bigint] NOT NULL,
	[YksikkoID] [bigint] NOT NULL,
	[Luoja] [nvarchar](30) NOT NULL CONSTRAINT [DF_TekijanOrgYksikko_Luoja]  DEFAULT (original_login()),
	[Luontipaivamaara] [datetime2](4) NOT NULL CONSTRAINT [DF_TekijanOrgYksikko_Luontipaivamaara]  DEFAULT (getdate()),
	[Paivittaja] [nvarchar](30) NULL,
	[Paivityspaivamaara] [datetime2](4) NULL,
	[VanhempiID] [bigint] NULL,
 CONSTRAINT [PK_TekijanOrgYksikkoD_TOrgYksikkoID] PRIMARY KEY CLUSTERED
(
	[TOrgYksikkoID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Tekijat]    Script Date: 30.11.2015 16:05:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Tekijat](
	[TekijaID] [bigint] IDENTITY(1,1) NOT NULL,
	[JulkaisuID] [bigint] NOT NULL,
	[SukuNimi] [nvarchar](50) NULL,
	[Etunimet] [nvarchar](50) NULL,
	[ORCID] [nvarchar](50) NULL,
	[Luoja] [nvarchar](30) NOT NULL CONSTRAINT [DF_TekijatD_Luoja]  DEFAULT (original_login()),
	[Luontipaivamaara] [datetime2](4) NOT NULL CONSTRAINT [DF_TekijatD_Luontipaivamaara]  DEFAULT (getdate()),
	[Paivittaja] [nvarchar](30) NULL,
	[Paivityspaivamaara] [datetime2](4) NULL,
 CONSTRAINT [PK_TekijatD_TekijaID] PRIMARY KEY CLUSTERED
(
	[TekijaID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[TieteenalaLuokitus]    Script Date: 30.11.2015 16:05:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TieteenalaLuokitus](
	[TieteenalaID] [bigint] IDENTITY(1,1) NOT NULL,
	[Koodi] [nvarchar](5) NOT NULL,
	[Nimi] [nvarchar](100) NULL,
	[Alkamispaivmaara] [datetime] NULL,
	[Paattymispaivamaara] [datetime] NULL,
	[Luoja] [nvarchar](30) NOT NULL CONSTRAINT [DF_Tieteenalakoodit_Luoja]  DEFAULT (original_login()),
	[Luontipaivamaara] [datetime2](4) NOT NULL CONSTRAINT [DF_Tieteenalakoodit_Luontipaivamaara]  DEFAULT (getdate()),
	[Paivittaja] [nvarchar](30) NULL,
	[Paivityspaivamaara] [datetime2](4) NULL,
 CONSTRAINT [PK_TieteenalaLuokitus_TieteenalaID] PRIMARY KEY CLUSTERED
(
	[TieteenalaID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
ALTER TABLE [dbo].[Avainsanat]  WITH NOCHECK ADD  CONSTRAINT [FK_Avainsanat_Julkaisu] FOREIGN KEY([JulkaisuID])
REFERENCES [dbo].[Julkaisut] ([JulkaisuID])
NOT FOR REPLICATION
GO
ALTER TABLE [dbo].[Avainsanat] CHECK CONSTRAINT [FK_Avainsanat_Julkaisu]
GO
ALTER TABLE [dbo].[Hanke]  WITH NOCHECK ADD  CONSTRAINT [FK_Hanke_JulkaisuID] FOREIGN KEY([JulkaisuID])
REFERENCES [dbo].[Julkaisut] ([JulkaisuID])
NOT FOR REPLICATION
GO
ALTER TABLE [dbo].[Hanke] CHECK CONSTRAINT [FK_Hanke_JulkaisuID]
GO
ALTER TABLE [dbo].[Hanke]  WITH NOCHECK ADD  CONSTRAINT [FK_Hanke_OrgID] FOREIGN KEY([OrgID])
REFERENCES [dbo].[Organisaatio] ([OrgID])
NOT FOR REPLICATION
GO
ALTER TABLE [dbo].[Hanke] CHECK CONSTRAINT [FK_Hanke_OrgID]
GO
ALTER TABLE [dbo].[ISBN]  WITH NOCHECK ADD  CONSTRAINT [FK_ISBN_Julkaisu] FOREIGN KEY([JulkaisuID])
REFERENCES [dbo].[Julkaisut] ([JulkaisuID])
NOT FOR REPLICATION
GO
ALTER TABLE [dbo].[ISBN] CHECK CONSTRAINT [FK_ISBN_Julkaisu]
GO
ALTER TABLE [dbo].[ISSN]  WITH NOCHECK ADD  CONSTRAINT [FK_ISSN_Julkaisu] FOREIGN KEY([JulkaisuID])
REFERENCES [dbo].[Julkaisut] ([JulkaisuID])
NOT FOR REPLICATION
GO
ALTER TABLE [dbo].[ISSN] CHECK CONSTRAINT [FK_ISSN_Julkaisu]
GO
ALTER TABLE [dbo].[JulkaisunKoulutusala]  WITH NOCHECK ADD  CONSTRAINT [FK_JulkaisunKoulutusalaD_JulkaisuID] FOREIGN KEY([JulkaisuID])
REFERENCES [dbo].[Julkaisut] ([JulkaisuID])
NOT FOR REPLICATION
GO
ALTER TABLE [dbo].[JulkaisunKoulutusala] CHECK CONSTRAINT [FK_JulkaisunKoulutusalaD_JulkaisuID]
GO
ALTER TABLE [dbo].[JulkaisunKoulutusala]  WITH NOCHECK ADD  CONSTRAINT [FK_KOulutusalatD_KoulutusalaID] FOREIGN KEY([KoulutusalaID])
REFERENCES [dbo].[Koulutusala] ([KoulutusalaID])
NOT FOR REPLICATION
GO
ALTER TABLE [dbo].[JulkaisunKoulutusala] CHECK CONSTRAINT [FK_KOulutusalatD_KoulutusalaID]
GO
ALTER TABLE [dbo].[JulkaisunOrgYksikko]  WITH NOCHECK ADD  CONSTRAINT [FK_JulkaisunOrgYksikko_JulkaisuID] FOREIGN KEY([JulkaisuID])
REFERENCES [dbo].[Julkaisut] ([JulkaisuID])
NOT FOR REPLICATION
GO
ALTER TABLE [dbo].[JulkaisunOrgYksikko] CHECK CONSTRAINT [FK_JulkaisunOrgYksikko_JulkaisuID]
GO
ALTER TABLE [dbo].[JulkaisunOrgYksikko]  WITH NOCHECK ADD  CONSTRAINT [FK_JulkaisunOrgYksikko_VanhempiID] FOREIGN KEY([YksikkoID])
REFERENCES [dbo].[OrgYksikko] ([YksikkoID])
NOT FOR REPLICATION
GO
ALTER TABLE [dbo].[JulkaisunOrgYksikko] CHECK CONSTRAINT [FK_JulkaisunOrgYksikko_VanhempiID]
GO
ALTER TABLE [dbo].[JulkaisunOrgYksikko]  WITH NOCHECK ADD  CONSTRAINT [FK_JulkaisunOrgYksikko_YksikkoID] FOREIGN KEY([YksikkoID])
REFERENCES [dbo].[OrgYksikko] ([YksikkoID])
NOT FOR REPLICATION
GO
ALTER TABLE [dbo].[JulkaisunOrgYksikko] CHECK CONSTRAINT [FK_JulkaisunOrgYksikko_YksikkoID]
GO
ALTER TABLE [dbo].[JulkaisunTieteenala]  WITH NOCHECK ADD  CONSTRAINT [FK_JulkaisunTieteenalaD_JulkaisuID] FOREIGN KEY([JulkaisuID])
REFERENCES [dbo].[Julkaisut] ([JulkaisuID])
NOT FOR REPLICATION
GO
ALTER TABLE [dbo].[JulkaisunTieteenala] CHECK CONSTRAINT [FK_JulkaisunTieteenalaD_JulkaisuID]
GO
ALTER TABLE [dbo].[JulkaisunTieteenala]  WITH NOCHECK ADD  CONSTRAINT [FK_JulkaisunTieteenalaD_TieteenalaID] FOREIGN KEY([TieteenalaID])
REFERENCES [dbo].[TieteenalaLuokitus] ([TieteenalaID])
NOT FOR REPLICATION
GO
ALTER TABLE [dbo].[JulkaisunTieteenala] CHECK CONSTRAINT [FK_JulkaisunTieteenalaD_TieteenalaID]
GO
ALTER TABLE [dbo].[Julkaisut]  WITH NOCHECK ADD  CONSTRAINT [FK_Julkaisu_Organisaatio] FOREIGN KEY([OrgID])
REFERENCES [dbo].[Organisaatio] ([OrgID])
NOT FOR REPLICATION
GO
ALTER TABLE [dbo].[Julkaisut] CHECK CONSTRAINT [FK_Julkaisu_Organisaatio]
GO
ALTER TABLE [dbo].[JulkaisutXML]  WITH NOCHECK ADD  CONSTRAINT [FK_JulkaisutXML_JulkaisuID] FOREIGN KEY([JulkaisuID])
REFERENCES [dbo].[Julkaisut] ([JulkaisuID])
NOT FOR REPLICATION
GO
ALTER TABLE [dbo].[JulkaisutXML] CHECK CONSTRAINT [FK_JulkaisutXML_JulkaisuID]
GO
ALTER TABLE [dbo].[OrgYksikko]  WITH NOCHECK ADD  CONSTRAINT [FK_OrgYksikko_Organisaatio] FOREIGN KEY([OrgID])
REFERENCES [dbo].[Organisaatio] ([OrgID])
NOT FOR REPLICATION
GO
ALTER TABLE [dbo].[OrgYksikko] CHECK CONSTRAINT [FK_OrgYksikko_Organisaatio]
GO
ALTER TABLE [dbo].[TekijanOrgYksikko]  WITH NOCHECK ADD  CONSTRAINT [FK_TekijanOrgYksikko_TekijaID] FOREIGN KEY([TekijaID])
REFERENCES [dbo].[Tekijat] ([TekijaID])
NOT FOR REPLICATION
GO
ALTER TABLE [dbo].[TekijanOrgYksikko] CHECK CONSTRAINT [FK_TekijanOrgYksikko_TekijaID]
GO
ALTER TABLE [dbo].[TekijanOrgYksikko]  WITH NOCHECK ADD  CONSTRAINT [FK_TekijanOrgYksikko_YksikkoID] FOREIGN KEY([YksikkoID])
REFERENCES [dbo].[OrgYksikko] ([YksikkoID])
NOT FOR REPLICATION
GO
ALTER TABLE [dbo].[TekijanOrgYksikko] CHECK CONSTRAINT [FK_TekijanOrgYksikko_YksikkoID]
GO
ALTER TABLE [dbo].[Tekijat]  WITH CHECK ADD  CONSTRAINT [FK_Tekijat_Julkaisu] FOREIGN KEY([JulkaisuID])
REFERENCES [dbo].[Julkaisut] ([JulkaisuID])
GO
ALTER TABLE [dbo].[Tekijat] CHECK CONSTRAINT [FK_Tekijat_Julkaisu]
GO
