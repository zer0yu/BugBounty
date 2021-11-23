[
  {
    "ProfileName": "SSTI_Parameters",
    "Enabled": true,
    "Scanner": 3,
    "Author": "@burpbounty",
    "UrlEncode": false,
    "Grep": [
      "true,,GET Parameter,Name,^template$",
      "true,Or,POST Parameter,Name,^template$",
      "true,Or,JSON Parameter,Name,^template$",
      "true,Or,XML Parameter,Name,^template$",
      "true,Or,POST Multipart,Name,^template$",
      "true,Or,XML Multipart,Name,^template$",
      "true,Or,GET Parameter,Name,^preview$",
      "true,Or,POST Parameter,Name,^preview$",
      "true,Or,JSON Parameter,Name,^preview$",
      "true,Or,XML Parameter,Name,^preview$",
      "true,Or,POST Multipart,Name,^preview$",
      "true,Or,XML Multipart,Name,^preview$",
      "true,Or,GET Parameter,Name,^id$",
      "true,Or,POST Parameter,Name,^id$",
      "true,Or,JSON Parameter,Name,^id$",
      "true,Or,XML Parameter,Name,^id$",
      "true,Or,POST Multipart,Name,^id$",
      "true,Or,XML Multipart,Name,^id$",
      "true,Or,GET Parameter,Name,^view$",
      "true,Or,POST Parameter,Name,^view$",
      "true,Or,JSON Parameter,Name,^view$",
      "true,Or,XML Parameter,Name,^view$",
      "true,Or,POST Multipart,Name,^view$",
      "true,Or,XML Multipart,Name,^view$",
      "true,Or,GET Parameter,Name,^activity$",
      "true,Or,POST Parameter,Name,^activity$",
      "true,Or,JSON Parameter,Name,^activity$",
      "true,Or,XML Parameter,Name,^activity$",
      "true,Or,POST Multipart,Name,^activity$",
      "true,Or,XML Multipart,Name,^activity$",
      "true,Or,GET Parameter,Name,^name$",
      "true,Or,POST Parameter,Name,^name$",
      "true,Or,JSON Parameter,Name,^name$",
      "true,Or,XML Parameter,Name,^name$",
      "true,Or,POST Multipart,Name,^name$",
      "true,Or,XML Multipart,Name,^name$",
      "true,Or,GET Parameter,Name,^content$",
      "true,Or,POST Parameter,Name,^content$",
      "true,Or,JSON Parameter,Name,^content$",
      "true,Or,XML Parameter,Name,^content$",
      "true,Or,POST Multipart,Name,^content$",
      "true,Or,XML Multipart,Name,^content$",
      "true,Or,GET Parameter,Name,^redirect$",
      "true,Or,POST Parameter,Name,^redirect$",
      "true,Or,JSON Parameter,Name,^redirect$",
      "true,Or,XML Parameter,Name,^redirect$",
      "true,Or,POST Multipart,Name,^redirect$",
      "true,Or,XML Multipart,Name,^redirect$"
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
    "IssueName": "SSTI_Parameters",
    "IssueSeverity": "Information",
    "IssueConfidence": "Firm",
    "IssueDetail": "Based  in GF patterns by @1ndianl33t.\u003cbr/\u003e\n\nI also add more parameters and regex.",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "VariationAttributes": [],
    "Scanas": true,
    "Scantype": 2,
    "pathDiscovery": false
  }
]