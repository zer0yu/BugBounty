[
  {
    "ProfileName": "CORS Misconfiguration",
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
      "true,,Access-Control-Allow-Credential: true",
      "true,Or,Access-Control-Allow-Origin: https://burpbounty.net",
      "true,Or,Access-Control-Allow-Origin: null"
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
    "OnlyHTTP": true,
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
    "IssueName": "CORS Misconfiguration",
    "IssueSeverity": "Low",
    "IssueConfidence": "Tentative",
    "IssueDetail": "https://github.com/swisskyrepo/PayloadsAllTheThings/tree/master/CORS%20Misconfiguration",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [
      {
        "type": "Request",
        "match": "",
        "replace": "Origin: https://burpbounty.net",
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