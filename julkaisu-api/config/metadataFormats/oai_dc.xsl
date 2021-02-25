<?xml version="1.0" encoding="UTF-8" ?>
<!--


    The contents of this file are subject to the license and copyright
    detailed in the LICENSE and NOTICE files at the root of the source
    tree and available online at

    http://www.dspace.org/license/
	Developed by DSpace @ Lyncode <dspace@lyncode.com>

	> http://www.openarchives.org/OAI/2.0/oai_dc.xsd

 -->
<xsl:stylesheet
        xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
        xmlns:doc="http://www.lyncode.com/xoai"
        version="1.0">
    <xsl:output omit-xml-declaration="yes" method="xml" indent="yes" />

    <xsl:template match="/">
        <oai_dc:dc xmlns:oai_dc="http://www.openarchives.org/OAI/2.0/oai_dc/"
                   xmlns:dc="http://purl.org/dc/doc:elements/1.1/"
                   xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                   xsi:schemaLocation="http://www.openarchives.org/OAI/2.0/oai_dc/ http://www.openarchives.org/OAI/2.0/oai_dc.xsd">
            <xsl:apply-templates mode="copy" select="doc:metadata/doc:element/*"></xsl:apply-templates>
        </oai_dc:dc>
    </xsl:template>

    <xsl:template match="*" mode="copy">
        <xsl:element name="dc:{name()}" namespace="http://purl.org/dc/doc:elements/1.1/">
            <xsl:apply-templates select="@*|node()" mode="copy" />
        </xsl:element>
    </xsl:template>

    <xsl:template match="@*|text()|comment()" mode="copy">
        <xsl:copy/>
    </xsl:template>
</xsl:stylesheet>