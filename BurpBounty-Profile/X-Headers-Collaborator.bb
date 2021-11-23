[
  {
    "ProfileName": "X-Headers-Collaborator",
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
    "Grep": [],
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
    "RedirType": 0,
    "MaxRedir": 0,
    "payloadPosition": 2,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "X-Headers-Collaborator",
    "IssueSeverity": "Medium",
    "IssueConfidence": "Certain",
    "IssueDetail": "The payload that generated the alert may not be the same as the one in the issue request, you have to make sure that it is the same by testing it manually.",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [
      {
        "type": "Request",
        "match": "",
        "replace": "X-Forwarded-For: {BC}",
        "regex": "String"
      },
      {
        "type": "Request",
        "match": "",
        "replace": "X-Host: {BC}",
        "regex": "String"
      },
      {
        "type": "Request",
        "match": "",
        "replace": "X-Forwarded-Server: {BC}",
        "regex": "String"
      },
      {
        "type": "Request",
        "match": "",
        "replace": "X-Forwarded-Scheme: {BC}",
        "regex": "String"
      },
      {
        "type": "Request",
        "match": "",
        "replace": "X-Original-URL: {BC}",
        "regex": "String"
      },
      {
        "type": "Request",
        "match": "",
        "replace": "X-Rewrite-URL: {BC}",
        "regex": "String"
      },
      {
        "type": "Request",
        "match": "",
        "replace": "Forwarded: for\u003d{BC}",
        "regex": "String"
      },
      {
        "type": "Request",
        "match": "",
        "replace": "Origin: {BC}",
        "regex": "String"
      },
      {
        "type": "Request",
        "match": "",
        "replace": "Referer: {BC}",
        "regex": "String"
      },
      {
        "type": "Request",
        "match": "",
        "replace": "X-Forwarded-Host: {BC}",
        "regex": "String"
      },
      {
        "type": "Request",
        "match": "",
        "replace": "X-Forwarded-Proto: {BC}",
        "regex": "String"
      },
      {
        "type": "Request",
        "match": "",
        "replace": "X-ProxyUser-Ip: {BC}",
        "regex": "String"
      },
      {
        "type": "Request",
        "match": "",
        "replace": "X-Wap-Profile: {BC}",
        "regex": "String"
      },
      {
        "type": "Request",
        "match": "",
        "replace": "Client-IP: {BC}",
        "regex": "String"
      },
      {
        "type": "Request",
        "match": "",
        "replace": "True-Client-IP: {BC}",
        "regex": "String"
      },
      {
        "type": "Request",
        "match": "",
        "replace": "Cluster-Client-IP: {BC}",
        "regex": "String"
      },
      {
        "type": "Request",
        "match": "",
        "replace": "X-Custom-IP-Authorization: {BC}",
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