[
  {
    "ProfileName": "Test_XSS_append",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@burpbounty",
    "Payloads": [
      "\u003cu\u003etest1337",
      "\u003ca\u003etest1337",
      ";\u003cu\u003etest1337",
      ";\u003ca\u003etest1337",
      "%0d%0a\u003cu\u003etest1337",
      "%0d%0a\u003ca\u003etest1337",
      "%00\u003cu\u003etest1337",
      "%00\u003ca\u003etest1337"
    ],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [
      "true,,\u003cu\u003etest1337",
      "true,Or,\u003ca\u003etest1337"
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
    "ExcludeHTTP": true,
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
    "RedirType": 2,
    "MaxRedir": 4,
    "payloadPosition": 2,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "Test_XSS_replace",
    "IssueSeverity": "Information",
    "IssueConfidence": "Firm",
    "IssueDetail": "",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [
      65,
      36,
      1,
      6,
      5,
      64,
      0,
      3
    ],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false
  }
]