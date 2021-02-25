<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet
        xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
        xmlns:doc="http://www.lyncode.com/xoai"
        version="1.0">
    <xsl:output omit-xml-declaration="yes" method="xml" indent="yes"/>

    <xsl:template match="/">
        <Julkaisut xmlns="urn:mace:funet.fi:julkaisut/2015/03/01"
                   xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                   xsi:schemaLocation="urn:mace:funet.fi:julkaisut/2015/03/01">
            <xsl:element name="Julkaisu" namespace="urn:mace:funet.fi:julkaisut/2015/03/01">
                <xsl:apply-templates mode="copy" select="doc:metadata/doc:element/doc:Julkaisu/*"></xsl:apply-templates>
            </xsl:element>
        </Julkaisut>
    </xsl:template>

    <xsl:template match="*" mode="copy">
        <xsl:element name="{name()}" namespace="urn:mace:funet.fi:julkaisut/2015/03/01">
            <xsl:apply-templates select="@*|node()" mode="copy" />
        </xsl:element>
    </xsl:template>

    <xsl:template match="@*|text()|comment()" mode="copy">
        <xsl:copy/>
    </xsl:template>
</xsl:stylesheet>