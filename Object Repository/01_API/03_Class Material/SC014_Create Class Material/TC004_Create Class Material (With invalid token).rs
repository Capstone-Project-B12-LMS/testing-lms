<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>TC004_Create Class Material (With invalid token)</name>
   <tag></tag>
   <elementGuidId>b77b3438-4c89-4888-8f68-d1d00a643c9c</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;classId\&quot;: \&quot;${GlobalVariable.id_class}\&quot;,\n  \&quot;title\&quot;: \&quot;Introduction to QE\&quot;,\n  \&quot;content\&quot;: \&quot;Introduction to QE\&quot;,\n  \&quot;topicId\&quot;: \&quot;\&quot;,\n  \&quot;video\&quot;: \&quot;https://youtu.be/8Wmo4Fjatoo\&quot;,\n  \&quot;file\&quot;: \&quot;https://docs.google.com/presentation/d/1dLNf9XOcEllyQTA4dj4G45lkWwR3dmqY\&quot;,\n  \&quot;deadline\&quot;: null,\n  \&quot;point\&quot;: 0,\n  \&quot;category\&quot;: \&quot;QE\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer eyJhbGciOiJIUzI1NiJ9.eyJyb2xlcyI6W3siYXV0aG9yaXR5IjoiVVNFUiJ9XSwiZXhwIjoxNjU1NzI4NDU1LCJ1c2VySWQiOiIwOTEyMjkxMC1hZmY4LTQ5MzktYTQ5NS1iMmQ0MGNkNTgzODUiLCJpYXQiOjE2NTU3MjQ4NTV9.YAQ8lvbhLJ4tgMILFUglK5_7XTQtOl7Ep5oYk_gssw</value>
   </httpHeaderProperties>
   <katalonVersion>8.2.5</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${GlobalVariable.base_url_api}/${GlobalVariable.api_version}/material</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
