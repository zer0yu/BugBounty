[
  {
    "ProfileName": "Key_Parameters",
    "Enabled": true,
    "Scanner": 3,
    "Author": "@burpbounty",
    "UrlEncode": false,
    "Grep": [
      "true,,GET Parameter,Name,.*key.*",
      "true,Or,POST Parameter,Name,.*key.*",
      "true,Or,JSON Parameter,Name,.*key.*",
      "true,Or,XML Parameter,Name,.*key.*",
      "true,Or,POST Multipart,Name,.*key.*",
      "true,Or,XML Multipart,Name,.*key.*",
      "true,Or,All Parameters,Value,([^A-Z0-9]|^)(AKIA|A3T|AGPA|AIDA|AROA|AIPA|ANPA|ANVA|ASIA)[A-Z0-9]{12,}"
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
    "IsContentType": false,
    "NegativeCT": false,
    "IsResponseCode": false,
    "NegativeRC": false,
    "urlextension": "",
    "isurlextension": false,
    "NegativeUrlExtension": false,
    "MatchType": 2,
    "Scope": 0,
    "RedirType": 0,
    "MaxRedir": 0,
    "payloadPosition": 0,
    "grepsFile": "",
    "IssueName": "Key_Parameters",
    "IssueSeverity": "Information",
    "IssueConfidence": "Firm",
    "IssueDetail": "References for API keys:\u003cbr/\u003e\u003cbr/\u003e\n\n* https://github.com/streaak/keyhacks\u003cbr/\u003e\n* https://cloud.google.com/docs/authentication/api-keys#securing_an_api_key\u003cbr/\u003e\n* https://medium.com/bugbountywriteup/unauthorized-google-maps-api-key-usage-cases-and-why-you-need-to-care-1ccb28bf21e\u003cbr/\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "VariationAttributes": [],
    "Scanas": false,
    "Scantype": 2,
    "pathDiscovery": false
  }
]