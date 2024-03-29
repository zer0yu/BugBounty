[
  {
    "ProfileName": "OpenRedirect_to_Account_Takeover",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@burpbounty",
    "Payloads": [
      "http://burpbounty.net",
      "//burpbounty.net",
      "http:burpbounty.net",
      "///burpbounty.net",
      "\\/\\/burpbounty.net",
      "//burpbounty%E3%80%82net"
    ],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [
      "true,,action\u003d\"http://burpbounty.net",
      "true,Or,action\u003d\"//burpbounty",
      "true,Or,action\u003d\"http:burpbounty.net",
      "true,Or,action\u003d\"///burpbounty.net",
      "true,Or,action\u003d\"\\/\\/burpbounty.net"
    ],
    "Tags": [
      "Open Redirect",
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
    "MaxRedir": 5,
    "payloadPosition": 1,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "OpenRedirect_to_Account_Takeover",
    "IssueSeverity": "High",
    "IssueConfidence": "Firm",
    "IssueDetail": "",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [
      65,
      1,
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