[
  {
    "ProfileName": "AWS_Creds_File",
    "Enabled": true,
    "Scanner": 2,
    "Author": "@six2dez1",
    "UrlEncode": false,
    "Grep": [
      "true,,(?i)(aws_access_key_id|aws_secret_access_key)(.{0,20})?\u003d.[0-9a-zA-Z\\/+]{20,40}"
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
    "ContentType": "text/css,image/jpeg,image/png,image/svg+xml,image/gif,image/tiff,image/webp,image/x-icon,application/font-woff,image/vnd.microsoft.icon,font/ttf,font/woff2",
    "NegativeCT": true,
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
    "IssueName": "AWS Credential Files",
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