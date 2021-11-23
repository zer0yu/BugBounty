[
  {
    "enabled": true,
    "name": "GraphQL injection Rule",
    "comments": "This rule searches the request for GraphQL endpoint, and if it finds them, it executes the active profile in search of these vulnerabilities.",
    "match": [
      "true,,Passive Request,GraphQL_Endpoint"
    ],
    "execute": [
      "true,Profile,GraphQL injection,All Matches"
    ]
  }
]