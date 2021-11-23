[
  {
    "ProfileName": "DOM_XSS_Sources",
    "Enabled": true,
    "Scanner": 2,
    "Author": "@six2dez1",
    "UrlEncode": false,
    "Grep": [
      "true,,(location\\s*[\\[.])|([.\\[]\\s*[\\\"\u0027]?\\s*(arguments|dialogArguments|innerHTML|write(ln)?|open(Dialog)?|showModalDialog|cookie|URL|documentURI|baseURI|referrer|name|opener|parent|top|content|self|frames)\\W)|(localStorage|sessionStorage|Database)"
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
    "NegativeCT": true,
    "IsResponseCode": false,
    "ResponseCode": "",
    "NegativeRC": false,
    "urlextension": "js",
    "isurlextension": true,
    "NegativeUrlExtension": true,
    "MatchType": 2,
    "Scope": 2,
    "RedirType": 0,
    "MaxRedir": 0,
    "payloadPosition": 0,
    "grepsFile": "",
    "IssueName": "DOM XSS Sources",
    "IssueSeverity": "Information",
    "IssueConfidence": "Certain",
    "IssueDetail": "",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "VariationAttributes": [],
    "InsertionPointType": [],
    "Scantype": 0,
    "pathDiscovery": false
  }
]