[
  {
    "ProfileName": "GraphQL_Endpoint",
    "Enabled": true,
    "Scanner": 3,
    "Author": "@burpbounty",
    "UrlEncode": false,
    "Grep": [
      "true,,All Request,Name,/graphql?",
      "true,And,GET Parameter,Name,query",
      "true,Or,All Request,Name,/graphiql?",
      "true,And,GET Parameter,Name,query"
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
    "MatchType": 1,
    "Scope": 0,
    "RedirType": 0,
    "MaxRedir": 0,
    "payloadPosition": 0,
    "grepsFile": "",
    "IssueName": "GraphQL_Endpoint",
    "IssueSeverity": "Information",
    "IssueConfidence": "Firm",
    "IssueDetail": "References:\u003cbr/\u003e\u003cbr/\u003e\n* https://github.com/swisskyrepo/PayloadsAllTheThings/tree/master/GraphQL%20Injection\u003cbr/\u003e\n* https://gitlab.com/dee-see/graphql-path-enum",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "VariationAttributes": [],
    "Scanas": true,
    "Scantype": 2,
    "pathDiscovery": false
  }
]