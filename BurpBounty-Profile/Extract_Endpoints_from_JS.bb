[
  {
    "ProfileName": "Extract_Endpoints_from_JS",
    "Enabled": true,
    "Scanner": 2,
    "Author": "@six2dez1",
    "UrlEncode": false,
    "Grep": [
      "true,,(?:\"|\u0027)(((?:[a-zA-Z]{1,10}://|//)[^\"\u0027/]{1,}\\.[a-zA-Z]{2,}[^\"\u0027]{0,})|((?:/|\\.\\./|\\./)[^\"\u0027\u003e\u003c,;| *()(%%$^/\\\\\\[\\]][^\"\u0027\u003e\u003c,;|()]{1,})|([a-zA-Z0-9_\\-/]{1,}/[a-zA-Z0-9_\\-/]{1,}\\.(?:[a-zA-Z]{1,4}|action)(?:[\\?|/][^\"|\u0027]{0,}|))|([a-zA-Z0-9_\\-]{1,}\\.(?:php|asp|aspx|jsp|json|action|html|js|txt|xml)(?:\\?[^\"|^\u0027]{0,}|)))(?:\"|\u0027)"
    ],
    "Tags": [
      "All"
    ],
    "PayloadResponse": false,
    "NotResponse": false,
    "isTime": false,
    "iscontentLength": false,
    "CaseSensitive": false,
    "ExcludeHTTP": false,
    "OnlyHTTP": false,
    "IsContentType": true,
    "ContentType": "text/javascript,application/javascript,application/x-javascript",
    "NegativeCT": false,
    "IsResponseCode": false,
    "ResponseCode": "",
    "NegativeRC": false,
    "urlextension": "",
    "isurlextension": false,
    "NegativeUrlExtension": false,
    "MatchType": 2,
    "Scope": 2,
    "RedirType": 0,
    "MaxRedir": 0,
    "payloadPosition": 0,
    "grepsFile": "",
    "IssueName": "Extract_Endpoints_from_JS",
    "IssueSeverity": "Information",
    "IssueConfidence": "Certain",
    "IssueDetail": "Credits to Gerben Javado:\u003cbr/\u003e\u003cbr/\u003e\n\n* https://github.com/GerbenJavado/LinkFinder",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "VariationAttributes": [],
    "InsertionPointType": [],
    "Scantype": 0,
    "pathDiscovery": false
  }
]