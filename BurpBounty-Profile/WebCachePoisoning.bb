[
  {
    "ProfileName": "WebCachePoisoning",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@burpbounty",
    "Payloads": [
      "."
    ],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [
      "true,,TOKEN1337",
      "true,Or,TOKEN1338",
      "true,Or,TOKEN1339",
      "true,Or,TOKEN1340",
      "true,Or,TOKEN1341",
      "true,Or,TOKEN1342"
    ],
    "Tags": [
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
    "IssueName": "WebCachePoisoning",
    "IssueSeverity": "Medium",
    "IssueConfidence": "Certain",
    "IssueDetail": "",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [
      {
        "type": "Request",
        "match": "",
        "replace": "X-Forwarded-For: TOKEN1337",
        "regex": "String"
      },
      {
        "type": "Request",
        "match": "",
        "replace": "X-Host: TOKEN1338",
        "regex": "String"
      },
      {
        "type": "Request",
        "match": "",
        "replace": "X-Forwarded-Server: TOKEN1339",
        "regex": "String"
      },
      {
        "type": "Request",
        "match": "",
        "replace": "X-Forwarded-Scheme: TOKEN1340",
        "regex": "String"
      },
      {
        "type": "Request",
        "match": "",
        "replace": "X-Original-URL: TOKEN1341",
        "regex": "String"
      },
      {
        "type": "Request",
        "match": "",
        "replace": "X-Rewrite-URL: TOKEN1342",
        "regex": "String"
      }
    ],
    "VariationAttributes": [],
    "InsertionPointType": [
      32,
      64
    ],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false
  }
]