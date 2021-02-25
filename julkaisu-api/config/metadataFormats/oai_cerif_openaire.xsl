<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet
        xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
        xmlns:doc="http://www.lyncode.com/xoai"
        version="1.0">
    <xsl:output omit-xml-declaration="yes" method="xml" indent="yes" />

    
    <xsl:template match="/"
        xmlns="https://www.openaire.eu/cerif-profile/1.1/"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="https://www.openaire.eu/cerif-profile/1.1/ https://www.openaire.eu/cerif-profile/1.1/">
        <xsl:copy>
	    <xsl:copy-of select="doc:metadata/doc:element/*"/>
	</xsl:copy>
    </xsl:template> 
    

<!-- testline2 -->

<!--
  <xsl:template match="/"      
        xmlns:cerif="https://www.openaire.eu/cerif-profile/1.1/"
        xmlns:type="https://www.openaire.eu/cerif-profile/vocab/COAR_Publication_Types"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="https://www.openaire.eu/cerif-profile/1.1/ https://www.openaire.eu/cerif-profile/1.1/">         
            <xsl:apply-templates mode="copy" select="doc:metadata/doc:element/*"></xsl:apply-templates>     
    </xsl:template>

    <xsl:template match="*" mode="copy">
        <xsl:element name="{name()}" namespace="{namespace-uri()}">
            <xsl:apply-templates select="@*|node()" mode="copy" />
        </xsl:element>
    </xsl:template>

    <xsl:template match="@*|text()|comment()" mode="copy">
        <xsl:copy/>
    </xsl:template>
    

    
  -->  

<!-- THIS IS CURRENT SOLUTION
 
    <xsl:template match="/"      
        xmlns="https://www.openaire.eu/cerif-profile/1.1/"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="https://www.openaire.eu/cerif-profile/1.1/ https://www.openaire.eu/cerif-profile/1.1/">         
            <xsl:apply-templates mode="copy" select="doc:metadata/doc:element/*"></xsl:apply-templates>     
    </xsl:template>

    <xsl:template match="*" mode="copy">
        <xsl:element name="{name()}" namespace="https://www.openaire.eu/cerif-profile/1.1/">
            <xsl:apply-templates select="@*|node()" mode="copy" />
        </xsl:element>
    </xsl:template>

    <xsl:template match="@*|text()|comment()" mode="copy">
        <xsl:copy/>
    </xsl:template>
    
    -->
    
</xsl:stylesheet>