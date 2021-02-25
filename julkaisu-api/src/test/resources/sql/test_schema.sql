CREATE TABLE "Avainsanat"
(
    "AvainsanaID" BIGINT PRIMARY KEY NOT NULL,
    "JulkaisuID" BIGINT NOT NULL,
    "Sana" NVARCHAR(100),
    "Luoja" NVARCHAR(30) DEFAULT '(original_login())' NOT NULL,
    "Luontipaivamaara" DATETIME DEFAULT '(getdate())' NOT NULL,
    "Paivittaja" NVARCHAR(30),
    "Paivityspaivamaara" DATETIME
);
CREATE TABLE "Hanke"
(
    "HankeID" BIGINT PRIMARY KEY NOT NULL ,
    "JulkaisuID" BIGINT NOT NULL,
    "OrgID" BIGINT NOT NULL,
    "Hankenumero" NVARCHAR(100),
    "Luoja" NVARCHAR(30) DEFAULT '(original_login())' NOT NULL,
    "Luontipaivamaara" DATETIME DEFAULT '(getdate())' NOT NULL,
    "Paivittaja" NVARCHAR(30),
    "Paivityspaivamaara" DATETIME
);
CREATE TABLE "ISBN"
(
    "ISBNID" BIGINT PRIMARY KEY NOT NULL ,
    "JulkaisuID" BIGINT NOT NULL,
    "ISBN" NVARCHAR(100),
    "Luoja" NVARCHAR(30) DEFAULT '(original_login())' NOT NULL,
    "Luontipaivamaara" DATETIME DEFAULT '(getdate())' NOT NULL,
    "Paivittaja" NVARCHAR(30),
    "Paivityspaivamaara" DATETIME
);
CREATE TABLE "ISSN"
(
    "ISSNID" BIGINT PRIMARY KEY NOT NULL ,
    "JulkaisuID" BIGINT NOT NULL,
    "ISSN" NVARCHAR(100),
    "Luoja" NVARCHAR(30) DEFAULT '(original_login())' NOT NULL,
    "Luontipaivamaara" DATETIME DEFAULT '(getdate())' NOT NULL,
    "Paivittaja" NVARCHAR(30),
    "Paivityspaivamaara" DATETIME
);
CREATE TABLE "JulkaisunKoulutusala"
(
    "JKoulutusalaID" BIGINT PRIMARY KEY NOT NULL ,
    "JulkaisuID" BIGINT NOT NULL,
    "KoulutusalaID" BIGINT NOT NULL,
    "Jnro" INT,
    "Luoja" NVARCHAR(30) DEFAULT '(original_login())' NOT NULL,
    "Luontipaivamaara" DATETIME DEFAULT '(getdate())' NOT NULL,
    "Paivittaja" NVARCHAR(30),
    "Paivityspaivamaara" DATETIME
);
CREATE TABLE "JulkaisunOrgYksikko"
(
    "JOrgYksikkoID" BIGINT PRIMARY KEY NOT NULL ,
    "JulkaisuID" BIGINT NOT NULL,
    "YksikkoID" BIGINT NOT NULL,
    "Luoja" NVARCHAR(30) DEFAULT '(original_login())' NOT NULL,
    "Luontipaivamaara" DATETIME DEFAULT '(getdate())' NOT NULL,
    "Paivittaja" NVARCHAR(30),
    "Paivityspaivamaara" DATETIME,
    "VanhempiID" BIGINT
);
CREATE TABLE "JulkaisunTieteenala"
(
    "JTieteenalaID" BIGINT PRIMARY KEY NOT NULL ,
    "JulkaisuID" BIGINT NOT NULL,
    "TieteenalaID" BIGINT NOT NULL,
    "Jnro" INT,
    "Luoja" NVARCHAR(30) DEFAULT '(original_login())' NOT NULL,
    "Luontipaivamaara" DATETIME DEFAULT '(getdate())' NOT NULL,
    "Paivittaja" NVARCHAR(30),
    "Paivityspaivamaara" DATETIME
);
CREATE TABLE "JulkaisunTaiteenala"
(
    "JTaiteenalaID" BIGINT PRIMARY KEY NOT NULL ,
    "JulkaisuID" BIGINT NOT NULL,
    "TaiteenalaID" BIGINT NOT NULL,
    "Jnro" INT,
    "Luoja" NVARCHAR(30) DEFAULT '(original_login())' NOT NULL,
    "Luontipaivamaara" DATETIME DEFAULT '(getdate())' NOT NULL,
    "Paivittaja" NVARCHAR(30),
    "Paivityspaivamaara" DATETIME
);
CREATE TABLE "Julkaisut"
(
    "JulkaisuID" BIGINT PRIMARY KEY NOT NULL ,
    "JulkaisunTunnus" NVARCHAR(50) NOT NULL,
    "JulkaisunTila" INT,
    "JulkaisuTyyppi" NVARCHAR(2) NOT NULL,
    "IlmoitusVuosi" INT,
    "OrgID" BIGINT NOT NULL,
    "JulkaisuVuosi" INT,
    "JulkaisunNimi" NVARCHAR(500),
    "Tekijatiedot" NVARCHAR(800),
    "TekijoidenLkm" INT,
    "Sivunumero" NVARCHAR(100),
    "Artikkelinumero" INT,
    "ISBN" NVARCHAR(100),
    "Volyymi" NVARCHAR(200),
    "LehdenNumero" NVARCHAR(200),
    "Kustannuspaikka" NVARCHAR(200),
    "EmojulkaisunNimi" NVARCHAR(500),
    "EmojulkaisunToimittajat" NVARCHAR(500),
    "YhteisjulkaisuKV" INT,
    "YhteisjulkaisuSHP" INT,
    "YhteisjulkaisuTutkimuslaitos" INT,
    "YhteisjulkaisuMuu" INT,
    "JulkaisunKansainvalisyys" INT,
    "AvoinSaatavuusKoodi" INT,
    "EVOjulkaisu" INT,
    "DOI" NVARCHAR(200),
    "PysyvaOsoite" NVARCHAR(400),
    "LahdetietokannanTunnus" NVARCHAR(400),
    "JulkaisunOrgTunnus" NVARCHAR(100),
    "JufoTunnus" NVARCHAR(5),
    "JufoLuokka" NVARCHAR(1),
    "Julkaisumaa" NVARCHAR(20),
    "LehdenNimi" NVARCHAR(500),
    "ISSN" NVARCHAR(100),
    "KonferenssinNimi" NVARCHAR(500),
    "KustantajanNimi" NVARCHAR(500),
    "JulkaisunKieli" NVARCHAR(20),
    "Luoja" NVARCHAR(30) DEFAULT '(original_login())' NOT NULL,
    "Luontipaivamaara" DATETIME DEFAULT '(getdate())' NOT NULL,
    "Paivittaja" NVARCHAR(30),
    "Paivityspaivamaara" DATETIME
);
CREATE TABLE "JulkaisutXML"
(
    "JulkaisuXMLid" BIGINT PRIMARY KEY NOT NULL ,
    "JulkaisuID" BIGINT NOT NULL,
    "xmldata" CLOB,
    "Luoja" NVARCHAR(30) DEFAULT '(original_login())' NOT NULL,
    "Luontipaivamaara" DATETIME DEFAULT '(getdate())' NOT NULL,
    "Paivittaja" NVARCHAR(30),
    "Paivityspaivamaara" DATETIME
);
CREATE TABLE "Koulutusala"
(
    "KoulutusalaID" BIGINT PRIMARY KEY NOT NULL ,
    "Koodi" NVARCHAR(5) NOT NULL,
    "Nimi" NVARCHAR(100),
    "Alkamispaivmaara" DATETIME,
    "Paattymispaivamaara" DATETIME,
    "Luoja" NVARCHAR(30) DEFAULT '(original_login())' NOT NULL,
    "Luontipaivamaara" DATETIME DEFAULT '(getdate())' NOT NULL,
    "Paivittaja" NVARCHAR(30),
    "Paivityspaivamaara" DATETIME
);
CREATE TABLE "Organisaatio"
(
    "OrgID" BIGINT PRIMARY KEY NOT NULL ,
    "OrgTunnus" NVARCHAR(100) NOT NULL,
    "Nimi" NVARCHAR(100),
    "Tyyppi" INT,
    "Luoja" NVARCHAR(30) DEFAULT '(original_login())' NOT NULL,
    "Luontipaivamaara" DATETIME DEFAULT '(getdate())' NOT NULL,
    "Paivittaja" NVARCHAR(30),
    "Paivityspaivamaara" DATETIME
);
CREATE TABLE "OrgYksikko"
(
    "YksikkoID" BIGINT PRIMARY KEY NOT NULL ,
    "OrgID" BIGINT NOT NULL,
    "YksikkoKoodi" NVARCHAR(200),
    "Nimi" NVARCHAR(100),
    "Luoja" NVARCHAR(30) DEFAULT '(original_login())' NOT NULL,
    "Luontipaivamaara" DATETIME DEFAULT '(getdate())' NOT NULL,
    "Paivittaja" NVARCHAR(30),
    "Paivityspaivamaara" DATETIME
);

CREATE TABLE "TekijanOrgYksikko"
(
    "TOrgYksikkoID" BIGINT PRIMARY KEY NOT NULL ,
    "TekijaID" BIGINT NOT NULL,
    "YksikkoID" BIGINT NOT NULL,
    "Luoja" NVARCHAR(30) DEFAULT '(original_login())' NOT NULL,
    "Luontipaivamaara" DATETIME DEFAULT '(getdate())' NOT NULL,
    "Paivittaja" NVARCHAR(30),
    "Paivityspaivamaara" DATETIME,
    "VanhempiID" BIGINT
);
CREATE TABLE "Tekijat"
(
    "TekijaID" BIGINT PRIMARY KEY NOT NULL ,
    "JulkaisuID" BIGINT NOT NULL,
    "SukuNimi" NVARCHAR(50),
    "Etunimet" NVARCHAR(50),
    "ORCID" NVARCHAR(50),
    "Luoja" NVARCHAR(30) DEFAULT '(original_login())' NOT NULL,
    "Luontipaivamaara" DATETIME DEFAULT '(getdate())' NOT NULL,
    "Paivittaja" NVARCHAR(30),
    "Paivityspaivamaara" DATETIME
);
CREATE TABLE "TieteenalaLuokitus"
(
    "TieteenalaID" BIGINT PRIMARY KEY NOT NULL ,
    "Koodi" NVARCHAR(5) NOT NULL,
    "Nimi" NVARCHAR(100),
    "Alkamispaivmaara" DATETIME,
    "Paattymispaivamaara" DATETIME,
    "Luoja" NVARCHAR(30) DEFAULT '(original_login())' NOT NULL,
    "Luontipaivamaara" DATETIME DEFAULT '(getdate())' NOT NULL,
    "Paivittaja" NVARCHAR(30),
    "Paivityspaivamaara" DATETIME
);
CREATE TABLE "TaiteenalaLuokitus"
(
    "TaiteenalaID" BIGINT PRIMARY KEY NOT NULL ,
    "Koodi" NVARCHAR(5) NOT NULL,
    "Nimi" NVARCHAR(100),
    "Alkamispaivmaara" DATETIME,
    "Paattymispaivamaara" DATETIME,
    "Luoja" NVARCHAR(30) DEFAULT '(original_login())' NOT NULL,
    "Luontipaivamaara" DATETIME DEFAULT '(getdate())' NOT NULL,
    "Paivittaja" NVARCHAR(30),
    "Paivityspaivamaara" DATETIME
);
CREATE TABLE "julkaisut"
(
    "avain" BIGINT NOT NULL,
    "JulkaisuID" BIGINT NOT NULL,
    "JulkaisunTunnus" NVARCHAR(50) NOT NULL,
    "JulkaisunNimi" NVARCHAR(500),
    "SukuNimi" NVARCHAR(50),
    "Etunimet" NVARCHAR(50),
    "JulkaisuVuosi" INT,
    "JulkaisuTyyppi" NVARCHAR(2) NOT NULL,
    "LehdenNimi" NVARCHAR(500),
    "KustantajanNimi" NVARCHAR(500),
    "ISSN" NVARCHAR(100),
    "ISBN" NVARCHAR(100),
    "Muutospvm" DATETIME NOT NULL,
    "JulkaisunTila" INT
);
CREATE TABLE "julkaisut_f"
(
    "avain" BIGINT PRIMARY KEY NOT NULL,
    "JulkaisuID" BIGINT NOT NULL,
    "JulkaisunTunnus" NVARCHAR(50) NOT NULL,
    "JulkaisunOrgTunnus" NVARCHAR(100) NOT NULL,
    "JulkaisunNimi" NVARCHAR(500),
    "SukuNimi" NVARCHAR(50),
    "Etunimet" NVARCHAR(50),
    "Tekijatiedot" NVARCHAR(800),
    "JulkaisuVuosi" INT,
    "JulkaisuTyyppi" NVARCHAR(2) NOT NULL,
    "LehdenNimi" NVARCHAR(500),
    "KustantajanNimi" NVARCHAR(500),
    "ISSN" NVARCHAR(100),
    "ISBN" NVARCHAR(100),
    "Luontipvm" DATETIME NOT NULL,
    "Muutospvm" DATETIME NOT NULL,
    "JulkaisunTila" INT,
    "OrgTunnus" NVARCHAR(20),
    "ORCID" NVARCHAR(50),
    "DOI" NVARCHAR(200),
    "YhteisJulkaisunTunnus" NVARCHAR(50),
    "IlmoitusVuosi" INT
);
CREATE TABLE "Juuli_temp"
(
    "ID" BIGINT PRIMARY KEY auto_increment NOT NULL,
    "JulkaisunTunnus" NVARCHAR(50) NOT NULL,
    "Juuli-ID" NVARCHAR(400) NOT NULL,
    "Luoja" NVARCHAR(30),
    "Luontipaivamaara" DATETIME NOT NULL,
    "Paivittaja" NVARCHAR(30),
    "Paivityspaivamaara" DATETIME
);
CREATE TABLE "TK_Julkaisut"
(
    "OrganisaatioTunnus" NVARCHAR(20),
    "IlmoitusVuosi" INT,
    "JulkaisunTunnus" NVARCHAR(500) NOT NULL,
    "JulkaisunTilaKoodi" INT,
    "JulkaisunOrgTunnus" NVARCHAR(100),
    "JulkaisuVuosi" INT,
    "JulkaisunNimi" NVARCHAR(500),
    "TekijatiedotTeksti" NVARCHAR(800),
    "TekijoidenLkm" INT,
    "SivunumeroTeksti" NVARCHAR(100),
    "Artikkelinumero" NVARCHAR(50),
    "ISBN" NVARCHAR(100),
    "JufoTunnus" NVARCHAR(5),
    "JufoLuokkaKoodi" NVARCHAR(1),
    "JulkaisumaaKoodi" NVARCHAR(20),
    "LehdenNimi" NVARCHAR(500),
    "ISSN" NVARCHAR(100),
    "VolyymiTeksti" NVARCHAR(200),
    "LehdenNumeroTeksti" NVARCHAR(200),
    "KonferenssinNimi" NVARCHAR(500),
    "KustantajanNimi" NVARCHAR(500),
    "KustannuspaikkaTeksti" NVARCHAR(200),
    "EmojulkaisunNimi" NVARCHAR(500),
    "EmojulkaisunToimittajatTeksti" NVARCHAR(500),
    "JulkaisutyyppiKoodi" NVARCHAR(2),
    "YhteisjulkaisuKVKytkin" NVARCHAR(1),
    "YhteisjulkaisuSHPKytkin" NVARCHAR(1),
    "YhteisjulkaisuTutkimuslaitosKytkin" NVARCHAR(1),
    "YhteisjulkaisuMuuKytkin" NVARCHAR(1),
    "JulkaisunKansainvalisyysKytkin" NVARCHAR(1),
    "JulkaisunKieliKoodi" NVARCHAR(20),
    "AvoinSaatavuusKoodi" NVARCHAR(1),
    "EVOjulkaisuKytkin" NVARCHAR(1),
    "DOI" NVARCHAR(200),
    "PysyvaOsoiteTeksti" NVARCHAR(400),
    "LahdetietokannanTunnus" NVARCHAR(400),
    "Lataus_ID" NVARCHAR(255) NOT NULL,
    "Yhteisjulkaisu_Id" NVARCHAR(20) NOT NULL,
    "RinnakkaistallenettuKytkin" NVARCHAR(1),
    "YhteisjulkaisunTunnus" NVARCHAR(50),
    "JuuliOsoiteTeksti" NVARCHAR(400),
    "YhteisjulkaisuYritysKytkin" NVARCHAR(1),
    "Jufo_ID" NVARCHAR(5),
    "OrgSektori" INT,
    "kasvatusalat_1" NVARCHAR(10),
    "taiteet_ja_kulttuurialat_2" NVARCHAR(10),
    "humanistiset_alat_3" NVARCHAR(10),
    "yhteiskunnalliset_alat_4" NVARCHAR(10),
    "kauppa_hallinto_ja_oikeustieteet_5" NVARCHAR(10),
    "luonnontieteet_6" NVARCHAR(10),
    "tietojenkasittely_ja_tietoliikenne_7" NVARCHAR(10),
    "tekniikan_alat_8" NVARCHAR(10),
    "maa_ja_metsatalousalat_9" NVARCHAR(10),
    "laaketieteet_10" NVARCHAR(10),
    "terveys_ja_hyvinvointialat_11" NVARCHAR(10),
    "palvelualat_12" NVARCHAR(10),
    "JufoLuokkaVanha" NVARCHAR(5),
    "JufoLuokkaUusi" NVARCHAR(5),
    "Alayksikko" NVARCHAR(500)
);

CREATE TABLE "TK_Hanke"
(
    "JulkaisunTunnus" NVARCHAR(500) NOT NULL,
    "Hankenumero" NVARCHAR(100),
    "RahoittajaOrg" NVARCHAR(5),
    "Lataus_ID" NVARCHAR(255) NOT NULL
);

CREATE TABLE "TK_Avainsanat"
(
    "JulkaisunTunnus" NVARCHAR(500) NOT NULL,
    "Avainsana" NVARCHAR(100),
    "Lataus_ID" NVARCHAR(255) NOT NULL
);

CREATE TABLE "TK_ISBN"
(
    "JulkaisunTunnus" NVARCHAR(500) NOT NULL,
    "ISBN" NVARCHAR(100),
    "Lataus_ID" NVARCHAR(255) NOT NULL
);

CREATE TABLE "TK_ISSN"
(
    "JulkaisunTunnus" NVARCHAR(500) NOT NULL,
    "ISSN" NVARCHAR(100),
    "Lataus_ID" NVARCHAR(255) NOT NULL
);

CREATE TABLE "TK_Koulutusalat"
(
    "JulkaisunTunnus" NVARCHAR(500) NOT NULL,
    "Koulutusala" INT,
    "JNro" INT,
    "Lataus_ID" NVARCHAR(255) NOT NULL
);

CREATE TABLE "TK_OrgYksikko"
(
    "JulkaisunTunnus" NVARCHAR(500) NOT NULL,
    "OrganisaatioTunnus" NVARCHAR(20),
    "julkaisu_yksikko" NVARCHAR(200),
    "tekija_yksikko" NVARCHAR(200),
    "Lataus_ID" NVARCHAR(255) NOT NULL
);

CREATE TABLE "TK_Tekijat"
(
    "JulkaisunTunnus" NVARCHAR(500) NOT NULL,
    "Etunimet" NVARCHAR(50),
    "Sukunimi" NVARCHAR(50),
    "ORCID" NVARCHAR(20),
    "Yksikko" NVARCHAR(200),
    "Lataus_ID" NVARCHAR(255) NOT NULL,
    "Rooli" NVARCHAR(20) 
);

CREATE TABLE "TK_Tieteenalat"
(
    "JulkaisunTunnus" NVARCHAR(500) NOT NULL,
    "Tieteenala" INT,
    "JNro" INT,
    "Lataus_ID" NVARCHAR(255) NOT NULL
);

CREATE TABLE "TK_Taiteenalat"
(
    "JulkaisunTunnus" NVARCHAR(500) NOT NULL,
    "Taiteenala" INT,
    "JNro" INT,
    "Lataus_ID" NVARCHAR(255) NOT NULL
);

ALTER TABLE "Avainsanat" ADD FOREIGN KEY ("JulkaisuID") REFERENCES "Julkaisut" ("JulkaisuID");
ALTER TABLE "Hanke" ADD FOREIGN KEY ("JulkaisuID") REFERENCES "Julkaisut" ("JulkaisuID");
ALTER TABLE "Hanke" ADD FOREIGN KEY ("OrgID") REFERENCES "Organisaatio" ("OrgID");
ALTER TABLE "ISBN" ADD FOREIGN KEY ("JulkaisuID") REFERENCES "Julkaisut" ("JulkaisuID");
ALTER TABLE "ISSN" ADD FOREIGN KEY ("JulkaisuID") REFERENCES "Julkaisut" ("JulkaisuID");
ALTER TABLE "JulkaisunKoulutusala" ADD FOREIGN KEY ("JulkaisuID") REFERENCES "Julkaisut" ("JulkaisuID");
ALTER TABLE "JulkaisunKoulutusala" ADD FOREIGN KEY ("KoulutusalaID") REFERENCES "Koulutusala" ("KoulutusalaID");
ALTER TABLE "JulkaisunOrgYksikko" ADD FOREIGN KEY ("JulkaisuID") REFERENCES "Julkaisut" ("JulkaisuID");
ALTER TABLE "JulkaisunOrgYksikko" ADD FOREIGN KEY ("YksikkoID") REFERENCES "OrgYksikko" ("YksikkoID");
ALTER TABLE "JulkaisunOrgYksikko" ADD FOREIGN KEY ("YksikkoID") REFERENCES "OrgYksikko" ("YksikkoID");
ALTER TABLE "JulkaisunTieteenala" ADD FOREIGN KEY ("JulkaisuID") REFERENCES "Julkaisut" ("JulkaisuID");
ALTER TABLE "JulkaisunTieteenala" ADD FOREIGN KEY ("TieteenalaID") REFERENCES "TieteenalaLuokitus" ("TieteenalaID");
ALTER TABLE "JulkaisunTaiteenala" ADD FOREIGN KEY ("JulkaisuID") REFERENCES "Julkaisut" ("JulkaisuID");
ALTER TABLE "JulkaisunTaiteenala" ADD FOREIGN KEY ("TaiteenalaID") REFERENCES "TaiteenalaLuokitus" ("TaiteenalaID");
ALTER TABLE "Julkaisut" ADD FOREIGN KEY ("OrgID") REFERENCES "Organisaatio" ("OrgID");
CREATE UNIQUE INDEX "julkaisut_julkaisuntunnus_uniq" ON "Julkaisut" ("JulkaisunTunnus");
ALTER TABLE "JulkaisutXML" ADD FOREIGN KEY ("JulkaisuID") REFERENCES "Julkaisut" ("JulkaisuID");
ALTER TABLE "OrgYksikko" ADD FOREIGN KEY ("OrgID") REFERENCES "Organisaatio" ("OrgID");
ALTER TABLE "TekijanOrgYksikko" ADD FOREIGN KEY ("YksikkoID") REFERENCES "OrgYksikko" ("YksikkoID");
ALTER TABLE "TekijanOrgYksikko" ADD FOREIGN KEY ("TekijaID") REFERENCES "Tekijat" ("TekijaID");
ALTER TABLE "Tekijat" ADD FOREIGN KEY ("JulkaisuID") REFERENCES "Julkaisut" ("JulkaisuID");
