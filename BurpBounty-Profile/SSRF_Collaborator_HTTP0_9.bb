[
  {
    "ProfileName": "SSRF_Collaborator_HTTP0_9",
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
    "RedirType": 0,
    "MaxRedir": 0,
    "payloadPosition": 2,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "SSRF_Collaborator_HTTP0_9",
    "IssueSeverity": "Medium",
    "IssueConfidence": "Certain",
    "IssueDetail": "The payload that generated the alert may not be the same as the one in the issue request, you have to make sure that it is the same by testing it manually.",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [
      {
        "type": "Request",
        "match": "HTTP/1.1",
        "replace": "HTTP/0.9",
        "regex": "String"
      },
      {
        "type": "Request",
        "match": "",
        "replace": "Content-type: text/plain",
        "regex": "String"
      },
      {
        "type": "Request",
        "match": "",
        "replace": "X-Forwarded-For: http://{BC}",
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