[{
  "enabled": true,
  "name": "XSS_Rule",
  "comments": "This rule searches the request for typical parameters of XSS vulnerabilities, and if it finds them, it executes the active profiles in search of these vulnerabilities.",
  "match": [
    "true,,Passive Request,XSS_Parameters"
  ],
  "execute": [
    "true,Profile,XSS,All Matches",
    "true,Profile,XSS_UrlEncode,All Matches",
    "true,Profile,XSS_Akamai_GHost_bypass,All Matches",
    "true,Profile,XSS_HtmlUrlEncode,All Matches",
    "true,Profile,Blind_XSS_append,All Matches",
    "true,Profile,Blind_XSS_replace,All Matches",
    "true,Profile,Blind_XSS_XSSHUNTER_append,All Matches",
    "true,Profile,Blind_XSS_XSSHUNTER_replace,All Matches"
  ]
}]