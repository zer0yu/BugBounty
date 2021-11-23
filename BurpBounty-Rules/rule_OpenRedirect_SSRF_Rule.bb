[{
  "enabled": true,
  "name": "OpenRedirect_SSRF_Rule",
  "comments": "This rule searches the request for typical parameters of Open redirect and SSRF vulnerabilities, and if it finds them, it executes the active profiles in search of these vulnerabilities.",
  "match": [
    "true,Or,Passive Request,OpenRedirect_SSRF_Parameters",
    "true,Or,Passive Request,URL_as_a_Value",
    "true,Or,Passive Request,URL_Path_as_a_Value"
  ],
  "execute": [
    "true,Profile,OpenRedirect,All Matches",
    "true,Profile,OpenRedirect_SSRF_Collaborator,All Matches",
    "true,Profile,Openredirect_to_XSS,All Matches",
    "true,Profile,OpenRedirect_to_Account_Takeover,All Matches",
    "true,Profile,SSRF-Collaborator,All Matches",
    "true,Profile,SSRF-URLScheme,All Matches",
    "true,Profile,SSRF_Collaborator_HTTP1_0,All Matches",
    "true,Profile,SSRF_Collaborator_HTTP0_9,All Matches"
  ]
}]