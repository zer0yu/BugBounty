[{
  "enabled": true,
  "name": "RCE_Rule",
  "comments": "This rule searches the request for typical parameters of RCE vulnerabilities, and if it finds them, it executes the active profiles in search of these vulnerabilities.",
  "match": [
    "true,,Passive Request,RCE_Parameters"
  ],
  "execute": [
    "true,Profile,RCE_Linux,All Matches",
    "true,Profile,Blind_RCE_Linux,All Matches",
    "true,Profile,Blind_RCE_Windows,All Matches",
    "true,Profile,Echo_RCE_append,All Matches",
    "true,Profile,Echo_RCE_replace,All Matches",
    "true,Profile,Expect_RCE,All Matches",
    "true,Profile,PHP_RCE,All Matches",
    "true,Profile,RCE_Windows,All Matches"
  ]
}]